/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import gui.VentanaSeleccionarProductos;
import javax.swing.JFrame;

/**
 *
 * @author af_da
 */
public class ControlRegistrarVenta implements IControlRegistrarVenta {

    public VentanaSeleccionarProductos ventanaSeleccionarProducto() {

        return new VentanaSeleccionarProductos();
    }
}
