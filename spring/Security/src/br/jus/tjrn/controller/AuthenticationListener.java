package br.jus.tjrn.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.concurrent.SessionRegistryUtils;
import org.springframework.security.context.SecurityContext;
import org.springframework.security.event.authentication.AuthenticationSuccessEvent;
import org.springframework.security.providers.UsernamePasswordAuthenticationToken;
import org.springframework.security.ui.WebAuthenticationDetails;
import org.springframework.security.ui.session.HttpSessionDestroyedEvent;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationListener implements ApplicationListener {

	@Autowired
	private RegistroEntradaService service;
	
	@Autowired
	private TokenSingleSignOnService ssoService;
	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		
		if (event instanceof AuthenticationSuccessEvent) {
			if (event.getSource() instanceof UsernamePasswordAuthenticationToken) {
				UsernamePasswordAuthenticationToken token = 
					(UsernamePasswordAuthenticationToken) event.getSource();
				
				Usuario user = (Usuario) token.getPrincipal();
				
				WebAuthenticationDetails details = 
					(WebAuthenticationDetails) token.getDetails();
				
				RegistroEntrada registro = service.registrarEntrada(user.getUsername(), 
						event.getTimestamp(), details.getRemoteAddress(), 
						details.getSessionId());
				
				user.setRegistroAtual(registro);
	
				ssoService.registrarToken(user.getUsername(), event.getTimestamp(), 
						details.getSessionId(), details.getRemoteAddress());
			}
		} else if (event instanceof HttpSessionDestroyedEvent) {
			
			HttpSession session = (HttpSession) event.getSource();
			SecurityContext sc = 
				(SecurityContext) session.getAttribute("SPRING_SECURITY_CONTEXT"); 
				
			if (sc != null) {

				String sessionId = SessionRegistryUtils.obtainSessionIdFromAuthentication(
						sc.getAuthentication());
				//String login = (String) SessionRegistryUtils.obtainPrincipalFromAuthentication(
				//		sc.getAuthentication());
				
				service.registrarSaida(sessionId, event.getTimestamp());
				ssoService.invalidarToken(sessionId);
			}
			
		}
		
	}

}
