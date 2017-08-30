package br.farn.pcd.ejb;

import javax.ejb.Remote;

@Remote
public interface GeradorNomes {

	String gerar();
	
}
