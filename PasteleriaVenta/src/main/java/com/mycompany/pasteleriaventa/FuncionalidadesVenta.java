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
 * @author f_aco
 */
public class FuncionalidadesVenta implements IFuncionalidadesVenta {

    IVentasBO ventas;

    public FuncionalidadesVenta() {
        this.ventas = new VentasBO();
    }

    @Override
    public void agregarVenta(DTO_Venta venta) {
        System.out.println(venta.getIDcliente());
        ventas.agregarVenta(venta);
    }

}
