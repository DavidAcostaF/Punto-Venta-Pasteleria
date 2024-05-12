/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadominiosMapeo;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author PERSONAL
 */
public class FacturaMapeo {
    private ObjectId id;
    private Date fechaEmision;
    private Date fechaVencimiento;
    private VentaMapeo venta;
    private ObjectId ventaId;
    private ObjectId facturaPdf;

    public FacturaMapeo() {
    }

    public FacturaMapeo(Date fechaEmision, Date fechaVencimiento, VentaMapeo venta, ObjectId ventaId) {
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.venta = venta;
        this.ventaId = ventaId;
    }

    public FacturaMapeo(ObjectId id, Date fechaEmision, Date fechaVencimiento, VentaMapeo venta, ObjectId ventaId) {
        this.id = id;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.venta = venta;
        this.ventaId = ventaId;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public VentaMapeo getVenta() {
        return venta;
    }

    public void setVenta(VentaMapeo venta) {
        this.venta = venta;
    }

    public ObjectId getVentaId() {
        return ventaId;
    }

    public void setVentaId(ObjectId ventaId) {
        this.ventaId = ventaId;
    }

    public ObjectId getFacturaPdf() {
        return facturaPdf;
    }

    public void setFacturaPdf(ObjectId facturaPdf) {
        this.facturaPdf = facturaPdf;
    }

    @Override
    public String toString() {
        return "FacturaMapeo{" + "id=" + id + ", fechaEmision=" + fechaEmision + ", fechaVencimiento=" + fechaVencimiento + ", venta=" + venta + ", ventaId=" + ventaId + '}';
    }

    
}
