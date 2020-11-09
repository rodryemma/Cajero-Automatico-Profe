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
public class TrasferenciaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idtrasferencia")
    private int idtrasferencia;
    @Basic(optional = false)
    @Column(name = "idcuenta")
    private int idcuenta;

    public TrasferenciaPK() {
    }

    public TrasferenciaPK(int idtrasferencia, int idcuenta) {
        this.idtrasferencia = idtrasferencia;
        this.idcuenta = idcuenta;
    }

    public int getIdtrasferencia() {
        return idtrasferencia;
    }

    public void setIdtrasferencia(int idtrasferencia) {
        this.idtrasferencia = idtrasferencia;
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
        hash += (int) idtrasferencia;
        hash += (int) idcuenta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrasferenciaPK)) {
            return false;
        }
        TrasferenciaPK other = (TrasferenciaPK) object;
        if (this.idtrasferencia != other.idtrasferencia) {
            return false;
        }
        if (this.idcuenta != other.idcuenta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TrasferenciaPK[ idtrasferencia=" + idtrasferencia + ", idcuenta=" + idcuenta + " ]";
    }
    
}
