/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;


import com.mycompany.pastelerianegocio.VentasBO;
import conversionesnegocio.VentasConversiones;
import dto.DTO_Cliente;
import dto.DTO_DetalleVenta;
import dto.DTO_Direccion;
import dto.DTO_Venta;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author abelc
 */
public class VentaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentasBO v=new VentasBO();
        DTO_Venta venta=new DTO_Venta();
//            venta.setMontoTotal(150.00f); // Monto total de la venta
//        VentasConversiones conversor = new VentasConversiones();
//
//        Date fechaEntrega = new GregorianCalendar(2024, Calendar.MAY, 25).getTime();// Fecha de entrega
//        Date fechaRegistro = new GregorianCalendar(2024, Calendar.MAY, 15).getTime();
//        venta.setFechaEntrega(fechaEntrega);
//        venta.setFechaRegistro(fechaRegistro);
//        venta.setEstado("jotoo");
//        DTO_Cliente cliente = new DTO_Cliente();
//        cliente.setID("66406d0293d57d3040a5bdc8");
//        cliente.setNombre("Kanye west");
//        cliente.setApellidoP("Swift");
//        cliente.setApellidoM("Morales");
//        venta.setCliente(cliente);
//        List<DTO_DetalleVenta> detallesVenta = new ArrayList<>();
//        DTO_DetalleVenta dv = new DTO_DetalleVenta();
//        dv.setCantidad(2);
//        dv.setEspecificacion(" ");
//        dv.setImporte(150.00f);
//        dv.setPrecio(75);
//        dv.setIdproducto("66406d434d21240168dbd52a");
//        dv.setTamanhoProducto("chico");
//        detallesVenta.add(dv);
//        venta.setDetallesVenta(detallesVenta);
//        DTO_Direccion direccionEntrega = new DTO_Direccion();
//        direccionEntrega.setCalle("Calle Principal");
//        direccionEntrega.setNumExterior("123");
//        direccionEntrega.setColonia("Ciudad Ejemplo");
//        venta.setDireccionEntrega(direccionEntrega);
//        v.agregarVenta(venta);
        List<DTO_Venta> ventas=v.consultarVentas();
        for (DTO_Venta venta1:ventas) {
          System.out.println(venta1.getCliente().getNombre());  
        }
        
    }
    
}
