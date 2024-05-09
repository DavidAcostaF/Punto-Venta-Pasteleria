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
    private String ID;
    private float montoTotal;
    private String fechaEntrega;
    private String fechaRegistro;
    private String IDcliente;
    private List<DTO_DetalleVenta> detallesVenta;  
    private DTO_Direccion dieccionEntrega;

    public DTO_Venta() {
    }

    public DTO_Venta(String ID, float montoTotal, String fechaEntrega, String fechaRegistro, String IDcliente, List<DTO_DetalleVenta> detallesVenta, DTO_Direccion dieccionEntrega) {
        this.ID = ID;
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.fechaRegistro = fechaRegistro;
        this.IDcliente = IDcliente;
        this.detallesVenta = detallesVenta;
        this.dieccionEntrega = dieccionEntrega;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getIDcliente() {
        return IDcliente;
    }

    public void setIDcliente(String IDcliente) {
        this.IDcliente = IDcliente;
    }

    public List<DTO_DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(List<DTO_DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    public DTO_Direccion getDieccionEntrega() {
        return dieccionEntrega;
    }

    public void setDieccionEntrega(DTO_Direccion dieccionEntrega) {
        this.dieccionEntrega = dieccionEntrega;
    }

    @Override
    public String toString() {
        return "DTO_Venta{" + "ID=" + ID + ", montoTotal=" + montoTotal + ", fechaEntrega=" + fechaEntrega + ", fechaRegistro=" + fechaRegistro + ", IDcliente=" + IDcliente + ", detallesVenta=" + detallesVenta + ", dieccionEntrega=" + dieccionEntrega + '}';
    }

   

    
}
