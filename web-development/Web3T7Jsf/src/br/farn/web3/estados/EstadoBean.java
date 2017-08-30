package br.farn.web3.estados;

import javax.faces.model.ListDataModel;
import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("estadoAntigoBean") @Scope("request")
public class EstadoBean {

	@Inject
	private EstadoDAO dao;
	
	private Estado estado = new Estado();
	
	private ListDataModel<Estado> estados;
	
	public String salvar() {
		dao.salvar(estado);
		return "lista";
	}
	
	public String editar() {
		estado = estados.getRowData();
		return "form";
	}
	
	public String remover() {
		estado = estados.getRowData();
		dao.remover(estado);
		return null;
	}
	
	public ListDataModel<Estado> getEstados() {
		estados = new ListDataModel<Estado>(dao.buscarTodos());
		return estados;
	}
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
