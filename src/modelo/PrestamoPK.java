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
public class PrestamoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idprestamo")
    private int idprestamo;
    @Basic(optional = false)
    @Column(name = "idcuenta")
    private int idcuenta;

    public PrestamoPK() {
    }

    public PrestamoPK(int idprestamo, int idcuenta) {
        this.idprestamo = idprestamo;
        this.idcuenta = idcuenta;
    }

    public int getIdprestamo() {
        return idprestamo;
    }

    public void setIdprestamo(int idprestamo) {
        this.idprestamo = idprestamo;
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
        hash += (int) idprestamo;
        hash += (int) idcuenta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrestamoPK)) {
            return false;
        }
        PrestamoPK other = (PrestamoPK) object;
        if (this.idprestamo != other.idprestamo) {
            return false;
        }
        if (this.idcuenta != other.idcuenta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.PrestamoPK[ idprestamo=" + idprestamo + ", idcuenta=" + idcuenta + " ]";
    }
    
}
