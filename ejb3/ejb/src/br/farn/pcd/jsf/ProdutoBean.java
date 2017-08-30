package br.farn.pcd.jsf;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.farn.pcd.dominio.Produto;
import br.farn.pcd.ejb.GerenciadorProdutos;

@ManagedBean
public class ProdutoBean {

	private Produto produto = new Produto();

	@EJB
	private GerenciadorProdutos gerenciador;
	
	public String cadastrar() {
		gerenciador.cadastrar(produto);
		return "lista";
	}
	
	public List<Produto> getProdutos() {
		return gerenciador.buscarTodos();
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
