


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
<div id="content-wrapper" style="float:left;">

        <div class="container-fluid">


          <!-- Espacio formulario registrar cliente-->




          <div  style="width: 100%;">

            <div style="width: 62%;float: left;">
              <br>
				<div >
					 Buscar Producto :
		              
		              <input style="width: 500px;" id="producto" type="text" class="form-control" placeholder="Codigo del producto"
		               >
		               <ul class="list-group" id="ul" >
		              
		                <c:forEach items="${productos}" var="producto">
		               <li class="list-group-item"  >
		               <a  id="${producto.idproducto}" style="color: black;text-decoration: none;">${producto.nombre} </a> 
		               						</li>
		               </c:forEach>
		                
		              	
		               </ul>
		              <br>
		         	
				
				</div>
				<div class="container" id="stocker">
 <label>
 No se encuentra en Stock..!
 </label>
</div>
                  <table class="table table-bordered" id="table">

  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Cantidad</th>
      <th scope="col">Descripcion</th>
      <th scope="col">Stock</th>
      <th scope="col">Costo</th>
      <th scope="col">Costo total</th>
      <th colspan="2">Acciones</th>


    </tr>
  </thead>
  <tbody>
   
  </tbody>
</table>
<label style="margin-left:900px;">cantidad: 60.00</label>
<br>
<button type="button" class="btn btn-success" id="volcartodo">Volcar todo</button>
<button type="button" class="btn btn-danger" id="confirmar">Confirmar</button>
            </div>


            <div  style="width: 35%;float: left;margin-left: 5px;">
             <form>
    <div class="form-group">
    <label for="inputAddress">Cliente</label>
    <input type="text" class="form-control"  id="clienteSearch" placeholder="Buscar Cliente">
    <br>
     <button type="button" class="btn btn-info" id="buscar">Buscar</button>
  </div>
 
  <div class="form-group">
    <label for="inputPassword4">Apellido</label>
    <input type="text" class="form-control" id="apellidoSearch" placeholder="Coloque el apellido">
  </div>
  <div class="form-group">
    <label for="inputAddress">Celular</label>
    <input type="text" class="form-control" id="celularSearch" placeholder="Maximo 9 N°">
  </div>
  <div class="form-group">
    <label for="inputAddress">Dni</label>
    <input type="text" class="form-control" id="dniSearch" placeholder="Maximo 8 N°">
  </div>
  <div class="form-group">
    <label for="inputAddress">Direccion</label>
    <input type="text" class="form-control" id="direccionSearch" placeholder="Maximo 8 N°">
  </div>
  <div class="form-group">
    <label for="inputAddress">Ruc</label>
    <input type="text" class="form-control" id="rucSearch" placeholder="Maximo 8 N°">
  </div>
  <div class="form-group">
    <label for="inputAddress">Razon_social</label>
    <input type="text" class="form-control" id="razon_socialSearch" placeholder="Maximo 8 N°">
  </div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="tipo" id="Contado" value="Contado" checked>
  <label class="form-check-label" for="inlineRadio2">Contado</label>
</div>

<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="tipo" id="inlineRadio2" value="option2">
  <label class="form-check-label" for="inlineRadio2">Credito</label>
</div>

<br><br>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="documento" id="inlineRadio2" value="option2" checked>
  <label class="form-check-label" for="inlineRadio2">Proforma</label>
</div>

<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="documento" id="inlineRadio2" value="option2">
  <label class="form-check-label" for="inlineRadio2">Boleta</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="documento" id="inlineRadio2" value="option2">
  <label class="form-check-label" for="inlineRadio2">Factura</label>
</div>
<br>
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
<script>
//var prod = ${valor};
//var arr = ${productos};
var carro = new Array() ;
$(function() {
	$("#ul").hide();
	$("#stocker").hide();
	$("#producto").keyup(function(){
		var pala = $("#producto").val();
		
		if(pala===""){
			$("#ul").hide();
		}else{
			$("#ul").show();
			$("#ul li ").filter(function(){
				$(this).toggle($(this).text().toLowerCase().indexOf(pala) > -1);
			});
		}
	});
	$("#ul li").click(function(){
		var q=$(this).index();
		var n = $("#ul").find("a").eq(q).attr("id");
		var prod = $("#ul").find("a").eq(q).html();
		console.log(n);
		
		var mel = 'Listapedidoproductos/'+ n;
		var valor=true;
		$.ajax({type:'GET',
				url:mel ,
				success:function(result){
					for (var i = 0; i <carro.length; i++) {
				        if(result.nom===carro[i].nom){
				            valor=false;
				        }
				    }
				    if(valor===true){
				    	
				    	var o = new Object();
				    	o.cant=0;
				    	o.nom=result.nom;
				    	o.codig=result.codig;
				    	o.preci=result.preci;
				    	o.stock=result.cant;
				    	o.idprod=result.idprod;
				    	o.costo=0;
				    	if(o.stock===0){
				    		 setTimeout(function() {
				    		        $("#stocker").fadeOut(0);
				    		    },0);
				    		 
				    		    setTimeout(function() {
				    		        $("#stocker").fadeIn(1500);
				    		    },6000);
				    	}else{
				       carro.push(o);
				       ListarProductos();
				    	}
				    }
				},
				error:function(){
					console.log("nosale");
				}
				});
	});
});
function ListarProductos(){
	$("#table tbody tr").remove(); 
    for(var i = 0;i<carro.length;i++){
       		
            $("#table").append("<tr><td>"+(i+1)+"</td >"+
                                       "<td><input id='"+i+"' value='"+carro[i].cant+"' class='form-control' ></td>"+
                                       "<td >"+carro[i].nom+"</td>"+
                                       "<td >"+carro[i].stock+"</td>"+
                                       "<td >"+carro[i].preci+"</td>"+
                                       "<td >"+carro[i].costo+"</td>"+
                                       "<td><a href='#' onclick='BorrarProducto("+i+")' ><i class='fas fa-trash-alt'></i></a></td>"+
                                       "</tr>");
     
    
    }
    }

function BorrarProducto(id){
	carro.splice(id,1);
	ListarProductos();
}

$("#table tbody ").click(function(){
	
	var r =$(this).find("input").keyup(function(){
		var n= $(this).val();
		var id = $(this).attr("id");
		var np = $("table tbody tr").eq(id).find("td").eq(4).html();
		var pp=parseFloat(n)*parseFloat(np);
		$("table tbody tr").eq(id).find("td").eq(5).html(pp) ;
		
	});
	
	
});

var mel;
	$("#volcartodo").click(function(){
		
	});
	$("#confirmar").click(function(){
		alert($('input:checkbox[name=colorfavorito]:checked').val());
		alert($('input:checkbox[name=colorfavorito]:checked').val());
	});
	$("#buscar").click(function(){
		var n =$("#clienteSearch").val();
		alert(n);
		 n="BuscarCliente/"+n;
		$.ajax({
				type:'GET',
				url:n,
				success:function(result){
					$("#clienteSearch").val(result[0].nombre);
					$("#apellidoSearch").val(result[0].apellido);
					$("#celularSearch").val(result[0].celular);
					$("#dniSearch").val(result[0].dni);
					$("#direccionSearch").val(result[0].direccion);
					$("#rucSearch").val(result[0].ruc);
					$("#razon_socialSearch").val(result[0].razon_social);
				},
				error:function(){
					console.log("nosalebuscar");
				}
		});
	});
	
</script>
</html>

