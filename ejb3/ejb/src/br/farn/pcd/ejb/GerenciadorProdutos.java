package br.farn.pcd.ejb;

import java.util.List;

import javax.ejb.Local;

import br.farn.pcd.dominio.Produto;

@Local
public interface GerenciadorProdutos {

	void cadastrar(Produto produto);

	List<Produto> buscarTodos();

}
