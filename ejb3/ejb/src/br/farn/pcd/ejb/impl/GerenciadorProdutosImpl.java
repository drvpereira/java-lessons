package br.farn.pcd.ejb.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.farn.pcd.dominio.Produto;
import br.farn.pcd.ejb.GerenciadorProdutos;

@Stateless
public class GerenciadorProdutosImpl implements GerenciadorProdutos {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void cadastrar(Produto produto) {
		em.persist(produto);
	}

	@Override
	public List<Produto> buscarTodos() {
		return em.createQuery("select p from Produto p order by p.nome", 
				Produto.class).getResultList();
	}

}
