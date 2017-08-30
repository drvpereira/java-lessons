package br.farn.web3.apresentacao;

import javax.faces.model.ListDataModel;
import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.farn.web3.dominio.Municipio;
import br.farn.web3.negocio.GerenciadorMunicipios;

@Component @Scope("request")
public class MunicipioBean {

	@Inject
	private GerenciadorMunicipios gerenciador;
	
	private Municipio municipio = new Municipio();
	
	private ListDataModel<Municipio> municipios;
	
	public String salvar() {
		gerenciador.salvar(municipio);
		return "lista";
	}
	
	public String editar() {
		municipio = municipios.getRowData();
		return "form";
	}
	
	public String remover() {
		municipio = municipios.getRowData();
		gerenciador.remover(municipio);
		return null;
	}
	
	public ListDataModel<Municipio> getEstados() {
		municipios = new ListDataModel<Municipio>(gerenciador.buscarTodos());
		return municipios;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	
}
