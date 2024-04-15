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
    public float montoTotal;
    public String fechaEntrega;
    public String fechaRegistro;
    public DTO_Cliente cliente;
    public List<DTO_DetalleVenta> detallesVenta;  

    public DTO_Venta() {
    }

    public DTO_Venta(float montoTotal, String fechaEntrega, String fechaRegistro, DTO_Cliente cliente) {
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.fechaRegistro = fechaRegistro;
        this.cliente = cliente;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DTO_Venta{");
        sb.append("montoTotal=").append(montoTotal);
        sb.append(", fechaEntrega=").append(fechaEntrega);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", cliente=").append(cliente);
        sb.append(", detallesVenta=").append(detallesVenta);
        sb.append('}');
        return sb.toString();
    }


    
}
