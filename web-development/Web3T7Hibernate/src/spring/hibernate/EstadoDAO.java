package spring.hibernate;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component @SuppressWarnings("unchecked")
public class EstadoDAO {

	@Inject
	private HibernateTemplate ht;
	
	public Estado buscarPorId(int id) {
		return ht.get(Estado.class, id);
	}
	
	public List<Estado> buscarTodos() {
		return ht.loadAll(Estado.class);
	}
	
	public void inserir(Estado estado) {
		ht.save(estado);
	}
	
	public void atualizar(Estado estado) {
		ht.update(estado);
	}
	
	public void salvar(Estado estado) {
		ht.saveOrUpdate(estado);
	}
	
	public void remover(Estado estado) {
		ht.delete(estado);
	}
	
	public List<Estado> buscarPorNome(String nome) {
		return ht.find("from Estado where nome like ?", nome + "%");
	}
	
	public List<Estado> buscarPorNomeCriteria(String nome) {
		DetachedCriteria c = DetachedCriteria.forClass(Estado.class);
		c.add(Restrictions.ilike("nome", nome + "%"));
		return ht.findByCriteria(c);
	}
	
	public Estado buscarPorSigla(String sigla) {
		List<Estado> estados = ht.find("from Estado where sigla = ?", sigla);
		if (!estados.isEmpty())
			return estados.iterator().next();
		else
			return null;
		
	}
	
	
}
