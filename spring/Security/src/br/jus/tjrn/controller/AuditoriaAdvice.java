package br.jus.tjrn.controller;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.security.context.SecurityContext;
import org.springframework.security.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Aspect @Component
public class AuditoriaAdvice {

	@Around("")
	public Object audit(ProceedingJoinPoint pjp) throws Throwable {
		
		SecurityContext sc = SecurityContextHolder.getContext();
		Usuario usuario = (Usuario) sc.getAuthentication().getDetails();
		
		usuario.getRegistroAtual();
		
		return pjp.proceed();
	}
	
}
