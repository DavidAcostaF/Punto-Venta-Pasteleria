/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mycompany.pasteleriadominios.DetalleVenta;

/**
 *
 * @author PC
 */
public interface IDetalleVentaDAO {
    public DetalleVenta agregrarDetalleVenta(DetalleVenta detalleVenta);
    
    public void eliminarDetalleVenta(DetalleVenta detalleVenta);
}
