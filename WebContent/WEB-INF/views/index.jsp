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
<body>
<<<<<<< HEAD
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

          <!-- Icon Cards-->
          <div class="row">
            <div class="col-xl-3 col-sm-6 mb-3">
              <div class="card text-white bg-primary o-hidden h-100">
                <div class="card-body">
                  <div class="card-body-icon">
                    <i class="fas fa-book"></i>
                  </div>
                  <div class="mr-5">Cliente</div>
                </div>
                <a class="card-footer text-white clearfix small z-1" href="cliente/ClienteLista.html">
                  <span class="float-left">Ver Detalles</span>
                  <span class="float-right">
                    <i class="fas fa-angle-right"></i>
                  </span>
                </a>
              </div>
            </div>
            <div class="col-xl-3 col-sm-6 mb-3">
              <div class="card text-white bg-warning o-hidden h-100">
                <div class="card-body">
                  <div class="card-body-icon">
                  <i class="fas fa-fw fa-shopping-cart"></i>
                  </div>
                  <div class="mr-5">Pedidos de Venta</div>
                </div>
                <a class="card-footer text-white clearfix small z-1" href="pedidoventa/RegistrarPedidoventa.html">
                  <span class="float-left">Ver Detalles</span>
                  <span class="float-right">
                    <i class="fas fa-angle-right"></i>
                  </span>
                </a>
              </div>
            </div>
            <div class="col-xl-3 col-sm-6 mb-3">
              <div class="card text-white bg-success o-hidden h-100">
                <div class="card-body">
                  <div class="card-body-icon">
                    <i class="fas fa-clipboard-list"></i>                  </div>
                  <div class="mr-5">Pedidos de Compra</div>
                </div>
                <a class="card-footer text-white clearfix small z-1" href="pedidodecompra.html">
                  <span class="float-left">Ver Detalles</span>
                  <span class="float-right">
                    <i class="fas fa-angle-right"></i>
                  </span>
                </a>
              </div>
            </div>
            <div class="col-xl-3 col-sm-6 mb-3">
              <div class="card text-white bg-dark o-hidden h-100">
                <div class="card-body">
                  <div class="card-body-icon">
                    <i class="fas fa-fw fa-life-ring"></i>
                  </div>
                  <div class="mr-5">Registrar factura de compra</div>
                </div>
                <a class="card-footer text-white clearfix small z-1" href="registrarfacturacompra.html">
                  <span class="float-left">Ver Detalles</span>
                  <span class="float-right">
                    <i class="fas fa-angle-right"></i>
                  </span>
                </a>
              </div>
            </div>
            <div class="col-xl-3 col-sm-6 mb-3">
              <div class="card text-white bg-secondary o-hidden h-100">
                <div class="card-body">
                  <div class="card-body-icon">
                    <i class="fas fa-fw fa-life-ring"></i>
                  </div>
                  <div class="mr-5">Registrar Productos</div>
                </div>
                <a class="card-footer text-white clearfix small z-1" href="registrarproducto.html">
                  <span class="float-left">Ver Detalles</span>
                  <span class="float-right">
                    <i class="fas fa-angle-right"></i>
                  </span>
                </a>
              </div>
            </div> <div class="col-xl-3 col-sm-6 mb-3">
              <div class="card text-white bg-danger o-hidden h-100">
                <div class="card-body">
                  <div class="card-body-icon">
                    <i class="fas fa-fw fa-life-ring"></i>
                  </div>
                  <div class="mr-5">Pago a credito</div>
                </div>
                <a class="card-footer text-white clearfix small z-1" href="pagocreditprin.html">
                  <span class="float-left">Ver Detalles</span>
                  <span class="float-right">
                    <i class="fas fa-angle-right"></i>
                  </span>
                </a>
              </div>
            </div>
            <div class="col-xl-3 col-sm-6 mb-3">
              <div class="card text-white bg-info o-hidden h-100">
                <div class="card-body">
                  <div class="card-body-icon">
                    <i class="fas fa-fw fa-life-ring"></i>
                  </div>
                  <div class="mr-5">Registrar Usuario</div>
                </div>
                <a class="card-footer text-white clearfix small z-1" href="registrarusuario.html">
                  <span class="float-left">Ver Detalles</span>
                  <span class="float-right">
                    <i class="fas fa-angle-right"></i>
                  </span>
                </a>
              </div>
            </div>
             <div class="col-xl-3 col-sm-6 mb-3">
              <div class="card text-white bg-info o-hidden h-100">
                <div class="card-body">
                  <div class="card-body-icon">
                    <i class="fas fa-fw fa-life-ring"></i>
                  </div>
                  <div class="mr-5">Registrar Guia</div>
                </div>
                <a class="card-footer text-white clearfix small z-1" href="registrarguia.html">
                  <span class="float-left">Ver Detalles</span>
                  <span class="float-right">
                    <i class="fas fa-angle-right"></i>
                  </span>
                </a>
              </div>
            </div>
             <div class="col-xl-3 col-sm-6 mb-3">
              <div class="card text-white bg-primary o-hidden h-100">
                <div class="card-body">
                  <div class="card-body-icon">
                    <i class="fas fa-book"></i>
                  </div>
                  <div class="mr-5">Proveedores</div>
                </div>
                <a class="card-footer text-white clearfix small z-1" href="proveedores">
                  <span class="float-left">Ver Detalles</span>
                  <span class="float-right">
                    <i class="fas fa-angle-right"></i>
                  </span>
                </a>
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
      <!-- /.content-wrapper -->

    </div>


