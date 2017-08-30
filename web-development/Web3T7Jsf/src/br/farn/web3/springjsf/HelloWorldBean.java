package br.farn.web3.springjsf;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component @Scope("request")
public class HelloWorldBean {

	@Inject
	private GeradorAleatorioNomes gerador;
	
	public String getMensagem() {
		return "Hello, " + gerador.getNome() + "!";
	}
	
}
