package br.farn.pcd.ejb.impl;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName="jms/FilaMensagens")
public class MessageDrivenBean implements MessageListener {

	@Override
	public void onMessage(Message message) {
		System.out.println("Recebi uma mensagem");
	}

}