=======
	<jsp:include page="template/top.jsp"></jsp:include>
	<jsp:include page="template/left.jsp"></jsp:include>
	<div id="content-wrapper">
		<div class="container-fluid">
			<!-- Breadcrumbs-->
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="#">Menu</a></li>
			</ol>
			<!-- Icon Cards-->
			<div class="row">
				<div class="col-xl-3 col-sm-6 mb-3">
					<div class="card text-white bg-primary o-hidden h-100">
						<div class="card-body">
							<div class="card-body-icon">
								<i class="fas fa-book"></i>
							</div>
							<div class="mr-5">Cliente</div>
						</div>
						<a class="card-footer text-white clearfix small z-1"
							href="cliente/ClienteLista.html"> <span class="float-left">Ver
								Detalles</span> <span class="float-right"> <i
								class="fas fa-angle-right"></i>
						</span>
						</a>
					</div>
				</div>
				<div class="col-xl-3 col-sm-6 mb-3">
					<div class="card text-white bg-warning o-hidden h-100">
						<div class="card-body">
							<div class="card-body-icon">
								<i class="fas fa-fw fa-shopping-cart"></i>
							</div>
							<div class="mr-5">Pedidos de Venta</div>
						</div>
						<a class="card-footer text-white clearfix small z-1"
							href="pedidocompra.html"> <span class="float-left">Ver
								Detalles</span> <span class="float-right"> <i
								class="fas fa-angle-right"></i>
						</span>
						</a>
					</div>
				</div>
				<div class="col-xl-3 col-sm-6 mb-3">
					<div class="card text-white bg-success o-hidden h-100">
						<div class="card-body">
							<div class="card-body-icon">
								<i class="fas fa-clipboard-list"></i>
							</div>
							<div class="mr-5">Pedidos de Compra</div>
						</div>
						<a class="card-footer text-white clearfix small z-1"
							href="pedidodecompra.html"> <span class="float-left">Ver
								Detalles</span> <span class="float-right"> <i
								class="fas fa-angle-right"></i>
						</span>
						</a>
					</div>
				</div>
				<div class="col-xl-3 col-sm-6 mb-3">
					<div class="card text-white bg-dark o-hidden h-100">
						<div class="card-body">
							<div class="card-body-icon">
								<i class="fas fa-fw fa-life-ring"></i>
							</div>
							<div class="mr-5">Registrar factura de compra</div>
						</div>
						<a class="card-footer text-white clearfix small z-1"
							href="registrarfacturacompra.html"> <span class="float-left">Ver
								Detalles</span> <span class="float-right"> <i
								class="fas fa-angle-right"></i>
						</span>
						</a>
					</div>
				</div>
				<div class="col-xl-3 col-sm-6 mb-3">
					<div class="card text-white bg-secondary o-hidden h-100">
						<div class="card-body">
							<div class="card-body-icon">
								<i class="fas fa-fw fa-life-ring"></i>
							</div>
							<div class="mr-5">Registrar Productos</div>
						</div>
						<a class="card-footer text-white clearfix small z-1"
							href="registrarproducto.html"> <span class="float-left">Ver
								Detalles</span> <span class="float-right"> <i
								class="fas fa-angle-right"></i>
						</span>
						</a>
					</div>
				</div>
				<div class="col-xl-3 col-sm-6 mb-3">
					<div class="card text-white bg-danger o-hidden h-100">
						<div class="card-body">
							<div class="card-body-icon">
								<i class="fas fa-fw fa-life-ring"></i>
							</div>
							<div class="mr-5">Pago a credito</div>
						</div>
						<a class="card-footer text-white clearfix small z-1"
							href="pagocreditprin.html"> <span class="float-left">Ver
								Detalles</span> <span class="float-right"> <i
								class="fas fa-angle-right"></i>
						</span>
						</a>
					</div>
				</div>
				<div class="col-xl-3 col-sm-6 mb-3">
					<div class="card text-white bg-info o-hidden h-100">
						<div class="card-body">
							<div class="card-body-icon">
								<i class="fas fa-fw fa-life-ring"></i>
							</div>
							<div class="mr-5">Registrar Usuario</div>
						</div>
						<a class="card-footer text-white clearfix small z-1"
							href="registrarusuario.html"> <span class="float-left">Ver
								Detalles</span> <span class="float-right"> <i
								class="fas fa-angle-right"></i>
						</span>
						</a>
					</div>
				</div>
			</div>



			<c:forEach items="${lista}" var="user">
				<li><a class="app-menu__item" href="${user.ACS_URL}"><i
						class="app-menu__icon ${user.ACS_ICONO}"></i><span
						class="app-menu__label"> ${user.ACS_NOMBRE} </span></a> <!-- id="${user.ACS_ID}"  <a  href="upd/${user.ACS_ID}"> Hola </a>--></li>
			</c:forEach>




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
>>>>>>> 42b5b1a97325f42e0d95800a2d8615f94a392bae
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