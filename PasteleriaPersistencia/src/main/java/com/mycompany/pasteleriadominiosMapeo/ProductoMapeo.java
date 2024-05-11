/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadominiosMapeo;

import com.mycompany.pasteleriadocumentosanidadosmapeo.IngredienteDetalleMapeo;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author abelc
 */
public class ProductoMapeo {

    private ObjectId id;
    private float precio;
    private String nombre;
    private String descripcion;
    private List<IngredienteDetalleMapeo> ingredientes;

    public ProductoMapeo() {
        if(ingredientes == null){
            ingredientes = new ArrayList<>();
        }
    }

    public ProductoMapeo(ObjectId id) {
        this.id = id;
    }

    public ProductoMapeo(ObjectId id, float precio, String nombre, String descripcion, List<IngredienteDetalleMapeo> ingredientes) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
    }

    public ProductoMapeo(float precio, String nombre, String descripcion, List<IngredienteDetalleMapeo> ingredientes) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
    }

    public List<IngredienteDetalleMapeo> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<IngredienteDetalleMapeo> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void addIngredienteDetalle(IngredienteDetalleMapeo ingrediente) {
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
