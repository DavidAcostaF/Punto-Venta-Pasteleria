/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadominios;

/**
 *
 * @author f_aco
 */
public class Direccion {

    public String calle;
    public String colonia;
    public String numExterior;
    public Cliente cliente;

    public Direccion() {
    }
    
    

    public Direccion(String calle, String colonia, String numExterior, Cliente cliente) {
        this.calle = calle;
        this.colonia = colonia;
        this.numExterior = numExterior;
        this.cliente = cliente;
    }
    
    

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getNumExterior() {
        return numExterior;
    }

    public void setNumExterior(String numExterior) {
        this.numExterior = numExterior;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
