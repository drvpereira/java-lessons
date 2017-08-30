package br.jus.tjrn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroEntradaServiceImpl 
		implements RegistroEntradaService {

	@Autowired
	private RepositorioRegistroEntrada repositorio;
	
	@Override
	public RegistroEntrada registrarEntrada(String login, long timestamp,
			String remoteAddress, String sessionId) {
		
		RegistroEntrada registro = RegistroEntrada.criar(login, timestamp, remoteAddress, sessionId);
		repositorio.adicionar(registro);
		
		return registro;
		
	}

	@Override
	public void registrarSaida(String sessionId, long timestamp) {
		RegistroEntrada registro = repositorio.pegarRegistroEntrada(sessionId);
		registro.registrarLogoff(timestamp);
		repositorio.atualizar(registro);
	}

}
