/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dto.DTO_Cliente;
import dto.DTO_Direccion;
import dto.DTO_Producto;
import dto.DTO_Venta;
import presentacion.Presentacion_DlgAgregarDireccion;
import presentacion.Presentacion_DlgAgregarPastel;
import presentacion.Presentacion_DlgCobrarVenta;
import presentacion.Presentacion_DlgDatosCliente;
import presentacion.Presentacion_DlgDirecciones;
import presentacion.Presentacion_DlgListaClientes;
import presentacion.Presentacion_DlgConfirmacionPago;
import presentacion.Presentacion_MenuPrincipal;
import presentacion.Presentacion_ProductosVenta;
import javax.swing.JFrame;

/**
 *
 * @author abelc
 */
public class ControlAgregarVenta {

    private static ControlAgregarVenta instance;
    DTO_Producto producto;

    public ControlAgregarVenta() {
    }



    public ControlAgregarVenta getInstance() {
        if (instance == null) {
            instance = new ControlAgregarVenta();
        }
        return instance;
    }

    public DTO_Producto agregarPastel(JFrame frame) {
        Presentacion_DlgAgregarPastel dlgpastel = new Presentacion_DlgAgregarPastel(frame, true);
        return producto;
    }

    public DTO_Direccion AgregarDireccion(DTO_Venta venta) {
        DTO_Direccion direccion = new DTO_Direccion();
        Presentacion_DlgAgregarDireccion dir = new Presentacion_DlgAgregarDireccion(null, true, venta);
        return direccion;
    }

    public DTO_Cliente agregarCliente(JFrame frame, DTO_Venta venta) {
        DTO_Cliente cliente = new DTO_Cliente();
        Presentacion_DlgDatosCliente dlgcliente = new Presentacion_DlgDatosCliente(frame, true, venta);
        return cliente;
    }

    public void listaClientes(JFrame frame, DTO_Venta venta) {
        Presentacion_DlgListaClientes dlgListaClientes = new Presentacion_DlgListaClientes(frame, true, venta);
    }

    public void listaDirecciones(DTO_Venta venta) {
        Presentacion_DlgDirecciones dlgdireccion = new Presentacion_DlgDirecciones(null, true, venta);
    }

    public void mostrarProductosVenta() {
        Presentacion_ProductosVenta p = new Presentacion_ProductosVenta();
        p.setVisible(true);
    }

    public void mostrarMenu() {
        Presentacion_MenuPrincipal m = new Presentacion_MenuPrincipal();
        m.setVisible(true);
    }

    public void CobrarVenta(DTO_Venta venta) {
        Presentacion_DlgCobrarVenta dlgcobrarventa = new Presentacion_DlgCobrarVenta(null, true, venta);
    }

    public void MostrarDatosVenta(DTO_Venta venta) {
        Presentacion_DlgConfirmacionPago dlgPagoEfectivo = new Presentacion_DlgConfirmacionPago(null, true, venta);
    }

}
