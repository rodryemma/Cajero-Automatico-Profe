/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodry-Asus
 */
public class EliminarDeTabla {
 
    //DELETE FROM `cajeroprofe`.`destinatario` WHERE (`iddestinatario` = '11') and (`idcuenta` = '3');
    
    public void EliminarDedestinatario (String idcuenta, String idDestinatario) {
        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();
        
        try {

            Statement s = conx.createStatement();
            //SE envia el comando para eliminar la tabla de destinatario
            //con idDestinatario e idcuenta
            s.execute("DELETE FROM `cajeroprofe`.`destinatario` WHERE (`iddestinatario` = '"+idDestinatario+"') and (`idcuenta` = '"+idcuenta+"')" );
            
            
            s.close();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();
            //return null;

        }

    }  
    
     public void EliminarBanco (String idBanco) {
        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();
        
        try {

            Statement s = conx.createStatement();
            //SE envia el comando para eliminar la tabla de destinatario
            //con idDestinatario e idcuenta
            s.execute("DELETE FROM `cajeroprofe`.`banco` WHERE (`idbanco` = '"+idBanco+"') " );
            
            
            s.close();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();
            //return null;

        }

        
        
        
    }  
    
    
     public void EliminarUsuario (String idusuario) {
        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();
        
        try {

            Statement s = conx.createStatement();
            //SE envia el comando para eliminar la tabla de destinatario
            //con idDestinatario e idcuenta
            s.execute("DELETE FROM `cajeroprofe`.`usuario` WHERE (`idusuario` = '"+idusuario+"') " );
            
            
            s.close();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();
            //return null;

        }

        
        
        
    }  
    
    
}
