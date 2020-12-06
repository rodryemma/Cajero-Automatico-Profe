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

    
    public void AgregarDedestinatario (String idCuenta, String cbuDesti, String personaDesti, String correoDesti) {
        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();
        
        try {

            Statement s = conx.createStatement();
            //SE envia el comando para agregar una nueva la tabla de destinatario
            //con idDestinatario e idcuenta
            s.execute("INSERT INTO `cajeroprofe`.`destinatario` (`cbu`, `persona`, `correo`, `idcuenta`) VALUES ('"+cbuDesti+"', '"+personaDesti+"', '"+correoDesti+"', '"+idCuenta+"');" );
            
            
            s.close();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();
            

        }

    }  
    
    
}
