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
    private float precio;
    private float importe;
    private int cantidad;
    private String especificacion;
    private String Idproducto;
    private String tamanhoProducto;
    public DTO_DetalleVenta() {
    }

    public DTO_DetalleVenta(float precio, float importe, int cantidad, String especificacion, String Idproducto, String tamanhoProducto) {
        this.precio = precio;
        this.importe = importe;
        this.cantidad = cantidad;
        this.especificacion = especificacion;
        this.Idproducto = Idproducto;
        this.tamanhoProducto = tamanhoProducto;
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

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    public String getIdproducto() {
        return Idproducto;
    }

    public void setIdproducto(String Idproducto) {
        this.Idproducto = Idproducto;
    }

    public String getTamanhoProducto() {
        return tamanhoProducto;
    }

    public void setTamanhoProducto(String tamanhoProducto) {
        this.tamanhoProducto = tamanhoProducto;
    }

    @Override
    public String toString() {
        return "DTO_DetalleVenta{" + "precio=" + precio + ", importe=" + importe + ", cantidad=" + cantidad + ", especificacion=" + especificacion + ", Idproducto=" + Idproducto + '}';
    }

   
    
    
    
    
}
