package spring.hibernate;

import javax.inject.Inject;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component @Transactional
public class ClasseTransacional {

	@Inject
	private EstadoDAO dao;
	
	public void metodoTransacional() {
		
		Estado e1 = new Estado();
		e1.setNome("Teste 1");
		e1.setSigla("T1");
		
		dao.inserir(e1);
		
		Estado e2 = new Estado();
		e2.setNome("Teste 2");
		e2.setSigla("T2");
		
		dao.inserir(e2);
		
	}
	
}
