/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rodry-Asus
 */
@Entity
@Table(name = "cuenta", catalog = "cajeroprofe", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuenta.findAll", query = "SELECT c FROM Cuenta c")
    , @NamedQuery(name = "Cuenta.findByIdcuenta", query = "SELECT c FROM Cuenta c WHERE c.cuentaPK.idcuenta = :idcuenta")
    , @NamedQuery(name = "Cuenta.findByNrocuenta", query = "SELECT c FROM Cuenta c WHERE c.nrocuenta = :nrocuenta")
    , @NamedQuery(name = "Cuenta.findBySaldo", query = "SELECT c FROM Cuenta c WHERE c.saldo = :saldo")
    , @NamedQuery(name = "Cuenta.findByFechaalta", query = "SELECT c FROM Cuenta c WHERE c.fechaalta = :fechaalta")
    , @NamedQuery(name = "Cuenta.findByUsuarioalta", query = "SELECT c FROM Cuenta c WHERE c.usuarioalta = :usuarioalta")
    , @NamedQuery(name = "Cuenta.findByFechamodificacion", query = "SELECT c FROM Cuenta c WHERE c.fechamodificacion = :fechamodificacion")
    , @NamedQuery(name = "Cuenta.findByUsuariomodificacion", query = "SELECT c FROM Cuenta c WHERE c.usuariomodificacion = :usuariomodificacion")
    , @NamedQuery(name = "Cuenta.findByFechabaja", query = "SELECT c FROM Cuenta c WHERE c.fechabaja = :fechabaja")
    , @NamedQuery(name = "Cuenta.findByUsuariobaja", query = "SELECT c FROM Cuenta c WHERE c.usuariobaja = :usuariobaja")
    , @NamedQuery(name = "Cuenta.findByIdusuario", query = "SELECT c FROM Cuenta c WHERE c.cuentaPK.idusuario = :idusuario")
    , @NamedQuery(name = "Cuenta.findByIdbanco", query = "SELECT c FROM Cuenta c WHERE c.cuentaPK.idbanco = :idbanco")})
public class Cuenta implements Serializable {

    private String usuarioalta;
    private String usuariomodificacion;
    private String usuariobaja;

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CuentaPK cuentaPK;
    @Column(name = "nrocuenta")
    private Integer nrocuenta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "saldo")
    private Double saldo;
    @Column(name = "fechaalta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaalta;
    @Column(name = "fechamodificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechamodificacion;
    @Column(name = "fechabaja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechabaja;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuenta")
    private List<Prestamo> prestamoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuenta")
    private List<Movimiento> movimientoList;
    @JoinColumn(name = "idbanco", referencedColumnName = "idbanco", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Banco banco;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuenta")
    private List<Pago> pagoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuenta")
    private List<Trasferencia> trasferenciaList;

    public Cuenta() {
    }

    public Cuenta(CuentaPK cuentaPK) {
        this.cuentaPK = cuentaPK;
    }

    public Cuenta(int idcuenta, int idusuario, int idbanco) {
        this.cuentaPK = new CuentaPK(idcuenta, idusuario, idbanco);
    }

    public CuentaPK getCuentaPK() {
        return cuentaPK;
    }

    public void setCuentaPK(CuentaPK cuentaPK) {
        this.cuentaPK = cuentaPK;
    }

    public Integer getNrocuenta() {
        return nrocuenta;
    }

    public void setNrocuenta(Integer nrocuenta) {
        this.nrocuenta = nrocuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Date getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }


    public Date getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }


    public Date getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(Date fechabaja) {
        this.fechabaja = fechabaja;
    }


    @XmlTransient
    public List<Prestamo> getPrestamoList() {
        return prestamoList;
    }

    public void setPrestamoList(List<Prestamo> prestamoList) {
        this.prestamoList = prestamoList;
    }

    @XmlTransient
    public List<Movimiento> getMovimientoList() {
        return movimientoList;
    }

    public void setMovimientoList(List<Movimiento> movimientoList) {
        this.movimientoList = movimientoList;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @XmlTransient
    public List<Pago> getPagoList() {
        return pagoList;
    }

    public void setPagoList(List<Pago> pagoList) {
        this.pagoList = pagoList;
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
        hash += (cuentaPK != null ? cuentaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.cuentaPK == null && other.cuentaPK != null) || (this.cuentaPK != null && !this.cuentaPK.equals(other.cuentaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Cuenta[ cuentaPK=" + cuentaPK + " ]";
    }

    public String getUsuarioalta() {
        return usuarioalta;
    }

    public void setUsuarioalta(String usuarioalta) {
        this.usuarioalta = usuarioalta;
    }

    public String getUsuariomodificacion() {
        return usuariomodificacion;
    }

    public void setUsuariomodificacion(String usuariomodificacion) {
        this.usuariomodificacion = usuariomodificacion;
    }

    public String getUsuariobaja() {
        return usuariobaja;
    }

    public void setUsuariobaja(String usuariobaja) {
        this.usuariobaja = usuariobaja;
    }
    
}
