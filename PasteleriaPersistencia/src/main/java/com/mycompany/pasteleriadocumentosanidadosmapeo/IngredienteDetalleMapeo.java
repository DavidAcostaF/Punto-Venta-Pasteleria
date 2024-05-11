/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadocumentosanidadosmapeo;

import org.bson.types.ObjectId;

/**
 *
 * @author af_da
 */
public class IngredienteDetalleMapeo {

    private ObjectId ingredienteId;
    private String nombre;
    private Integer cantidad;

    public IngredienteDetalleMapeo(ObjectId ingredienteId, String nombre, Integer cantidad) {
        this.ingredienteId = ingredienteId;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public ObjectId getIngredienteId() {
        return ingredienteId;
    }

    public IngredienteDetalleMapeo() {
    }

    public void setIngredienteId(ObjectId ingredienteId) {
        this.ingredienteId = ingredienteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

}
