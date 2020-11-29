/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rodry-Asus
 */
@Entity
@Table(name = "trasferencia", catalog = "cajeroprofe", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trasferencia.findAll", query = "SELECT t FROM Trasferencia t")
    , @NamedQuery(name = "Trasferencia.findByIdtrasferencia", query = "SELECT t FROM Trasferencia t WHERE t.trasferenciaPK.idtrasferencia = :idtrasferencia")
    , @NamedQuery(name = "Trasferencia.findByFecha", query = "SELECT t FROM Trasferencia t WHERE t.fecha = :fecha")
    , @NamedQuery(name = "Trasferencia.findByMonto", query = "SELECT t FROM Trasferencia t WHERE t.monto = :monto")
    , @NamedQuery(name = "Trasferencia.findByDetalle", query = "SELECT t FROM Trasferencia t WHERE t.detalle = :detalle")
    , @NamedQuery(name = "Trasferencia.findByIdcuenta", query = "SELECT t FROM Trasferencia t WHERE t.trasferenciaPK.idcuenta = :idcuenta")})
public class Trasferencia implements Serializable {

    @JoinColumn(name = "iddestinatario", referencedColumnName = "iddestinatario", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Destinatario destinatario;

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TrasferenciaPK trasferenciaPK;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto")
    private Double monto;
    @Column(name = "detalle")
    private String detalle;
    @JoinColumn(name = "idcuenta", referencedColumnName = "idcuenta", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cuenta cuenta;

    public Trasferencia() {
    }

    public Trasferencia(TrasferenciaPK trasferenciaPK) {
        this.trasferenciaPK = trasferenciaPK;
    }

    public Trasferencia(int idtrasferencia, int idcuenta) {
        this.trasferenciaPK = new TrasferenciaPK(idtrasferencia, idcuenta);
    }

    public TrasferenciaPK getTrasferenciaPK() {
        return trasferenciaPK;
    }

    public void setTrasferenciaPK(TrasferenciaPK trasferenciaPK) {
        this.trasferenciaPK = trasferenciaPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trasferenciaPK != null ? trasferenciaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trasferencia)) {
            return false;
        }
        Trasferencia other = (Trasferencia) object;
        if ((this.trasferenciaPK == null && other.trasferenciaPK != null) || (this.trasferenciaPK != null && !this.trasferenciaPK.equals(other.trasferenciaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Trasferencia[ trasferenciaPK=" + trasferenciaPK + " ]";
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }
    
}
