package br.farn.web3.dados.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.inject.Inject;

import org.springframework.orm.hibernate3.HibernateTemplate;

public abstract class AbstractDAO<T> {

	@Inject
	private HibernateTemplate ht;
	
	public void salvar(T obj) {
		ht.saveOrUpdate(obj);
	}

	public void remover(T obj) {
		ht.delete(obj);
	}

	@SuppressWarnings("unchecked")
	public List<T> buscarTodos() {
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		Type param = type.getActualTypeArguments()[0];
		return ht.loadAll((Class<T>) param);
	}
	
}
