package br.farn.web3.estados;

import java.util.List;

import javax.inject.Inject;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class EstadoDAO {

	@Inject
	private HibernateTemplate ht;
	
	public List<Estado> buscarTodos() {
		return ht.loadAll(Estado.class);
	}
	
	public void salvar(Estado estado) {
		ht.saveOrUpdate(estado);
	}

	public void remover(Estado estado) {
		ht.delete(estado);
	}
	
}
