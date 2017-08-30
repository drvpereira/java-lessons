package versao6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac = 
			new ClassPathXmlApplicationContext("versao6/applicationContext.xml");
		
		Computador c = (Computador) ac.getBean("computador");
		c.ligar();
		
	}
	
}
