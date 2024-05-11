/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesPersistencia;

import com.mycompany.pasteleriadominioentidades.DetalleVenta;
import com.mycompany.pasteleriadominioentidades.Direccion;
import com.mycompany.pasteleriadominioentidades.Venta;
import com.mycompany.pasteleriadominiosMapeo.DetalleVentaMapeo;
import com.mycompany.pasteleriadominiosMapeo.DireccionMapeo;

import com.mycompany.pasteleriadominiosMapeo.VentaMapeo;
import dto.DTO_DetalleVenta;
import dto.DTO_Direccion;
import dto.DTO_Venta;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author PC
 */
public class VentasConversiones {

    ClientesConversiones conversorCliente;
    ProductosConversiones conversorProductos;

    public VentasConversiones() {
        conversorCliente = new ClientesConversiones();
        conversorProductos = new ProductosConversiones();
    }

    public Venta convertirAVentaEntidad(VentaMapeo venta) {
        Venta ventaE = new Venta();
        ventaE.setId(venta.getId().toHexString());
        ventaE.setFechaEntrega(venta.getFechaEntrega());
        ventaE.setFechaRegistro(venta.getFechaRegistro());
        ventaE.setMontoTotal(venta.getMontoTotal());
        ventaE.setEstado(venta.getEstado());
        ventaE.setClienteid(venta.getClienteid().toHexString());
        List<DetalleVenta> detallesVenta = new ArrayList<>();
        for (DetalleVentaMapeo detalleVenta : venta.getDetallesVenta()) {
            DetalleVenta detalleVentaE = new DetalleVenta();
            detalleVentaE.setCantidad(detalleVenta.getCantidad());
            detalleVentaE.setDetallesCliente(detalleVenta.getDetallesCliente());
            detalleVentaE.setProductoId(detalleVenta.getProductoId().toString());
            detalleVentaE.setImporte(detalleVenta.getImporte());
            detalleVentaE.setPrecio(detalleVenta.getPrecio());
            detalleVentaE.setTamanhoProducto(detalleVenta.getTamanhoProducto());
            detallesVenta.add(detalleVentaE);
        }
        ventaE.setDetallesVenta(detallesVenta);
        Direccion direccion = new Direccion();
        direccion.setCalle(venta.getDireccionEntrega().getCalle());
        direccion.setColonia(venta.getDireccionEntrega().getColonia());
        direccion.setNumExterior(venta.getDireccionEntrega().getNumExterior());
        ventaE.setDireccionEntrega(direccion);
        return ventaE;
    }

    public Venta convertirAVentaEntidadObjetos(VentaMapeo venta) {
        Venta ventaE = new Venta();
        ventaE.setId(venta.getId().toString());
        ventaE.setFechaEntrega(venta.getFechaEntrega());
        ventaE.setFechaRegistro(venta.getFechaRegistro());
        ventaE.setMontoTotal(venta.getMontoTotal());
        ventaE.setEstado(venta.getEstado());
        ventaE.setClienteid(venta.getClienteid().toString());
        ventaE.setCliente(conversorCliente.convertirCliente(venta.getCliente()));
        List<DetalleVenta> detallesVentaE = new ArrayList<>();
        for (DetalleVentaMapeo detalleVenta : venta.getDetallesVenta()) {
            DetalleVenta detalleVentaE = new DetalleVenta();
            detalleVentaE.setCantidad(detalleVenta.getCantidad());
            detalleVentaE.setDetallesCliente(detalleVenta.getDetallesCliente());
            detalleVentaE.setProductoId(detalleVenta.getProductoId().toString());
            detalleVentaE.setImporte(detalleVenta.getImporte());
            detalleVentaE.setPrecio(detalleVenta.getPrecio());
            detalleVentaE.setTamanhoProducto(detalleVenta.getTamanhoProducto());
            detalleVentaE.setProducto(conversorProductos.convertirProducto(detalleVenta.getProducto()));
            detallesVentaE.add(detalleVentaE);
        }
        ventaE.setDetallesVenta(detallesVentaE);
        Direccion direccionE = new Direccion();
        direccionE.setCalle(venta.getDireccionEntrega().getCalle());
        direccionE.setColonia(venta.getDireccionEntrega().getColonia());
        direccionE.setNumExterior(venta.getDireccionEntrega().getNumExterior());
        ventaE.setDireccionEntrega(direccionE);
        return ventaE;
    }
    
    public VentaMapeo convertirAVentaMapeo(Venta venta) {
    VentaMapeo ventaMapeo = new VentaMapeo();
    ventaMapeo.setClienteid(new ObjectId(venta.getId())); 
    ventaMapeo.setFechaEntrega(venta.getFechaEntrega());
    ventaMapeo.setFechaRegistro(venta.getFechaRegistro());
    ventaMapeo.setMontoTotal(venta.getMontoTotal());
    ventaMapeo.setEstado(venta.getEstado());
    List<DetalleVentaMapeo> detallesVentaMapeo = new ArrayList<>();
    for (DetalleVenta detalleVenta : venta.getDetallesVenta()) {
        DetalleVentaMapeo detalleVentaMapeo = new DetalleVentaMapeo();
        detalleVentaMapeo.setCantidad(detalleVenta.getCantidad());
        detalleVentaMapeo.setDetallesCliente(detalleVenta.getDetallesCliente());
        detalleVentaMapeo.setProductoId(new ObjectId(detalleVenta.getProductoId()));
        detalleVentaMapeo.setImporte(detalleVenta.getImporte());
        detalleVentaMapeo.setPrecio(detalleVenta.getPrecio());
        detalleVentaMapeo.setTamanhoProducto(detalleVenta.getTamanhoProducto());
        detallesVentaMapeo.add(detalleVentaMapeo);
    }
    ventaMapeo.setDetallesVenta(detallesVentaMapeo);
    DireccionMapeo direccionMapeo = new DireccionMapeo();
    direccionMapeo.setCalle(venta.getDireccionEntrega().getCalle());
    direccionMapeo.setColonia(venta.getDireccionEntrega().getColonia());
    direccionMapeo.setNumExterior(venta.getDireccionEntrega().getNumExterior());
    ventaMapeo.setDireccionEntrega(direccionMapeo);
    return ventaMapeo;
}
}
