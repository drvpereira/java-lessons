package br.jus.tjrn.dominio;

import java.io.Serializable;

import org.springframework.core.style.ToStringCreator;

public class Venda implements Serializable {

	private double preco;

	private int numeroItens;
	
	private String categoria;
	
	private boolean entrega;
	
	private String tipoEntrega;

	public double getValorTotal() {
		return preco * numeroItens;
	}
	
	public double getTaxaDesconto() {
		double desconto = 0.02;
		
		if ("A".equals(categoria)) {
			if (numeroItens >= 100) {
				desconto = 0.1;
			}
		} else if ("B".equals(categoria)) {
			if (numeroItens >= 200) {
				desconto = 0.2;
			}
		}
		
		return desconto;
	}
	
	public double getDescontos() {
		return getTaxaDesconto() * getValorTotal();
	}
	
	public double getCustoEntrega() {
		double entrega = 0.0;
		if ("S".equals(tipoEntrega)) {
			entrega = 10.0;
		} else if ("E".equals(tipoEntrega)) {
			entrega = 20.0;
		}
		
		return entrega;
	}
	
	public double getCustoTotal() {
		return getValorTotal() + getCustoEntrega() - getDescontos();
	}
	
	@Override
	public String toString() {
		return new ToStringCreator(this).append("numeroItens", numeroItens)
			.append("preco", preco).append("tipoEntrega", tipoEntrega)
			.append("categoria", categoria).append("entrega", entrega).toString();
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getNumeroItens() {
		return numeroItens;
	}

	public void setNumeroItens(int numeroItens) {
		this.numeroItens = numeroItens;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isEntrega() {
		return entrega;
	}

	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}

	public String getTipoEntrega() {
		return tipoEntrega;
	}

	public void setTipoEntrega(String tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}

	
	
}
