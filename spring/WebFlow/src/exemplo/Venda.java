package exemplo;

import java.io.Serializable;

import org.springframework.core.style.ToStringCreator;

public class Venda implements Serializable {

	private double preco;

	private int numeroItens;

	private String categoria;

	private boolean entrega;

	private String tipoEntrega;

	
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNumeroItens() {
		return numeroItens;
	}

	public void setNumeroItens(int numeroItens) {
		this.numeroItens = numeroItens;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
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

	// business logic methods

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
		double custoEntrega = 0.0;
		if ("S".equals(tipoEntrega)) {
			custoEntrega = 10.0;
		} else if ("E".equals(tipoEntrega)) {
			custoEntrega = 20.0;
		}
		return custoEntrega;
	}

	public double getCustoTotal() {
		return getValorTotal() + getCustoEntrega() - getDescontos();
	}

	public String toString() {
		return new ToStringCreator(this).append("preco", preco).append("numeroItens", numeroItens).toString();
	}
}