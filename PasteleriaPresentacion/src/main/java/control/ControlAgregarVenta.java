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
import presentacion.Presentacion_DlgPagoEfectivo;
import presentacion.Presentacion_MenuPrincipal;
import presentacion.Presentacion_ProductosVenta;
import javax.swing.JFrame;

/**
 *
 * @author abelc
 */
public class ControlAgregarVenta {

    private static DTO_Cliente cliente;

    public ControlAgregarVenta() {

    }

    public DTO_Producto agregarPastel(JFrame frame) {
        DTO_Producto producto = new DTO_Producto();

        Presentacion_DlgAgregarPastel dlgpastel = new Presentacion_DlgAgregarPastel(frame, true, producto);
        return producto;
    }

    public DTO_Direccion AgregarDireccion() {
        DTO_Direccion direccion = new DTO_Direccion();
        Presentacion_DlgAgregarDireccion dir = new Presentacion_DlgAgregarDireccion(null, true);
        return direccion;
    }

    public DTO_Direccion seleccionarDireccion(){
     DTO_Direccion direccion = new DTO_Direccion();
        Presentacion_DlgDirecciones dir = new Presentacion_DlgDirecciones(null, true);
        return direccion;
    }
    public DTO_Cliente agregarCliente(JFrame frame) {
        DTO_Cliente cliente = new DTO_Cliente();
        Presentacion_DlgDatosCliente dlgcliente = new Presentacion_DlgDatosCliente(frame, true);
        return cliente;
    }

    public void listaClientes(JFrame frame,DTO_Venta venta) {
        Presentacion_DlgListaClientes dlgListaClientes = new Presentacion_DlgListaClientes(frame, true,venta);
    }

    public void listaDirecciones() {
        Presentacion_DlgDirecciones dlgdireccion = new Presentacion_DlgDirecciones(null, true);
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
        Presentacion_DlgCobrarVenta dlgcobrarventa = new Presentacion_DlgCobrarVenta(null, true,venta);
    }

    public void MostrarDatosVenta(DTO_Venta venta) {
        Presentacion_DlgPagoEfectivo dlgPagoEfectivo = new Presentacion_DlgPagoEfectivo(null, true,venta);
    }

    public static DTO_Cliente getCliente() {
        return cliente;
    }

    public static void setCliente(DTO_Cliente cliente) {
        ControlAgregarVenta.cliente = cliente;
    }
}
