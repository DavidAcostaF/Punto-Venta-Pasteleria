/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import dto.DTO_Cliente;
import dto.DTO_Producto;

/**
 *
 * @author PC
 */
public class DTO_Venta {
    public DTO_Producto producto;
    public float montoTotal;
    public String fechaEntrega;
    public String fechaRegistro;
    public DTO_Cliente cliente;
    public String detallesCliente;

    public DTO_Venta() {
    }

    public DTO_Venta(DTO_Producto producto, float montoTotal, String fechaEntrega, String fechaRegistro, DTO_Cliente cliente, String detallesCliente) {
        this.producto = producto;
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.fechaRegistro = fechaRegistro;
        this.cliente = cliente;
        this.detallesCliente = detallesCliente;
    }

    public DTO_Producto getProducto() {
        return producto;
    }

    public void setProducto(DTO_Producto producto) {
        this.producto = producto;
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

    public String getDetallesCliente() {
        return detallesCliente;
    }

    public void setDetallesCliente(String detallesCliente) {
        this.detallesCliente = detallesCliente;
    }

    @Override
    public String toString() {
        return "VentaDTO{" + "producto=" + producto + ", montoTotal=" + montoTotal + ", fechaEntrega=" + fechaEntrega + ", fechaRegistro=" + fechaRegistro + ", cliente=" + cliente + ", detallesCliente=" + detallesCliente + '}';
    }
    
    
}