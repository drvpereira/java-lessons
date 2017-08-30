package br.farn.lojavirtual.web;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.farn.lojavirtual.dominio.ItemCompra;
import br.farn.lojavirtual.dominio.Produto;
import br.farn.lojavirtual.services.CompraService;
import br.farn.lojavirtual.services.ProdutoService;

@ManagedBean @SessionScoped
public class CompraBean {

	@EJB
	private CompraService compraService;
	
	@EJB
	private ProdutoService produtoService;
	
	private Produto produto = new Produto();
	
	private DataModel<Produto> produtos;
	
	public DataModel<Produto> getProdutos() {
		if (produtos == null) {
			produtos = new ListDataModel<Produto>(produtoService.buscarTodos());
		}
		
		return produtos;
	}
	
	public int getTotalCarrinho() {
		return compraService.getProdutos().size();
	}
	
	public String adicionarProduto() {
		compraService.adicionarProduto(produtos.getRowData());
		return null;
	}

	public List<ItemCompra> getProdutosCarrinho() {
		return compraService.getProdutos();
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
