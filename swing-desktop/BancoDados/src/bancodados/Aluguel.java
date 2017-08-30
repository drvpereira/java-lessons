/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bancodados;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author david
 */
@Entity
@Table(name = "aluguel")
@NamedQueries({
    @NamedQuery(name = "Aluguel.findAll", query = "SELECT a FROM Aluguel a"),
    @NamedQuery(name = "Aluguel.findById", query = "SELECT a FROM Aluguel a WHERE a.id = :id"),
    @NamedQuery(name = "Aluguel.findByDataLocacao", query = "SELECT a FROM Aluguel a WHERE a.dataLocacao = :dataLocacao"),
    @NamedQuery(name = "Aluguel.findByDataDevolucao", query = "SELECT a FROM Aluguel a WHERE a.dataDevolucao = :dataDevolucao"),
    @NamedQuery(name = "Aluguel.findByValor", query = "SELECT a FROM Aluguel a WHERE a.valor = :valor")})
public class Aluguel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "data_locacao")
    @Temporal(TemporalType.DATE)
    private Date dataLocacao;
    @Column(name = "data_devolucao")
    @Temporal(TemporalType.DATE)
    private Date dataDevolucao;
    @Column(name = "valor")
    private BigDecimal valor;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    @ManyToOne
    private Cliente idCliente;
    @JoinColumn(name = "id_filme", referencedColumnName = "id")
    @ManyToOne
    private Filme idFilme;

    public Aluguel() {
    }

    public Aluguel(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Filme getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(Filme idFilme) {
        this.idFilme = idFilme;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluguel)) {
            return false;
        }
        Aluguel other = (Aluguel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bancodados.Aluguel[id=" + id + "]";
    }

}
