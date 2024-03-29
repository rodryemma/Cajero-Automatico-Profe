
package vista;

import controlador.ControlUsuarios;
import controlador.EliminarDeTabla;
import javax.swing.table.DefaultTableModel;



public class AgendarCbu extends javax.swing.JFrame {

 DefaultTableModel tabusuario;
 DefaultTableModel tabcuenta;
 
    
    public AgendarCbu() {
       
        initComponents();
        this.setLocationRelativeTo(null);
         //refrescartabla();
        deshabilitarbot();
        
    }

    public void deshabilitarbot(){
        botSeleccionar.setEnabled(false);
        botEliminar.setEnabled(false);
        botModificar.setEnabled(false);
    }
    
    public void refrescartabla(DefaultTableModel usuario){
    ControlUsuarios contusu = new ControlUsuarios();
       //guardamos la tabla del usuario 
        this.tabusuario=usuario;
        //guardamos la tabla de la cuenta del usuario
        this.tabcuenta=contusu.cuenta(usuario.getValueAt(0, 0).toString());
       // System.out.println(tabcuenta.getValueAt(0, 9).toString());
       //mostramo la tabla del destinatario a traves de la cuenta vinculada
        TablaDestinatario.setModel(contusu.destinatario(tabcuenta.getValueAt(0, 9).toString()));
        
    
}
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botAgregar = new javax.swing.JButton();
        botEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDestinatario = new javax.swing.JTable();
        botModificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botSeleccionar = new javax.swing.JButton();
        botCancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botAgregar.setText("Agregar");
        botAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAgregarActionPerformed(evt);
            }
        });

        botEliminar.setText("Eliminar");
        botEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEliminarActionPerformed(evt);
            }
        });

        TablaDestinatario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CBU", "Nombre", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDestinatario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaDestinatario.getTableHeader().setReorderingAllowed(false);
        TablaDestinatario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDestinatarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDestinatario);

        botModificar.setText("Modificar");
        botModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botModificarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(botSeleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botCancelar)
                .addGap(176, 176, 176))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botSeleccionar)
                    .addComponent(botCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botModificar)
                        .addGap(12, 12, 12)
                        .addComponent(botEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Destinatarios");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAgregarActionPerformed
        
        
        AgregarDestinatarios agreDes = new AgregarDestinatarios();
        agreDes.setVisible(true);
        agreDes.guardarIdcuenta(tabcuenta.getValueAt(0, 9).toString(),this.tabcuenta);
        //System.out.println(tabcuenta.getValueAt(0, 9).toString());
        dispose();
         
        
    }//GEN-LAST:event_botAgregarActionPerformed

    private void botModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botModificarActionPerformed
       
        
        
        //Creamos una instancia para traer la tabla completa de Destinaratio del cliente 
        ControlUsuarios contusu = new ControlUsuarios();
        //enviamos el id del cliente
        DefaultTableModel TablaDest = contusu.destinatarioCompleta(tabcuenta.getValueAt(0, 9).toString());
        
         //SE guarda la fila seleccionada de Jtable pero solo tiene 3 campos
        int fila = TablaDestinatario.getSelectedRow();
     
        ModificarDestinatario modDesti = new ModificarDestinatario();
        modDesti.cargarTxt(fila,TablaDest,this.tabusuario);
        modDesti.setVisible(true);
       dispose();
        
       
        
        
        
    }//GEN-LAST:event_botModificarActionPerformed

    private void botSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSeleccionarActionPerformed
        ControlUsuarios contusu = new ControlUsuarios();
        DefaultTableModel TablaDest = contusu.destinatarioCompleta(tabcuenta.getValueAt(0, 9).toString());
        //SE guarda la fila seleccionada de Jtable
        int fila = TablaDestinatario.getSelectedRow();
        
        //String seleccion =TablaDestinatario.getValueAt(fila, 0).toString();
        String idDest = TablaDest.getValueAt(fila, 0).toString();
        //Se guarda el nombre de la tabla seleccionada
        String nombredesti = TablaDestinatario.getValueAt(fila, 1).toString();
        //Se guarda el CBU de la persona seleccionada
        String cbudest = TablaDestinatario.getValueAt(fila, 0).toString();
        //se guarda el correo de la persona seleccionada
        String correodest = TablaDestinatario.getValueAt(fila, 2).toString();
        
        transferencia transf = new transferencia();
        transf.cargardestinatario(idDest,nombredesti,cbudest,correodest,tabusuario);
        transf.iniciaTxtTransf(tabusuario);
        transf.setVisible(true);
        
       dispose();
        
        
    }//GEN-LAST:event_botSeleccionarActionPerformed

    private void botEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEliminarActionPerformed
       //Creamos una instancia para traer la tabla completa de Destinaratio del cliente 
        ControlUsuarios contusu = new ControlUsuarios();
        //enviamos el id del cliente
        DefaultTableModel TablaDest = contusu.destinatarioCompleta(tabcuenta.getValueAt(0, 9).toString());
        
         //SE guarda la fila seleccionada de Jtable pero solo tiene 3 campos
        int fila = TablaDestinatario.getSelectedRow();
        
                
        //Se guarda el id Destinaratio de la persona seleccionada
        String idDestinaratio = TablaDest.getValueAt(fila, 0).toString();
        //se guarda el idCuenta de la persona seleccionada
        String idCuenta = TablaDest.getValueAt(fila, 4).toString();
        
        //se envia a eliminar con idCuenta e IdDestinatario
        EliminarDeTabla eliTab = new EliminarDeTabla();
        eliTab.EliminarDedestinatario(idCuenta, idDestinaratio);
        
        //System.out.println("idDestinatario:  "+idDestinaratio + "  --  IDcuenta:  "+idCuenta);
        
       //se refresca tabla para ver los datos actualizados
       refrescartabla(tabusuario);
       
        
      
       
        
        
    }//GEN-LAST:event_botEliminarActionPerformed

    private void TablaDestinatarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDestinatarioMouseClicked
        
        //habilitaremos botones al seleccionar un elemento en la tabla
        botSeleccionar.setEnabled(true);
        botEliminar.setEnabled(true);
        botModificar.setEnabled(true);
        
    }//GEN-LAST:event_TablaDestinatarioMouseClicked

    private void botCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarActionPerformed
        
        //Cerramos ventana actual 
        transferencia trans = new transferencia();
        dispose();
        
        //y abrimos la vista de transferencia enviando la tabla de usuario
        trans.iniciaTxtTransf(tabusuario);
        trans.setVisible(true);
        
        
    }//GEN-LAST:event_botCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(AgendarCbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendarCbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendarCbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendarCbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendarCbu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDestinatario;
    private javax.swing.JButton botAgregar;
    private javax.swing.JButton botCancelar;
    private javax.swing.JButton botEliminar;
    private javax.swing.JButton botModificar;
    private javax.swing.JButton botSeleccionar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
