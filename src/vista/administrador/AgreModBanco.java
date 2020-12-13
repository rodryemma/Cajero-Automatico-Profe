/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.administrador;

import controlador.AgregarDeTabla;
import controlador.ModificarDeTabla;
import javax.swing.table.DefaultTableModel;
import vista.AgendarCbu;

/**
 *
 * @author Rodry-Asus
 */
public class AgreModBanco extends javax.swing.JFrame {

    String bandera;
    String idBanco;
    DefaultTableModel tabUsuario;

    public AgreModBanco() {
        //inicia componentes
        initComponents();
        //centra vista
        this.setLocationRelativeTo(null);
        //limpiamos bandera
        bandera = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoBanco = new javax.swing.JTextField();
        txtNombreBanco = new javax.swing.JTextField();
        txtDIreccionBanco = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        botGuardar = new javax.swing.JButton();
        botCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitulo.setText("AgreMod Banco");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(labTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(labTitulo)
                .addGap(22, 22, 22))
        );

        jLabel1.setText("Codigo Banco");

        jLabel2.setText("Nombre");

        jLabel3.setText("Direccion");

        txtNombreBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreBancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDIreccionBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDIreccionBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botGuardar.setText("Guardar");
        botGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botGuardarActionPerformed(evt);
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
                .addGap(54, 54, 54)
                .addComponent(botGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botCancelar)
                .addGap(54, 54, 54))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botGuardar)
                    .addComponent(botCancelar))
                .addContainerGap(24, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void agreBanco(DefaultTableModel tabusuario) {
        //asignamos agregar a la bandera para saber que se agregara una nueva celda a la tabla
        this.bandera = "agregar";
        this.tabUsuario = tabusuario;
    }

    public void modBanco(DefaultTableModel tabusuario, DefaultTableModel tabBanco, int fila) {
        //asignamos agregar a la bandera para saber que se modificara una nueva celda seleccionada
        this.bandera = "modificar";
        this.tabUsuario = tabusuario;

        //guardamos el id de la celda seleccionada del banco
        this.idBanco = tabBanco.getValueAt(fila, 0).toString();

        //cargamos los txt de la vista con el contenido de la celda seleccionada
        txtCodigoBanco.setText(tabBanco.getValueAt(fila, 1).toString());
        txtNombreBanco.setText(tabBanco.getValueAt(fila, 2).toString());
        txtDIreccionBanco.setText(tabBanco.getValueAt(fila, 3).toString());

    }


    private void botCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarActionPerformed
        gestionAbm gestAbm = new gestionAbm();
        dispose();
        gestAbm.refrescartablaBanco(tabUsuario);
        gestAbm.setVisible(true);

    }//GEN-LAST:event_botCancelarActionPerformed

    private void txtNombreBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreBancoActionPerformed

    private void botGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botGuardarActionPerformed
        //separamos con condiciones la opcion para guardar o modificar en el boton agregar

        if (bandera.equals("agregar")) {
            AgregarDeTabla agreTabla = new AgregarDeTabla();
            AgendarCbu agenCbu = new AgendarCbu();

            String codigoBanco = null;
            String nombre = null;
            String direccion = null;

            //buscamos los datos de los txt de la vista
            codigoBanco = txtCodigoBanco.getText();
            nombre = txtNombreBanco.getText();
            direccion = txtDIreccionBanco.getText();

            //lo enviamos a un metodo para crear la nueva celda con los datos
            agreTabla.AgregarBanco(codigoBanco, nombre, direccion);

            //cerrar ventana y abtir la anterior con la tabla de usuario
            gestionAbm gestAbm = new gestionAbm();
            dispose();
            gestAbm.refrescartablaBanco(tabUsuario);
            gestAbm.setVisible(true);

        }

        if (bandera.equals("modificar")) {

            //buscamos los datos ingresados en el txt esten o no cambiados
            String codigoBanco = txtCodigoBanco.getText();
            String nombre = txtNombreBanco.getText();
            String direccion = txtDIreccionBanco.getText();

            // se envian los datos de los txt de la vista mas el id de la celda seleccionada para modificarla
            ModificarDeTabla modBan = new ModificarDeTabla();
            modBan.modiBanco(this.idBanco, codigoBanco, nombre, direccion);

            //cerrar vista y abrir la anterior con la tabla usuario
            gestionAbm gestAbm = new gestionAbm();
            dispose();
            gestAbm.refrescartablaBanco(tabUsuario);
            gestAbm.setVisible(true);
        }


    }//GEN-LAST:event_botGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AgreModBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgreModBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgreModBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgreModBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgreModBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCancelar;
    private javax.swing.JButton botGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JTextField txtCodigoBanco;
    private javax.swing.JTextField txtDIreccionBanco;
    private javax.swing.JTextField txtNombreBanco;
    // End of variables declaration//GEN-END:variables
}
