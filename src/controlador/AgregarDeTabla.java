/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodry-Asus
 */
public class AgregarDeTabla {

    //INSERT INTO `cajeroprofe`.`destinatario` (`cbu`, `persona`, `correo`, `idcuenta`) VALUES ('666666', 'agro SA', 'agropeSA@gmail.com', '3');
    public void AgregarDedestinatario(String idCuenta, String cbuDesti, String personaDesti, String correoDesti) {
        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();

        try {

            Statement s = conx.createStatement();
            //SE envia el comando para agregar una nueva la tabla de destinatario
            //con idDestinatario e idcuenta
            s.execute("INSERT INTO `cajeroprofe`.`destinatario` (`cbu`, `persona`, `correo`, `idcuenta`) VALUES ('" + cbuDesti + "', '" + personaDesti + "', '" + correoDesti + "', '" + idCuenta + "');");

            s.close();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();

        }

    }

    public void AgregarTransferencia(String idCuenta, String idDest, String fecha, String monto, String detalle) {
        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();

        try {

            Statement s = conx.createStatement();
            //SE envia el comando para agregar una nueva la tabla de destinatario
            //con idDestinatario e idcuenta
            s.execute("INSERT INTO `cajeroprofe`.`trasferencia` (`fecha`, `monto`, `detalle`, `iddestinatario`, `idcuenta`) VALUES ('" + fecha + "', '" + monto + "', '" + detalle + "', '" + idDest + "', '" + idCuenta + "');");
            //INSERT INTO `cajeroprofe`.`trasferencia` (`fecha`, `monto`, `detalle`, `iddestinatario`, `idcuenta`) VALUES ('2020-12-08', '100', '123', '4', '3');

            s.close();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();

        }

    }

    public void AgregarBanco(String codigo, String nombre, String direccion) {
        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();

        try {

            Statement s = conx.createStatement();
            //SE envia el comando para agregar una nueva la tabla de destinatario
            //con idDestinatario e idcuenta
            s.execute("INSERT INTO `cajeroprofe`.`banco` (`codigo`, `nombre`, `direccion`) VALUES ('" + codigo + "', '" + nombre + "', '" + direccion + "');");

            s.close();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();

        }

    }

    public void agregarUsuario(String usuario, String pass, String banned, String tipo, String nombre, String apellido, String dni, String cel) {

        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();

        try {

            Statement s = conx.createStatement();
            //SE envia el comando para agregar una nueva la tabla de destinatario
            //con idDestinatario e idcuenta
            s.execute("INSERT INTO `cajeroprofe`.`usuario` (`usuario`, `password`, `banned`, `tipo`, `nombre`, `apellido`, `dni`, `cel`) VALUES ('" + usuario + "', '" + pass + "', '" + banned + "', '" + tipo + "', '" + nombre + "', '" + apellido + "', '" + dni + "', '" + cel + "');");

            s.close();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();

        }

    }

    public void agregarCuenta(String nrocuenta, String saldo, String fecha, String idusuario, String idbanco) {

        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();

        try {

            Statement s = conx.createStatement();
            //SE envia el comando para agregar una nueva la tabla de destinatario
            //con idDestinatario e idcuenta
            s.execute("INSERT INTO `cajeroprofe`.`cuenta` (`nrocuenta`, `saldo`, `fechaalta`, `usuarioalta`, `idusuario`, `idbanco`) VALUES ('"+nrocuenta+"', '"+saldo+"', '"+fecha+"', 'true', '"+idusuario+"', '"+idbanco+"');");

            s.close();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();

        }

    }

}
