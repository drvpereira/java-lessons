package br.farn.lojavirtual.services.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.farn.lojavirtual.dominio.Categoria;
import br.farn.lojavirtual.dominio.Produto;
import br.farn.lojavirtual.services.ProdutoService;

@Stateless
public class ProdutoServiceImpl implements ProdutoService {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void cadastrar(Produto obj) {		
		em.persist(obj);
	}

	@Override
	public void atualizar(Produto obj) {
		em.merge(obj);
	}

	@Override
	public void remover(Produto obj) {
		em.remove(obj);
	}

	@Override
	public Produto buscar(int id) {
		return em.find(Produto.class, id);
	}

	@Override
	public List<Produto> buscarTodos() {
		List<Produto> produtos = new ArrayList<Produto>();
		
		Categoria c1 = new Categoria();
		c1.setId(1);
		c1.setNome("Teste");
		
		Produto p1 = new Produto();
		p1.setId(1);
		p1.setNome("Produto 1");
		p1.setDescricao("Descrição 1");
		p1.setPreco(new BigDecimal("1.99"));
		p1.setCategoria(c1);
		produtos.add(p1);
		
		Produto p2 = new Produto();
		p2.setId(2);
		p2.setNome("Produto 2");
		p2.setDescricao("Descrição 2");
		p2.setPreco(new BigDecimal("2.99"));
		p2.setCategoria(c1);
		produtos.add(p2);
		
		Produto p3 = new Produto();
		p3.setId(3);
		p3.setNome("Produto 3");
		p3.setDescricao("Descrição 3");
		p3.setPreco(new BigDecimal("3.99"));
		p3.setCategoria(c1);
		produtos.add(p3);
		
		return produtos;
		
	}
		
}
