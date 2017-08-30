package br.farn.web3.apresentacao;

import javax.faces.model.ListDataModel;
import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.farn.web3.dominio.Estado;
import br.farn.web3.negocio.GerenciadorEstados;

@Component @Scope("view")
public class EstadoBean {

	@Inject
	private GerenciadorEstados gerenciador;
	
	private Estado estado = new Estado();
	
	private ListDataModel<Estado> estados;
	
	public String salvar() {
		gerenciador.salvar(estado);
		return "lista";
	}
	
	public String editar() {
		estado = estados.getRowData();
		return "form";
	}
	
	public String remover() {
		estado = estados.getRowData();
		gerenciador.remover(estado);
		return null;
	}
	
	public ListDataModel<Estado> getEstados() {
		estados = new ListDataModel<Estado>(gerenciador.buscarTodos());
		return estados;
	}
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
