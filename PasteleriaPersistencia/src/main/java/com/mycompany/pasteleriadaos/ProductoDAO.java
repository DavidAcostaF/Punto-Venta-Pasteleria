/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.result.DeleteResult;
import com.mycompany.pasteleriadominioentidades.Producto;
import com.mycompany.pasteleriadominiosMapeo.IngredienteMapeo;
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

    @Override
    public Producto agregarProducto(Producto producto) {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        coleccion.insertOne(conversor.convertirProductoMapeo(producto));

        return producto;
    }

    @Override
    public Producto actualizar(ProductoMapeo producto) {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        ProductoMapeo productoActualizado = coleccion.findOneAndReplace(eq("nombre", producto.getNombre()), producto);

        return conversor.convertirProducto(productoActualizado);
    }

    @Override
    public boolean eliminarProducto(ProductoMapeo producto) {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        DeleteResult result = coleccion.deleteOne(eq("nombre", producto.getNombre()));

        return result.getDeletedCount() == 1;
    }

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
        ProductoMapeo resultado = coleccion.find(eq("nombre", nombre)).first();
        return conversor.convertirProducto(resultado);
    }

}
