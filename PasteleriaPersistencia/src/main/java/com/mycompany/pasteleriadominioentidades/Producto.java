/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadominioentidades;

import com.mycompany.pasteleriadominiodocumentosanidados.IngredienteDetalle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abelc
 */
public class Producto {
    private String id;
    private float precio;
    private String nombre;
    private String descripcion;
    private List<IngredienteDetalle> ingredientes;

    public Producto() {
        if(ingredientes == null){
            ingredientes = new ArrayList<>();
        }
    }

    public Producto(String id) {
        this.id = id;
    }

    public Producto(String id, float precio, String nombre, String descripcion, List<IngredienteDetalle> ingredientes) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
    }

    public Producto(float precio, String nombre, String descripcion, List<IngredienteDetalle> ingredientes) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
    }

    public List<IngredienteDetalle> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<IngredienteDetalle> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void addIngredienteDetalle(IngredienteDetalle ingrediente) {
        this.getIngredientes().add(ingrediente);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", precio=" + precio + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    } 
}
