/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import com.mycompany.pasteleriaagregaringrediente.FuncionalidadAgregarIngrediente;
import com.mycompany.pasteleriaagregaringrediente.IFuncionalidadAgregarIngrediente;
import com.mycompany.pasteleriaconsultaringrediente.FuncionalidadConsultarIngrediente;
import com.mycompany.pasteleriaconsultaringrediente.IFuncionalidadConsultarIngrediente;
import com.mycompany.pasteleriaconsultaringredientes.FuncionalidadConsultarIngredientes;
import com.mycompany.pasteleriaconsultaringredientes.IFuncionalidadConsultarIngredientes;
import dto.DTO_Ingrediente;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author af_da
 */
public class Presentacion_DlgInventarioIngredientes extends javax.swing.JFrame {

    private IFuncionalidadConsultarIngredientes funcionalidadConsultarIngredientes;
    private IFuncionalidadAgregarIngrediente funcionalidadAgregarIngrediente;
    private IFuncionalidadConsultarIngrediente funcionalidadConsultarIngrediente;
    // private List<DTO_Ingrediente> listaIngredientes;

    /**
     * Creates new form Presentacion_DlgInventarioIngredientes
     */
    public Presentacion_DlgInventarioIngredientes() {
        initComponents();
        funcionalidadConsultarIngredientes = new FuncionalidadConsultarIngredientes();
        funcionalidadAgregarIngrediente = new FuncionalidadAgregarIngrediente();
        funcionalidadConsultarIngrediente = new FuncionalidadConsultarIngrediente();
        //listaIngredientes = funcionalidadConsultarIngredientes.consultarIngredientes();
        llenarTabla();
        btnActualizar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        tableIngredientes = new javax.swing.JTable();
        comboUnidad = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnVolver1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregar.setBackground(new java.awt.Color(140, 220, 254));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tableIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Unidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableIngredientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableIngredientesMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(tableIngredientes);

        comboUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gramos", "mililitros", "unidad" }));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Cantidad:");

        jLabel3.setText("Unidad:");

        jLabel4.setText("Precio:");

        btnActualizar.setBackground(new java.awt.Color(140, 220, 254));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(140, 220, 254));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        btnVolver1.setBackground(new java.awt.Color(140, 220, 254));
        btnVolver1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre:");

        btnEliminar.setBackground(new java.awt.Color(140, 220, 254));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(155, 155, 155))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar)
                                .addGap(56, 56, 56)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBuscar)
                                .addComponent(jLabel5))
                            .addComponent(btnVolver1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver)
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarTabla() {
        List<DTO_Ingrediente> listaIngredientes = funcionalidadConsultarIngredientes.consultarIngredientes();
        DefaultTableModel modelo = (DefaultTableModel) tableIngredientes.getModel();

        if (listaIngredientes != null) {
            listaIngredientes.forEach(t -> modelo.addRow(new Object[]{t.getNombre(), t.getCantidad(), t.getUnidadDeMedida(), t.getPrecio()}));
        }
    }

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
            java.util.logging.Logger.getLogger(Presentacion_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Presentacion_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Presentacion_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Presentacion_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Presentacion_DlgInventarioIngredientes().setVisible(true);
            }
        });
    }

    private void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tableIngredientes.getModel();

        modelo.setRowCount(0);

        tableIngredientes.setModel(modelo);
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtNombre.getText().isEmpty() || txtPrecio.getText().isEmpty() || comboUnidad.getSelectedItem().toString().isEmpty() || txtCantidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos.");
            return;
        }
        DefaultTableModel modelo = (DefaultTableModel) tableIngredientes.getModel();
        DTO_Ingrediente ingredientoDTO = new DTO_Ingrediente();
        ingredientoDTO.setNombre(txtNombre.getText());
        ingredientoDTO.setPrecio(Float.parseFloat(txtPrecio.getText()));
        ingredientoDTO.setUnidadDeMedida(comboUnidad.getSelectedItem().toString());
        ingredientoDTO.setCantidad(Integer.parseInt(txtCantidad.getText()));
        DTO_Ingrediente ingredienteNuevo = null;
        try {
            ingredienteNuevo = funcionalidadAgregarIngrediente.agregarIngrediente(ingredientoDTO);
            modelo.addRow(new Object[]{ingredienteNuevo.getNombre(), ingredienteNuevo.getCantidad(), ingredienteNuevo.getUnidadDeMedida(), ingredienteNuevo.getPrecio()});
            this.limpiarCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_btnAgregarActionPerformed
    private void limpiarCampos() {
        txtNombre.setText("");
        txtPrecio.setText("");
        comboUnidad.setSelectedItem(0);
        txtCantidad.setText("");
    }
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        btnActualizar.setEnabled(false);
        btnAgregar.setEnabled(true);
        this.limpiarCampos();

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void tableIngredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableIngredientesMouseClicked
        int fila = tableIngredientes.rowAtPoint(evt.getPoint());
        txtNombre.setText(tableIngredientes.getValueAt(fila, 0).toString());
        txtCantidad.setText(tableIngredientes.getValueAt(fila, 1).toString());
        //comboUnidad.se(tableIngredientes.getValueAt(fila, 0).toString());
        txtPrecio.setText(tableIngredientes.getValueAt(fila, 3).toString());
        btnActualizar.setEnabled(true);
        btnAgregar.setEnabled(false);
    }//GEN-LAST:event_tableIngredientesMouseClicked

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped


    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        limpiarTabla();

        if (txtBuscar.getText().isBlank()) {
            llenarTabla();
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) tableIngredientes.getModel();
        DTO_Ingrediente ingredientoDTO = new DTO_Ingrediente();
        ingredientoDTO.setNombre(txtBuscar.getText());
//        ingredientoDTO.setPrecio(Float.parseFloat(txtPrecio.getText()));
//        ingredientoDTO.setUnidadDeMedida(comboUnidad.getSelectedItem().toString());
//        ingredientoDTO.setCantidad(Integer.parseInt(txtCantidad.getText()));
        List<DTO_Ingrediente> ingredienteConsultado = funcionalidadConsultarIngrediente.consultarIngrediente(ingredientoDTO);
        if (ingredienteConsultado != null) {
            ingredienteConsultado.forEach(t -> modelo.addRow(new Object[]{t.getNombre(), t.getCantidad(), t.getUnidadDeMedida(), t.getPrecio()}));
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JComboBox<String> comboUnidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tableIngredientes;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
