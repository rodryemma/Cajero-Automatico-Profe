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
public class CuentaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idcuenta")
    private int idcuenta;
    @Basic(optional = false)
    @Column(name = "idusuario")
    private int idusuario;
    @Basic(optional = false)
    @Column(name = "idbanco")
    private int idbanco;

    public CuentaPK() {
    }

    public CuentaPK(int idcuenta, int idusuario, int idbanco) {
        this.idcuenta = idcuenta;
        this.idusuario = idusuario;
        this.idbanco = idbanco;
    }

    public int getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(int idcuenta) {
        this.idcuenta = idcuenta;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdbanco() {
        return idbanco;
    }

    public void setIdbanco(int idbanco) {
        this.idbanco = idbanco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idcuenta;
        hash += (int) idusuario;
        hash += (int) idbanco;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentaPK)) {
            return false;
        }
        CuentaPK other = (CuentaPK) object;
        if (this.idcuenta != other.idcuenta) {
            return false;
        }
        if (this.idusuario != other.idusuario) {
            return false;
        }
        if (this.idbanco != other.idbanco) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.CuentaPK[ idcuenta=" + idcuenta + ", idusuario=" + idusuario + ", idbanco=" + idbanco + " ]";
    }
    
}
