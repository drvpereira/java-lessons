package br.farn.lojavirtual.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.farn.lojavirtual.dominio.Categoria;
import br.farn.lojavirtual.services.CategoriaService;

@Stateless
public class CategoriaServiceImpl implements CategoriaService {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void cadastrar(Categoria obj) {		
		em.persist(obj);
	}

	@Override
	public void atualizar(Categoria obj) {
		em.merge(obj);
	}

	@Override
	public void remover(Categoria obj) {
		em.remove(obj);
	}

	@Override
	public Categoria buscar(int id) {
		return em.find(Categoria.class, id);
	}

	@Override
	public List<Categoria> buscarTodos() {
		return em.createQuery("select c from Categoria c order by c.nome asc", Categoria.class).getResultList();
	}
		
}
