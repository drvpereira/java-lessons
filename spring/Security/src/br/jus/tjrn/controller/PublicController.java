package br.jus.tjrn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicController {

	@RequestMapping
	public String main() {
		return "publicmain";
	}
	
}
