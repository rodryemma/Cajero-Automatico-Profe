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
@Table(name = "prestamo", catalog = "cajeroprofe", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prestamo.findAll", query = "SELECT p FROM Prestamo p")
    , @NamedQuery(name = "Prestamo.findByIdprestamo", query = "SELECT p FROM Prestamo p WHERE p.prestamoPK.idprestamo = :idprestamo")
    , @NamedQuery(name = "Prestamo.findByFecha", query = "SELECT p FROM Prestamo p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "Prestamo.findByMonto", query = "SELECT p FROM Prestamo p WHERE p.monto = :monto")
    , @NamedQuery(name = "Prestamo.findByDescripccion", query = "SELECT p FROM Prestamo p WHERE p.descripccion = :descripccion")
    , @NamedQuery(name = "Prestamo.findByIdcuenta", query = "SELECT p FROM Prestamo p WHERE p.prestamoPK.idcuenta = :idcuenta")})
public class Prestamo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrestamoPK prestamoPK;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto")
    private Double monto;
    @Column(name = "descripccion")
    private String descripccion;
    @JoinColumn(name = "idcuenta", referencedColumnName = "idcuenta", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cuenta cuenta;

    public Prestamo() {
    }

    public Prestamo(PrestamoPK prestamoPK) {
        this.prestamoPK = prestamoPK;
    }

    public Prestamo(int idprestamo, int idcuenta) {
        this.prestamoPK = new PrestamoPK(idprestamo, idcuenta);
    }

    public PrestamoPK getPrestamoPK() {
        return prestamoPK;
    }

    public void setPrestamoPK(PrestamoPK prestamoPK) {
        this.prestamoPK = prestamoPK;
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

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
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
        hash += (prestamoPK != null ? prestamoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestamo)) {
            return false;
        }
        Prestamo other = (Prestamo) object;
        if ((this.prestamoPK == null && other.prestamoPK != null) || (this.prestamoPK != null && !this.prestamoPK.equals(other.prestamoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Prestamo[ prestamoPK=" + prestamoPK + " ]";
    }
    
}
