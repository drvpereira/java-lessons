/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bancodados;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author david
 */
@Entity
@Table(name = "genero")
@NamedQueries({
    @NamedQuery(name = "Genero.findAll", query = "SELECT g FROM Genero g"),
    @NamedQuery(name = "Genero.findById", query = "SELECT g FROM Genero g WHERE g.id = :id"),
    @NamedQuery(name = "Genero.findByNome", query = "SELECT g FROM Genero g WHERE g.nome = :nome")})
public class Genero implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqGenerator")
    @SequenceGenerator(name="seqGenerator", sequenceName="hibernate_sequence")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @OneToMany(mappedBy = "idGenero")
    private List<Filme> filmeList;

    public Genero() {
    }

    public Genero(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Filme> getFilmeList() {
        return filmeList;
    }

    public void setFilmeList(List<Filme> filmeList) {
        this.filmeList = filmeList;
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
        if (!(object instanceof Genero)) {
            return false;
        }
        Genero other = (Genero) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bancodados.Genero[id=" + id + "]";
    }

}
