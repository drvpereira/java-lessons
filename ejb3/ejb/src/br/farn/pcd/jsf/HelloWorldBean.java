package br.farn.pcd.jsf;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.farn.pcd.ejb.GeradorNomes;

@ManagedBean
public class HelloWorldBean {

	@EJB
	private GeradorNomes gerador;
	
	public String getMensagem() {
		return "Hello, " + gerador.gerar() + "!";
	}
	
}
