/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Rodry-Asus
 */
@Embeddable
public class MovimientoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idmovimiento")
    private int idmovimiento;
    @Basic(optional = false)
    @Column(name = "idcuenta")
    private int idcuenta;

    public MovimientoPK() {
    }

    public MovimientoPK(int idmovimiento, int idcuenta) {
        this.idmovimiento = idmovimiento;
        this.idcuenta = idcuenta;
    }

    public int getIdmovimiento() {
        return idmovimiento;
    }

    public void setIdmovimiento(int idmovimiento) {
        this.idmovimiento = idmovimiento;
    }

    public int getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(int idcuenta) {
        this.idcuenta = idcuenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idmovimiento;
        hash += (int) idcuenta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientoPK)) {
            return false;
        }
        MovimientoPK other = (MovimientoPK) object;
        if (this.idmovimiento != other.idmovimiento) {
            return false;
        }
        if (this.idcuenta != other.idcuenta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.MovimientoPK[ idmovimiento=" + idmovimiento + ", idcuenta=" + idcuenta + " ]";
    }
    
}
