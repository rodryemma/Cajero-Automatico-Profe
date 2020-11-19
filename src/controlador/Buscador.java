/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodry-Escritorio
 */
public class Buscador {

    public String nombreBanco(String idusuario) {
//Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();
        ResultSet rs;
        //System.out.println(idusuario);
        try {

            Statement s = conx.createStatement();
            // usamos el codigo en mysql y lo modificamos
            rs = s.executeQuery("SELECT * FROM cajeroprofe.banco \n"
                    + "inner join cajeroprofe.cuenta\n"
                    + "on banco.idbanco = cuenta.idbanco\n"
                    + "inner join cajeroprofe.usuario\n"
                    + "on cuenta.idusuario =  usuario.idusuario\n"
                    + "where usuario.idusuario=" + idusuario + ";");
            rs.next();
            //System.out.println(rs.getString("nombre"));
            String nombreBanco = rs.getString("nombre");
            //cerramos conexion
            s.close();
            return nombreBanco;
            //System.exit(0);

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();
            return null;

        }

    }

  
}
