package versao8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac = 
			new ClassPathXmlApplicationContext("versao8/applicationContext.xml");
		
		for (int i = 0; i < 10; i++) {
			Computador c = (Computador) ac.getBean("computador");
			System.out.println(c);
		}
		
	}
	
}
