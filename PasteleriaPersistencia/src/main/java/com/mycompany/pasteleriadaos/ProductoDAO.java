/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mycompany.pasteleriadominios.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class ProductoDAO implements IProductoDAO {
    List<Producto> listaProductos;

    public ProductoDAO() {
        this.listaProductos = new ArrayList<>();    

    }

    @Override
    public Producto agregarProducto(Producto producto) {
        this.listaProductos.add(producto);
        return producto;
    }

    @Override
    public void eliminarProducto(Producto producto) {
        this.listaProductos.remove(producto);
    }

    @Override
    public List<Producto> consultarProductos() {
       return this.listaProductos;
    }

   
    
}
