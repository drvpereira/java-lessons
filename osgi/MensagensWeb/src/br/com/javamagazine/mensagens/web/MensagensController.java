package br.com.javamagazine.mensagens.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.javamagazine.mensagens.core.CanalEnvioMensagens;

@Controller
public class MensagensController {

	@Resource(name="canal")
	private List<CanalEnvioMensagens> canais;
	
	@RequestMapping
	public String form(ModelMap model) {
		model.addAttribute("canais", canais);
		return "form";
	}
	
	@RequestMapping
	public String enviar(@RequestParam String mensagem, ModelMap model) {
		List<String> result = new ArrayList<String>();
		for (CanalEnvioMensagens canal : canais) {
			String status = canal.enviar(mensagem);
			if (!status.isEmpty()) result.add(status);			
		}
		model.addAttribute("result", result);
		return "result";
	}

	@RequestMapping
	public void selecionar(@RequestParam String nome, @RequestParam boolean ativo, HttpServletResponse res) {
		for (CanalEnvioMensagens canal : canais) {
			if (canal.getNome().equals(nome))
				canal.setAtivo(ativo);
		}
	}
	
}
