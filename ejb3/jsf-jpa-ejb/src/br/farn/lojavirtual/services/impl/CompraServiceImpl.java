package br.farn.lojavirtual.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

import br.farn.lojavirtual.dominio.Compra;
import br.farn.lojavirtual.dominio.ItemCompra;
import br.farn.lojavirtual.dominio.Produto;
import br.farn.lojavirtual.services.CompraService;

@Stateful
public class CompraServiceImpl implements CompraService {

	private Compra compra = new Compra();
	
	private List<ItemCompra> produtos = new ArrayList<ItemCompra>();
	
	@Override
	public void adicionarProduto(Produto produto) {
		ItemCompra item = new ItemCompra();
		item.setProduto(produto);
		item.setCompra(compra);
		item.setPrecoUnitario(produto.getPreco());
		
		if (produtos.contains(item)) {
			item = produtos.get(produtos.indexOf(item));
		} else { 
			produtos.add(item);
		}
		
		item.incrementaQuantidade();
	}

	public List<ItemCompra> getProdutos() {
		return produtos;
	}

}
