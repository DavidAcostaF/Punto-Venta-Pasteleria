/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package control;

import dto.DTO_Cliente;
import dto.DTO_Factura;
import dto.DTO_Venta;
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
    private String ventanaAnterior;

    
    private ControlFacturar() {
        this.factura = factura;
        this.venta = venta;
        this.cliente = cliente;
    }
    
    public static ControlFacturar getInstance() {
        if (instance == null) {
            instance = new ControlFacturar();
        }
        return instance;
    }
    
    private void mostrarDlgFacturarACliente(){
        Presentacion_DlgFacturarACliente dlgFacturarACliente = new Presentacion_DlgFacturarACliente(null, true);
    }
    
    private void mostrarDlgOpcionFactura(){
        Presentacion_DlgOpcionFactura dlgOpcionFactura = new Presentacion_DlgOpcionFactura(null, true);
    }
    
    private void mostrarFrmConfirmarGenerarFactura(){
        Presentacion_FrmConfirmarGenerarFactura frmConfirmarGenerarFactura = new Presentacion_FrmConfirmarGenerarFactura();
        frmConfirmarGenerarFactura.setVisible(true);
    }
    
    private void mostrarFrmSeleccionarVenta(){
        Presentacion_FrmSeleccionarVenta frmSeleccionarVenta = new Presentacion_FrmSeleccionarVenta();
        frmSeleccionarVenta.setVisible(true);
    }
    
    private void mostrarFrmHistorialFacturas(){
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
    
    
}
