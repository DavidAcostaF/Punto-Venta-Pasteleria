/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadominiodocumentosanidados;

/**
 *
 * @author abelc
 */
public class IngredienteDetalle {
   
    private String ingredienteId;
    private String nombre;
    private Integer cantidad;

    public IngredienteDetalle(String ingredienteId, String nombre, Integer cantidad) {
        this.ingredienteId = ingredienteId;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getIngredienteId() {
        return ingredienteId;
    }

    public IngredienteDetalle() {
    }

    public void setIngredienteId(String ingredienteId) {
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
