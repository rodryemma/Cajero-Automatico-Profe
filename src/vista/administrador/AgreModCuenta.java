/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.administrador;

import controlador.AgregarDeTabla;
import controlador.ModificarDeTabla;
import java.util.Calendar;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Cuenta_;
import modelo.Trasferencia_;

public class AgreModCuenta extends javax.swing.JFrame {

    DefaultTableModel tabusuario;
    DefaultTableModel tabcuentacom;
    String bandera;
    String idcuenta;
    String idbanco;
    String idusuario;
    String idUsuNew;
    String idBcoNew;

    public AgreModCuenta() {
        initComponents();

        //centra vista
        this.setLocationRelativeTo(null);
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnroCuenta = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        txtIdBanco = new javax.swing.JTextField();
        botBuscUsuario = new javax.swing.JButton();
        botBusBanc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        botGuardar = new javax.swing.JButton();
        botCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitulo.setText("AgreMod Cuenta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(labTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("N° de cuenta");

        jLabel3.setText("Saldo");

        jLabel4.setText("Id Usuario");

        jLabel5.setText("Id Banco");

        txtIdUsuario.setEditable(false);

        txtIdBanco.setEditable(false);

        botBuscUsuario.setText("Buscar Usuario");
        botBuscUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBuscUsuarioActionPerformed(evt);
            }
        });

        botBusBanc.setText("Buscar Banco");
        botBusBanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBusBancActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(txtIdBanco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botBuscUsuario)
                            .addComponent(botBusBanc, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtnroCuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botBuscUsuario))
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botBusBanc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(63, 63, 63)
                .addComponent(botGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botCancelar)
                .addGap(72, 72, 72))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botGuardar)
                    .addComponent(botCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    public String fecha() {
        Calendar c = Calendar.getInstance();
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(c.get(Calendar.MONTH));
        String annio = Integer.toString(c.get(Calendar.YEAR));
        String fecha = annio + "/" + mes + "/" + dia;
        return fecha;
    }

    
    public void botguardar(){
        if(txtIdUsuario.getText().toString().equals("")||txtIdBanco.getText().toString().equals("")){
            botGuardar.setEnabled(false);
        }else{
        botGuardar.setEnabled(true);
        }
    }
    
    
    public void agreCuenta(DefaultTableModel tabusu) {
        labTitulo.setText("Agregar cuenta");
        this.tabusuario = tabusu;
        this.bandera = "agregar";
        botguardar();

    }

    public void modifCuenta(DefaultTableModel tabusu, DefaultTableModel tabcuenta, int fila) {
        labTitulo.setText("Modificar cuenta");
        this.tabusuario = tabusu;
        this.tabcuentacom = tabcuenta;
        this.bandera = "modificar";
        this.idcuenta = this.tabcuentacom.getValueAt(fila, 0).toString();
        this.idusuario = this.tabcuentacom.getValueAt(fila, 9).toString();
        this.idbanco = this.tabcuentacom.getValueAt(fila, 10).toString();

        txtnroCuenta.setText(this.tabcuentacom.getValueAt(fila, 1).toString());
        txtSaldo.setText(this.tabcuentacom.getValueAt(fila, 2).toString());
        txtIdUsuario.setText(this.idusuario);
        txtIdBanco.setText(this.idbanco);
        this.idUsuNew = this.idusuario;
        this.idBcoNew = this.idbanco;
        botguardar();
    }

    public void cargaridusuario(DefaultTableModel tabUsu,String idCta,String idusu, String idbco, String idUsunew, String idBancnew, String nrocuenta, String saldo, String bande) {
        this.idUsuNew = idUsunew;
        this.idBcoNew = idBancnew;
        this.bandera = bande;
        this.idusuario=idusu;
        this.idbanco=idbco;
        this.idcuenta=idCta;
        txtnroCuenta.setText(nrocuenta);
        txtSaldo.setText(saldo);
        txtIdUsuario.setText(this.idUsuNew);
        txtIdBanco.setText(this.idBcoNew);
        this.setVisible(true);
        botguardar();
        
        // this.setVisible(true);
    }

    public void cargaridbanco(DefaultTableModel tabUsu,String idCta,String idusu, String idbco, String idusuario, String idbanco, String nrocuenta, String saldo, String bande) {
        this.idUsuNew = idusuario;
        this.idBcoNew = idbanco;
        this.bandera = bande;
        this.idusuario=idusu;
        this.idbanco=idbco;
        this.idcuenta=idCta;
        txtnroCuenta.setText(nrocuenta);
        txtSaldo.setText(saldo);
        txtIdUsuario.setText(this.idUsuNew);
        txtIdBanco.setText(this.idBcoNew);
        this.setVisible(true);

        //this.setVisible(true);
    }

    private void botBuscUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBuscUsuarioActionPerformed
        buscador busc = new buscador();
        busc.cargarTablaUsu(tabusuario,idcuenta,idusuario,idbanco, idUsuNew, idBcoNew, txtnroCuenta.getText().toString(), txtSaldo.getText().toString(), bandera);
        busc.setVisible(true);
        dispose();

    }//GEN-LAST:event_botBuscUsuarioActionPerformed

    private void botBusBancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBusBancActionPerformed
        buscador busc = new buscador();
        busc.cargarTablaBco(tabusuario,idcuenta,idusuario,idbanco, idUsuNew, idBcoNew, txtnroCuenta.getText().toString(), txtSaldo.getText().toString(), bandera);
        busc.setVisible(true);
        dispose();


    }//GEN-LAST:event_botBusBancActionPerformed

    private void botGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botGuardarActionPerformed
        String nrocta = txtnroCuenta.getText().toString();
        String saldo = txtSaldo.getText().toString();

        if (this.bandera.equals("agregar")) {
            AgregarDeTabla agreCta = new AgregarDeTabla();

            System.out.println("nrocta :" + nrocta + " saldo :" + saldo + " idusuario :" + idUsuNew + " idbanco: " + idBcoNew);
            agreCta.agregarCuenta(nrocta, saldo, fecha(), idUsuNew, idBcoNew);
            volver();
        }

        if (this.bandera.equals("modificar")) {
            ModificarDeTabla modCta = new ModificarDeTabla();
            System.out.println("nrocta :" + nrocta + " -saldo :" + saldo +" -idcuenta : "+idcuenta+ " -idusuario :" + this.idusuario + " -idbanco: " + this.idbanco + " -idusunew: " + idUsuNew + " -idbconew: " + idBcoNew);
            modCta.modiCuenta(nrocta, saldo, fecha(), idcuenta, idusuario, idbanco, idUsuNew, idBcoNew);
            volver();
        }


    }//GEN-LAST:event_botGuardarActionPerformed


    private void botCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarActionPerformed
        volver();
    }//GEN-LAST:event_botCancelarActionPerformed

    public void volver() {
        gestionAbm gestAbm = new gestionAbm();
        dispose();
        gestAbm.refrescartablaCuenta(tabusuario);
        gestAbm.setVisible(true);

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgreModCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botBusBanc;
    private javax.swing.JButton botBuscUsuario;
    private javax.swing.JButton botCancelar;
    private javax.swing.JButton botGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JTextField txtIdBanco;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtnroCuenta;
    // End of variables declaration//GEN-END:variables
}
