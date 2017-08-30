package br.farn.lojavirtual.services.impl;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName="jms/Queue")
public class MessageReceiver implements MessageListener {

	@Override
	public void onMessage(Message message) {
		System.out.println("Recebi mensagem");
	}

}
