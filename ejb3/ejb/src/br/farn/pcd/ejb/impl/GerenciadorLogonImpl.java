package br.farn.pcd.ejb.impl;

import javax.ejb.Stateful;

import br.farn.pcd.ejb.GerenciadorLogon;

@Stateful
public class GerenciadorLogonImpl implements GerenciadorLogon {

	private String nome;
	
	@Override
	public boolean logar(String username, String password) {

		if ("usuario1".equals(username) && "1234".equals(password)) {
			nome = "José";
			return true;
		} else if ("usuario2".equals(username) && "4321".equals(password)) {
			nome = "Francisco";
			return true;
		}
		
		return false;
	}

	public String getNome() {
		return nome;
	}
	
}
