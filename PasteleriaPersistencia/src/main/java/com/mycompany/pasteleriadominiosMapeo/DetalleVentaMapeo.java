/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadominiosMapeo;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author abelc
 */
public class DetalleVentaMapeo {

    private float precio;
    private float importe;
    private int cantidad;
    private String detallesCliente;
    private String tamanhoProducto;
    private ObjectId productoId;
    private ProductoMapeo producto;

    public DetalleVentaMapeo() {
    }

    public DetalleVentaMapeo(float precio, float importe, int cantidad, String detallesCliente, String tamanhoProducto, ObjectId productoId) {
        this.precio = precio;
        this.importe = importe;
        this.cantidad = cantidad;
        this.detallesCliente = detallesCliente;
        this.tamanhoProducto = tamanhoProducto;
        this.productoId = productoId;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public ProductoMapeo getProducto() {
        return producto;
    }

    public void setProducto(ProductoMapeo producto) {
        this.producto = producto;
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

    public String getDetallesCliente() {
        return detallesCliente;
    }

    public void setDetallesCliente(String detallesCliente) {
        this.detallesCliente = detallesCliente;
    }

    public ObjectId getProductoId() {
        return productoId;
    }

    public void setProductoId(ObjectId productoId) {
        this.productoId = productoId;
    }

    public String getTamanhoProducto() {
        return tamanhoProducto;
    }

    public void setTamanhoProducto(String tamanhoProducto) {
        this.tamanhoProducto = tamanhoProducto;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "precio=" + precio + ", importe=" + importe + ", cantidad=" + cantidad + ", detallesCliente=" + detallesCliente + ", productoId=" + productoId + '}';
    }

}
