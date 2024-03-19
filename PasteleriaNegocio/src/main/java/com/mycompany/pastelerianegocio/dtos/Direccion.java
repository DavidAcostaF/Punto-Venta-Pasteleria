/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio.dtos;

/**
 *
 * @author PC
 */
public class Direccion {
    public String calle;
    public String colonia;
    public String numExterior;
    public ClienteDTO cliente;

    public Direccion() {
    }

    public Direccion(String calle, String colonia, String numExterior, ClienteDTO cliente) {
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

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", colonia=" + colonia + ", numExterior=" + numExterior + ", cliente=" + cliente + '}';
    }
    
}
