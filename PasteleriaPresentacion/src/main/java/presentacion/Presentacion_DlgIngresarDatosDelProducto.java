/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import com.mycompany.pasteleriaconsultaringredientes.FuncionalidadConsultarIngredientes;
import com.mycompany.pasteleriaconsultaringredientes.IFuncionalidadConsultarIngredientes;
import dto.DTO_Ingrediente;
import extras.Render;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author af_da
 */
public class Presentacion_DlgIngresarDatosDelProducto extends javax.swing.JFrame {

    private IFuncionalidadConsultarIngredientes funcionalidadConsultarIngrediente;

    /**
     * Creates new form Presentacion_DlgSeleccionarIngredientesProducto
     */
    public Presentacion_DlgIngresarDatosDelProducto() {
        initComponents();
        funcionalidadConsultarIngrediente = new FuncionalidadConsultarIngredientes();
        cargaTabla();
    }

    private void cargaTabla() {
        tableIngredientes.setDefaultRenderer(Object.class, new Render());
        String[] columnas = {"Nombre", "Selección"};
        boolean[] editable = {false, true};
        Class[] tipos = new Class[]{java.lang.Object.class, java.lang.Boolean.class};

        DefaultTableModel model = new DefaultTableModel(columnas, 0) {
            public Class getColumnClass(int i) {
                return tipos[i];
            }

            public boolean isCellEditable(int row, int column) {
                return editable[column];
            }
        };

        limipiarTabla(tableIngredientes, model);

        Object datos = new Object[columnas.length];
        List<DTO_Ingrediente> ingredientes = funcionalidadConsultarIngrediente.consultarIngredientes();
        for (DTO_Ingrediente ingrediente : ingredientes) {

            model.addRow(new Object[]{ingrediente.getNombre(), false});
        }

        tableIngredientes.setModel(model);
    }

    private void limipiarTabla(JTable tabla, DefaultTableModel modeloTabla) {
        if (modeloTabla.getRowCount() > 0) {
            for (int i = 0; i < tabla.getRowCount(); i++) {
                modeloTabla.removeRow(i);
                i -= 1;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        tableIngredientes = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos del pastel");

        tableIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Seleccionar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableIngredientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableIngredientes.getTableHeader().setReorderingAllowed(false);
        tableIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableIngredientesMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(tableIngredientes);
        if (tableIngredientes.getColumnModel().getColumnCount() > 0) {
            tableIngredientes.getColumnModel().getColumn(0).setResizable(false);
            tableIngredientes.getColumnModel().getColumn(1).setResizable(false);
            tableIngredientes.getColumnModel().getColumn(1).setPreferredWidth(1);
        }

        btnAceptar.setBackground(new java.awt.Color(140, 220, 254));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Selecciona los ingredientes.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableIngredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableIngredientesMouseClicked

    }//GEN-LAST:event_tableIngredientesMouseClicked

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        List<String> elementosSeleccionados = new ArrayList<>();

        for (int i = 0; i < tableIngredientes.getRowCount(); i++) {
            // Obtener el valor del CheckBox en la columna "Seleccionar"
            boolean seleccionado = (boolean) tableIngredientes.getValueAt(i, 1);

            if (seleccionado) {
                String fila = tableIngredientes.getValueAt(i, 0).toString(); // Nombre

                elementosSeleccionados.add(fila);
            }
        }

        for (String fila : elementosSeleccionados) {
            System.out.println(fila);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Presentacion_DlgIngresarDatosDelProducto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Presentacion_DlgIngresarDatosDelProducto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Presentacion_DlgIngresarDatosDelProducto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Presentacion_DlgIngresarDatosDelProducto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presentacion_DlgIngresarDatosDelProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tableIngredientes;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}