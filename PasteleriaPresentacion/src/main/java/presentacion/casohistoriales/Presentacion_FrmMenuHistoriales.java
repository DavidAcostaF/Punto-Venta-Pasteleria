/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion.casohistoriales;

import control.ControlAgregarVenta;
import control.ControlHistoriales;

/**
 *
 * @author abelc
 */
public class Presentacion_FrmMenuHistoriales extends javax.swing.JFrame {

    private ControlHistoriales control;
    private ControlAgregarVenta controlPrincipal;

    /**
     * Creates new form FrmMenuHistoriales
     */
    public Presentacion_FrmMenuHistoriales() {
        setTitle("Menú");
        initComponents();
        this.controlPrincipal = new ControlAgregarVenta();
        this.control = ControlHistoriales.getInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        historialVentaBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        historialReportes = new javax.swing.JButton();
        regresarBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        historialVentaBtn.setBackground(new java.awt.Color(140, 220, 254));
        historialVentaBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        historialVentaBtn.setForeground(new java.awt.Color(0, 0, 0));
        historialVentaBtn.setText("Historial de ventas");
        historialVentaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialVentaBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Historiales");

        historialReportes.setBackground(new java.awt.Color(140, 220, 254));
        historialReportes.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        historialReportes.setForeground(new java.awt.Color(0, 0, 0));
        historialReportes.setText("Historial de reportes");
        historialReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialReportesActionPerformed(evt);
            }
        });

        regresarBtn.setBackground(new java.awt.Color(255, 255, 255));
        regresarBtn.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        regresarBtn.setForeground(new java.awt.Color(0, 0, 0));
        regresarBtn.setText("←");
        regresarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                regresarBtnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(historialReportes)
                            .addComponent(historialVentaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(regresarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(regresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86)
                .addComponent(historialVentaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(historialReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void historialVentaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialVentaBtnActionPerformed
        this.dispose();
        control.mostrarHistorialVentas();
    }//GEN-LAST:event_historialVentaBtnActionPerformed

    private void historialReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialReportesActionPerformed
        this.dispose();
        control.mostrarHistorialr();
    }//GEN-LAST:event_historialReportesActionPerformed

    private void regresarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarBtnMousePressed
        this.dispose();
        controlPrincipal.mostrarMenu();
    }//GEN-LAST:event_regresarBtnMousePressed

    public void mostrarHistorialVentas() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presentacion_FrmMenuHistoriales().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton historialReportes;
    private javax.swing.JButton historialVentaBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel regresarBtn;
    // End of variables declaration//GEN-END:variables
}
