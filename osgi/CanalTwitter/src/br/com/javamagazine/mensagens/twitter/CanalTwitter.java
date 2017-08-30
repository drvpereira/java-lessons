package br.com.javamagazine.mensagens.twitter;

import br.com.javamagazine.mensagens.core.CanalEnvioMensagens;

public class CanalTwitter implements CanalEnvioMensagens {

	private boolean ativo = true;
	
	@Override
	public String enviar(String message) {
		if (ativo)
			return "Enviando por Twitter: " + message;
		else
			return "";
	}

	@Override
	public String getNome() {
		return "Twitter";
	}

	@Override
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
