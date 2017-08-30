package br.farn.lojavirtual.services.impl;

import javax.ejb.Stateless;

import br.farn.lojavirtual.services.TesteService;

@Stateless
public class TesteServiceImpl implements TesteService {

	@Override
	public String mensagem() {
		return "From EJB";
	}

}
