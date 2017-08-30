package br.jus.tjrn.controller;

import java.util.Date;

public class RegistroEntrada {

	private long id;
	
	private String login;
	
	private Date dataLogon;
	
	private Date dataLogoff;
	
	private String remoteAddress;
	
	private String sessionId;
	
	public static RegistroEntrada criar(String login, long timestamp, 
			String remoteAddress, String sessionId) {
		
		RegistroEntrada r = new RegistroEntrada();
		r.login = login;
		r.dataLogon = new Date(timestamp);
		r.remoteAddress = remoteAddress;
		r.sessionId = sessionId;
		
		return r;
	}
	
	public void registrarLogoff(long timestamp) {
		dataLogoff = new Date(timestamp);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Date getDataLogon() {
		return dataLogon;
	}

	public void setDataLogon(Date dataLogon) {
		this.dataLogon = dataLogon;
	}

	public Date getDataLogoff() {
		return dataLogoff;
	}

	public void setDataLogoff(Date dataLogoff) {
		this.dataLogoff = dataLogoff;
	}

	public String getRemoteAddress() {
		return remoteAddress;
	}

	public void setRemoteAddress(String remoteAddress) {
		this.remoteAddress = remoteAddress;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
