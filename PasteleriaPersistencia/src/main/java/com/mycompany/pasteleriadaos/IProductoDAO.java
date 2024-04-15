/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mycompany.pasteleriadominios.Producto;

/**
 *
 * @author PC
 */
public interface IProductoDAO {
    public Producto agregarProducto(Producto producto);
    
    public void eliminarProducto(Producto producto);
}