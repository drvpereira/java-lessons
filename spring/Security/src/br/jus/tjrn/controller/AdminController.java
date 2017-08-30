package br.jus.tjrn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.annotation.Secured;
import org.springframework.security.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@Autowired
	private RepositorioRegistroEntrada repositorio;
	
	@RequestMapping @Secured("ROLE_ADMIN")
	public String main() {
		return "adminmain";
	}
	
	@RequestMapping
	public String teste(ModelMap model) {
		Usuario usuario = (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute(repositorio.pegarPorLogin(usuario.getUsername()));
		return "adminteste";
	}
	
}
