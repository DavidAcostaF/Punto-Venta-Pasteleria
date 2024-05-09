/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadominios;

import com.mycompany.pasteleriadocumentosanidados.IngredienteDetalle;
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
    private List<IngredienteDetalle> ingredientes;

    public Producto() {
    }

    public Producto(ObjectId id) {
        this.id = id;
    }

    public Producto(ObjectId id, float precio, String nombre, String descripcion, List<IngredienteDetalle> ingredientes) {
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

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", precio=" + precio + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

}
