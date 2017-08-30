package br.jus.tjrn.controller;

public interface RegistroEntradaService {

	public RegistroEntrada registrarEntrada(String login, long timestamp,
			String remoteAddress, String sessionId);
	
	public void registrarSaida(String sessionId, long timestamp);
	
}
