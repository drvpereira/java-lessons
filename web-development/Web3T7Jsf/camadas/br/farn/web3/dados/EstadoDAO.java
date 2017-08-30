package br.farn.web3.dados;

import java.util.List;

import br.farn.web3.dominio.Estado;


public interface EstadoDAO {
	
	List<Estado> buscarTodos();
	
	void salvar(Estado estado);
	
	void remover(Estado estado);
	
}
