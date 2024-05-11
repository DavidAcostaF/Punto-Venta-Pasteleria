/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadominiosMapeo;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author f_aco
 */
public class ClienteMapeo {
   private ObjectId id;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String telefono;
    private List<DireccionMapeo> direcciones;

    public ClienteMapeo() {
    }

    public ClienteMapeo(ObjectId id, String nombre, String apellidoP, String apellidoM, String telefono, List<DireccionMapeo> direcciones) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        this.direcciones = direcciones;
    }

    public ClienteMapeo(String nombre, String apellidoP, String apellidoM, String telefono, List<DireccionMapeo> direcciones) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        this.direcciones = direcciones;
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

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

  

    public List<DireccionMapeo> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<DireccionMapeo> direcciones) {
        this.direcciones = direcciones;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", telefono=" + telefono + ", direcciones=" + direcciones + '}';
    }

   

    
}
