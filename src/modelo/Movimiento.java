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
@Table(name = "movimiento", catalog = "cajeroprofe", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimiento.findAll", query = "SELECT m FROM Movimiento m")
    , @NamedQuery(name = "Movimiento.findByIdmovimiento", query = "SELECT m FROM Movimiento m WHERE m.movimientoPK.idmovimiento = :idmovimiento")
    , @NamedQuery(name = "Movimiento.findByFecha", query = "SELECT m FROM Movimiento m WHERE m.fecha = :fecha")
    , @NamedQuery(name = "Movimiento.findByDetalle", query = "SELECT m FROM Movimiento m WHERE m.detalle = :detalle")
    , @NamedQuery(name = "Movimiento.findByMonto", query = "SELECT m FROM Movimiento m WHERE m.monto = :monto")
    , @NamedQuery(name = "Movimiento.findByIdcuenta", query = "SELECT m FROM Movimiento m WHERE m.movimientoPK.idcuenta = :idcuenta")})
public class Movimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MovimientoPK movimientoPK;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "detalle")
    private String detalle;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto")
    private Double monto;
    @JoinColumn(name = "idcuenta", referencedColumnName = "idcuenta", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cuenta cuenta;

    public Movimiento() {
    }

    public Movimiento(MovimientoPK movimientoPK) {
        this.movimientoPK = movimientoPK;
    }

    public Movimiento(int idmovimiento, int idcuenta) {
        this.movimientoPK = new MovimientoPK(idmovimiento, idcuenta);
    }

    public MovimientoPK getMovimientoPK() {
        return movimientoPK;
    }

    public void setMovimientoPK(MovimientoPK movimientoPK) {
        this.movimientoPK = movimientoPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
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
        hash += (movimientoPK != null ? movimientoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimiento)) {
            return false;
        }
        Movimiento other = (Movimiento) object;
        if ((this.movimientoPK == null && other.movimientoPK != null) || (this.movimientoPK != null && !this.movimientoPK.equals(other.movimientoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Movimiento[ movimientoPK=" + movimientoPK + " ]";
    }
    
}
