package br.farn.t7.sd.ejb;

import javax.ejb.Stateful;

@Stateful(name="GeradorNomes")
public class GeradorNomesImpl implements GeradorNomes {

	private int i;
	
	public String nome() {
		return "David (" + i++ + ")";
	}
	
}
