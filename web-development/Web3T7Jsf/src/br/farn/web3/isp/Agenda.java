package br.farn.web3.isp;

import java.util.List;

public interface Agenda {

	void adicionarContato(String contato);
	
	List<String> buscarContatos();
	
	void telefonarParaContato(String contato);
	
}
