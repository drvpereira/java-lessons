package br.com.javamagazine.mensagens.email;

import br.com.javamagazine.mensagens.core.CanalEnvioMensagens;

public class CanalEmail implements CanalEnvioMensagens {

	private boolean ativo;
	
	public String enviar(String mensagem) {
		if (ativo)
			return "Enviando por e-mail: " + mensagem;
		return "";
	}

	public String getNome() {
		return "E-mail";
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
