/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import com.mycompany.pasteleriadominios.Producto;
import conversiones.ProductosConversiones;
import dto.DTO_Producto;
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
        conexion = new Conexion("productos", Producto.class);
        conversor = new ProductosConversiones();

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
    public List<DTO_Producto> consultarProductos() {
        MongoCollection<Producto> coleccion = conexion.obtenerColeccion();
        FindIterable<Producto> Productos = coleccion.find();
        List<DTO_Producto> listaProductos = new ArrayList<>();
        for (Producto producto : Productos) {
            listaProductos.add(conversor.convertirProducto(producto));
        }
        return listaProductos;
    }

    @Override
    public DTO_Producto consultarProductoId(String idProducto) {
        MongoCollection<Producto> coleccion = conexion.obtenerColeccion();
        Producto resultado=coleccion.find(eq("_id", new ObjectId(idProducto))).first();
         if (resultado != null) {
            return conversor.convertirProducto(resultado);
        } else {
            return null;
        }
    }

}
