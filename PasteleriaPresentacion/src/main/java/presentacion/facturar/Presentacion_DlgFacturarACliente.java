/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package presentacion.facturar;

import actualizarCliente.FuncionalidadActualizarCliente;
import actualizarCliente.IFuncionalidadActualizarCliente;
import consultarClientes.FuncionalidadConsultarClientes;
import consultarClientes.IFuncionalidadConsultarClientes;
import control.ControlFacturar;
import dto.DTO_Cliente;
import dto.DTO_Direccion;
import extras.DireccionesComboboxModel;
import extras.ValidadorCampos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author PERSONAL
 */
public class Presentacion_DlgFacturarACliente extends javax.swing.JDialog {

    ControlFacturar control;
    IFuncionalidadActualizarCliente actualizarCliente;
    IFuncionalidadConsultarClientes consultarClientes;
    DTO_Direccion direccionObtenida;
    List<DTO_Direccion> listaDirecciones;

    
    /**
     * Creates new form Presentacion_DlgFacturarACliente
     * @param parent
     * @param modal
     */
    public Presentacion_DlgFacturarACliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        control = ControlFacturar.getInstance();
        actualizarCliente = new FuncionalidadActualizarCliente();
        consultarClientes = new FuncionalidadConsultarClientes();
        listaDirecciones = consultarClientes.encontrarClienteID(control.getCliente().getID()).getDirecciones();

        initComponents();
        
        txtNombre.setText(control.getCliente().getNombre());
        txtApellidoPaterno.setText(control.getCliente().getApellidoP());
        txtApellidoMaterno.setText(control.getCliente().getApellidoM());

        if (control.getCliente().getRfc() != null) {
            System.out.println(consultarClientes.encontrarClienteID(control.getCliente().getID()).getRfc());
            txtRFC.setText(consultarClientes.encontrarClienteID(control.getCliente().getID()).getRfc());
        }
        
        if (!listaDirecciones.isEmpty()) {
            cboClientesDirecciones.setModel(new DireccionesComboboxModel(listaDirecciones));
        }
        
        txtTelefono.setText(consultarClientes.encontrarClienteID(control.getCliente().getID()).getTelefono());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroCasa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        rdbEditar = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        cboClientesDirecciones = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        rdbNuevaDirección = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();

