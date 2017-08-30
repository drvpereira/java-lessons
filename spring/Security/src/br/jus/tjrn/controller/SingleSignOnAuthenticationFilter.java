package br.jus.tjrn.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.GrantedAuthority;
import org.springframework.security.GrantedAuthorityImpl;
import org.springframework.security.ui.preauth.AbstractPreAuthenticatedProcessingFilter;

public class SingleSignOnAuthenticationFilter 
		extends AbstractPreAuthenticatedProcessingFilter {

	@Autowired
	private TokenSingleSignOnService service;
	
	@Override
	protected Object getPreAuthenticatedCredentials(HttpServletRequest req) {
		return "N/A";
	}

	@Override
	protected Object getPreAuthenticatedPrincipal(HttpServletRequest req) {
		TokenSingleSignOn token = service.getToken(req.getParameter("login"));
		
		if (token != null && req.getRemoteAddr().equals(token.getIp())) {
			Usuario u = new Usuario();
			u.setUsername("maria");
			u.setPapeis(new GrantedAuthority[] {
					new GrantedAuthorityImpl("ROLE_USER"),
					new GrantedAuthorityImpl("ROLE_MARIA")
			});
			return u;
		}
		
		return null;
	}

	@Override
	public int getOrder() {
		return 0;
	}

}
