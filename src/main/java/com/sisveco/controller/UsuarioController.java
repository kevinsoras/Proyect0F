package com.sisveco.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	@GetMapping("/Validarusuario")
	
	public String Validarusuario() {
		return "Validarusuario";
	}
	@GetMapping("/{id}")
	public ModelAndView main1(Model model, HttpServletRequest request) {
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
	}
}
