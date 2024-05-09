/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import Exceptions.PersistenciaException;
import com.mycompany.pasteleriadaos.VentaDAO;
import com.mycompany.pasteleriadominios.DetalleVenta;
import com.mycompany.pasteleriadominios.Direccion;
import com.mycompany.pasteleriadominios.Venta;
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
     Venta venta = new Venta();
        venta.setMontoTotal(150.00f); // Monto total de la venta
/*
// Crear objetos Date para las fechas
        Date fechaEntrega = new Date(); // Fecha de entrega
        Date fechaRegistro = new Date(); // Fecha de registro

// Establecer las fechas en el objeto Venta
        venta.setFechaEntrega(fechaEntrega);
        venta.setFechaRegistro(fechaRegistro);
        venta.setEstado("Pagado");
        venta.setClienteid(new ObjectId("663b16288bcd861f9682ffa9"));
        List<DetalleVenta> detallesVenta = new ArrayList<>();
        DetalleVenta dv = new DetalleVenta();
        dv.setCantidad(2);
        dv.setDetallesCliente(" ");
        dv.setImporte(150.00f);
        dv.setPrecio(75);
        dv.setProductoId(new ObjectId("663c434ac97af46c1e9d7bf9"));
        dv.setTamanhoProducto("chico");
        detallesVenta.add(dv);
        venta.setDetallesVenta(detallesVenta);
        Direccion direccionEntrega = new Direccion();
        direccionEntrega.setCalle("Calle Principal");
        direccionEntrega.setNumExterior("123");
        direccionEntrega.setColonia("Ciudad Ejemplo");
        venta.setDireccionEntrega(direccionEntrega);
        ventadao.agregarVenta(venta);*/
   
   /* List<DTO_Venta> ventas=ventadao.consultarVentas();
    // List<DTO_Venta> ventas=ventadao.ventasPorCliente("663b16288bcd861f9682ffa9");
        for (DTO_Venta venta1:ventas) {
            System.out.println(venta1);
        }*/
   
   DTO_Venta venta1 = null;
        try {
            venta1 = ventadao.encontrarVenta("663c5d4fa6ca7e6121d3e116");
        } catch (PersistenciaException ex) {
            Logger.getLogger(PruebasVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(venta1.getID());
    }
}
