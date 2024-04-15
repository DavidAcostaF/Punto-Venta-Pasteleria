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
        listaProductos.add(new Producto(300, "Pastel de Chocolate", "Cubierto con ganache de chocolate y decorado con virutas de chocolate.", "Grande"));
        listaProductos.add(new Producto(200, "Tarta de Fresa", "Rellena con crema de fresa y cubierta con glaseado de fresa.", "Mediano"));
        listaProductos.add(new Producto(150, "Pastel de Zanahoria", "Lleno de nueces y especias, cubierto con frosting de queso crema.", "Chico"));
        listaProductos.add(new Producto(300, "Tarta de Limón", "Bizcocho esponjoso de limón cubierto con crema de limón y ralladura de limón.", "Grande"));
        listaProductos.add(new Producto(400, "Pastel Red Velvet", "Bizcocho de terciopelo rojo con capas de frosting de queso crema.", "Grande"));
        listaProductos.add(new Producto(600,"Pastel de caca","afeff"," "));
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
