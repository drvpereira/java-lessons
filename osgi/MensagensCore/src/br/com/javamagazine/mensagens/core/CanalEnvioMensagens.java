package br.com.javamagazine.mensagens.core;

public interface CanalEnvioMensagens {

	public String enviar(String mensagem);
	
	public String getNome();
	
	public void setAtivo(boolean ativo);
	
}
