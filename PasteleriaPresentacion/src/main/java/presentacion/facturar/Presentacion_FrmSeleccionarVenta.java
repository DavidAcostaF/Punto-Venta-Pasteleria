/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion.facturar;

import com.mycompany.pasteleriaconsultarventas.FuncionalidadConsultarVentas;
import com.mycompany.pasteleriaconsultarventas.IFuncionalidadConsultarVentas;
import com.mycompany.pasteleriagenerarreporte.FuncionalidadGenerarReporte;
import com.mycompany.pasteleriagenerarreporte.IFuncionalidadGenerarReporte;
import com.mycompany.pasteleriaguardarreportes.FuncionalidadGuardarReportes;
import com.mycompany.pasteleriaguardarreportes.IFuncionalidadGuardarReportes;
import com.mycompany.pasteleriaproductosventa.FuncionalidadConsultarProductos;
import com.mycompany.pasteleriaproductosventa.IFuncionalidadConsultarProductos;
import consultarClientes.FuncionalidadConsultarClientes;
import consultarClientes.IFuncionalidadConsultarClientes;
import control.ControlFacturar;
import control.ControlHistoriales;
import dto.DTO_Cliente;
import dto.DTO_Producto;
import dto.DTO_Venta;
import extras.VentasTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.TableModel;

/**
 *
 * @author PERSONAL
 */
public class Presentacion_FrmSeleccionarVenta extends javax.swing.JFrame {

    private ControlFacturar control;
    private DTO_Cliente cliente;
    private IFuncionalidadConsultarClientes funcionalidadesClientes;
    private List<DTO_Cliente> listaClientes;
    private List<DTO_Producto> listaProductos;
    private List<DTO_Producto> listaProductosSeleccionados;
    private IFuncionalidadConsultarProductos funcionalidadConsultarProductos;
    private IFuncionalidadConsultarVentas funcionalidadConsultarVentas;
    private IFuncionalidadGenerarReporte funcionalidadGenerarReporte;
    private DTO_Venta venta;
    private IFuncionalidadGuardarReportes guardarReporte;
    
    /**
     * Creates new form Presentacion_FrmSeleccionarVenta
     */
    public Presentacion_FrmSeleccionarVenta() {
        initComponents();
        
        this.control = ControlFacturar.getInstance().getInstance();
        this.guardarReporte = new FuncionalidadGuardarReportes();
        this.funcionalidadConsultarVentas = new FuncionalidadConsultarVentas();
        this.funcionalidadesClientes = new FuncionalidadConsultarClientes();
        this.funcionalidadConsultarProductos = new FuncionalidadConsultarProductos();
        this.funcionalidadGenerarReporte = new FuncionalidadGenerarReporte();
        this.cliente = new DTO_Cliente();
        this.venta = new DTO_Venta();
        this.listaProductosSeleccionados = new ArrayList<>();
        listaClientes = funcionalidadesClientes.consultarClientes();
        listaProductos = funcionalidadConsultarProductos.consultarProductos();
        
        initComponents();
        llenarTabla();
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
        jPanel2 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVentas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        datePickerDesde = new com.github.lgooddatepicker.components.DatePicker();
        jLabel4 = new javax.swing.JLabel();
        datePickerHasta = new com.github.lgooddatepicker.components.DatePicker();
        jLabel5 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(18, 149, 205));

        btnVolver.setText("Volver");
        btnVolver.setBackground(new java.awt.Color(18, 111, 161));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel6.setText("FACTURAR");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(149, 149, 149)
                .addComponent(btnVolver)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(btnVolver))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "FECHA VENTA", "FECHA ENTREGA", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableVentas);
        if (tableVentas.getColumnModel().getColumnCount() > 0) {
            tableVentas.getColumnModel().getColumn(0).setResizable(false);
            tableVentas.getColumnModel().getColumn(1).setResizable(false);
            tableVentas.getColumnModel().getColumn(2).setResizable(false);
            tableVentas.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setText("Filtrar por fecha:");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel3.setText("Desde");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setText("Hasta");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setText("Filtrar por nombre:");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtNombreCliente.setMinimumSize(new java.awt.Dimension(74, 21));
        txtNombreCliente.setPreferredSize(new java.awt.Dimension(74, 21));

        jLabel1.setText("Seleccione una venta para facturar:");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setBackground(new java.awt.Color(18, 111, 161));
        btnSeleccionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setBackground(new java.awt.Color(18, 111, 161));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(datePickerDesde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(datePickerHasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnSeleccionar)
                        .addGap(42, 42, 42)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datePickerDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datePickerHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleccionar)
                    .addComponent(btnCancelar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        control.mostrarDlgOpcionFactura();
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        control.mostrarDlgOpcionFactura();
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        control.setVenta(venta);
        control.setCliente(venta.getCliente());
        control.mostrarDlgFacturarACliente();
        this.dispose();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    public void llenarTabla() {
        limpiarTabla();
        List<DTO_Venta> listaVentas = funcionalidadConsultarVentas.consultarVentas();
        if (listaVentas != null) {
            VentasTableModel modelo = new VentasTableModel(listaVentas);
            tableVentas.setModel(modelo);
        }
    }

    private void limpiarTabla() {
        TableModel modelo = tableVentas.getModel();
        if (modelo instanceof VentasTableModel) {
            ((VentasTableModel) modelo).limpiarTabla();
        }
    }
    
    private void obtenerDatosFilaSeleccionada() {
        int filaSeleccionada = tableVentas.getSelectedRow();
        if (filaSeleccionada != -1) {
            venta = ((VentasTableModel) tableVentas.getModel()).getVentaAt(filaSeleccionada);

        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnVolver;
    private com.github.lgooddatepicker.components.DatePicker datePickerDesde;
    private com.github.lgooddatepicker.components.DatePicker datePickerHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableVentas;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
