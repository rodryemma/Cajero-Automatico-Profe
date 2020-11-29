package controlador;

import com.sun.jndi.ldap.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

public class ControlUsuarios {

    //creamos una tabla de 2 dimensiones para guardar los datos de la bd
    final DefaultTableModel listaUsuarios = new DefaultTableModel(300, 9);
    final DefaultTableModel listaCuenta = new DefaultTableModel(300, 9);
    final DefaultTableModel listaDestinatario = new DefaultTableModel(300, 9);

    public DefaultTableModel validarUsuario(Usuario usuario) {
        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();
        // se crea Resulset para traer los mismos registros de la base de dato al programa
        ResultSet rs;

        try {
            Statement s = conx.createStatement();
            // usamos una sentencia para ejecutarlo en mysql con resulset
            rs = s.executeQuery("select * from usuario where usuario = '" + usuario.getUsuario() + "'");

            //Se carga modelo de la tabla con los datos en rs a listaUsuario
            GestorTabla.configuraColumnas(rs, this.listaUsuarios);
            GestorTabla.rellena(rs, this.listaUsuarios);
            //cerramos conexion
            s.close();
            rs.close();
            return this.listaUsuarios;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();

            return null;
        }

    }

    public DefaultTableModel cuenta(String idusuario) {
        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();
        ResultSet rs;
        //System.out.println(idusuario);
        try {

            Statement s = conx.createStatement();
            // usamos el codigo en mysql y lo modificamos
            rs = s.executeQuery("SELECT * FROM cajeroprofe.usuario \n"
                    + "inner join cajeroprofe.cuenta\n"
                    + "on cuenta.idusuario =  usuario.idusuario\n"
                    + "where usuario.idusuario=" + idusuario + ";");

            GestorTabla.configuraColumnas(rs, this.listaCuenta);
            GestorTabla.rellena(rs, this.listaCuenta);
            //System.out.println(rs.getString("nombre"));

            //cerramos conexion
            s.close();
            rs.close();
            return this.listaCuenta;
            //System.exit(0);

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();
            return null;

        }

    }
    public DefaultTableModel destinatario (String idusuario) {
        //Establecer coenxion a base de datos
        BaseDatos bD = new BaseDatos();
        java.sql.Connection conx = bD.estableceConexion();
        ResultSet rs;
        //System.out.println(idusuario);
        try {

            Statement s = conx.createStatement();
            // usamos el codigo en mysql y lo modificamos
            rs = s.executeQuery("selected * from cajeroprofe.destinatario = '" +idusuario + "'");

            GestorTabla.configuraColumnas(rs, this.listaCuenta);
            GestorTabla.rellena(rs, this.listaCuenta);
            //System.out.println(rs.getString("nombre"));

            //cerramos conexion
            s.close();
            rs.close();
            return this.listaCuenta;
            //System.exit(0);

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            bD.cierraConexion();
            return null;

        }

    }
    
    
    
}
