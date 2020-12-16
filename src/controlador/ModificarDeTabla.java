
package controlador;

import java.sql.Statement;
import javax.swing.JOptionPane;


public class ModificarDeTabla {
 
    
    //UPDATE `cajeroprofe`.`destinatario` SET `persona` = 'muli' WHERE (`iddestinatario` = '22') and (`idcuenta` = '3');

    public void modiDedestinatario (String idCuenta,String idDestinatario,String cbuDesti, String persoDesti, String correoDesti ) {
        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();
        
        try {

            Statement s = conx.createStatement();
            //SE envia el comando para agregar una nueva la tabla de destinatario
            //con idDestinatario e idcuenta
            s.executeUpdate("UPDATE `cajeroprofe`.`destinatario` SET `cbu` = '"+cbuDesti+"', `persona` = '"+persoDesti+"', `correo` = '"+correoDesti+"' WHERE (`iddestinatario` = '"+idDestinatario+"') and (`idcuenta` = '"+idCuenta+"');" );
            
            
            s.close();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();
            

        }

    }  
    
    
    
    public void modiCuentaSaldo (String idUsuario,String idBanco,String nuevoSaldo) {
        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();
        
        try {

            Statement s = conx.createStatement();
            //SE envia el comando para agregar una nueva la tabla de destinatario
            //con idDestinatario e idcuenta
            s.executeUpdate("UPDATE `cajeroprofe`.`cuenta` SET `saldo` = '"+nuevoSaldo+"' WHERE (`idusuario` = '"+idUsuario+"') and (`idbanco` = '"+idBanco+"');" );
            
            
            s.close();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();
            

        }

    }  
    
    
    
     public void modiBanco (String idBanco,String codigo,String nombre,String direccion) {
        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();
        
        try {

            Statement s = conx.createStatement();
            //SE envia el comando para agregar una nueva la tabla de destinatario
            //con idDestinatario e idcuenta
            s.executeUpdate("UPDATE `cajeroprofe`.`banco` SET `codigo` = '"+codigo+"', `nombre` = '"+nombre+"', `direccion` = '"+direccion+"' WHERE (`idbanco` = '"+idBanco+"');");
            
            
            s.close();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();
            

        }

    }  
    
    
     
     
      public void modiUsuario (String idUsario,String usuario,String pass,String banned,String tipo,String nombre,String apellido, String dni , String cel) {
        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();
        
        try {

            Statement s = conx.createStatement();
            //SE envia el comando para agregar una nueva la tabla de destinatario
            //con idDestinatario e idcuenta
            s.executeUpdate("UPDATE `cajeroprofe`.`usuario` SET `usuario` = '"+usuario+"', `password` = '"+pass+"', `banned` = '"+banned+"', `tipo` = '"+tipo+"', `nombre` = '"+nombre+"', `apellido` = '"+apellido+"', `dni` = '"+dni+"', `cel` = '"+cel+"' WHERE (`idusuario` = '"+idUsario+"');");
            
            
            s.close();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();
            

        }

    }  
    
    
    
   public void modiCuenta (String idUsario,String nrocuenta, String saldo , String fecha , String idcuenta ,String idusuario , String idbanco ,String modIdusuario ,String modIdbanco) {
        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();
        
        try {

            Statement s = conx.createStatement();
            //SE envia el comando para agregar una nueva la tabla de destinatario
            //con idDestinatario e idcuenta
            s.executeUpdate("UPDATE `cajeroprofe`.`cuenta` SET `nrocuenta` = '"+nrocuenta+"', `saldo` = '"+saldo+"', `fechamodificacion` = '"+fecha+"', `usuariomodificacion` = 'true', `idusuario` = '"+modIdusuario+"', `idbanco` = '"+modIdbanco+"' WHERE (`idcuenta` = '"+idcuenta+"') and (`idusuario` = '"+idusuario+"') and (`idbanco` = '"+idbanco+"');");
            
            
            s.close();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();
            

        }

    }     
      
    
}  


