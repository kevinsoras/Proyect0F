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
import org.springframework.web.servlet.ModelAndView;

import com.sisveco.entity.Cliente;
import com.sisveco.entity.Producto;
import com.sisveco.serviceImp.ProductoServiceImp;

@Controller
@RequestMapping("/pedidoventa")
public class PedidoController {
@Autowired 
private ProductoServiceImp psi;

private List<Map<String,Object>> object = new ArrayList<>();

@GetMapping("/RegistrarPedidoventa")
public ModelAndView ListarProducto() {
	ModelAndView ma = new ModelAndView();
	ma.setViewName("pedidocompra");
	ma.addObject("productos",psi.readAll());
	for(Map<String,Object> ne :object) {
		object.remove(ne);
	}
	//mo.addAttribute("modal",false);
	
	return ma;
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
