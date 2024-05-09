/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadominios;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author f_aco
 */
public class Venta {

    private ObjectId id;
    private float montoTotal;
    private String fechaEntrega;
    private String fechaRegistro;
    private ObjectId clienteid;
    private List<DetalleVenta> detallesVenta;
    private Direccion direccionEntrega;

    public Venta() {
    }

    public Venta(ObjectId id, float montoTotal, String fechaEntrega, String fechaRegistro, ObjectId clienteid, List<DetalleVenta> detallesVenta, Direccion direccionEntrega) {
        this.id = id;
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.fechaRegistro = fechaRegistro;
        this.clienteid = clienteid;
        this.detallesVenta = detallesVenta;
        this.direccionEntrega = direccionEntrega;
    }

    public Venta(float montoTotal, String fechaEntrega, String fechaRegistro, ObjectId clienteid, List<DetalleVenta> detallesVenta, Direccion direccionEntrega) {
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.fechaRegistro = fechaRegistro;
        this.clienteid = clienteid;
        this.detallesVenta = detallesVenta;
        this.direccionEntrega = direccionEntrega;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
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

    public ObjectId getClienteid() {
        return clienteid;
    }

    public void setClienteid(ObjectId clienteid) {
        this.clienteid = clienteid;
    }

    public List<DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    public Direccion getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(Direccion direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", montoTotal=" + montoTotal + ", fechaEntrega=" + fechaEntrega + ", fechaRegistro=" + fechaRegistro + ", clienteid=" + clienteid + ", detallesVenta=" + detallesVenta + ", direccionEntrega=" + direccionEntrega + '}';
    }

  

    
}
