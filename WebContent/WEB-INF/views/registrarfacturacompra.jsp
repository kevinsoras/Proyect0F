 
      
      


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

<div id="buscador">
  <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Fecha</th>
      
            <th colspan="2">Acciones</th>


    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>19/08/2080</td>
    
      <td>  <button type="button" class="btn btn-primary">Detalles</button>
     <h4>Completado</h4>

</td>
     
    </tr>
    <tr>
      <th scope="row">1</th>
      <td>19/08/2090</td>
    
      <td>  <button id="c" type="button" class="btn btn-primary">Detalles</button>
     <h4 style="color: red;">Incompleto</h4>

</td>
     
    </tr>
  
  </tbody>
</table>
  </div>

<div id="aceptar" style="display: none">
<h1>Pedido de compra del :</h1>
<h2>19/08/2090</h2>


 <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Producto</th>
            <th scope="col">Cantidad Pedida</th>
            <th scope="col">Cantidad de entrada</th>

            <th >Producto llegado</th>


    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Tornillos de auto</td>
      <td>  <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" value="22" style="width: 80px;" disabled="on">
</td>
      <td>   <input type="number" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm">

<td><div class="form-check">
  <input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
  <label class="form-check-label" for="defaultCheck1">
    LLego
  </label>
</div></td>
</td>
     
    </tr>
    <tr>
      <th scope="row">1</th>
      <td>Parachoques</td>
      <td>  <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" value="5" style="width: 80px;" disabled="on">
</td>
      <td>   <input type="number" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm">

<td><div class="form-check">
  <input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
  <label class="form-check-label" for="defaultCheck1">
    LLego
  </label>
</div></td>
</td>
     
    </tr>
  </tbody>
</table>
<br>
<button type="button" class="btn btn-info">Confirmar</button>


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