/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones;

import com.mycompany.pasteleriadominioentidades.DetalleVenta;
import com.mycompany.pasteleriadominioentidades.Venta;
import dto.DTO_DetalleVenta;
import dto.DTO_Direccion;
import dto.DTO_Venta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abelc
 */
public class VentasConversiones {
    
    ClientesConversiones conversorCliente;
    ProductosConversiones conversorProductos;

    public VentasConversiones() {
        conversorCliente = new ClientesConversiones();
        conversorProductos = new ProductosConversiones();
    }
    
    public DTO_Venta convertirVentaADTO(Venta venta) {
        DTO_Venta dtoVenta = new DTO_Venta();
        dtoVenta.setID(venta.getId());
        dtoVenta.setFechaEntrega(venta.getFechaEntrega());
        dtoVenta.setFechaRegistro(venta.getFechaRegistro());
        dtoVenta.setMontoTotal(venta.getMontoTotal());
        dtoVenta.setEstado(venta.getEstado());
        dtoVenta.setIDcliente(venta.getClienteid());
        List<DTO_DetalleVenta> detallesVenta = new ArrayList<>();
        for (DetalleVenta detalleVenta : venta.getDetallesVenta()) {
            DTO_DetalleVenta detalleVentaDTO = new DTO_DetalleVenta();
            detalleVentaDTO.setCantidad(detalleVenta.getCantidad());
            detalleVentaDTO.setEspecificacion(detalleVenta.getDetallesCliente());
            detalleVentaDTO.setIdproducto(detalleVenta.getProductoId());
            detalleVentaDTO.setImporte(detalleVenta.getImporte());
            detalleVentaDTO.setPrecio(detalleVenta.getPrecio());
            detalleVentaDTO.setTamanhoProducto(detalleVentaDTO.getTamanhoProducto());
            detallesVenta.add(detalleVentaDTO);
        }
        dtoVenta.setDetallesVenta(detallesVenta);
        DTO_Direccion dtoDireccion = new DTO_Direccion();
        dtoDireccion.setCalle(venta.getDireccionEntrega().getCalle());
        dtoDireccion.setColonia(venta.getDireccionEntrega().getColonia());
        dtoDireccion.setNumExterior(venta.getDireccionEntrega().getNumExterior());
        dtoVenta.setDieccionEntrega(dtoDireccion);
        return dtoVenta;
    }
    
    public DTO_Venta convertirADTO(Venta venta) {
        DTO_Venta dtoVenta = new DTO_Venta();
        dtoVenta.setID(venta.getId());
        dtoVenta.setFechaEntrega(venta.getFechaEntrega());
        dtoVenta.setFechaRegistro(venta.getFechaRegistro());
        dtoVenta.setMontoTotal(venta.getMontoTotal());
        dtoVenta.setEstado(venta.getEstado());
        dtoVenta.setIDcliente(venta.getClienteid());
        dtoVenta.setCliente(conversorCliente.convertirCliente(venta.getCliente()));
        List<DTO_DetalleVenta> detallesVenta = new ArrayList<>();
        for (DetalleVenta detalleVenta : venta.getDetallesVenta()) {
            DTO_DetalleVenta detalleVentaDTO = new DTO_DetalleVenta();
            detalleVentaDTO.setCantidad(detalleVenta.getCantidad());
            detalleVentaDTO.setEspecificacion(detalleVenta.getDetallesCliente());
            detalleVentaDTO.setIdproducto(detalleVenta.getProductoId());
            detalleVentaDTO.setImporte(detalleVenta.getImporte());
            detalleVentaDTO.setPrecio(detalleVenta.getPrecio());
            detalleVentaDTO.setTamanhoProducto(detalleVentaDTO.getTamanhoProducto());
            detalleVentaDTO.setProducto(conversorProductos.convertirProducto(detalleVenta.getProducto()));
            detallesVenta.add(detalleVentaDTO);
        }
        dtoVenta.setDetallesVenta(detallesVenta);
        DTO_Direccion dtoDireccion = new DTO_Direccion();
        dtoDireccion.setCalle(venta.getDireccionEntrega().getCalle());
        dtoDireccion.setColonia(venta.getDireccionEntrega().getColonia());
        dtoDireccion.setNumExterior(venta.getDireccionEntrega().getNumExterior());
        dtoVenta.setDieccionEntrega(dtoDireccion);
        return dtoVenta;
    }
    
    public List<DTO_Venta> convertirListaADTO(List<Venta> ventas){
    List<DTO_Venta> ventasDTO = new ArrayList<>();
        for (Venta venta:ventas) {
            DTO_Venta dtoVenta=convertirVentaADTO(venta);
            ventasDTO.add(dtoVenta);
        }
        return ventasDTO;
    }
}
