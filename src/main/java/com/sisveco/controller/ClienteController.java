package com.sisveco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sisveco.entity.Cliente;
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
	@GetMapping("/ClienteLista")
	public ModelAndView ListarCliente() {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("Registrarcliente");
		ma.addObject("lista",csi.readAll());
		return ma;
	}
	@GetMapping("/del/{id}")
	public String ClienteDelete(Model model, @PathVariable("id") int idcliente) {
		System.out.println("noool"+idcliente);
		csi.delete(idcliente);
		return "redirect:/cliente/ClienteLista";
	}
	@GetMapping("/read/{id}")
	public String ClienteReaD(Model model, @PathVariable("id") int idcli) {
		Cliente c = csi.read(idcli);
		System.out.println("nooldawd"+idcli);
		model.addAttribute("cliente",c);
		model.addAttribute("modal",c.getDirec());
		return "redirect:/cliente/ClienteLista";
	}
	@GetMapping("/upd")
	public String ClienteUpdate(Model model, @ModelAttribute("cliente") Cliente cliente) {
		csi.update(cliente);
		return "redirect:/Cliente/ClienteLista";
		
	}
}
