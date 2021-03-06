package formularios;

import clases.Datos;
import clases.Utilidades;
import javax.swing.table.DefaultTableModel;

public class FrmBusquedaCliente extends javax.swing.JDialog {
    
    private Datos misDatos;
    private DefaultTableModel miTabla;
    private String respuesta = "";
    
    public FrmBusquedaCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //agrupamos los botones
        bgrTipoBusqueda.add(rbtID);
        bgrTipoBusqueda.add(rbtNombres);
        bgrTipoBusqueda.add(rbtApellidos);
    }
    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }
    private void llenarTabla() {
        String titulos[] = { "ID Cliente", "Nombres", "Apellidos" };
        String registro[] = new String[3];
        miTabla = new DefaultTableModel(null, titulos);
        
        for (int i = 0; i < misDatos.numeroClientes(); i++) {
            if (txtCriterio.getText().equals("")) {
                registro[0] = misDatos.getClientes()[i].getIdCliente();
                registro[1] = misDatos.getClientes()[i].getNombres();
                registro[2] = misDatos.getClientes()[i].getApellidos();
                miTabla.addRow(registro);
            } else {
                if (rbtNombres.isSelected() && misDatos.getClientes()[i].getNombres().startsWith(txtCriterio.getText())) {
                    
                        registro[0] = misDatos.getClientes()[i].getIdCliente();
                        registro[1] = misDatos.getClientes()[i].getNombres();
                        registro[2] = misDatos.getClientes()[i].getApellidos();
                        miTabla.addRow(registro);
                    
                }
                else if (rbtApellidos.isSelected() && misDatos.getClientes()[i].getApellidos().startsWith(txtCriterio.getText())) {
                    
                        registro[0] = misDatos.getClientes()[i].getIdCliente();
                        registro[1] = misDatos.getClientes()[i].getNombres();
                        registro[2] = misDatos.getClientes()[i].getApellidos();
                        miTabla.addRow(registro);
                    
                }
                else if (rbtID.isSelected() && misDatos.getClientes()[i].getIdCliente().startsWith(txtCriterio.getText())) {
                    
                        registro[0] = misDatos.getClientes()[i].getIdCliente();
                        registro[1] = misDatos.getClientes()[i].getNombres();
                        registro[2] = misDatos.getClientes()[i].getApellidos();
                        miTabla.addRow(registro);
                    
                }
            }
        }
        tblTabla.setModel(miTabla);
    }
    public String getRespuesta() {
        return respuesta;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrTipoBusqueda = new javax.swing.ButtonGroup();
        rbtID = new javax.swing.JRadioButton();
        rbtNombres = new javax.swing.JRadioButton();
        rbtApellidos = new javax.swing.JRadioButton();
        txtCriterio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busqueda Cliente");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        rbtID.setSelected(true);
        rbtID.setText("ID");
        rbtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtIDActionPerformed(evt);
            }
        });

        rbtNombres.setText("Nombres");
        rbtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNombresActionPerformed(evt);
            }
        });

        rbtApellidos.setText("Apellidos");
        rbtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtApellidosActionPerformed(evt);
            }
        });

        txtCriterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCriterioActionPerformed(evt);
            }
        });

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTabla);

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aceptar24x24.png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancelar24x24.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCriterio)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtID)
                        .addGap(18, 18, 18)
                        .addComponent(rbtNombres)
                        .addGap(18, 18, 18)
                        .addComponent(rbtApellidos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtID)
                    .addComponent(rbtNombres)
                    .addComponent(rbtApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        llenarTabla();
        txtCriterio.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened
    private void rbtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNombresActionPerformed
        txtCriterio.setText("");
        txtCriterio.requestFocusInWindow();
    }//GEN-LAST:event_rbtNombresActionPerformed
    private void rbtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtApellidosActionPerformed
        txtCriterio.setText("");
        txtCriterio.requestFocusInWindow();
    }//GEN-LAST:event_rbtApellidosActionPerformed
    private void rbtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtIDActionPerformed
        txtCriterio.setText("");
        txtCriterio.requestFocusInWindow();
    }//GEN-LAST:event_rbtIDActionPerformed
    private void txtCriterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCriterioActionPerformed
       llenarTabla();
    }//GEN-LAST:event_txtCriterioActionPerformed
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        respuesta = "";
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int num = tblTabla.getRowCount();
        
        if (num  == 0) {
            respuesta = "";
            dispose();
            return;
        }
        for (int i = 0; i < num; i++) {
            if (tblTabla.isRowSelected(i)) {
                respuesta = Utilidades.objectToString(tblTabla.getValueAt(i, 0));
                dispose();
                return;
            }
        }
        respuesta = Utilidades.objectToString(tblTabla.getValueAt(0, 0));
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed


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
            java.util.logging.Logger.getLogger(FrmBusquedaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmBusquedaCliente dialog = new FrmBusquedaCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrTipoBusqueda;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtApellidos;
    private javax.swing.JRadioButton rbtID;
    private javax.swing.JRadioButton rbtNombres;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtCriterio;
    // End of variables declaration//GEN-END:variables
}
