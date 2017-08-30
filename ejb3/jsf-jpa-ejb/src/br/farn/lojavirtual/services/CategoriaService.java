package br.farn.lojavirtual.services;

import java.util.List;

import javax.ejb.Local;

import br.farn.lojavirtual.dominio.Categoria;

@Local
public interface CategoriaService {

	void cadastrar(Categoria obj);
	
	void atualizar(Categoria obj);
	
	void remover(Categoria obj);
	
	Categoria buscar(int id);
	
	List<Categoria> buscarTodos();
	
}
