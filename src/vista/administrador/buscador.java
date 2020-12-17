package vista.administrador;

import controlador.AgregarDeTabla;
import controlador.ControlUsuarios;
import javax.swing.table.DefaultTableModel;

public class buscador extends javax.swing.JFrame {

    DefaultTableModel tabusuario;
    String bandera;
    String accion;
    String idUsuario;
    String idBanco;
    String idcuenta;
    String idusunew;
    String idbconew;
    String nrocuenta;
    String saldo;

    public buscador() {
        initComponents();

        //centrar ventana
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloBuscador = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableBuscador = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        botSeleccionar = new javax.swing.JButton();
        botCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloBuscador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloBuscador.setText("Buscador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(tituloBuscador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloBuscador)
                .addContainerGap())
        );

        jtableBuscador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtableBuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableBuscadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableBuscador);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botSeleccionar.setText("Seleccionar");
        botSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSeleccionarActionPerformed(evt);
            }
        });

        botCancelar.setText("Cancelar");
        botCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(botSeleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(botCancelar)
                .addGap(155, 155, 155))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botSeleccionar)
                    .addComponent(botCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarTablaUsu(DefaultTableModel tabUsu ,String idCta,String idusuario, String idbanco,String idusunew, String idbconew, String nrocta, String sal,String acci) {
        //guardamos la tabla del usuario activo
        this.tabusuario = tabUsu;
        //señalamos que se trata de ussuario
        this.bandera = "usuario";
        //señalamos la accion de agregar o modificar
        this.accion=acci;
        this.idusunew=idusunew;
        this.idbconew=idbconew;
        this.idUsuario=idusuario;
        this.idBanco=idbanco;
        this.idcuenta=idCta;
        this.nrocuenta=nrocta;
        this.saldo=sal;
        //instanciamo para poder traer la tabla completa de usuario
        ControlUsuarios contusu = new ControlUsuarios();

        botSeleccionar.setEnabled(false);
        tituloBuscador.setText("Usuarios");
        //cargamos en la jtable la tabla completa de usuario
        jtableBuscador.setModel(contusu.todoUsuario());
    }

    public void cargarTablaBco(DefaultTableModel tabUsu ,String idCta,String idusuario, String idbanco,String idusunew, String idbconew,String nrocta, String sal, String acci) {
        //guardamos la tabla del usuario activo
        this.tabusuario = tabUsu;
        //señalamos que se trata de banco
        this.bandera = "banco";
         //señalamos la accion de agregar o modificar
        this.accion=acci;
        this.idusunew=idusunew;
        this.idbconew=idbconew;
        this.idUsuario=idusuario;
        this.idBanco=idbanco;
        this.idcuenta=idCta;
        this.nrocuenta=nrocta;
        this.saldo=sal;
        //instanciamo para poder traer la tabla completa de banco
        ControlUsuarios contusu = new ControlUsuarios();
        botSeleccionar.setEnabled(false);
        tituloBuscador.setText("Bancos");
        //cargamos en la jtable la tabla completa de banco
        jtableBuscador.setModel(contusu.banco());

    }


    private void botSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSeleccionarActionPerformed
        
        int fila = jtableBuscador.getSelectedRow();
        
        String id = jtableBuscador.getValueAt(fila, 0).toString();
        AgreModCuenta agreModCta = new AgreModCuenta();
        if (this.bandera.equals("usuario")){
            this.idusunew=id;
            agreModCta.cargaridusuario(tabusuario,this.idcuenta,this.idUsuario,this.idBanco,this.idusunew,this.idbconew, this.nrocuenta, this.saldo, this.accion);
            System.out.println("se envio id: "+id);
        }
         if (this.bandera.equals("banco")){
            this.idbconew=id;
            agreModCta.cargaridbanco(tabusuario,this.idcuenta,this.idUsuario,this.idBanco,this.idusunew,this.idbconew,this.nrocuenta, this.saldo , this.accion);
        System.out.println("se envio id: "+id);
         }
        
        dispose();

    }//GEN-LAST:event_botSeleccionarActionPerformed

    private void botCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarActionPerformed

        dispose();


    }//GEN-LAST:event_botCancelarActionPerformed

    private void jtableBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableBuscadorMouseClicked
        //Habilitamos el boton seleccionar al ya tener un click en la tabla 
        botSeleccionar.setEnabled(true);

    }//GEN-LAST:event_jtableBuscadorMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCancelar;
    private javax.swing.JButton botSeleccionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableBuscador;
    private javax.swing.JLabel tituloBuscador;
    // End of variables declaration//GEN-END:variables
}
