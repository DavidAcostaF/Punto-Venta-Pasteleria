/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mycompany.pasteleriadominios.Venta;

/**
 *
 * @author f_aco
 */
public interface IVentaDAO {
     public Venta agregarVenta(Venta venta);
    
    public void eliminarCliente(Venta venta);
}
