 


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
         

            <div >
           <form>
  
  
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Nombre o Apellido</label>
      <input value ="Kevin Soras" type="text" class="form-control" id="inputEmail4" placeholder="Ingrese el nombre o apellido">
    </div>

  </div>
<br>
  <br>  <br>

</form>

<div >
  <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nº</th>
      <th scope="col">Nombre</th>
      <th scope="col">Fecha</th>
      <th scope="col">Costo Total</th>
      <th scope="col">Saldo</th>
      <th colspan="2">Acción</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>545</td>
      <td>Kevin Soras</td>
      <td>16/10/18</td>
      <td>S/. 100</td>
      <td>S/. 50</td>
      <td>
        <a href="pagocreditsecu.html"><button type="button" class="btn btn-primary" >Detalle</button></a>
        <a href="pagocreditpagar.html"><button type="button" class="btn btn-danger">Pagar</button></a>
      </td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>430</td>
      <td>Kevin Soras</td>
      <td>10/10/18</td>
      <td>S/. 400</td>
      <td>S/. 100</td>
      <td>
        <a href="pagocreditsecu.html"><button type="button" class="btn btn-primary" >Detalle</button></a>
        <a href="pagocreditpagar.html"><button type="button" class="btn btn-danger">Pagar</button></a>
      </td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>950</td>
      <td>Kevin Soras</td>
      <td>05/10/18</td>
      <td>S/. 550</td>
      <td>S/. 350</td>
      <td>
        <a href="pagocreditsecu.html"><button type="button" class="btn btn-primary" >Detalle</button></a>
        <a href="pagocreditpagar.html"><button type="button" class="btn btn-danger">Pagar</button></a>
      </td>
    </tr>
  </tbody>
</table>
  </div>
        </div>
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
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 