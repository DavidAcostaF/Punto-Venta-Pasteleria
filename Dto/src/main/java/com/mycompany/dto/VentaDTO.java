/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio.dtos;

/**
 *
 * @author PC
 */
public class VentaDTO {
    public ProductoDTO producto;
    public float montoTotal;
    public String fechaEntrega;
    public String fechaRegistro;
    public ClienteDTO cliente;
    public String detallesCliente;

    public VentaDTO() {
    }

    public VentaDTO(ProductoDTO producto, float montoTotal, String fechaEntrega, String fechaRegistro, ClienteDTO cliente, String detallesCliente) {
        this.producto = producto;
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.fechaRegistro = fechaRegistro;
        this.cliente = cliente;
        this.detallesCliente = detallesCliente;
    }

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
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

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
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
