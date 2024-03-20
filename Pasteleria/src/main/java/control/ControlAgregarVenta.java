/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import com.mycompany.pastelerianegocio.dtos.ClienteDTO;
import com.mycompany.pastelerianegocio.dtos.DireccionDTO;
import com.mycompany.pastelerianegocio.dtos.ProductoDTO;
import gui.DlgAgregarPastel;
import gui.DlgCobrarVenta;
import gui.DlgDatosCliente;
import gui.DlgDirecciones;
import gui.DlgListaClientes;
import gui.DlgPagoEfectivo;
import javax.swing.JFrame;

/**
 *
 * @author abelc
 */
public class ControlAgregarVenta {

    private static ClienteDTO cliente;

    public ControlAgregarVenta() {
    }

    public ProductoDTO agregarPastel(JFrame frame) {
        ProductoDTO producto = new ProductoDTO();

        DlgAgregarPastel dlgpastel = new DlgAgregarPastel(frame, true, producto);
        return producto;
    }

    public ClienteDTO agregarCliente(JFrame frame) {
        ClienteDTO cliente = new ClienteDTO();
        DlgDatosCliente dlgcliente = new DlgDatosCliente(frame, true);
        return cliente;
    }

    public void listaClientes(JFrame frame) {
        DlgListaClientes dlgListaClientes = new DlgListaClientes(frame, true);
    }

    public void listaDirecciones() {
        DlgDirecciones dlgdireccion = new DlgDirecciones(null, true);
    }

    public void CobrarVenta(){
    DlgCobrarVenta dlgcobrarventa=new DlgCobrarVenta(null,true);
    }
    public void MostrarDatosVenta(){
    DlgPagoEfectivo dlgPagoEfectivo=new DlgPagoEfectivo(null,true);
    }
    public static ClienteDTO getCliente() {
        return cliente;
    }

    public static void setCliente(ClienteDTO cliente) {
        ControlAgregarVenta.cliente = cliente;
    }
}
