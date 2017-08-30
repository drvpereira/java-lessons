package br.farn.lojavirtual.services;

import java.util.List;

import br.farn.lojavirtual.dominio.ItemCompra;
import br.farn.lojavirtual.dominio.Produto;

public interface CompraService {

	void adicionarProduto(Produto produto);
	
	public List<ItemCompra> getProdutos();

}
