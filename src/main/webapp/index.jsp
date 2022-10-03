
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Comics</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
  </head>
  <body>
<h1>Ingresa el comics que quieres</h1>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>


<div class="m-0 row justify-content-center">
    <form class="row g-3 needs-validation" action="proceso" novalidate>
  <div class="col-md-3">
    <label for="validationCustom01" class="form-label">Ingresa el ID</label>
    <input type="text" class="form-control" id="id" placeholder="xxxxxxxx" value="" required>
  </div>
  <div class="col-md-3">
    <label for="validationCustom01" class="form-label">Ingresa el nombre del Comic</label>
    <input type="text" class="form-control" id="nombre" placeholder="Invensible Iron man" value="" required>
  </div>
 <div class="col-md-3">
    <label for="validationCustom01" class="form-label">Ingresa la Editorial</label>
    <input type="text" class="form-control" id="editorial" placeholder="Marvel" value="" required>
  </div>
<div class="col-md-3">
    <label for="validationCustom01" class="form-label">Ingresa la Editorial que publica</label>
    <input type="text" class="form-control" id="editorial2" placeholder="Panini" value="" required>
  </div>
<div class="col-md-3">
    <label for="validationCustom01" class="form-label">Ingresa el numero del tomo</label>
    <input type="text" class="form-control" id="numero" placeholder="01" value="" required>
  </div>
<div class="col-md-3">
    <label for="validationCustom01" class="form-label">Ingresa el escritor e ilustrador</label>
    <input type="text" class="form-control" id="escritor" placeholder="Escritor e Ilustrador" value="" required>
  </div>
 
  </div>
  <div class="col-12">
    <button class="btn btn-primary" type="submit">Enviar</button>
  </div>
</form>
</div>

  </body>
</html>
