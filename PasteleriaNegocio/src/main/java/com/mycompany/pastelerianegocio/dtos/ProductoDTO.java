/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio.dtos;

/**
 *
 * @author PC
 */
public class ProductoDTO {

    public float precio;
    public String nombre;
    public String descripcion;
    public String tamaño;
    public ProductoDTO() {
    }

    
    public ProductoDTO(float precio, String nombre, String descripcion, String tamaño) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamaño = tamaño;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" + "precio=" + precio + ", nombre=" + nombre + ", descripcion=" + descripcion + ", tama\u00f1o=" + tamaño + '}';
    }

}
