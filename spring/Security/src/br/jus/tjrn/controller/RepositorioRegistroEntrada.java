package br.jus.tjrn.controller;

import java.util.List;

public interface RepositorioRegistroEntrada {

	public RegistroEntrada pegarRegistroEntrada(String sessionId);
	
	public void adicionar(RegistroEntrada re);
	
	public void atualizar(RegistroEntrada re);

	public List<RegistroEntrada> pegarPorLogin(String login);
	
}
