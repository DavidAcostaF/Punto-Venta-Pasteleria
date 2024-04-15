/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.List;

/**
 *
 * @author PC
 */
public class DTO_DetalleVenta {
    public float precio;
    public float importe;
    public int cantidad;
    public DTO_Producto productos;
    public DTO_Venta venta;

    public DTO_DetalleVenta() {
    }

    
    
    public DTO_DetalleVenta(float precio, float importe, int cantidad, DTO_Producto productos, DTO_Venta venta) {
        this.precio = precio;
        this.importe = importe;
        this.cantidad = cantidad;
        this.productos = productos;
        this.venta = venta;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public DTO_Producto getProductos() {
        return productos;
    }

    public void setProductos(DTO_Producto productos) {
        this.productos = productos;
    }

    public DTO_Venta getVenta() {
        return venta;
    }

    public void setVenta(DTO_Venta venta) {
        this.venta = venta;
    }

    
    
    
    
}
