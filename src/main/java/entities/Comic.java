/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Blackat
 */
@Entity
@Table(name = "comics")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Comic.findAll", query = "SELECT c FROM Comic c"),
    @NamedQuery(name = "Comic.findById", query = "SELECT c FROM Comic c WHERE c.id = :id"),
    @NamedQuery(name = "Comic.findByNombre", query = "SELECT c FROM Comic c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Comic.findByEditorial", query = "SELECT c FROM Comic c WHERE c.editorial = :editorial"),
    @NamedQuery(name = "Comic.findByEditorialPublicacion", query = "SELECT c FROM Comic c WHERE c.editorialPublicacion = :editorialPublicacion"),
    @NamedQuery(name = "Comic.findByNumeroDeLibro", query = "SELECT c FROM Comic c WHERE c.numeroDeLibro = :numeroDeLibro"),
    @NamedQuery(name = "Comic.findByEscritoIlustrador", query = "SELECT c FROM Comic c WHERE c.escritoIlustrador = :escritoIlustrador")
})
public class Comic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    
    @Size(max = 2147483647)
    @Column(name = "editorial")
    private String editorial;
    
    @Size(max = 2147483647)
    @Column(name = "editorial_publicacion")
    private String editorialPublicacion;
    
    @Column(name = "numero_de_libro")
    private Integer numeroDeLibro;
    
    @Size(max = 2147483647)
    @Column(name = "escritor_ilustrador")
    private String escritoIlustrador;

    public Comic() {
    }

    public Comic(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEditorialPublicacion() {
        return editorialPublicacion;
    }

    public void setEditorialPublicacion(String editorialPublicacion) {
        this.editorialPublicacion = editorialPublicacion;
    }

    public Integer getNumeroDeLibro() {
        return numeroDeLibro;
    }

    public void setNumeroDeLibro(Integer numeroDeLibro) {
        this.numeroDeLibro = numeroDeLibro;
    }

    public String getEscritoIlustrador() {
        return escritoIlustrador;
    }

    public void setEscritoIlustrador(String escritoIlustrador) {
        this.escritoIlustrador = escritoIlustrador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comic))
        {
            return false;
        }
        Comic other = (Comic) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Comic[ id=" + id + " ]";
    }
    
}
