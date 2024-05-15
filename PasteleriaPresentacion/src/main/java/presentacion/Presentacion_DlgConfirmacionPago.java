/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package presentacion;

import com.mycompany.clientes.FuncionalidadAgregarClientes;
import com.mycompany.clientes.IFuncionalidadAgregarClientes;
import com.mycompany.pasteleriaventa.FuncionalidadesVenta;
import com.mycompany.pasteleriaventa.IFuncionalidadesVenta;
import control.ControlAgregarVenta;
import dto.DTO_Direccion;
import dto.DTO_Venta;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author af_da
 */
public class Presentacion_DlgConfirmacionPago extends javax.swing.JDialog {

    ControlAgregarVenta control;
    DTO_Venta venta;
    IFuncionalidadesVenta ventas;
    IFuncionalidadAgregarClientes agregarCliente;

    /**
     * Creates new form DlgPagoEfectivo
     */
    public Presentacion_DlgConfirmacionPago(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        control = ControlAgregarVenta.getInstance();
        this.venta = control.getVenta();
        this.agregarCliente = new FuncionalidadAgregarClientes();
        this.ventas = new FuncionalidadesVenta();
        initComponents();
        txtCliente.setText(venta.getCliente().getNombre());
        txtCosto.setText(Float.toString(venta.getMontoTotal()));
        SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
        txtFechaEntrega.setText(ff.format(venta.getFechaEntrega()));
        txtUbicacionEntrega.setText(venta.getDireccionEntrega().getCalle());
        setVisible(true);

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
        jLabel1 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        txtFechaEntrega = new javax.swing.JTextField();
        txtUbicacionEntrega = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Confirmación de Pago");

        btnRegistrar.setBackground(new java.awt.Color(140, 220, 254));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(140, 220, 254));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel3.setText("Costo:");

        jLabel8.setText("Cliente:");

        jLabel9.setText("Fecha de entrega:");

        jLabel10.setText("Ubicacion Entrega:");

        txtCosto.setEditable(false);
        txtCosto.setBackground(new java.awt.Color(255, 255, 255));
        txtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoActionPerformed(evt);
            }
        });

        txtFechaEntrega.setEditable(false);
        txtFechaEntrega.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaEntregaActionPerformed(evt);
            }
        });

        txtUbicacionEntrega.setEditable(false);
        txtUbicacionEntrega.setBackground(new java.awt.Color(255, 255, 255));
        txtUbicacionEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionEntregaActionPerformed(evt);
            }
        });

        txtCliente.setEditable(false);
        txtCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(txtUbicacionEntrega)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCliente)
                                    .addComponent(txtCosto))))
                        .addGap(194, 194, 194))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtUbicacionEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnRegistrar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (venta.getCliente().getID() == null) {
            List<DTO_Direccion> a = new ArrayList<>();
            a.add(venta.getDireccionEntrega());
            venta.getCliente().setDirecciones(a);
            venta.setIDcliente(agregarCliente.agregarCliente(venta.getCliente()).getID());   
            ventas.agregarVenta(venta);
            venta.setFechaRegistro(new Date());

        } else {
            System.out.println(venta.getCliente().getID());
            venta.setIDcliente(venta.getCliente().getID());
            venta.setFechaRegistro(new Date());
            ventas.agregarVenta(venta);
        }

        String mensaje = "¡La venta ha sido registrada exitosamente!";

        JOptionPane.showMessageDialog(null, mensaje, "Registro de Venta Exitoso", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        int respuesta = JOptionPane.showOptionDialog(null, "¿Quiere registrar otra venta?", "Hola", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Sí", "No"}, "Sí");

        if (respuesta == JOptionPane.YES_OPTION) {
            this.dispose();
            control.mostrarProductosVenta();

        } else {
            this.dispose();
            control.mostrarMenu();

        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoActionPerformed

    private void txtFechaEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaEntregaActionPerformed

    private void txtUbicacionEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionEntregaActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtUbicacionEntrega;
    // End of variables declaration//GEN-END:variables
}
