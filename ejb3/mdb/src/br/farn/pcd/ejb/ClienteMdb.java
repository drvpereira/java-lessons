package br.farn.pcd.ejb;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;

public class ClienteMdb {

	public static void main(String[] args) throws Exception {
		/* Configuração do JMS */
		InitialContext ic = new InitialContext();
		ConnectionFactory cf = (ConnectionFactory) ic.lookup("jms/ConnectionFactory");
		Queue queue = (Queue) ic.lookup("jms/FilaMensagens");
		Connection con = cf.createConnection();
		Session session = con.createSession(false, Session.AUTO_ACKNOWLEDGE);

		/* Enviador de mensagens */
		MessageProducer mp = session.createProducer(queue);
		
		/* Criando uma nova mensagem */
		TextMessage msg = session.createTextMessage("Testando MDB");
		
		/* Enviando mensagem */
		mp.send(msg);
		
		System.out.println("Finalizando envio de mensagens!");
		System.exit(0);
	}
	
}
