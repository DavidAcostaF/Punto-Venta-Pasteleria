/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package presentacion;

import com.mycompany.pasteleriadirecciones.FuncionalidadConsultarDirecciones;
import com.mycompany.pasteleriadirecciones.IFuncionalidadConsultarDirecciones;
import com.mycompany.pasteleriadominios.Direccion;
import control.ControlAgregarVenta;
import dto.DTO_Direccion;
import dto.DTO_Venta;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abelc
 */
public class Presentacion_DlgDirecciones extends javax.swing.JDialog {
    
    private ControlAgregarVenta control;
    private IFuncionalidadConsultarDirecciones direcciones;
    private List<DTO_Direccion> direccionesLista;
    private DTO_Venta venta;

    /**
     * Creates new form DlgDirecciones
     */
    public Presentacion_DlgDirecciones(java.awt.Frame parent, boolean modal, DTO_Venta venta) {
        super(parent, modal);
        this.venta = venta;
        control = new ControlAgregarVenta();
        direcciones = new FuncionalidadConsultarDirecciones();
        direccionesLista = direcciones.consultarDirecciones();
        System.out.println(direccionesLista);
        initComponents();
        
        llenarTabla();
        setVisible(true);
    }
    
    private void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaDirecciones.getModel();
        
        direccionesLista.forEach(p -> modelo.addRow(new Object[]{p.getCalle() + "", p.getColonia() + "", p.getNumExterior()}));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDirecciones = new javax.swing.JTable();
        btnSeleccionarDireccion = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Seleccione una dirección");

        tablaDirecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Calle", "Colonia", "Numero"
            }
        ));
        tablaDirecciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaDirecciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaDirecciones);

        btnSeleccionarDireccion.setBackground(new java.awt.Color(140, 220, 254));
        btnSeleccionarDireccion.setText("Seleccionar");
        btnSeleccionarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarDireccionActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(140, 220, 254));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Agregar dirección");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(btnSeleccionarDireccion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(229, 229, 229))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnSeleccionarDireccion))
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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
        control.AgregarDireccion(venta);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnSeleccionarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarDireccionActionPerformed
        int filaSeleccionada = tablaDirecciones.getSelectedRow();
        if (filaSeleccionada != -1) {
            DTO_Direccion direccion = new DTO_Direccion();
            direccion.setCalle(tablaDirecciones.getValueAt(filaSeleccionada, 0).toString());
            venta.setDieccionEntrega(direccion);
            this.dispose();
            control.CobrarVenta(venta);
        }
        

    }//GEN-LAST:event_btnSeleccionarDireccionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSeleccionarDireccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDirecciones;
    // End of variables declaration//GEN-END:variables
}
