package br.jus.tjrn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenSingleSignOnService {

	@Autowired
	private RegistroSingleSignOn registro;
	
	public void registrarToken(String login, long timestamp, String sessionId, String ip) {
		TokenSingleSignOn sso = TokenSingleSignOn.criar(login, timestamp, sessionId, ip);
		registro.adicionar(sso);
	}
	
	public TokenSingleSignOn getToken(String login) {
		return registro.getValidByUserName(login);
	}
	
	public void invalidarToken(String key) {
		registro.invalidar(key);
	}
	
}
