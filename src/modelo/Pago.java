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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "pago", catalog = "cajeroprofe", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pago.findAll", query = "SELECT p FROM Pago p")
    , @NamedQuery(name = "Pago.findByIdpago", query = "SELECT p FROM Pago p WHERE p.pagoPK.idpago = :idpago")
    , @NamedQuery(name = "Pago.findByFecha", query = "SELECT p FROM Pago p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "Pago.findByMonto", query = "SELECT p FROM Pago p WHERE p.monto = :monto")
    , @NamedQuery(name = "Pago.findByDescripcion", query = "SELECT p FROM Pago p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Pago.findByIdcuenta", query = "SELECT p FROM Pago p WHERE p.pagoPK.idcuenta = :idcuenta")
    , @NamedQuery(name = "Pago.findByIdusuario", query = "SELECT p FROM Pago p WHERE p.pagoPK.idusuario = :idusuario")
    , @NamedQuery(name = "Pago.findByIdbanco", query = "SELECT p FROM Pago p WHERE p.pagoPK.idbanco = :idbanco")})
public class Pago implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PagoPK pagoPK;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto")
    private Double monto;
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumns({
        @JoinColumn(name = "idcuenta", referencedColumnName = "idcuenta", insertable = false, updatable = false)
        , @JoinColumn(name = "idusuario", referencedColumnName = "idusuario", insertable = false, updatable = false)
        , @JoinColumn(name = "idbanco", referencedColumnName = "idbanco", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Cuenta cuenta;

    public Pago() {
    }

    public Pago(PagoPK pagoPK) {
        this.pagoPK = pagoPK;
    }

    public Pago(int idpago, int idcuenta, int idusuario, int idbanco) {
        this.pagoPK = new PagoPK(idpago, idcuenta, idusuario, idbanco);
    }

    public PagoPK getPagoPK() {
        return pagoPK;
    }

    public void setPagoPK(PagoPK pagoPK) {
        this.pagoPK = pagoPK;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (pagoPK != null ? pagoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pago)) {
            return false;
        }
        Pago other = (Pago) object;
        if ((this.pagoPK == null && other.pagoPK != null) || (this.pagoPK != null && !this.pagoPK.equals(other.pagoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Pago[ pagoPK=" + pagoPK + " ]";
    }
    
}
