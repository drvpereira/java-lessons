package cep.ws;

import cep.dao.CepDao;
import cep.dominio.Logradouro;

public class BuscaCep {

	public Logradouro getLogradouro(String cep) {
		return new CepDao().buscarLogradouroPorCep(cep);
	}
	
}
