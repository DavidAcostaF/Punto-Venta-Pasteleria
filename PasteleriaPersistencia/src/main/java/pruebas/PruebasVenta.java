/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import Exceptions.PersistenciaException;
import com.mycompany.pasteleriadaos.VentaDAO;
import com.mycompany.pasteleriadominioentidades.Cliente;
import com.mycompany.pasteleriadominioentidades.DetalleVenta;
import com.mycompany.pasteleriadominioentidades.Producto;
import com.mycompany.pasteleriadominioentidades.Venta;
import com.mycompany.pasteleriadominiosMapeo.ClienteMapeo;
import com.mycompany.pasteleriadominiosMapeo.DetalleVentaMapeo;
import com.mycompany.pasteleriadominiosMapeo.DireccionMapeo;
import com.mycompany.pasteleriadominiosMapeo.VentaMapeo;
import conversionesPersistencia.VentasConversiones;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.types.ObjectId;

/**
 *
 * @author abelc
 */
public class PruebasVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentaDAO ventadao = new VentaDAO();
        VentaMapeo venta = new VentaMapeo();

//        venta.setMontoTotal(150.00f); // Monto total de la venta
//        VentasConversiones conversor = new VentasConversiones();
//
//// 
//        Date fechaEntrega = new GregorianCalendar(2024, Calendar.MAY, 25).getTime();// Fecha de entrega
//        Date fechaRegistro = new GregorianCalendar(2024, Calendar.MAY, 15).getTime();
//
//// 
//        venta.setFechaEntrega(fechaEntrega);
//        venta.setFechaRegistro(fechaRegistro);
//        venta.setEstado("jotoo");
//        venta.setId(new ObjectId());
//        ClienteMapeo cliente = new ClienteMapeo();
//        cliente.setId(new ObjectId("66406d0293d57d3040a5bdc8"));
//        cliente.setNombre("Kanye west");
//        cliente.setApellidoP("Swift");
//        cliente.setApellidoM("Morales");
//        System.out.println(cliente.getId());
//        venta.setCliente(cliente);
//        System.out.println(venta.getCliente().getId());
//        List<DetalleVentaMapeo> detallesVenta = new ArrayList<>();
//        DetalleVentaMapeo dv = new DetalleVentaMapeo();
//        dv.setCantidad(2);
//        dv.setDetallesCliente(" ");
//        dv.setImporte(150.00f);
//        dv.setPrecio(75);
//        dv.setProductoId(new ObjectId("66406d434d21240168dbd52a"));
//        dv.setTamanhoProducto("chico");
//        detallesVenta.add(dv);
//        venta.setDetallesVenta(detallesVenta);
//        DireccionMapeo direccionEntrega = new DireccionMapeo();
//        direccionEntrega.setCalle("Calle Principal");
//        direccionEntrega.setNumExterior("123");
//        direccionEntrega.setColonia("Ciudad Ejemplo");
//        venta.setDireccionEntrega(direccionEntrega);
//        Venta ventaEntidad = conversor.convertirAVentaEntidad(venta);
//        try {
//            ventadao.agregarVenta(ventaEntidad);
//        venta.setMontoTotal(150.00f); // Monto total de la venta
//        VentasConversiones conversor = new VentasConversiones();
//
//// 
//        Date fechaEntrega = new Date(); // Fecha de entrega
//        Date fechaRegistro = new Date(); // Fecha de registro
//
//// 
//        venta.setFechaEntrega(fechaEntrega);
//        venta.setFechaRegistro(fechaRegistro);
//        venta.setEstado("Pagado");
//        venta.setId(new ObjectId());
//        venta.setClienteid(new ObjectId("664062b3be17b02d28f61d60"));
//        List<DetalleVentaMapeo> detallesVenta = new ArrayList<>();
//        DetalleVentaMapeo dv = new DetalleVentaMapeo();
//        dv.setCantidad(2);
//        dv.setDetallesCliente(" ");
//        dv.setImporte(150.00f);
//        dv.setPrecio(75);
//        dv.setProductoId(new ObjectId("6640635df35eca6e5bf3d58e"));
//        dv.setTamanhoProducto("chico");
//        detallesVenta.add(dv);
//        venta.setDetallesVenta(detallesVenta);
//        DireccionMapeo direccionEntrega = new DireccionMapeo();
//        direccionEntrega.setCalle("Calle Principal");
//        direccionEntrega.setNumExterior("123");
//        direccionEntrega.setColonia("Ciudad Ejemplo");
//        venta.setDireccionEntrega(direccionEntrega);
//        Venta ventaEntidad = conversor.convertirAVentaEntidad(venta);
//        ventadao.agregarVenta(ventaEntidad);
        List<Venta> ventas = null;
        try {
            ventas = ventadao.consultarVentas();
        } catch (PersistenciaException ex) {
            Logger.getLogger(PruebasVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            List<Venta> ventas2 = ventadao.ventasPorCliente("663b16288bcd861f9682ffa9");
        } catch (PersistenciaException ex) {
            Logger.getLogger(PruebasVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Venta venta1 : ventas) {
            System.out.println(venta1);
            System.out.println(venta.getCliente());
        }

//  Venta venta1 = null;
//        try {
//            venta1 = ventadao.encontrarVenta("66407078f7989940561be054");
//        } catch (PersistenciaException ex) {
//            Logger.getLogger(PruebasVenta.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println(venta1.getFechaEntrega());
//        System.out.println(venta1.getFechaRegistro());
//        for (DetalleVenta dv:venta1.getDetallesVenta()) {
//            System.out.println(dv);
//            System.out.println(dv.getProducto().getId());
//            
//        }
//  Venta venta1 = null;
//        try {
//            venta1 = ventadao.encontrarVenta("663c5d4fa6ca7e6121d3e116");
//        } catch (PersistenciaException ex) {
//            Logger.getLogger(PruebasVenta.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println(venta1.getFechaEntrega());
//        System.out.println(venta1.getFechaRegistro());
//        for (DetalleVenta dv1:venta1.getDetallesVenta()) {
//            System.out.println(dv1);
//            System.out.println(dv1.getProducto().getId());
//            System.out.println(venta1.getCliente());
// }
//        Producto producto1 = new Producto();
//        producto1.setId("663d1f0de604fa31cd6f6b5b");
//        List<Producto> listaprod = new ArrayList<>();
//        listaprod.add(producto1);
//        Cliente c = new Cliente();
//        c.setId("663b16288bcd861f9682ffa9");
//        try {
//            List<Venta> ventas = ventadao.consultarVentasConFiltros(c.getId(), null, null,listaprod);
//            System.out.println(ventas);
//        } catch (PersistenciaException ex) {
//            Logger.getLogger(PruebasVenta.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        } catch (PersistenciaException ex) {
//            Logger.getLogger(PruebasVenta.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
