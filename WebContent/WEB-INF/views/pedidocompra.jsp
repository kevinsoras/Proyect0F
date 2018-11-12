


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


          <!-- Espacio formulario registrar cliente-->




          <div  style="width: 100%;">

            <div style="width: 62%;float: left;">
              <br>

              Buscar Producto :
              <br>
              <input style="width: 220px;" type="number" class="form-control" placeholder="Codigo del producto" aria-label="Recipient's username" aria-describedby="basic-addon2">
              <br>
              <table class="table table-bordered">

  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Cantidad</th>
      <th scope="col">Descripcion</th>
      <th scope="col">Costo</th>
            <th scope="col">Costo total</th>
            <th colspan="2">Acciones</th>


    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>  <input style="width: 180px;" type="number" class="form-control" placeholder="Cantidad" aria-label="Recipient's username" aria-describedby="basic-addon2">
</td>
      <td>Freno de calidad</td>
      <td>12</td>
      <td></td>
      <td>  
        <button type="button" class="btn btn-danger">Eliminar</button>
</td>
     
    </tr>
    
  </tbody>
</table>
<button type="button" class="btn btn-success">Volcar todo</button>
<button type="button" class="btn btn-danger">Confirmar</button>
            </div>


            <div  style="width: 35%;float: left;margin-left: 5px;">
             <form>
    <div class="form-group">
    <label for="inputAddress">Cliente</label>


    <input type="number" class="form-control" id="inputAddress" placeholder="Buscar por dni">
  </div>
  <div class="form-group">
    <label for="inputPassword4">Apellido</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="Coloque el apellido">
  </div>
  <div class="form-group">
    <label for="inputAddress">Celular</label>
    <input type="number" class="form-control" id="inputAddress" placeholder="Maximo 9 N°">
  </div>
  <div class="form-group">
    <label for="inputAddress">Dni</label>
    <input type="number" class="form-control" id="inputAddress" placeholder="Maximo 8 N°">
  </div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2" checked>
  <label class="form-check-label" for="inlineRadio2">Contado</label>
</div>

<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
  <label class="form-check-label" for="inlineRadio2">Credito</label>
</div>

<br><br>
<button type="button" class="btn btn-info">Registrar</button>
   </form>
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