        jLabel8.setText("jLabel8");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(18, 149, 205));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FACTURAR");

        btnVolver.setBackground(new java.awt.Color(18, 111, 161));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(119, 119, 119)
                .addComponent(btnVolver)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver)
                    .addComponent(jLabel1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnConfirmar.setBackground(new java.awt.Color(18, 111, 161));
        btnConfirmar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(18, 111, 161));
        btnCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Facturar a:");

        txtNombre.setEnabled(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellidoMaterno.setEnabled(false);
        txtApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoKeyTyped(evt);
            }
        });

        txtApellidoPaterno.setEnabled(false);
        txtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyTyped(evt);
            }
        });

        txtCalle.setEnabled(false);

        txtRFC.setEnabled(false);
        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("Nombre(s):");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setText("Apellido paterno:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("Apellido materno:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setText("RFC:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setText("Calle:");

        txtNumeroCasa.setEnabled(false);
        txtNumeroCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroCasaKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel9.setText("Número de casa:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel10.setText("Colonia:");

        txtColonia.setEnabled(false);

        rdbEditar.setText("Editar datos");
        rdbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbEditarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel11.setText("Direcciones:");

        cboClientesDirecciones.setModel(new DireccionesComboboxModel(listaDirecciones)
        );
        cboClientesDirecciones.setEnabled(false);
        cboClientesDirecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboClientesDireccionesActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel12.setText("O, agregar nueva dirección:");

        rdbNuevaDirección.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNuevaDirecciónActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel13.setText("Teléfono:");

        txtTelefono.setEnabled(false);
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbNuevaDirección)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCalle, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(cboClientesDirecciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txtApellidoPaterno)
                                    .addComponent(txtApellidoMaterno)
                                    .addComponent(txtRFC))))))
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(rdbEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboClientesDirecciones)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel11)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rdbNuevaDirección)
                    .addComponent(jLabel12))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addComponent(rdbEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        control.mostrarFrmSeleccionarVenta();
        control.setVenta(null);
        control.setCliente(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (txtNombre.getText().isEmpty() || txtApellidoPaterno.getText().isEmpty() || txtApellidoMaterno.getText().isEmpty()
                || txtRFC.getText().isEmpty() || (rdbNuevaDirección.isSelected() && (txtCalle.getText().isEmpty() || txtColonia.getText().isEmpty() || txtNumeroCasa.getText().isEmpty()))) {

            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        System.out.println(control.getCliente().toString());

        List<DTO_Direccion> direcciones = control.getCliente().getDirecciones();

        if (rdbNuevaDirección.isSelected()) {
            // Crear nueva dirección desde los campos de texto y añadir a la lista
            DTO_Direccion nuevaDireccion = new DTO_Direccion(txtCalle.getText(), txtColonia.getText(), txtNumeroCasa.getText());
            direcciones.add(nuevaDireccion);
            control.setDireccion(nuevaDireccion);
        } else {
            // Obtener la dirección seleccionada desde el JComboBox
            obtenerDireccion();
            DTO_Direccion direccionSeleccionada = (DTO_Direccion) cboClientesDirecciones.getSelectedItem();
            if (direccionSeleccionada != null && !direcciones.contains(direccionSeleccionada)) {
                control.setDireccion(direccionObtenida);
            }
        }

        DTO_Cliente clienteActualizado = new DTO_Cliente(
                txtNombre.getText(),
                txtApellidoPaterno.getText(),
                txtApellidoMaterno.getText(),
                txtTelefono.getText(),
                direcciones
        );
        clienteActualizado.setID(control.getCliente().getID());
        clienteActualizado.setRfc(txtRFC.getText());

        control.setCliente(clienteActualizado);
        try {
            actualizarCliente.actualizarClienteConRfc(control.getCliente());
            System.out.println();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar el cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.dispose();
        control.mostrarFrmConfirmarGenerarFactura();   
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        ValidadorCampos.soloLetras(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoKeyTyped
        ValidadorCampos.soloLetras(evt);
    }//GEN-LAST:event_txtApellidoMaternoKeyTyped

    private void txtApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyTyped
        ValidadorCampos.soloLetras(evt);
    }//GEN-LAST:event_txtApellidoPaternoKeyTyped

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        ValidadorCampos.caracteresMaximos(evt, 13, txtRFC);
    }//GEN-LAST:event_txtRFCKeyTyped

    private void txtNumeroCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCasaKeyTyped
        ValidadorCampos.soloNumeros(evt);
    }//GEN-LAST:event_txtNumeroCasaKeyTyped

    private void rdbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbEditarActionPerformed
        if (rdbEditar.isSelected()) {
            txtNombre.setEnabled(true);
            txtApellidoPaterno.setEnabled(true);
            txtApellidoMaterno.setEnabled(true);
            txtRFC.setEnabled(true);
            txtTelefono.setEnabled(true);
            cboClientesDirecciones.setEnabled(true);
        } else {
            txtNombre.setEnabled(false);
            txtApellidoPaterno.setEnabled(false);
            txtApellidoMaterno.setEnabled(false);
            txtRFC.setEnabled(false);
            txtCalle.setEnabled(false);
            txtNumeroCasa.setEnabled(false);
            txtColonia.setEnabled(false);
            txtTelefono.setEnabled(false);
            cboClientesDirecciones.setEnabled(false);
        }
    }//GEN-LAST:event_rdbEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        control.mostrarFrmSeleccionarVenta();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void rdbNuevaDirecciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNuevaDirecciónActionPerformed
        if (rdbNuevaDirección.isSelected()) {
            txtCalle.setEnabled(true);
            txtNumeroCasa.setEnabled(true);
            txtColonia.setEnabled(true);
        } else {
            txtCalle.setEnabled(false);
            txtNumeroCasa.setEnabled(false);
            txtColonia.setEnabled(false);
        }
    }//GEN-LAST:event_rdbNuevaDirecciónActionPerformed

    public void obtenerDireccion() {
    String direccionSeleccionada = (String) cboClientesDirecciones.getSelectedItem();
    if (direccionSeleccionada != null) {
        String[] partes = direccionSeleccionada.trim().split("\\s+", 4);

        if (partes.length >= 3) {
            String calle = partes[0];
            String colonia = partes[1];
            String numeroCasa = partes[2];

            direccionObtenida = new DTO_Direccion(calle, colonia, numeroCasa, control.getCliente());
        } else {
            System.err.println("No se pudo obtener la dirección: " + direccionSeleccionada);
        }
    }
}

    private void cboClientesDireccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboClientesDireccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboClientesDireccionesActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        ValidadorCampos.caracteresMaximos(evt, 10, txtTelefono);
        ValidadorCampos.soloNumeros(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboClientesDirecciones;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rdbEditar;
    private javax.swing.JRadioButton rdbNuevaDirección;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroCasa;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
