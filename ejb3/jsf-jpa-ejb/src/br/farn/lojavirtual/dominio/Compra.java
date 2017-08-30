package br.farn.lojavirtual.dominio;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Compra {

	@Id @GeneratedValue
	private int id;
	
	private String cliente;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	
	@OneToMany(mappedBy="compra", cascade=CascadeType.ALL)
	private List<ItemCompra> itens;
	
	private BigDecimal valorTotal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<ItemCompra> getItens() {
		return itens;
	}

	public void setItens(List<ItemCompra> itens) {
		this.itens = itens;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compra other = (Compra) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
