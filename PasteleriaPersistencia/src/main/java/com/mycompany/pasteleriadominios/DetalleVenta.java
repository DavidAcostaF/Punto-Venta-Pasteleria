/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadominios;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author abelc
 */
public class DetalleVenta {

    private float precio;
    private float importe;
    private int cantidad;
    private String detallesCliente;
    private ObjectId productoId;
  
    public DetalleVenta() {
    }

    public DetalleVenta(float precio, float importe, int cantidad, String detallesCliente, ObjectId productoId) {
        this.precio = precio;
        this.importe = importe;
        this.cantidad = cantidad;
        this.detallesCliente = detallesCliente;
        this.productoId = productoId;
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

    @Override
    public String toString() {
        return "DetalleVenta{" + "precio=" + precio + ", importe=" + importe + ", cantidad=" + cantidad + ", detallesCliente=" + detallesCliente + ", productoId=" + productoId + '}';
    }
  
  
   
}
