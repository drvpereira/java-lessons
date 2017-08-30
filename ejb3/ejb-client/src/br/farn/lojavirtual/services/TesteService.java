package br.farn.lojavirtual.services;

import javax.ejb.Remote;

@Remote
public interface TesteService {

	String mensagem();
	
}
