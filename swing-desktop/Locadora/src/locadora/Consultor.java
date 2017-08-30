/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "consultor", catalog = "sistemas_comum", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Consultor.findAll", query = "SELECT c FROM Consultor c"),
    @NamedQuery(name = "Consultor.findByIdConsultor", query = "SELECT c FROM Consultor c WHERE c.idConsultor = :idConsultor"),
    @NamedQuery(name = "Consultor.findByNome", query = "SELECT c FROM Consultor c WHERE c.nome = :nome"),
    @NamedQuery(name = "Consultor.findByEmail", query = "SELECT c FROM Consultor c WHERE c.email = :email"),
    @NamedQuery(name = "Consultor.findByIdAreaConhecimentoCnpq", query = "SELECT c FROM Consultor c WHERE c.idAreaConhecimentoCnpq = :idAreaConhecimentoCnpq"),
    @NamedQuery(name = "Consultor.findByInterno", query = "SELECT c FROM Consultor c WHERE c.interno = :interno"),
    @NamedQuery(name = "Consultor.findByIdServidor", query = "SELECT c FROM Consultor c WHERE c.idServidor = :idServidor"),
    @NamedQuery(name = "Consultor.findByCodmerg", query = "SELECT c FROM Consultor c WHERE c.codmerg = :codmerg"),
    @NamedQuery(name = "Consultor.findByQtdAvaliacoes", query = "SELECT c FROM Consultor c WHERE c.qtdAvaliacoes = :qtdAvaliacoes"),
    @NamedQuery(name = "Consultor.findByCodigoAcesso", query = "SELECT c FROM Consultor c WHERE c.codigoAcesso = :codigoAcesso"),
    @NamedQuery(name = "Consultor.findBySenhaAcesso", query = "SELECT c FROM Consultor c WHERE c.senhaAcesso = :senhaAcesso")})
public class Consultor implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_consultor")
    private Integer idConsultor;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "id_area_conhecimento_cnpq")
    private int idAreaConhecimentoCnpq;
    @Basic(optional = false)
    @Column(name = "interno")
    private boolean interno;
    @Column(name = "id_servidor")
    private Integer idServidor;
    @Column(name = "codmerg")
    private String codmerg;
    @Basic(optional = false)
    @Column(name = "qtd_avaliacoes")
    private int qtdAvaliacoes;
    @Basic(optional = false)
    @Column(name = "codigo_acesso")
    private int codigoAcesso;
    @Column(name = "senha_acesso")
    private String senhaAcesso;

    public Consultor() {
    }

    public Consultor(Integer idConsultor) {
        this.idConsultor = idConsultor;
    }

    public Consultor(Integer idConsultor, String nome, String email, int idAreaConhecimentoCnpq, boolean interno, int qtdAvaliacoes, int codigoAcesso) {
        this.idConsultor = idConsultor;
        this.nome = nome;
        this.email = email;
        this.idAreaConhecimentoCnpq = idAreaConhecimentoCnpq;
        this.interno = interno;
        this.qtdAvaliacoes = qtdAvaliacoes;
        this.codigoAcesso = codigoAcesso;
    }

    public Integer getIdConsultor() {
        return idConsultor;
    }

    public void setIdConsultor(Integer idConsultor) {
        Integer oldIdConsultor = this.idConsultor;
        this.idConsultor = idConsultor;
        changeSupport.firePropertyChange("idConsultor", oldIdConsultor, idConsultor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public int getIdAreaConhecimentoCnpq() {
        return idAreaConhecimentoCnpq;
    }

    public void setIdAreaConhecimentoCnpq(int idAreaConhecimentoCnpq) {
        int oldIdAreaConhecimentoCnpq = this.idAreaConhecimentoCnpq;
        this.idAreaConhecimentoCnpq = idAreaConhecimentoCnpq;
        changeSupport.firePropertyChange("idAreaConhecimentoCnpq", oldIdAreaConhecimentoCnpq, idAreaConhecimentoCnpq);
    }

    public boolean getInterno() {
        return interno;
    }

    public void setInterno(boolean interno) {
        boolean oldInterno = this.interno;
        this.interno = interno;
        changeSupport.firePropertyChange("interno", oldInterno, interno);
    }

    public Integer getIdServidor() {
        return idServidor;
    }

    public void setIdServidor(Integer idServidor) {
        Integer oldIdServidor = this.idServidor;
        this.idServidor = idServidor;
        changeSupport.firePropertyChange("idServidor", oldIdServidor, idServidor);
    }

    public String getCodmerg() {
        return codmerg;
    }

    public void setCodmerg(String codmerg) {
        String oldCodmerg = this.codmerg;
        this.codmerg = codmerg;
        changeSupport.firePropertyChange("codmerg", oldCodmerg, codmerg);
    }

    public int getQtdAvaliacoes() {
        return qtdAvaliacoes;
    }

    public void setQtdAvaliacoes(int qtdAvaliacoes) {
        int oldQtdAvaliacoes = this.qtdAvaliacoes;
        this.qtdAvaliacoes = qtdAvaliacoes;
        changeSupport.firePropertyChange("qtdAvaliacoes", oldQtdAvaliacoes, qtdAvaliacoes);
    }

    public int getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setCodigoAcesso(int codigoAcesso) {
        int oldCodigoAcesso = this.codigoAcesso;
        this.codigoAcesso = codigoAcesso;
        changeSupport.firePropertyChange("codigoAcesso", oldCodigoAcesso, codigoAcesso);
    }

    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(String senhaAcesso) {
        String oldSenhaAcesso = this.senhaAcesso;
        this.senhaAcesso = senhaAcesso;
        changeSupport.firePropertyChange("senhaAcesso", oldSenhaAcesso, senhaAcesso);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsultor != null ? idConsultor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consultor)) {
            return false;
        }
        Consultor other = (Consultor) object;
        if ((this.idConsultor == null && other.idConsultor != null) || (this.idConsultor != null && !this.idConsultor.equals(other.idConsultor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "locadora.Consultor[idConsultor=" + idConsultor + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
