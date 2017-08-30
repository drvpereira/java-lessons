package br.farn.web3.dados;

import java.util.List;

import br.farn.web3.dominio.Municipio;

public interface MunicipioDAO {

	void salvar(Municipio municipio);

	void remover(Municipio municipio);

	List<Municipio> buscarTodos();

}
