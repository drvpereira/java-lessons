package br.farn.pcd.ejb.impl;

import java.util.Random;

import javax.ejb.Stateless;

import br.farn.pcd.ejb.GeradorNomes;

@Stateless(mappedName="GeradorNomes")
public class GeradorNomesAleatorios implements GeradorNomes {

	private String[] nomes = { "David", "João", "Francisco", 
			"José", "Pedro", "Maria", "Joana" };
	
	@Override
	public String gerar() {
		Random r = new Random();
		return nomes[r.nextInt(nomes.length)] + " (do EJB de David)";
	}

}
