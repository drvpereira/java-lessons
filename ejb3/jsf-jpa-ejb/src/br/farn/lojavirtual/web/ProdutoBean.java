package br.farn.lojavirtual.web;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.farn.lojavirtual.dominio.Produto;
import br.farn.lojavirtual.services.ProdutoService;

@ManagedBean
public class ProdutoBean {

	@EJB
	private ProdutoService service;
	
	private Produto produto = new Produto();
	
	public String cadastrar() {
		service.cadastrar(produto);
		return "lista";
	}
	
	public List<Produto> getProdutos() {
		return service.buscarTodos();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
