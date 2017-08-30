/**
 * 
 */
package br.farn.t7.sd.jsf;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.farn.t7.sd.ejb.GeradorNomes;

/**
 * @author david
 *
 */
@ManagedBean @SessionScoped
public class TesteBean {

	@EJB
	private GeradorNomes gerador;
	
	public String getMensagem() {
		return "Hello, " + gerador.nome() + "!";
	}
	
}
