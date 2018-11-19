package com.sisveco.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ModelAndView ListarCliente(Model mo) {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("Registrarcliente");
		mo.addAttribute("modal",false);
		ma.addObject("lista",csi.readAll());
		ma.addObject("cliente",new Cliente());
		return ma;
	}
	@GetMapping("/ClienteListatrue")
	public ModelAndView ListarTrueCliente( @RequestParam("idcliente") int id ,Model model) {
		
		ModelAndView ma = new ModelAndView();
		Cliente c = csi.read(id);
		System.out.println(c.getNom());
		ma.setViewName("Registrarcliente");
		ma.addObject("cliente",c);
		ma.addObject("modal",true);
		ma.addObject("lista",csi.readAll());
		model.addAttribute("nom", c.getNom());
		model.addAttribute("apell", c.getApell());
		model.addAttribute("dni", c.getDni());
		model.addAttribute("direc", c.getDirec());
		model.addAttribute("cel", c.getCel());
		model.addAttribute("rucc", c.getRucc());
		model.addAttribute("raz_soc", c.getRaz_soc());
		
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
		
		model.addAttribute("idcliente",idcli);
		
		return "redirect:/cliente/ClienteListatrue";
	}
	@GetMapping("/upd")
	public String ClienteUpdate(Model model, @ModelAttribute("cliente") Cliente cliente) {
		csi.update(cliente);
		return "redirect:/Cliente/ClienteLista";
		
	}
}
