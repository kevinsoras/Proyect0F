


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





      <div id="content-wrapper">

        <div class="container-fluid">

          <!-- Breadcrumbs-->
          <ol class="breadcrumb">
            <li class="breadcrumb-item">
              <a href="#">Menu</a>
            </li>
          </ol>


          <!-- Espacio formulario registrar cliente-->
          <div >
            <button id="pf" type="button" class="btn btn-success">Productos faltantes </button>
<button type="button" id="tp" class="btn btn-danger">Todos los productos</button>

<div id="mostrar">
  <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Producto</th>
      <th scope="col">Cantidad</th>
      <th scope="col">Acciones</th>
  

    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Producto x 1</td>
      <td>  <input type="number" class="form-control"  aria-label="Recipient's username" aria-describedby="basic-addon2">
</td>
      
      <td>  <button type="button" class="btn btn-primary">Agregar</button>
      
</td>
     
    </tr>
   
  </tbody>
</table>
  </div >
<div id="ocultar" style="display: none">
  <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Producto</th>
      <th scope="col">Cantidad</th>
      <th scope="col">Acciones</th>
  

    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Producto x 2</td>
      <td>  <input type="number" class="form-control"  aria-label="Recipient's username" aria-describedby="basic-addon2">
</td>
      
      <td>  <button type="button" class="btn btn-primary">Agregar</button>
      
</td>
     
    </tr>
   
  </tbody>
</table>
  </div>
  <div >

    <h2>Lista de productos seleccionados</h2>
  <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Producto</th>
      <th scope="col">Cantidad</th>
      <th colspan="2" scope="col">Acciones</th>
  

    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Producto cualquiera</td>
      <td>  <input value="5" type="number" class="form-control"  aria-label="Recipient's username" aria-describedby="basic-addon2" disabled="on">
</td>
      
      <td>   <button type="button" class="btn btn-primary">Modificar</button> <button type="button" class="btn btn-danger">Eliminar</button>
      
</td>
     
    </tr>
   
  </tbody>
</table>
  </div >
<br>
       <button type="button" class="btn btn-info">Guardar e imprimir</button>
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










