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
public class PagoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idpago")
    private int idpago;
    @Basic(optional = false)
    @Column(name = "idcuenta")
    private int idcuenta;
    @Basic(optional = false)
    @Column(name = "idusuario")
    private int idusuario;
    @Basic(optional = false)
    @Column(name = "idbanco")
    private int idbanco;

    public PagoPK() {
    }

    public PagoPK(int idpago, int idcuenta, int idusuario, int idbanco) {
        this.idpago = idpago;
        this.idcuenta = idcuenta;
        this.idusuario = idusuario;
        this.idbanco = idbanco;
    }

    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
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
        hash += (int) idpago;
        hash += (int) idcuenta;
        hash += (int) idusuario;
        hash += (int) idbanco;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PagoPK)) {
            return false;
        }
        PagoPK other = (PagoPK) object;
        if (this.idpago != other.idpago) {
            return false;
        }
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
        return "modelo.PagoPK[ idpago=" + idpago + ", idcuenta=" + idcuenta + ", idusuario=" + idusuario + ", idbanco=" + idbanco + " ]";
    }
    
}
