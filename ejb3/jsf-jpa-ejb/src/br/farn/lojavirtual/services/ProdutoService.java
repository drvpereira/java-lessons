package br.farn.lojavirtual.services;

import java.util.List;

import javax.ejb.Local;

import br.farn.lojavirtual.dominio.Produto;

@Local
public interface ProdutoService {

	void cadastrar(Produto obj);
	
	void atualizar(Produto obj);
	
	void remover(Produto obj);
	
	Produto buscar(int id);
	
	List<Produto> buscarTodos();
	
}
