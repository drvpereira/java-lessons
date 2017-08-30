package versao7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac = 
			new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Computador c = (Computador) ac.getBean("computador");
		c.ligar();
		
	}
	
}
