/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.mycompany.pasteleriaconsultarventas.FuncionalidadConsultarVentas;
import com.mycompany.pasteleriaconsultarventas.IFuncionalidadConsultarVentas;
import com.mycompany.pasteleriaproductosventa.FuncionalidadProductos;
import com.mycompany.pasteleriaproductosventa.IFuncionalidadProductos;
import consultarClientes.FuncionalidadConsultarClientes;
import consultarClientes.IFuncionalidadConsultarClientes;
import control.ControlHistoriales;
import dto.DTO_Cliente;
import dto.DTO_Producto;
import dto.DTO_Venta;
import extras.ClientesComboBoxModel;
import extras.PastelComboBoxModel;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abelc
 */
public class Presentacion_FrmHistorialVentas extends javax.swing.JFrame {
    
    private ControlHistoriales control;
    private DTO_Cliente cliente;
    private IFuncionalidadConsultarClientes funcionalidadesClientes;
    private List<DTO_Cliente> listaClientes;
    private List<DTO_Producto> listaProductos;
    private IFuncionalidadProductos funcionalidadConsultarProductos;
    private IFuncionalidadConsultarVentas funcionalidadConsultarVentas;
    private DTO_Venta venta;

    /**
     * Creates new form FrmHistorialVentas
     */
    public Presentacion_FrmHistorialVentas() {
        this.control = ControlHistoriales.getInstance();
        this.funcionalidadConsultarVentas = new FuncionalidadConsultarVentas();
        this.funcionalidadesClientes = new FuncionalidadConsultarClientes();
        this.funcionalidadConsultarProductos = new FuncionalidadProductos();
        this.cliente = new DTO_Cliente();
        this.venta = new DTO_Venta();
        listaClientes = funcionalidadesClientes.consultarClientes();
        listaProductos = funcionalidadConsultarProductos.consultarProductosVenta();
        initComponents();
        llenarTabla();
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("extras");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacDarkLaf.setup();
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
        filtrarClienteRadioBtn = new javax.swing.JRadioButton();
        filtrarPorProductosRadioBtn = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        desdeDatePicker = new com.github.lgooddatepicker.components.DatePicker();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hastaDatePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        productosComboBox = new extras.ComboBoxMultiSeleccion();
        aplicarFiltroBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        detallesVentaBtn = new javax.swing.JButton();
        regresarBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        clientesComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setText("Historial de ventas");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));

        filtrarClienteRadioBtn.setText("Filtrar por clientes");
        filtrarClienteRadioBtn.setForeground(new java.awt.Color(0, 0, 0));
        filtrarClienteRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarClienteRadioBtnActionPerformed(evt);
            }
        });

        filtrarPorProductosRadioBtn.setText("Filtar Por Productos");
        filtrarPorProductosRadioBtn.setForeground(new java.awt.Color(0, 0, 0));
        filtrarPorProductosRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarPorProductosRadioBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Filtrar por periodo");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setText("Desde:");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setText("Hasta:");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));

        productosComboBox.setModel((new PastelComboBoxModel(listaProductos)));
        productosComboBox.setEnabled(false);
        productosComboBox.setForeground(new java.awt.Color(255, 255, 255));

        aplicarFiltroBtn.setText("Aplicar filtros");
        aplicarFiltroBtn.setBackground(new java.awt.Color(140, 220, 254));
        aplicarFiltroBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        aplicarFiltroBtn.setForeground(new java.awt.Color(0, 0, 0));
        aplicarFiltroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarFiltroBtnActionPerformed(evt);
            }
        });

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Fecha de compra", "Fecha de entrega", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVentas.setForeground(new java.awt.Color(0, 0, 0));
        tablaVentas.setSelectionBackground(new java.awt.Color(140, 220, 254));
        tablaVentas.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablaVentas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaVentas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaVentas);

        detallesVentaBtn.setText("Ver detalles de la venta");
        detallesVentaBtn.setBackground(new java.awt.Color(140, 220, 254));
        detallesVentaBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        detallesVentaBtn.setForeground(new java.awt.Color(0, 0, 0));
        detallesVentaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesVentaBtnActionPerformed(evt);
            }
        });

        regresarBtn.setText("Regresar");
        regresarBtn.setBackground(new java.awt.Color(140, 220, 254));
        regresarBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        regresarBtn.setForeground(new java.awt.Color(0, 0, 0));
        regresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Generar Reporte de las ventas");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));

        clientesComboBox.setModel(new ClientesComboBoxModel(listaClientes));
        clientesComboBox.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(aplicarFiltroBtn)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(filtrarClienteRadioBtn)
                                        .addComponent(filtrarPorProductosRadioBtn))
                                    .addGap(43, 43, 43)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(productosComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                        .addComponent(clientesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(regresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(163, 163, 163)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(78, 78, 78)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGap(138, 138, 138))
                        .addComponent(desdeDatePicker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hastaDatePicker1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(detallesVentaBtn)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filtrarClienteRadioBtn)
                            .addComponent(clientesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desdeDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filtrarPorProductosRadioBtn)
                            .addComponent(productosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hastaDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aplicarFiltroBtn)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detallesVentaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void filtrarClienteRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarClienteRadioBtnActionPerformed
        if (filtrarClienteRadioBtn.isSelected()) {
            clientesComboBox.setEnabled(true);
        } else {
            clientesComboBox.setEnabled(false);
            clientesComboBox.setSelectedIndex(0);
        }
    }//GEN-LAST:event_filtrarClienteRadioBtnActionPerformed

    private void filtrarPorProductosRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarPorProductosRadioBtnActionPerformed
        if (filtrarPorProductosRadioBtn.isSelected()) {
            productosComboBox.setEnabled(true);
        } else {
            productosComboBox.limpiarElementosSeleccionados();
            productosComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_filtrarPorProductosRadioBtnActionPerformed

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        this.dispose();
        control.mostrarMenu();
    }//GEN-LAST:event_regresarBtnActionPerformed

    private void detallesVentaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesVentaBtnActionPerformed
       obtenerDatosFilaSeleccionada();
       control.setVenta(venta);
       this.dispose();
        control.mostrarDetallesVenta();
    }//GEN-LAST:event_detallesVentaBtnActionPerformed

    private void aplicarFiltroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarFiltroBtnActionPerformed
        if (filtrarClienteRadioBtn.isSelected()) {
            obtenerCliente();
        }
        

    }//GEN-LAST:event_aplicarFiltroBtnActionPerformed
    public void obtenerCliente() {
        String clienteSeleccionado = (String) clientesComboBox.getSelectedItem();
        if (clienteSeleccionado != null) {
            // Dividir el texto en partes usando el guion como separador
            String[] partes = clienteSeleccionado.split("-");
            
            if (partes.length >= 2) {
                // El último elemento del array es el número de teléfono
                String numeroTelefono = partes[partes.length - 1].trim();

                // Extraer el nombre y apellidos
                String nombreCompleto = partes[0].trim();
                String[] nombresApellidos = nombreCompleto.split("\\s+");
                
                String nombre = nombresApellidos[0];
                String apellidoPaterno = "";
                String apellidoMaterno = "";
                
                if (nombresApellidos.length >= 3) {
                    // Hay dos nombres y apellidos
                    apellidoPaterno = nombresApellidos[1];
                    apellidoMaterno = nombresApellidos[2];
                } else if (nombresApellidos.length == 2) {
                    // Solo hay un nombre y apellidos
                    String[] apellidos = nombresApellidos[1].split(" ");
                    if (apellidos.length >= 2) {
                        apellidoPaterno = apellidos[0];
                        apellidoMaterno = apellidos[1];
                    } else {
                        apellidoPaterno = apellidos[0];
                    }
                    
                }
                
                cliente = funcionalidadesClientes.encontrarCliente(apellidoPaterno, apellidoMaterno, nombre, numeroTelefono);
                System.out.println(cliente.getID());
            }
        }
    }
    
    public void llenarTabla() {
        limpiarTabla();
        List<DTO_Venta> listaVentas = funcionalidadConsultarVentas.consultarVentas();
        DefaultTableModel modelo = (DefaultTableModel) tablaVentas.getModel();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");        
        if (listaVentas != null) {
            listaVentas.forEach(t -> {
                String fechaRegistro = formatoFecha.format(t.getFechaRegistro());
                String fechaEntrega = formatoFecha.format(t.getFechaEntrega());
                modelo.addRow(new Object[]{t.getID(), fechaRegistro, fechaEntrega, t.getEstado()});
            });
        }
    }
    
    private void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaVentas.getModel();
        
        modelo.setRowCount(0);
        
        tablaVentas.setModel(modelo);
    }
    
    private void obtenerDatosFilaSeleccionada() {
        int filaSeleccionada = tablaVentas.getSelectedRow();
        if (filaSeleccionada != -1) {
            String idVenta = tablaVentas.getValueAt(filaSeleccionada, 0).toString();
            venta = funcionalidadConsultarVentas.encontrarVenta(idVenta);
            
        }
    }
    
    public void mostrarHistorialVentas() {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("extras");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presentacion_FrmHistorialVentas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aplicarFiltroBtn;
    private javax.swing.JComboBox<String> clientesComboBox;
    private com.github.lgooddatepicker.components.DatePicker desdeDatePicker;
    private javax.swing.JButton detallesVentaBtn;
    private javax.swing.JRadioButton filtrarClienteRadioBtn;
    private javax.swing.JRadioButton filtrarPorProductosRadioBtn;
    private com.github.lgooddatepicker.components.DatePicker hastaDatePicker1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private extras.ComboBoxMultiSeleccion productosComboBox;
    private javax.swing.JButton regresarBtn;
    private javax.swing.JTable tablaVentas;
    // End of variables declaration//GEN-END:variables
}
