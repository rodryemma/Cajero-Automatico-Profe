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
 * @author Rodry-Escritorio
 */
public class Buscador {
    
    public String banco(String idbanco){    
//Establecer coenxion a base de datos
       BaseDatos bD = new BaseDatos();
       java.sql.Connection conx = bD.estableceConexion();
        
       //System.out.println(idusuario);
       try{
           Statement s = conx.createStatement();
           // usamos el codigo en mysql y lo modificamos
           s.addBatch("'SELECT nombre FROM cajeroprofe.banco where idbanco ="+idbanco+";");
           
           
           //cerramos conexion
           s.close();
           
           //System.exit(0);
          
       }catch(Exception e){
           JOptionPane.showConfirmDialog(null, e);
           bD.cierraConexion();
           
           
       }
    }
    
}
