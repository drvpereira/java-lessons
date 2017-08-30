package br.jus.tjrn.controller;

import org.springframework.security.GrantedAuthority;
import org.springframework.security.userdetails.UserDetails;


public class Usuario implements UserDetails {

	private String username;
	
	private String password;
	
	private Pessoa pessoa;
	
	private GrantedAuthority[] papeis;
	
	private boolean ativo;
	
	private RegistroEntrada registroAtual;
	
	public RegistroEntrada getRegistroAtual() {
		return registroAtual;
	}

	public void setRegistroAtual(RegistroEntrada registroAtual) {
		this.registroAtual = registroAtual;
	}

	@Override
	public GrantedAuthority[] getAuthorities() {
		return papeis;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return ativo;
	}

	public void setPapeis(GrantedAuthority[] papeis) {
		this.papeis = papeis;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
