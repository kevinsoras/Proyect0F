package com.sisveco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sisveco.serviceImp.ClienteServiceImp;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	private ClienteServiceImp csi;
	@GetMapping("/Registrarcliente")
	public String Registrarcliente() {
		return "Registrarcliente";
	}
	@GetMapping("/listarCliente")
	public ModelAndView ListarCliente() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("Registrarcliente");
		ma.addObject("lista",csi.readAll());
		return ma;
	}
	
}
