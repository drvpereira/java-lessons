package br.com.javamagazine.mensagens.sms;

import br.com.javamagazine.mensagens.core.CanalEnvioMensagens;

public class CanalSms implements CanalEnvioMensagens {

	private boolean ativo = true;
	
	@Override
	public String enviar(String mensagem) {
		if (ativo)
			return "Enviando por SMS: " + mensagem;
		else
			return "";
	}

	@Override
	public String getNome() {
		return "SMS";
	}

	@Override
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
