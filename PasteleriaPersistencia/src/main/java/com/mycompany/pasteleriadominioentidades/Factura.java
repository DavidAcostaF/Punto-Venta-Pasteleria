/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadominioentidades;

import java.io.File;
import java.util.Date;

/**
 *
 * @author PERSONAL
 */
public class Factura {
    
    private String id;
    private Date fechaEmision;
    private Date fechaVencimiento;
    private Venta venta;
    private String ventaId;
    private File facturaPdf;

    public Factura() {
    }

    public Factura(Date fechaEmision, Date fechaVencimiento, Venta venta) {
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.venta = venta;
    }

    public Factura(String id, Date fechaEmision, Date fechaVencimiento, Venta venta) {
        this.id = id;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.venta = venta;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public File getFacturaPdf() {
        return facturaPdf;
    }

    public void setFacturaPdf(File facturaPdf) {
        this.facturaPdf = facturaPdf;
    }

    public String getVentaId() {
        return ventaId;
    }

    public void setVentaId(String ventaId) {
        this.ventaId = ventaId;
    }
    
    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", fechaEmision=" + fechaEmision + ", fechaVencimiento=" + fechaVencimiento + ", venta=" + venta + '}';
    }
}
