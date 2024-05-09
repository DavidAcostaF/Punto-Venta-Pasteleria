/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mongodb.client.MongoCollection;
import com.mycompany.pasteleriadominios.Producto;
import dto.DTO_Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class ProductoDAO implements IProductoDAO {

    //List<Producto> listaProductos;
    private IConexion conexion;

    public ProductoDAO() {
        conexion = new Conexion("pasteles", Producto.class);
        //this.listaProductos = new ArrayList<>();    

    }

    @Override
    public DTO_Producto agregarProducto(Producto producto) {
        MongoCollection<Producto> coleccion = conexion.obtenerColeccion();
        coleccion.insertOne(producto);

        //Retornar el producto convertido a DTO por la clase encargada de la chamba esa
        return new DTO_Producto();
    }

    @Override
    public void eliminarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Producto> consultarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
