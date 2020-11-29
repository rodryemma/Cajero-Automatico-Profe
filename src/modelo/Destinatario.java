/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rodry-Escritorio
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Destinatario.findAll", query = "SELECT d FROM Destinatario d")
    , @NamedQuery(name = "Destinatario.findByIddestinatario", query = "SELECT d FROM Destinatario d WHERE d.iddestinatario = :iddestinatario")
    , @NamedQuery(name = "Destinatario.findByCbu", query = "SELECT d FROM Destinatario d WHERE d.cbu = :cbu")
    , @NamedQuery(name = "Destinatario.findByPersona", query = "SELECT d FROM Destinatario d WHERE d.persona = :persona")
    , @NamedQuery(name = "Destinatario.findByCorreo", query = "SELECT d FROM Destinatario d WHERE d.correo = :correo")})
public class Destinatario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer iddestinatario;
    private Integer cbu;
    private String persona;
    private String correo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "destinatario", fetch = FetchType.LAZY)
    private List<Trasferencia> trasferenciaList;

    public Destinatario() {
    }

    public Destinatario(Integer iddestinatario) {
        this.iddestinatario = iddestinatario;
    }

    public Integer getIddestinatario() {
        return iddestinatario;
    }

    public void setIddestinatario(Integer iddestinatario) {
        this.iddestinatario = iddestinatario;
    }

    public Integer getCbu() {
        return cbu;
    }

    public void setCbu(Integer cbu) {
        this.cbu = cbu;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @XmlTransient
    public List<Trasferencia> getTrasferenciaList() {
        return trasferenciaList;
    }

    public void setTrasferenciaList(List<Trasferencia> trasferenciaList) {
        this.trasferenciaList = trasferenciaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddestinatario != null ? iddestinatario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Destinatario)) {
            return false;
        }
        Destinatario other = (Destinatario) object;
        if ((this.iddestinatario == null && other.iddestinatario != null) || (this.iddestinatario != null && !this.iddestinatario.equals(other.iddestinatario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Destinatario[ iddestinatario=" + iddestinatario + " ]";
    }
    
}
