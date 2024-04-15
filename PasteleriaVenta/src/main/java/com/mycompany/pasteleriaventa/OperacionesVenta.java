/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaventa;

import com.mycompany.pastelerianegocio.IVentasBO;
import com.mycompany.pastelerianegocio.VentasBO;
import dto.DTO_Venta;

/**
 *
 * @author abelc
 */
public class OperacionesVenta {
    IVentasBO ventas;

    public OperacionesVenta() {
    this.ventas=new VentasBO();
    }
    protected void agregarVenta(DTO_Venta venta){
    ventas.agregarVenta(venta);
    }
}
