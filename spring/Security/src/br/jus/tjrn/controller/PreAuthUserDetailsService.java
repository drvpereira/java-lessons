package br.jus.tjrn.controller;

import org.springframework.dao.DataAccessException;
import org.springframework.security.Authentication;
import org.springframework.security.GrantedAuthority;
import org.springframework.security.GrantedAuthorityImpl;
import org.springframework.security.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.userdetails.UserDetails;
import org.springframework.security.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class PreAuthUserDetailsService implements AuthenticationUserDetailsService {

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
		Usuario u = new Usuario();
		u.setUsername("maria");
		u.setPassword("1234");
		u.setAtivo(true);
		u.setPessoa(new Pessoa("Maria da Silva", "123.456.789-10"));
		u.setPapeis(new GrantedAuthority[] {
				new GrantedAuthorityImpl("ROLE_USER"),
				new GrantedAuthorityImpl("ROLE_MARIA")
		});
		
		return u;
	}

	public UserDetails loadUserDetails(Authentication token) throws UsernameNotFoundException {
		UserDetails principal = (UserDetails) token.getPrincipal();
		return loadUserByUsername(principal.getUsername());
	}
}
