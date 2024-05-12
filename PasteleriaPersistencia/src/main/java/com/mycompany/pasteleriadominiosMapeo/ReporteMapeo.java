/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadominiosMapeo;

import java.util.Date;
import org.bson.types.Binary;
import org.bson.types.ObjectId;

/**
 *
 * @author abelc
 */
public class ReporteMapeo {

    private ObjectId id;
    private String nombre;
    private Binary contenido;
    private String tipo;
    private String categoria;
    private Date fechaExpedicion;

    public ReporteMapeo() {
    }

    public ReporteMapeo(ObjectId id, String nombre, Binary contenido, String tipo, String categoria, Date fechaExpedicion) {
        this.id = id;
        this.nombre = nombre;
        this.contenido = contenido;
        this.tipo = tipo;
        this.categoria = categoria;
        this.fechaExpedicion = fechaExpedicion;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Binary getContenido() {
        return contenido;
    }

    public void setContenido(Binary contenido) {
        this.contenido = contenido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

}
