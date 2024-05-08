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
public class Producto {
private ObjectId id;
    private float precio;
    private String nombre;
    private String descripcion;
    private String tamaño;

    public Producto() {
    }

    public Producto(ObjectId id) {
        this.id = id;
    }

    public Producto(float precio, String nombre, String descripcion, String tamaño) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamaño = tamaño;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
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
        return "Producto{" + "id=" + id + ", precio=" + precio + ", nombre=" + nombre + ", descripcion=" + descripcion + ", tama\u00f1o=" + tamaño + '}';
    }

   
}
