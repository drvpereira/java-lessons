package teste;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ClienteMdb {

	public static void main(String[] args) throws NamingException, JMSException {
		
		InitialContext ic = new InitialContext();
		
		ConnectionFactory connFactory = (ConnectionFactory) ic.lookup("jms/ConnectionFactory");
		Queue queue = (Queue) ic.lookup("jms/Queue");
		
		Connection connection = connFactory.createConnection();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		MessageProducer mp = session.createProducer(queue);
		
		TextMessage msg = session.createTextMessage();
		msg.setText("Teste");
		mp.send(msg);
		
		mp.close();
		session.close();
		connection.close();
		
		System.exit(0);
	}
	
}
