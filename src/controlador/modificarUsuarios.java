
package controlador;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import vista.login;


public class modificarUsuarios {
   
public void modifBannedFalso(String idusuario){    
//Establecer coenxion a base de datos
       BaseDatos bD = new BaseDatos();
       java.sql.Connection conx = bD.estableceConexion();
        
       //System.out.println(idusuario);
       try{
           Statement s = conx.createStatement();
           // usamos el codigo en mysql y lo modificamos
           s.executeUpdate("UPDATE `cajeroprofe`.`usuario` SET `banned` = 'true' WHERE (`idusuario` = '"+idusuario+"')");
           
           
           //cerramos conexion
           s.close();
           
           //System.exit(0);
           
       }catch(Exception e){
           JOptionPane.showConfirmDialog(null, e);
           bD.cierraConexion();
           
           
       }
    }
}
