package br.farn.t7.sd.ejb;

import javax.ejb.Remote;

@Remote
public interface GeradorNomes {

	String nome();
	
}
