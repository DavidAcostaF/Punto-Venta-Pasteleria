/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package control;

import dto.DTO_Cliente;
import dto.DTO_Direccion;
import dto.DTO_Factura;
import dto.DTO_Venta;
import presentacion.Presentacion_MenuPrincipal;
import presentacion.facturar.Presentacion_DlgFacturarACliente;
import presentacion.facturar.Presentacion_DlgOpcionFactura;
import presentacion.facturar.Presentacion_FrmConfirmarGenerarFactura;
import presentacion.facturar.Presentacion_FrmHistorialFacturas;
import presentacion.facturar.Presentacion_FrmSeleccionarVenta;

/**
 *
 * @author PERSONAL
 */
public class ControlFacturar {
    
    private static ControlFacturar instance;
    private DTO_Factura factura;
    private DTO_Venta venta;
    private DTO_Cliente cliente;
    private DTO_Direccion direccion;
    private String ventanaAnterior;

    
    private ControlFacturar() {
        this.factura = factura;
        this.venta = venta;
        this.cliente = cliente;
        this.direccion = direccion;
    }
    
    public static ControlFacturar getInstance() {
        if (instance == null) {
            instance = new ControlFacturar();
        }
        return instance;
    }
    
    public void mostrarMenuPrincipal(String opcion){
        Presentacion_MenuPrincipal menu = new Presentacion_MenuPrincipal();
            menu.setVisible(true);     
    }
    
    public void mostrarDlgFacturarACliente(){
        Presentacion_DlgFacturarACliente dlgFacturarACliente = new Presentacion_DlgFacturarACliente(null, true);
        dlgFacturarACliente.setVisible(true);
    }
    
    public void mostrarDlgOpcionFactura(){
        Presentacion_DlgOpcionFactura dlgOpcionFactura = new Presentacion_DlgOpcionFactura(null, true);
        dlgOpcionFactura.setVisible(true);
    }
    
    public void mostrarFrmConfirmarGenerarFactura(){
        Presentacion_FrmConfirmarGenerarFactura frmConfirmarGenerarFactura = new Presentacion_FrmConfirmarGenerarFactura();
        frmConfirmarGenerarFactura.setVisible(true);
    }
    
    public void mostrarFrmSeleccionarVenta(){
        Presentacion_FrmSeleccionarVenta frmSeleccionarVenta = new Presentacion_FrmSeleccionarVenta();
        frmSeleccionarVenta.setVisible(true);
    }
    
    public void mostrarFrmHistorialFacturas(){
        Presentacion_FrmHistorialFacturas frmHistorialFacturas = new Presentacion_FrmHistorialFacturas();
        frmHistorialFacturas.setVisible(true);
    }

    public DTO_Factura getFactura() {
        return factura;
    }

    public void setFactura(DTO_Factura factura) {
        this.factura = factura;
    }

    public DTO_Venta getVenta() {
        return venta;
    }

    public void setVenta(DTO_Venta venta) {
        this.venta = venta;
    }

    public DTO_Cliente getCliente() {
        return cliente;
    }

    public void setCliente(DTO_Cliente cliente) {
        this.cliente = cliente;
    }

    public String getVentanaAnterior() {
        return ventanaAnterior;
    }

    public void setVentanaAnterior(String ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
    }

    public DTO_Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(DTO_Direccion direccion) {
        this.direccion = direccion;
    }
    
    public void limpiarValores(){
        this.factura = null;
        this.venta = null;
        this.cliente = null;
        this.direccion = null;
    }
}
