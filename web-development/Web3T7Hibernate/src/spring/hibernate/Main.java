package spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac = 
			new ClassPathXmlApplicationContext("spring/hibernate/applicationContext.xml");
		
		ClasseTransacional tx = (ClasseTransacional) ac.getBean("classeTransacional");

		tx.metodoTransacional();
		
	}
	
}
