
package vista;

//Se armara y rellenara la TablaDestinatario

import javax.swing.table.AbstractTableModel;
import modelo.Destinatario;


class DestinatarioTableModel extends AbstractTableModel{

    private Destinatario destinatario;
    
    public DestinatarioTableModel (Destinatario destinatario){
        this.destinatario=destinatario;
    }
    
    @Override
    public String getColumnName(int i) {
        return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
