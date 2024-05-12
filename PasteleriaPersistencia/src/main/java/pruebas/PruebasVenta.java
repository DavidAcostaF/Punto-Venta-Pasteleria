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
import com.mycompany.pasteleriadominiosMapeo.DetalleVentaMapeo;
import com.mycompany.pasteleriadominiosMapeo.DireccionMapeo;
import com.mycompany.pasteleriadominiosMapeo.VentaMapeo;
import conversionesPersistencia.VentasConversiones;
import dto.DTO_Cliente;
import dto.DTO_DetalleVenta;
import dto.DTO_Producto;
import dto.DTO_Venta;
import java.util.ArrayList;
import java.util.Date;
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
        venta.setMontoTotal(150.00f); // Monto total de la venta
        VentasConversiones conversor = new VentasConversiones();

// 
        Date fechaEntrega = new Date(); // Fecha de entrega
        Date fechaRegistro = new Date(); // Fecha de registro

// 
        venta.setFechaEntrega(fechaEntrega);
        venta.setFechaRegistro(fechaRegistro);
        venta.setEstado("Pagado");
        venta.setId(new ObjectId());
        venta.setClienteid(new ObjectId("663b16288bcd861f9682ffa9"));
        List<DetalleVentaMapeo> detallesVenta = new ArrayList<>();
        DetalleVentaMapeo dv = new DetalleVentaMapeo();
        dv.setCantidad(2);
        dv.setDetallesCliente(" ");
        dv.setImporte(150.00f);
        dv.setPrecio(75);
        dv.setProductoId(new ObjectId("663c434ac97af46c1e9d7bf9"));
        dv.setTamanhoProducto("chico");
        detallesVenta.add(dv);
        venta.setDetallesVenta(detallesVenta);
        DireccionMapeo direccionEntrega = new DireccionMapeo();
        direccionEntrega.setCalle("Calle Principal");
        direccionEntrega.setNumExterior("123");
        direccionEntrega.setColonia("Ciudad Ejemplo");
        venta.setDireccionEntrega(direccionEntrega);
        Venta ventaEntidad = conversor.convertirAVentaEntidad(venta);
        ventadao.agregarVenta(ventaEntidad);

 /* List<DTO_Venta> ventas=ventadao.consultarVentas();
    // List<DTO_Venta> ventas=ventadao.ventasPorCliente("663b16288bcd861f9682ffa9");
        for (DTO_Venta venta1:ventas) {
            System.out.println(venta1);
        }*/
//  Venta venta1 = null;
//        try {
//            venta1 = ventadao.encontrarVenta("663c5d4fa6ca7e6121d3e116");
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
        /*Producto producto1 = new Producto();
        producto1.setId("663d1f0de604fa31cd6f6b5b");
        List<Producto> listaprod = new ArrayList<>();
        listaprod.add(producto1);
        Cliente c = new Cliente();
        c.setId("663b16288bcd861f9682ffa9");

        try {
            List<Venta> ventas = ventadao.consultarVentasConFiltros(c.getId(), null, null,listaprod);
            System.out.println(ventas);
        } catch (PersistenciaException ex) {
            Logger.getLogger(PruebasVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
    }
}
