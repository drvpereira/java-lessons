package br.farn.web3.negocio.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import br.farn.web3.dados.EstadoDAO;
import br.farn.web3.dominio.Estado;
import br.farn.web3.negocio.GerenciadorEstados;

@Component
public class GerenciadorEstadosImpl implements GerenciadorEstados {

	@Inject
	private EstadoDAO dao;

	public List<Estado> buscarTodos() {
		return dao.buscarTodos();
	}

	public void salvar(Estado estado) {
		dao.salvar(estado);
	}
	
	public void remover(Estado estado) {
		dao.remover(estado);
	}
	
}


