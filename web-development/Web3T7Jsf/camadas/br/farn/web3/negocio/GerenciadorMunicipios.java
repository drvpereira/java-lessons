package br.farn.web3.negocio;

import java.util.List;

import br.farn.web3.dominio.Municipio;

public interface GerenciadorMunicipios {

	void salvar(Municipio municipio);

	void remover(Municipio municipio);

	List<Municipio> buscarTodos();

}
