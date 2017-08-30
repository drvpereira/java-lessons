package br.farn.web3.negocio;

import java.util.List;

import br.farn.web3.dominio.Estado;

public interface GerenciadorEstados {

	List<Estado> buscarTodos();
	
	void salvar(Estado estado);
	
	void remover(Estado estado);
	
}

