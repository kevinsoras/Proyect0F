


<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>SysCoco</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <spring:url value="/recursos" var="urlrecursos"></spring:url>
	<link href="${urlrecursos}/css/bootstrap.min.css" rel="stylesheet">
		<link href="${urlrecursos}/fontawesome-free/css/all.min.css" rel="stylesheet">
			<link href="${urlrecursos}/datatables/dataTables.bootstrap4.css" rel="stylesheet">
				<link href="${urlrecursos}/css/sb-admin.css" rel="stylesheet">
	
  </head>
<body>
  <jsp:include page="template/top.jsp"></jsp:include>  
  <jsp:include page="template/left.jsp"></jsp:include>  

 <div id="content-wrapper" style="float: left;">

        <div class="container-fluid">

          <!-- Breadcrumbs-->
          <ol class="breadcrumb">
            <li class="breadcrumb-item">
              <a href="#">Menu</a>
            </li>
          </ol>


          <!-- Espacio formulario registrar cliente-->
          <div >
           <form>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Nombre</label>
      <input type="text" class="form-control" id="inputEmail4" placeholder="Coloque el nombre del producto">
    </div>

  </div>
  <div class="form-group">
    <label for="inputPassword4">Precio</label>
    <input type="number" class="form-control" id="inputAddress" placeholder="Coloque el precio">
  </div>
   <div class="form-group">
    <label for="inputPassword4">Cantidad</label>
    <input type="number" class="form-control" id="inputAddress" placeholder="Coloque la cantidad">
  </div>
  
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCity">Categoria</label>
      <select class="custom-select">
  <option selected>Seleccione una categoria</option>
  <option value="1">Nuevo</option>
  <option value="2">Usado</option>
  <option value="3">Especial</option>
</select>
    </div>
   
    </div>
<br>
  <button type="submit" class="btn btn-primary">Agregar</button>

  <br>  <br>

</form>
  
<div >
  <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nombre</th>
      <th scope="col">Precio</th>
      <th scope="col">Codigo </th>
            <th scope="col">Estado</th>
      <th scope="col">Categoria</th>
            <th colspan="2">Acciones</th>


    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Freno</td>
      <td>12</td>
      <td>125</td>
      <td>Activo</td>
      <td>Usado</td>
      <td>  <button type="button" class="btn btn-primary">Modificar</button>
        <button type="button" class="btn btn-danger">Eliminar</button>
</td>
     
    </tr>
   
    <tr>
      <th scope="row">1</th>
      <td>Llanta de moto</td>
      <td>40</td>
      <td>126</td>
      <td>Activo</td>
      <td>Usado</td>
      <td>  <button type="button" class="btn btn-primary">Modificar</button>
        <button type="button" class="btn btn-danger">Eliminar</button>
</td>
     
    </tr>
  </tbody>
</table>
  </div>

       
        </div>
          

        <!-- /.container-fluid -->

        <!-- Sticky Footer -->
        <footer class="sticky-footer">
          <div class="container my-auto">
            <div class="copyright text-center my-auto">
              <span>Copyright © Sisveco 2018</span>
            </div>
          </div>
        </footer>

      </div>
      <!-- /.content-wrapper -->

    </div>

</body>



 <script src="${urlrecursos}/jquery/jquery.min.js"></script>
    <script src="${urlrecursos}/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="${urlrecursos}/jquery-easing/jquery.easing.min.js"></script>

    <!-- Page level plugin JavaScript-->
    <script src="${urlrecursos}/chart.js/Chart.min.js"></script>
    <script src="${urlrecursos}/datatables/jquery.dataTables.js"></script>
    <script src="${urlrecursos}/datatables/dataTables.bootstrap4.js"></script>

</html>

