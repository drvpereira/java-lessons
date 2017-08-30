package async;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("async/config.xml");
		AsyncTasks t = (AsyncTasks) ac.getBean("tasks");
		t.start();
		
		MailService service = (MailService) ac.getBean("mailService");
		LogService log = (LogService) ac.getBean("logService");
		
		for (int i = 0; i < 100; i++) {
			service.enviarEmail("testando... " + i);
			log.logar("log... " + i);
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Yay!");
			Thread.sleep(1);
		}
	}
	
}
