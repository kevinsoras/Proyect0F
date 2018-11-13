package com.sisveco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
@GetMapping("/")
public String login() {
	return "login";
}
@PostMapping("/home")
public String main1() {
	return "main";
}
@GetMapping("/home")
public String main2() {
	return "main";
}

@GetMapping("/pagocreditpagar")
public String pagocreditpagar() {
	return "pagocreditpagar";
}
@GetMapping("/pagocreditprin")
public String pagocreditprin() {
	return "pagocreditprin";
}
@GetMapping("/pagocreditsecu")
public String pagocreditsecu() {
	return "pagocreditsecu";
}
@GetMapping("/pedidocompra")
public String pedidocompra() {
	return "pedidocompra";
}
@GetMapping("/pedidodecompra")
public String pedidodecompra() {
	return "pedidodecompra";
}
@GetMapping("/pedidoventa")
public String pedidoventa() {
	return "pedidoventa";
}

@GetMapping("/registrarfacturacompra")
public String registrarfacturacompra() {
	return "registrarfacturacompra";
}
@GetMapping("/registrarproducto")
public String registrarproducto() {
	return "registrarproducto";
}@GetMapping("/registrarusuario")
public String registrarusuario() {
	return "registrarusuario";
}
@GetMapping("/index")
public String index() {
	return "index";
}
}
