/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadominios;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author f_aco
 */
public class Venta {

    private ObjectId id;
    private float montoTotal;
    private Date fechaEntrega;
    private Date fechaRegistro;
    private String estado;
    private ObjectId clienteid;
    private List<DetalleVenta> detallesVenta;
    private Direccion direccionEntrega;
    private Cliente cliente;

    public Venta() {
    }

    public Venta(ObjectId id, float montoTotal, Date fechaEntrega, Date fechaRegistro, String estado, ObjectId clienteid, List<DetalleVenta> detallesVenta, Direccion direccionEntrega, Cliente cliente) {
        this.id = id;
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
        this.clienteid = clienteid;
        this.detallesVenta = detallesVenta;
        this.direccionEntrega = direccionEntrega;
        this.cliente = cliente;
    }

    public Venta(float montoTotal, Date fechaEntrega, Date fechaRegistro, String estado, ObjectId clienteid, List<DetalleVenta> detallesVenta, Direccion direccionEntrega, Cliente cliente) {
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
        this.clienteid = clienteid;
        this.detallesVenta = detallesVenta;
        this.direccionEntrega = direccionEntrega;
        this.cliente = cliente;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
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
