/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaventa;

import dto.DTO_Venta;

/**
 *
 * @author f_aco
 */
public class FuncionalidadesVenta implements IFuncionalidadesVenta {
   OperacionesVenta ventas;

    public FuncionalidadesVenta() {
    this.ventas=new OperacionesVenta();
    }
   
    @Override
    public void agregarVenta(DTO_Venta venta) {
    ventas.agregarVenta(venta);
    }
    
}
