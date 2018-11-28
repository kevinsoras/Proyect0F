w<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<spring:url value="/recursos" var="urlrecursos"></spring:url>
<link href="${urlrecursos}/css/bootstrap.min.css" rel="stylesheet">
<link href="${urlrecursos}/fontawesome-free/css/all.min.css"
	rel="stylesheet">
<link href="${urlrecursos}/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">
<link href="${urlrecursos}/css/sb-admin.css" rel="stylesheet">

</head>
<body>
	<jsp:include page="template/top.jsp"></jsp:include>
	<jsp:include page="template/left.jsp"></jsp:include>

	<div id="content-wrapper" style="float: left;">

		<div class="container-fluid">

			<!-- Breadcrumbs-->
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="#">Menu</a></li>
			</ol>


			<!-- Espacio formulario registrar cliente-->
			<div>
				<form:form method="GET" action="create"
					modelAttribute="clienteCrear">
					<div class="form-row">
						<label for="inputEmail4">Nombre</label>
						<form:input type="text" class="form-control" path="nom"
							placeholder="Coloque el nombre" />
					</div>
					<div class="form-group">
						<label for="inputPassword4">Apellido</label>
						<form:input type="text" class="form-control" path="apell"
							placeholder="Coloque el apellido" />
					</div>
					<div class="form-group">
						<label for="inputAddress">Dni</label>
						<form:input type="text" class="form-control" path="dni"
							placeholder="Maximo 8 NÂ°" />
					</div>
					<div class="form-group">
						<label for="inputAddress2">Direccion</label>
						<form:input type="text" class="form-control" path="direc"
							placeholder="Direccion" />
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputCity">Celular</label>
							<form:input type="text" placeholder="Maximo 9 NÂ°" path="cel"
								class="form-control" />
						</div>

					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputCity">Ruc</label>
							<form:input type="text" placeholder="Maximo 11" path="rucc"
								class="form-control" />
						</div>

					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputCity">Razón Social</label>
							<form:input type="text" placeholder="Coloque razón Social"
								path="raz_soc" class="form-control" />
						</div>

					</div>
					<br>
					<button type="submit" class="btn btn-primary">Agregar</button>



				</form:form>

				<div>
					<table class="table table-bordered">
						<thead>
							<tr>
								<th scope="col">#</th>
								<th scope="col">Nombre</th>
								<th scope="col">Apellidos</th>
								<th scope="col">DNI</th>
								<th scope="col">Direccion</th>
								<th scope="col">Celular</th>
								<th scope="col">RUC</th>
								<th scope="col">Razón social</th>
								<th colspan="1">Acciones</th>


							</tr>
						</thead>
						<tbody>
							<c:forEach items="${lista}" var="cliente">
								<tr>
									<th scope="row">1</th>
									<td>${cliente.nombre}</td>
									<td>${cliente.apellido}</td>
									<td>${cliente.dni}</td>
									<td>${cliente.direccion}</td>
									<td>${cliente.celular}</td>
									<td>${cliente.ruc}</td>
									<td>${cliente.razon_social}</td>
									<td><a id="modal" href="read/${cliente.idcliente}"
										style="color: blue;"><i class="fa fa-pencil-square-o"
											aria-hidden="true"></i></a></td>


								</tr>


							</c:forEach>


						</tbody>
					</table>
					<!-- Modal -->
					<div class="modal fade" id="exampleModal" tabindex="-1"
						role="dialog" aria-labelledby="exampleModalLabel"
						aria-hidden="true">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
								</div>
								<form:form method="GET" action="upd" modelAttribute="cliente">
									<div class="modal-body">



										<div class="form-group row">
											<label class="col-sm-2 col-form-label">Nombre:</label>
											<div class="col-sm-10">
												<form:input type="text" class="form-control" path="nom" />
												<form:input type="hidden" class="form-control" path="idcli" />
											</div>
										</div>
										<div class="form-group row">
											<label class="col-sm-2 col-form-label">Apellidos:</label>
											<div class="col-sm-10">
												<form:input type="text" class="form-control" path="apell" />
											</div>
										</div>
										<div class="form-group row">
											<label class="col-sm-2 col-form-label">Dni:</label>
											<div class="col-sm-10">
												<form:input type="text" class="form-control" path="dni" />
											</div>
										</div>
										<div class="form-group row">
											<label class="col-sm-2 col-form-label">Direccion:</label>
											<div class="col-sm-10">
												<form:input type="text" class="form-control" path="direc" />
											</div>
										</div>
										<div class="form-group row">
											<label class="col-sm-2 col-form-label">Celular:</label>
											<div class="col-sm-10">
												<form:input type="text" class="form-control" path="cel" />
											</div>
										</div>
										<div class="form-group row">
											<label class="col-sm-2 col-form-label">Ruc:</label>
											<div class="col-sm-10">
												<form:input type="text" class="form-control" path="rucc" />
											</div>
										</div>
										<div class="form-group row">
											<label class="col-sm-2 col-form-label">Razón Social:</label>
											<div class="col-sm-10">
												<form:input type="text" class="form-control" path="raz_soc" />
											</div>
										</div>
									</div>
									<div class="modal-footer">

										<a href="ClienteLista" class="btn btn-success">Close</a> <input
											type="submit" class="btn btn-primary" value="Guardar">

									</div>
								</form:form>
							</div>
						</div>
					</div>
				</div>


			</div>



			<!-- /.container-fluid -->

			<!-- Sticky Footer -->
			<footer class="sticky-footer">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright Â© Sisveco 2018</span>
					</div>
				</div>
			</footer>

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
<script>
	var modal = $
	{
		modal
	}

	$(function() {

		if (modal === true) {

			$("#exampleModal").modal("show");

		}

	});
	/*
	 $(function(){

	
	 //if(lanzar_modal == true){
	 $('#exampleModal').modal('show');
	 //}


	 });*/
</script>
</html>