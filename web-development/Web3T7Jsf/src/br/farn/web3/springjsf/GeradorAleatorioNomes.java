package br.farn.web3.springjsf;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class GeradorAleatorioNomes {

	private String[] nomes = {
		"David", "Daniel", "Jailson", "Maria Emilia", "Ronald", "Tiago", "Vicente"	
	};
	
	public String getNome() {
		Random r = new Random();
		return nomes[r.nextInt(7)];
	}
	
}
