
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Sisveco</title>
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
<body background="${urlrecursos}/imagenes/fondoprueba1.jpg">
	<div class="container">
		<div class="card card-login mx-auto mt-5">
			<div class="card-header">Login</div>
			<div class="card-body">
				<form>
					<div class="form-group">
						<div class="form-label-group">
							<input type="email" id="inputEmail" class="form-control"
								placeholder="Email address" required="required"
								autofocus="autofocus"> <label for="inputEmail">Ingrese
								su email</label>
						</div>
					</div>
					<div class="form-group">
						<div class="form-label-group">
							<input type="password" id="inputPassword" class="form-control"
								placeholder="Password" required="required"> <label
								for="inputPassword">Contraseña</label>
						</div>
					</div>
					<a class="btn btn-primary btn-block" href="index.html">Entrar</a>
				</form>
			</div>
		</div>
	</div>
</body>
<script src="${urlrecursos}/jquery/jquery.min.js"></script>
<script src="${urlrecursos}/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="${urlrecursos}/jquery-easing/jquery.easing.min.js"></script>
<script src="${urlrecursos}/chart.js/Chart.min.js"></script>
<script src="${urlrecursos}/datatables/jquery.dataTables.js"></script>
<script src="${urlrecursos}/datatables/dataTables.bootstrap4.js"></script>
</html>















