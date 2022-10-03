/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.exceptions.NonexistentEntityException;
import dao.exceptions.PreexistingEntityException;
import entities.Comic;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Blackat
 */
public class ComicDAO implements Serializable {

    public ComicDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Comic comic) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(comic);
            em.getTransaction().commit();
        } catch (Exception ex)
        {
            if (findComic(comic.getId()) != null)
            {
                throw new PreexistingEntityException("Comic " + comic + " already exists.", ex);
            }
            throw ex;
        } finally
        {
            if (em != null)
            {
                em.close();
            }
        }
    }

    public void edit(Comic comic) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            comic = em.merge(comic);
            em.getTransaction().commit();
        } catch (Exception ex)
        {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0)
            {
                Integer id = comic.getId();
                if (findComic(id) == null)
                {
                    throw new NonexistentEntityException("The comic with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally
        {
            if (em != null)
            {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            Comic comic;
            try
            {
                comic = em.getReference(Comic.class, id);
                comic.getId();
            } catch (EntityNotFoundException enfe)
            {
                throw new NonexistentEntityException("The comic with id " + id + " no longer exists.", enfe);
            }
            em.remove(comic);
            em.getTransaction().commit();
        } finally
        {
            if (em != null)
            {
                em.close();
            }
        }
    }

    public List<Comic> findComicEntities() {
        return findComicEntities(true, -1, -1);
    }

    public List<Comic> findComicEntities(int maxResults, int firstResult) {
        return findComicEntities(false, maxResults, firstResult);
    }

    private List<Comic> findComicEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try
        {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Comic.class));
            Query q = em.createQuery(cq);
            if (!all)
            {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally
        {
            em.close();
        }
    }

    public Comic findComic(Integer id) {
        EntityManager em = getEntityManager();
        try
        {
            return em.find(Comic.class, id);
        } finally
        {
            em.close();
        }
    }

    public int getComicCount() {
        EntityManager em = getEntityManager();
        try
        {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Comic> rt = cq.from(Comic.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally
        {
            em.close();
        }
    }
    
}
