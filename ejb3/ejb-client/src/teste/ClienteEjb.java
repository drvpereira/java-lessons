package teste;

import javax.jms.JMSException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.farn.lojavirtual.services.TesteService;

public class ClienteEjb {

	public static void main(String[] args) throws NamingException, JMSException {
		
		Properties p = new Properties();
		p.put("org.omg.CORBA.ORBInitialHost", "192.168.1.100");
		p.put("org.omg.CORBA.ORBInitialPort", "3700");
		
		InitialContext ic = new InitialContext(p);

		
		TesteService ts = (TesteService) ic.lookup(TesteService.class.getName());
		System.out.println(ts.mensagem());
		
	}
	
}
