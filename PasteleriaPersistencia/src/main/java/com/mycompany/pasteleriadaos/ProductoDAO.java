/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import com.mycompany.pasteleriadominioentidades.Producto;
import com.mycompany.pasteleriadominiosMapeo.ProductoMapeo;
import conversionesPersistencia.ProductosConversiones;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author PC
 */
public class ProductoDAO implements IProductoDAO {

    //List<Producto> listaProductos;
    private IConexion conexion;
    private ProductosConversiones conversor;

    public ProductoDAO() {
        conexion = new Conexion("productos", ProductoMapeo.class);
        conversor = new ProductosConversiones();

    }

  /*  @Override
    public DTO_Producto agregarProducto(ProductoMapeo producto) {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        coleccion.insertOne(producto);
        //Retornar el producto convertido a DTO por la clase encargada de la chamba esa
        return new DTO_Producto();
    }

    @Override
    public void eliminarProducto(ProductoMapeo producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

    @Override
    public List<Producto> consultarProductos() {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        FindIterable<ProductoMapeo> Productos = coleccion.find();
        List<Producto> listaProductos = new ArrayList<>();
        for (ProductoMapeo producto : Productos) {
            listaProductos.add(conversor.convertirProducto(producto));
        }
        return listaProductos;
    }

    @Override
    public Producto consultarPorNombre(String nombre) {
       MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
       ProductoMapeo resultado=coleccion.find(eq("nombre", nombre)).first();
       return conversor.convertirProducto(resultado);
    }

   

}
