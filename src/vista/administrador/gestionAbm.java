/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.administrador;

import controlador.ControlUsuarios;
import controlador.EliminarDeTabla;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import vista.AgregarDestinatarios;

/**
 *
 * @author Rodry-Escritorio
 */
public class gestionAbm extends javax.swing.JFrame {

    DefaultTableModel tabUsuario;
    DefaultTableModel tabBanco;
    DefaultTableModel tabUsuarioComp;
    DefaultTableModel tabCuentaCom;
    String bandera;

    public gestionAbm() {

        initComponents();
        this.setLocationRelativeTo(null);
        deshabilitarbott();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelAbm = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botAgregar = new javax.swing.JButton();
        botModificar = new javax.swing.JButton();
        botEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        botVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAbm = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelAbm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelAbm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAbm.setText("Administracion ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(labelAbm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(labelAbm)
                .addContainerGap())
        );

        botAgregar.setText("Agregar");
        botAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAgregarActionPerformed(evt);
            }
        });

        botModificar.setText("Modificar");
        botModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botModificarActionPerformed(evt);
            }
        });

        botEliminar.setText("Eliminar");
        botEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(botAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(botAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botEliminar)
                .addGap(6, 6, 6))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botVolver.setText("Volver");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(botVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaAbm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAbm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAbmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAbm);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void deshabilitarbott() {

        botEliminar.setEnabled(false);
        botModificar.setEnabled(false);
        this.bandera = "";
    }

    public void refrescartablaBanco(DefaultTableModel usuario) {
        //guardamos en bandera para saber en que tabal se debe trabajar
        this.bandera = "banco";
        ControlUsuarios contusu = new ControlUsuarios();
        //guardamos la tabla del usuario 
        this.tabUsuario = usuario;
        //guardamos la tabla de la cuenta del usuario
        this.tabBanco = contusu.banco();
        // System.out.println(tabcuenta.getValueAt(0, 9).toString());
        //mostramo la tabla del destinatario a traves de la cuenta vinculada
        labelAbm.setText("Administracion de Banco");
        // labelAbm.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        // labelAbm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tablaAbm.setModel(this.tabBanco);

    }

    public void refrescartablaUsuario(DefaultTableModel usuario) {
        //Se carga la bandera con usuario
        this.bandera = "usuario";
        ControlUsuarios contusu = new ControlUsuarios();
        //guardamos la tabla del usuario 
        this.tabUsuario = usuario;
        //guardamos la tabla de la cuenta del usuario
        this.tabUsuarioComp = contusu.todoUsuario();

        //mostramo la tabla del destinatario a traves de la cuenta vinculada
        labelAbm.setText("Administracion de Usuarios");
        // labelAbm.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        // labelAbm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tablaAbm.setModel(this.tabUsuarioComp);

    }

    public void refrescartablaCuenta(DefaultTableModel usuario) {
        //Se carga la bandera con cuenta
        this.bandera = "cuenta";
        // Instanciamos para crear un objeto en control de usuarios
        ControlUsuarios contcuenta = new ControlUsuarios();
        //guardamos la tabla del usuario 
        this.tabUsuario = usuario;
        //guradamos la tabla de cuenta completa
        this.tabCuentaCom = contcuenta.cuentaCompleta();
        //Cargamos el titulo al jlabel
        labelAbm.setText("Administracion de Cuentas");
        //mostramo la tabla del destinatario a traves de la cuenta vinculada
        tablaAbm.setModel(this.tabCuentaCom);
    }


    private void botEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEliminarActionPerformed

        if (this.bandera.equals("banco")) {

            //SE guarda la fila seleccionada de Jtable 
            int fila = tablaAbm.getSelectedRow();
            //Guardamos el id de la tabla seleccionada
            String idBanco = tabBanco.getValueAt(fila, 0).toString();

            //se envia a eliminar con idCuenta e IdDestinatario
            EliminarDeTabla eliTab = new EliminarDeTabla();
            eliTab.EliminarBanco(idBanco);

            System.out.println("idBanco:  " + idBanco);

            //se refresca tabla para ver los datos actualizados
            refrescartablaBanco(tabUsuario);
        }

        if (this.bandera.equals("usuario")) {

            //SE guarda la fila seleccionada de Jtable 
            int fila = tablaAbm.getSelectedRow();
            //Guardamos el id de la tabla seleccionada
            String idusuario = tabUsuarioComp.getValueAt(fila, 0).toString();

            //se envia a eliminar con idCuenta e IdDestinatario
            EliminarDeTabla eliTab = new EliminarDeTabla();
            eliTab.EliminarUsuario(idusuario);

           // System.out.println("idUsuario:  " + idusuario);

            //se refresca tabla para ver los datos actualizados
            refrescartablaUsuario(tabUsuario);
        }

        if (this.bandera.equals("cuenta")) {
            //SE guarda la fila seleccionada de Jtable 
            int fila = tablaAbm.getSelectedRow();

            //Guardamos el id de la tabla seleccionada para poder eliminar la celda
            //Usaremos los 3 id que tenemos por celda
            String idCuenta = tabCuentaCom.getValueAt(fila, 0).toString();
            String idBanco = tabCuentaCom.getValueAt(fila, 10).toString();
            String idusuario = tabCuentaCom.getValueAt(fila, 9).toString();
            
            
            
            //System.out.println("idcuenta : "+idCuenta+" - Idbanco: "+idBanco+" - Idusuario :"+idusuario+" - fecha: "+fecha());
            EliminarDeTabla eliTab = new EliminarDeTabla();
            eliTab.EliminarCuenta(idCuenta, idusuario, idBanco,fecha());
            refrescartablaCuenta(tabUsuario);
        }

    }//GEN-LAST:event_botEliminarActionPerformed

    
    public String fecha(){
        Calendar c = Calendar.getInstance();
            String dia = Integer.toString(c.get(Calendar.DATE));
            String mes = Integer.toString(c.get(Calendar.MONTH));
            String annio = Integer.toString(c.get(Calendar.YEAR));
            String fecha = annio+"/"+mes+"/"+dia;
            return fecha;
    }
    
    private void tablaAbmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAbmMouseClicked
        //Habiulitar botones despues de seleccionar un elemento en la tabla

        botEliminar.setEnabled(true);
        botModificar.setEnabled(true);

    }//GEN-LAST:event_tablaAbmMouseClicked

    private void botAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAgregarActionPerformed
        //Iniciamos las tablas de agregar depéndiendo de las banderas

        //condicion para iniciar con banco
        if (this.bandera.equals("banco")) {

            AgreModBanco agreBanc = new AgreModBanco();
            agreBanc.agreBanco(tabUsuario);
            agreBanc.setVisible(true);
            // agreBanc.guardarIdcuenta(tabcuenta.getValueAt(0, 9).toString(), this.tabcuenta);

            dispose();
        }

        //condicion para iniciar con usuario
        if (this.bandera.equals("usuario")) {

            AgreModUsuario agreUsu = new AgreModUsuario();
            agreUsu.agreUsuario(tabUsuario);
            agreUsu.setVisible(true);
            // agreBanc.guardarIdcuenta(tabcuenta.getValueAt(0, 9).toString(), this.tabcuenta);
            dispose();
        }


    }//GEN-LAST:event_botAgregarActionPerformed

    private void botModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botModificarActionPerformed

        //Iniciamos las tablas de modificar depéndiendo de las banderas
        //condicion para iniciar con banco
        if (this.bandera.equals("banco")) {

            AgreModBanco modBanc = new AgreModBanco();
            int fila = tablaAbm.getSelectedRow();
            modBanc.modBanco(tabUsuario, tabBanco, fila);
            modBanc.setVisible(true);
            // agreBanc.guardarIdcuenta(tabcuenta.getValueAt(0, 9).toString(), this.tabcuenta);

            dispose();
        }

        //condicion para iniciar con usuario
        if (this.bandera.equals("usuario")) {

            AgreModUsuario agreUsu = new AgreModUsuario();
            int fila = tablaAbm.getSelectedRow();
            agreUsu.modUsuario(tabUsuarioComp, tabUsuario, fila);
            agreUsu.setVisible(true);
            // agreBanc.guardarIdcuenta(tabcuenta.getValueAt(0, 9).toString(), this.tabcuenta);
            dispose();
        }


    }//GEN-LAST:event_botModificarActionPerformed

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
            java.util.logging.Logger.getLogger(gestionAbm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestionAbm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestionAbm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestionAbm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionAbm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAgregar;
    private javax.swing.JButton botEliminar;
    private javax.swing.JButton botModificar;
    private javax.swing.JButton botVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAbm;
    private javax.swing.JTable tablaAbm;
    // End of variables declaration//GEN-END:variables
}
