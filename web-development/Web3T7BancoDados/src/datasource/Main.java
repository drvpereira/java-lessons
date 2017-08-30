package datasource;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) throws Exception {
		ApplicationContext ac = 
			new ClassPathXmlApplicationContext("datasource/applicationContext.xml");
		
		CorreiosDao dao = (CorreiosDao) ac.getBean("correiosDao");
		
		System.out.println( dao.buscarQtdEstados() );
		
		System.out.println( dao.buscarQtdCidadesNoEstado("RN") );
		
		System.out.println( dao.inserirEstado("Tapaj—s", "TA") );
		
		System.out.println( dao.buscarNomeEstadoPorSigla("PA") );
		
		Localidade l = dao.buscarLocalidadePorId(1);
		
		System.out.println("-------------");
		System.out.println(l.getId());
		System.out.println(l.getNome());
		System.out.println(l.getUf());
		
		
		List<Localidade> localidadesRN = dao.buscarLocalidadesPorUf("RN");
		
		for (Localidade localidade : localidadesRN) {
			System.out.println("-------------");
			System.out.println(localidade.getId());
			System.out.println(localidade.getNome());
			System.out.println(localidade.getUf());
		}
		
		
	}
	
}
