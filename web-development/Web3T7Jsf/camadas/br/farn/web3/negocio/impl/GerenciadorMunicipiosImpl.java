package br.farn.web3.negocio.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import br.farn.web3.dados.MunicipioDAO;
import br.farn.web3.dominio.Municipio;
import br.farn.web3.negocio.GerenciadorMunicipios;

@Component
public class GerenciadorMunicipiosImpl implements GerenciadorMunicipios {

	@Inject
	private MunicipioDAO dao;
	
	public void salvar(Municipio municipio) {
		dao.salvar(municipio);
	}

	public void remover(Municipio municipio) {
		dao.remover(municipio);
	}

	public List<Municipio> buscarTodos() {
		return dao.buscarTodos();
	}

}
