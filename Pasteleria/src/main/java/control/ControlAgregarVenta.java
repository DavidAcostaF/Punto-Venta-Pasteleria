/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import com.mycompany.pastelerianegocio.dtos.ClienteDTO;
import com.mycompany.pastelerianegocio.dtos.DireccionDTO;
import com.mycompany.pastelerianegocio.dtos.ProductoDTO;
import gui.DlgAgregarPastel;
import gui.DlgDatosCliente;
import javax.swing.JFrame;

/**
 *
 * @author abelc
 */
public class ControlAgregarVenta {
    
    private static ClienteDTO cliente;
    
    public ControlAgregarVenta() {
    }
   
    public ProductoDTO agregarPastel(JFrame frame){
    ProductoDTO producto=new ProductoDTO();
   
    DlgAgregarPastel dlgpastel= new DlgAgregarPastel(frame,true,producto);
    return producto;
    }
public ClienteDTO agregarCliente(JFrame frame){
ClienteDTO cliente=new ClienteDTO();
DlgDatosCliente dlgcliente=new DlgDatosCliente(frame,true);
return cliente;
}
    public static ClienteDTO getCliente() {
        return cliente;
    }

    public static void setCliente(ClienteDTO cliente) {
        ControlAgregarVenta.cliente = cliente;
    }
}
