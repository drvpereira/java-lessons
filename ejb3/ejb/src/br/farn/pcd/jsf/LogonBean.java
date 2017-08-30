package br.farn.pcd.jsf;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.farn.pcd.ejb.GerenciadorLogon;

@ManagedBean @SessionScoped
public class LogonBean {

	private String username;
	
	private String password;

	@EJB
	private GerenciadorLogon gerenciador;
	
	public String logar() {
		boolean sucesso = gerenciador.logar(username, password);
		
		if (sucesso) {
			return "inicio";
		} else {
			return "falha";
		}
	}
	
	public GerenciadorLogon getGerenciador() {
		return gerenciador;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
