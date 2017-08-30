package br.farn.pcd.ejb;

import javax.ejb.Local;

@Local
public interface GerenciadorLogon {

	boolean logar(String username, String password);

	String getNome();
	
}
