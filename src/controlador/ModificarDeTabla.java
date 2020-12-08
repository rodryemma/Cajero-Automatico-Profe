
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
    
    
    
    
    
    
    
    
    
    
    
    
    
}
