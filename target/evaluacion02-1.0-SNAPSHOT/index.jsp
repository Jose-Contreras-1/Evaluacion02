
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Comics</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
  </head>
  <body>
<center>
<h1 class="text-center">Ingresa el comics que quieres</h1>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>

<div class="container">

<div>
    <form class="needs-validation" metod="get" action="Proceso" novalidate>
  <div class="col-3">
    <label for="validationCustom01" class="form-label">Ingresa el ID</label>
    <input type="text" class="form-control" name="id" placeholder="xxxxxxxx" value="" required>
  </div><br>
  <div class="col-3">
    <label for="validationCustom02" class="form-label">Ingresa el nombre del Comic</label>
    <input type="text" class="form-control" name="nombre" placeholder="Invensible Iron man" value="" required>
  </div><br>
 <div class="col-3">
    <label for="validationCustom03" class="form-label">Ingresa la Editorial</label>
    <input type="text" class="form-control" name="editorial" placeholder="Marvel" value="" required>
  </div><br>
<div class="col-md-3">
    <label for="validationCustom04" class="form-label">Ingresa la Editorial que publica</label>
    <input type="text" class="form-control" name="editorial2" placeholder="Panini" value="" required>
  </div><br>
<div class="col-md-3">
    <label for="validationCustom05" class="form-label">Ingresa el numero del tomo</label>
    <input type="text" class="form-control" name="numero" placeholder="01" value="" required>
  </div><br>
<div class="col-md-3">
    <label for="validationCustom06" class="form-label">Ingresa el escritor e ilustrador</label>
    <input type="text" class="form-control" name="escritor" placeholder="Escritor e Ilustrador" value="" required>
  </div>
 
  </div>

  <div class="col-12">
    <input type="radio" value="crear" name="proceso">Crear
    <input type="radio" value="actualizar" name="proceso">Actualizar
    <input type="radio" value="borrar" name="proceso">Borrar<br>
    <button class="btn btn-primary" type="submit">Iniciar proceso</button>
  </div>
</form>
</div>
</div>
  </center>
  </body>
</html>
