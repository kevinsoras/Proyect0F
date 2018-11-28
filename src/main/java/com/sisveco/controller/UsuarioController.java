package com.sisveco.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sisveco.dao.UsuarioDao;
import com.sisveco.daoimp.UsuarioDaoImp;
import com.sisveco.entity.Usuario;
import com.sisveco.serviceImp.UsuarioServiceImp;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioServiceImp usi;
	@GetMapping("/Registrarusuario")
	
	public String Registrarusuario() {
		return "Registrarusuario";
	}
	
	@GetMapping("/UsuarioLista")
	public ModelAndView ListarUsuario(Model mo) {
		ModelAndView ma = new ModelAndView();
		ma.setViewName("registrarusuario");
		mo.addAttribute("modal",false);
		ma.addObject("lista",usi.readAll());
		ma.addObject("usuario",new Usuario());
		ma.addObject("usuarioCrear", new Usuario());
		return ma;
	}
	@GetMapping("/UsuarioListatrue")
	public ModelAndView ListarTrueUsuario( @RequestParam("idusuario") int id ,Model model) {
		ModelAndView ma = new ModelAndView();
		Usuario u = usi.read(id);
		ma.setViewName("Registrarusuario");
		ma.addObject("usuario",u);
		ma.addObject("modal",true);
		ma.addObject("lista",usi.readAll());
		ma.addObject("usuarioCrear",new Usuario());
		model.addAttribute("nombr", u.getNombr());
		model.addAttribute("apell", u.getApell());
		model.addAttribute("direc", u.getDirec());
		model.addAttribute("cel", u.getCel());
		model.addAttribute("idroll", u.getIdroll());
		model.addAttribute("usu", u.getUsu());
		model.addAttribute("pasw", u.getPasw());
		model.addAttribute("idusu", u.getIdusu());
		return ma;
	}
	@GetMapping("/del/{id}")
	public String UsuarioDelete(Model model, @PathVariable("id") int idusuario) {
		System.out.println("Probamos id"+idusuario);
		usi.delete(idusuario);
		return "redirect:/usuario/UsuarioLista";
	}
	@GetMapping("/read/{id}")
	public String UsuarioReaD(Model model, @PathVariable("id") int idusu) {

		model.addAttribute("idusuario",idusu);
		
		return "redirect:/usuario/UsuarioListatrue";
	}
	@GetMapping("/upd")
	public String UsuarioUpdate(Model model, @ModelAttribute("usuario") Usuario usuario) {
		usi.update(usuario);
		return "redirect:/usuario/UsuarioLista";
	}
	@GetMapping("/create")
	public String UsuarioCreate(@ModelAttribute ("usuarioCrear") Usuario usuario) {
		System.out.println("Nombre:" + usuario.getNombr());
		usi.create(usuario);
		return "redirect:/usuario/UsuarioLista";
	}
	
	/*public ModelAndView main1(Model model, HttpServletRequest request) {
	System.out.println(request.getParameter("user") + " / " + request.getParameter("password"));
	HttpSession httpSession = request.getSession();
	String user = request.getParameter("user");
	String password = request.getParameter("password");
	Usuario em = new Usuario(1, user, password);
	UsuarioDao usu = new UsuarioDaoImp();
	ModelAndView ma = new ModelAndView();
	try {
		List<Map<String, Object>> lista = usu.validarUsuario(em);
		if (!lista.isEmpty()) {
			ma.setViewName("principal");
			for (Map<String, Object> map : lista) {
				System.out.println(map.get("ACS_ID") + "/" + map.get("EMPL_APELLIDO") +"// "+map.get("ACS_NOMBRE"));
			}
			httpSession.setAttribute("user", em.getUsu());
			ma.addObject("user", (String) httpSession.getAttribute("user"));
			httpSession.setAttribute("lista", lista);
			ma.addObject("lista", (List<Map<String, Object>>) httpSession.getAttribute("lista"));
		} else {
				httpSession.invalidate();
				ma.setViewName("redirect:/");
		}
	} catch (Exception e) {
		// TODO: handle exception
		ma.setViewName("redirect:/");
	}
	return ma;
*/
}

