package br.farn.web3.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity @Table(name="estado", schema="correios")
public class Estado {

	@Id @GeneratedValue(generator="seqGenerator", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="seqGenerator", sequenceName="correios.estado_seq")
	private int id;
	
	private String nome;
	
	private String sigla;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
}
