

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
            <div >
           <form>

  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Nombre o Apellido</label>

      <input value="Kevin Soras" type="text" class="form-control" id="inputEmail4" placeholder="Ingrese el nombre o apellido">
      <a href="pagocreditprin.html">
<br>
        <button type="button" class="btn btn-primary" >Volver</button></a>
    </div>
  </div>

</form>

<div >
  <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nº De Producto</th>
      <th scope="col">Nombre</th>
      <th scope="col">Costo Total</th>
      <th scope="col">Saldo</th>
      <th scope="col">Diferencia</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>545</td>
      <td>Llave Francesa</td>
      <td>S/. 150</td>
      <td>S/. 50</td>
      <td>S/. 100</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>430</td>
      <td>Tornillo</td>
      <td>S/. 500</td>
      <td>S/. 100</td>
      <td>S/. 400</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>950</td>
      <td>Pintura Azul</td>
      <td>S/. 900</td>
      <td>S/. 550</td>
      <td>S/. 350</td>
    </tr>
  </tbody>
</table>
  </div>


        </div>
           <p class="small text-center text-muted my-5">
            <em>Registrar cliente</em>
          </p>

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














