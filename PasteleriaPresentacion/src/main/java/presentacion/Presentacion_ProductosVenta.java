/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

//import com.mycompany.pastelerianegocio.ConsultarProductosVenta;
//import com.mycompany.pastelerianegocio.IConsultarProductosVenta;
import com.mycompany.pasteleriaproductosventa.FuncionalidadConsultarProductos;
import com.mycompany.pasteleriaproductosventa.IFuncionalidadConsultarProductos;
import dto.DTO_Producto;
import control.ControlAgregarVenta;
import dto.DTO_DetalleVenta;
import dto.DTO_Venta;
import java.awt.Component;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author abelc
 */
public class Presentacion_ProductosVenta extends javax.swing.JFrame {

    private DTO_Venta venta;
    private ControlAgregarVenta control;
    private IFuncionalidadConsultarProductos funcionalidadesProductos;
    float total;
//    private IConsultarProductosVenta consultarProductosVenta;

    /**
     * Creates new form VentanaSeleccionarProductos
     */
    public Presentacion_ProductosVenta() {
        initComponents();
        setTitle("Productos de la venta");
        this.control = ControlAgregarVenta.getInstance();
        this.funcionalidadesProductos = new FuncionalidadConsultarProductos();
        venta = new DTO_Venta();
        total = 0;
        llenarTabla();
        ponerTotal();
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
        labelTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fechaEntrega = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        agregarPastelBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        Siguientebtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelTotal.setText("Total a pagar:");
        labelTotal.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setText("Fecha de entrega:");
        jLabel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Detalles de la venta");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        agregarPastelBtn.setText("Agregar producto");
        agregarPastelBtn.setBackground(new java.awt.Color(140, 220, 254));
        agregarPastelBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        agregarPastelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPastelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(agregarPastelBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(agregarPastelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Especificacion", "Cantidad", "Precio", "Tamaño", "+", "-"
            }
        ));
        tableProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tableProductos);

        jLabel4.setText("Lista de productos seleccionados");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        Siguientebtn.setText("Siguiente");
        Siguientebtn.setBackground(new java.awt.Color(140, 220, 254));
        Siguientebtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Siguientebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguientebtnActionPerformed(evt);
            }
        });

        jButton5.setText("Cancelar");
        jButton5.setBackground(new java.awt.Color(140, 220, 254));
        jButton5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Siguientebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Siguientebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
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

    private void agregarPastelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPastelBtnActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tableProductos.getModel();
        control.mostrarAgregarPastel(this);
        DTO_Producto p = control.getProducto();
        if (p != null) {
            modelo.addRow(new Object[]{p.getNombre(), p.getEspecificaciones(), 1, p.getPrecio(), p.getTamanio()});
        }

    }//GEN-LAST:event_agregarPastelBtnActionPerformed

    private void SiguientebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguientebtnActionPerformed
        if (validarCamposVacios()) {

            if (((DefaultTableModel) tableProductos.getModel()).getRowCount() <= 0) {
                JOptionPane.showMessageDialog(this, "No se puede continuar sin agregar algun producto.", "No hay productos en la venta", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int rowCount = this.tableProductos.getModel().getRowCount();
            List<DTO_DetalleVenta> listaDetalles = new ArrayList<>();

            for (int i = 0; i < rowCount; i++) {
                DTO_DetalleVenta detalleVenta = new DTO_DetalleVenta();
                Object valueNombre = this.tableProductos.getModel().getValueAt(i, 0); // Obtener el valor en la segunda columna (índice 1)
                Object valueEspecificaciones = this.tableProductos.getModel().getValueAt(i, 1);
                Object valueCantidad = this.tableProductos.getModel().getValueAt(i, 2);
                Object valuePrecio = this.tableProductos.getModel().getValueAt(i, 3);
                Object valueTamanio = this.tableProductos.getModel().getValueAt(i, 4);

                String nombre = valueNombre != null ? valueNombre.toString() : "";
                String especificaciones = valueEspecificaciones != null ? valueEspecificaciones.toString() : "";

                int cantidad = 0;
                if (valueCantidad != null) {
                    try {
                        cantidad = Integer.parseInt(valueCantidad.toString());
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }

                float precio = 0.0f;
                if (valuePrecio != null) {
                    try {
                        precio = Float.parseFloat(valuePrecio.toString());
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }

                String tamanio = valueTamanio != null ? valueTamanio.toString() : "";

                detalleVenta.setIdproducto(this.funcionalidadesProductos.consultarProductoPorNombre(nombre).getId());
                detalleVenta.setEspecificacion(especificaciones);
                detalleVenta.setCantidad(cantidad);
                detalleVenta.setPrecio(precio);
                detalleVenta.setTamanhoProducto(tamanio);
                detalleVenta.setImporte(detalleVenta.getCantidad() * detalleVenta.getPrecio());
                listaDetalles.add(detalleVenta);
            }
            venta.setDetallesVenta(listaDetalles);
            int respuesta = JOptionPane.showOptionDialog(null, "¿El cliente ya ha comprado aqui?", "Bienvenido", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Sí", "No"}, "Sí");
            LocalDate localDate = fechaEntrega.getDate();
            Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            venta.setFechaEntrega(date);
            venta.setMontoTotal(total);
            control.setVenta(venta);
            if (respuesta == JOptionPane.YES_OPTION) {
                dispose();
                control.mostrarListaClientes();

            } else {
                System.out.println(control.getVenta());
                dispose();
                control.mostrarDatosClientes();

            }
        }
    }//GEN-LAST:event_SiguientebtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        control.mostrarMenu();
    }//GEN-LAST:event_jButton5ActionPerformed
    public void ponerTotal() {
        total = calcularTotal();

        labelTotal.setText("Total a pagar " + total);
    }

    private void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tableProductos.getModel();
        DTO_Venta venta = control.getVenta();
        if (venta != null && venta.getDetallesVenta() != null) {
            venta.getDetallesVenta().forEach(p -> modelo.addRow(new Object[]{p.getProducto().getNombre(), p.getEspecificacion(), Integer.valueOf(p.getCantidad()), Float.valueOf(p.getPrecio()), p.getTamanhoProducto()}));
        }

        tableProductos.getColumnModel().getColumn(5).setCellRenderer(new BotonRenderer("+"));
        tableProductos.getColumnModel().getColumn(5).setCellEditor(new BotonEditor(new JCheckBox(), modelo, 2, 1));

        tableProductos.getColumnModel().getColumn(6).setCellRenderer(new BotonRenderer("-"));
        tableProductos.getColumnModel().getColumn(6).setCellEditor(new BotonEditor(new JCheckBox(), modelo, 2, -1));
    }

    private float calcularTotal() {
        float total = 0;
        if (tableProductos.getRowCount() > 0) {
            for (int row = tableProductos.getRowCount() - 1; row >= 0; row--) {
                Object cantidad = tableProductos.getValueAt(row, 2);
                Object precio = tableProductos.getValueAt(row, 3);
                if (cantidad != null && precio != null) {
                    float multiplicacion = Float.parseFloat(cantidad.toString()) * Float.parseFloat(precio.toString());
                    total += multiplicacion;
                }
            }
        }

        return total;
    }

// Renderer para los botones
    class BotonRenderer extends JButton implements TableCellRenderer {

        public BotonRenderer(String texto) {
            setOpaque(true);
            setText(texto);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            ponerTotal();
            return this;
        }
    }

    private boolean validarCamposVacios() {
        if (fechaEntrega.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fecha de entrega.", "Fecha no seleccionada", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
// Editor para los botones

    class BotonEditor extends DefaultCellEditor {

        private JButton button;
        private String label;
        private boolean isPushed;
        private DefaultTableModel modelo;
        private int colCantidad;
        private int incremento;
        private int row; // Agregué una variable para almacenar el índice de fila

        public BotonEditor(JCheckBox checkBox, DefaultTableModel modelo, int colCantidad, int incremento) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(e -> fireEditingStopped());
            this.modelo = modelo;
            this.colCantidad = colCantidad;
            this.incremento = incremento;
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            this.row = row; // Almaceno el índice de fila
            if (isSelected) {
                button.setForeground(table.getSelectionForeground());
                button.setBackground(table.getSelectionBackground());
            } else {
                button.setForeground(table.getForeground());
                button.setBackground(table.getBackground());
            }
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            isPushed = true;
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            if (isPushed) {
                int cantidad = (int) modelo.getValueAt(row, colCantidad);
                cantidad += incremento;
                if (cantidad == 0) {
                    modelo.removeRow(row);
                } else {
                    modelo.setValueAt(cantidad, row, colCantidad);
                }
                modelo.fireTableDataChanged();
            }
            isPushed = false;
            return label;
        }

        @Override
        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
        }

        @Override
        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }

    }

    private void obtenerDatosTabla() {
        List<DTO_DetalleVenta> detallesVenta = new ArrayList<>();
        for (int i = 0; i < tableProductos.getRowCount(); i++) {
            DTO_DetalleVenta detalleVenta = new DTO_DetalleVenta();
            DTO_Producto producto = new DTO_Producto(tableProductos.getValueAt(i, 0).toString());
            detalleVenta.setProducto(producto);
            detalleVenta.setEspecificacion(tableProductos.getValueAt(i, 1).toString());
            int cantidad = Integer.parseInt(tableProductos.getValueAt(i, 2).toString());
            detalleVenta.setCantidad(cantidad);
            float total = Float.parseFloat(tableProductos.getValueAt(i, 2).toString());
            detalleVenta.setImporte(total * cantidad);
            detalleVenta.setPrecio(total);
            detallesVenta.add(detalleVenta);

        }
        venta.setDetallesVenta(detallesVenta);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Siguientebtn;
    private javax.swing.JButton agregarPastelBtn;
    private com.github.lgooddatepicker.components.DatePicker fechaEntrega;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable tableProductos;
    // End of variables declaration//GEN-END:variables
}
