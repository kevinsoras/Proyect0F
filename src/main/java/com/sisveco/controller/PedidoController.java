package com.sisveco.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sisveco.entity.Cliente;
import com.sisveco.entity.Producto;
import com.sisveco.serviceImp.ClienteServiceImp;
import com.sisveco.serviceImp.ProductoServiceImp;

@Controller
@RequestMapping("/pedidoventa")
public class PedidoController {
@Autowired 
private ProductoServiceImp psi;
@Autowired
private ClienteServiceImp csi;



@GetMapping("/RegistrarPedidoventa")
public ModelAndView ListarProducto() {
	ModelAndView ma = new ModelAndView();
	ma.setViewName("pedidocompra");
	ma.addObject("productos",psi.readAll());
	
	
	//mo.addAttribute("modal",false);
	
	return ma;
}

@GetMapping("/Listapedidoproductos/{id}")
@ResponseBody
public Producto ListadoProductos(@PathVariable(value="id") int id){
	System.out.println("productossslear");
	return  psi.read(id);
}
@GetMapping("/BuscarCliente/{ingreso}")
@ResponseBody
public List<Map<String,Object>> BuscarClientes(@PathVariable(value="ingreso") String key) {
	System.out.println("key"+key);
	String llave =(String)key;
	List<Map<String,Object>> mas = csi.Search(llave);
	System.out.println(mas.size());
	for(Map<String,Object> ma : mas ) {
		System.out.println(ma.get("dni"));
	}
	
	
	return csi.Search(llave);
}

@GetMapping("/IngresarProducto")
public ModelAndView IngresarProducto( @RequestParam("idpro") int idpro, Model model) {
	ModelAndView ma = new ModelAndView();
	ma.addObject("productos",psi.readAll());
	Producto o= psi.read(idpro);
	System.out.println(o.getNom());
	//System.out.println(psi.read(idcli).getNom());
	ma.setViewName("pedidocompra");
	
	return ma;
}

@GetMapping("/ObtenerProducto/{id}")
public String ClienteDelete(Model model, @PathVariable("id") int idproducto) {
	model.addAttribute("idpro",idproducto);
	return "redirect:/pedidoventa/IngresarProducto";
}

}
