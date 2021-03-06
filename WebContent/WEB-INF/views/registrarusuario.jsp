<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="#">Menu</a></li>
			</ol>
			<!-- Formulario registrar usuario-->
			<div>
				<form:form method="GET" action="create"
					modelAttribute="usuarioCrear">
					<div>
						<div class="form-group row">
							<label for="example-text-input" class="col-2 col-form-label">Nombre</label>
							<div class="col-10">
								<form:input class="form-control" type="text" placeholder="Ingrese Nombre" path ="nombr"/>
							</div>
						</div>
						<div class="form-group row">
							<label for="example-text-input" class="col-2 col-form-label">Apellido</label>
							<div class="col-10">
									<form:input type="text" class="form-control" path="apell" placeholder="Coloque el apellido"/>
							</div>
						</div>
						<div class="form-group row">
							<label for="example-text-input" class="col-2 col-form-label">Direcci�n</label>
							<div class="col-10">
								 <form:input type="text" class="form-control" path="direc" placeholder="Direccion"/>
							</div>
						</div>
						<div class="form-group row">
							<label for="example-text-input" class="col-2 col-form-label">Celular</label>
							<div class="col-10">
								<form:input type="text" class="form-control" path="cel" placeholder="Celular"/>
							</div>
						</div>
						<div class="form-group row">
							<label for="example-text-input" class="col-2 col-form-label">Usuario</label>
							<div class="col-10">
								 <form:input type="text" placeholder="Usuario" path="usu" class="form-control" />
							</div>
						</div>
						<div class="form-group row">
							<label for="example-text-input" class="col-2 col-form-label">Password</label>
							<div class="col-10">
								<form:input type="text" placeholder="Password" path="pasw" class="form-control" />
							</div>
						</div>
						<div class="form-group row">
							<label for="example-text-input" class="col-2 col-form-label">Rol</label>
							<div class="col-10">
								<form:input type="hidden" id="roloculto" placeholder="Password" path="idroll" class="form-control"/>
								<select class="form-control" id="selectrol">
									
								</select>
							</div>
						</div>
						
					</div>
					<button type="submit" class="btn btn-primary">Agregar</button>
				</form:form>
				<div>
					<table class="table table-bordered">
						<thead>
							<tr>
								<th scope="col">#</th>
								<th scope="col">Nombre</th>
								<th scope="col">Apellido</th>
								<th scope="col">Direccion</th>
								<th scope="col">Celular</th>
								<th scope="col">Usuario</th>
								<th scope="col">Rol</th>
								<th colspan="2">Acciones</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${lista}" var="usuario">
								<tr>
									<th scope="row">1</th>
									<td>${usuario.nombre}</td>
									<td>${usuario.apellido}</td>
									<td>${usuario.direccion}</td>
									<td>${usuario.celular}</td>
									<td>${usuario.usuario}</td>
									<td>${usuario.nombrer}</td>
									<td><a id="modal" href="read/${usuario.idusuario}"
										style="color: blue;"><i class="fa fa-pencil-square-o"
											aria-hidden="true"></i></a></td>
									<td><a href="del/${usuario.idusuario}" style="color: red;"><i
											class="fa fa-trash" aria-hidden="true"></i></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<!-- Modal -->
					<div class="modal fade" id="exampleModale" tabindex="-1"
						role="dialog" aria-labelledby="exampleModalLabel"
						aria-hidden="true">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<h5 class="modal-title" id="exampleModalLabel">Usuario</h5>
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
								</div>
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
						<span>Copyright © Sisveco 2018</span>
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
<script src="${urlrecursos}/datatables/jquery.dataTables.js"></script>
<script src="${urlrecursos}/datatables/dataTables.bootstrap4.js"></script>
<script>
	var modal = false;

	$(function() {
		/*
		if (modal === true) {
			$("#exampleModale").modal("show");
		}*/
		var n='roles';
		$.ajax({
			type:'GET',
			url:n,
			success:function(result){
				console.log(result);
				for(var i = 0;i<result.length;i++){
		       		
		          $("#selectrol").append("<option value='"+result[i].idrol+"'>"+result[i].nombre+"</option>");
		    
		   			 }
				
				
				
			},
			error:function(){
				console.log("nosalebuscar");
			}
		});
		$("#selectrol ").click(function(){
			var n =$("#selectrol").val();
			
			$("#roloculto").val(n);
		});
	
	});
	/*
	 $(function(){

	
	 //if(lanzar_modal == true){
	 $('#exampleModal').modal('show');
	 //}


	 });*/
</script>
</html>