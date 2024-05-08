/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import dto.DTO_Cliente;
import dto.DTO_Producto;
import java.util.List;

/**
 *
 * @author PC
 */
public class DTO_Venta {
    private String ID;
    private float montoTotal;
    private String fechaEntrega;
    private String fechaRegistro;
    private DTO_Cliente cliente;
    private List<DTO_DetalleVenta> detallesVenta;  
    private DTO_Direccion dieccionEntrega;

    public DTO_Venta() {
    }

    public DTO_Venta(String ID, float montoTotal, String fechaEntrega, String fechaRegistro, DTO_Cliente cliente, List<DTO_DetalleVenta> detallesVenta, DTO_Direccion dieccionEntrega) {
        this.ID = ID;
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.fechaRegistro = fechaRegistro;
        this.cliente = cliente;
        this.detallesVenta = detallesVenta;
        this.dieccionEntrega = dieccionEntrega;
    }

    public DTO_Venta(float montoTotal, String fechaEntrega, String fechaRegistro, DTO_Cliente cliente, List<DTO_DetalleVenta> detallesVenta, DTO_Direccion dieccionEntrega) {
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.fechaRegistro = fechaRegistro;
        this.cliente = cliente;
        this.detallesVenta = detallesVenta;
        this.dieccionEntrega = dieccionEntrega;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public DTO_Cliente getCliente() {
        return cliente;
    }

    public void setCliente(DTO_Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DTO_DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DTO_DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    public DTO_Direccion getDieccionEntrega() {
        return dieccionEntrega;
    }

    public void setDieccionEntrega(DTO_Direccion dieccionEntrega) {
        this.dieccionEntrega = dieccionEntrega;
    }

   


    
}
