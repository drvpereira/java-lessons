package br.jus.tjrn.controller;

import java.util.Date;

public class TokenSingleSignOn {

	private int id;
	
	private String key;
	
	private boolean valid;
	
	private String username;
	
	private Date createdAt;
	
	private Date invalidatedAt;
	
	private String ip;

	public static TokenSingleSignOn criar(String login, long timestamp,
			String sessionId, String ip) {
		TokenSingleSignOn sso = new TokenSingleSignOn();
		sso.username = login;
		sso.createdAt = new Date(timestamp);
		sso.key = sessionId;
		sso.valid = true;
		sso.ip = ip;
		return sso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getInvalidatedAt() {
		return invalidatedAt;
	}

	public void setInvalidatedAt(Date invalidatedAt) {
		this.invalidatedAt = invalidatedAt;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
}