package br.farn.lojavirtual.web;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.farn.lojavirtual.dominio.Categoria;
import br.farn.lojavirtual.services.CategoriaService;

@ManagedBean
public class CategoriaBean {

	@EJB
	private CategoriaService service;
	
	private Categoria categoria = new Categoria();
	
	public String cadastrar() {
		service.cadastrar(categoria);
		return "lista";
	}
	
	public List<Categoria> getCategorias() {
		return service.buscarTodos();
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
