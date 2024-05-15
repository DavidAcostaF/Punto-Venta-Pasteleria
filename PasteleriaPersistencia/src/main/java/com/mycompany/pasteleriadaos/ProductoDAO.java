/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import Exceptions.PersistenciaException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.regex;
import com.mongodb.client.result.DeleteResult;
import com.mycompany.pasteleriadominioentidades.Producto;
import com.mycompany.pasteleriadominiosMapeo.IngredienteMapeo;
import com.mycompany.pasteleriadominiosMapeo.ProductoMapeo;
import conversionesPersistencia.ProductosConversiones;
import java.util.ArrayList;
import java.util.LinkedList;
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
    public Producto agregarProducto(Producto producto) throws PersistenciaException {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        coleccion.insertOne(conversor.convertirProductoMapeo(producto));

        try {
            return producto;
        } catch (Exception e) {
            throw new PersistenciaException("No se pudo agregar el producto");
        }
    }

    @Override
    public Producto actualizar(Producto producto) throws PersistenciaException {

        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        ProductoMapeo productoActualizado = coleccion.findOneAndReplace(eq("_id", new ObjectId(producto.getId())), conversor.convertirProductoMapeo(producto));

        try {
            return conversor.convertirProducto(productoActualizado);
        } catch (Exception e) {
            throw new PersistenciaException("No se pudo actualizar el producto");
        }
    }

    @Override
    public boolean eliminarProducto(ProductoMapeo producto) throws PersistenciaException {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        DeleteResult result = coleccion.deleteOne(eq("nombre", producto.getNombre()));

        try {
            return result.getDeletedCount() == 1;
        } catch (Exception e) {
            throw new PersistenciaException("No se pudo eliminar el producto");
        }
    }

    @Override
    public Producto consultar(String id) throws PersistenciaException {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        ProductoMapeo resultado = coleccion.find(eq("_id", new ObjectId(id))).first();
        if (resultado == null) {
            return null;
        }

        try {
            return conversor.convertirProducto(resultado);
        } catch (Exception e) {
            throw new PersistenciaException("No se pudo consultar el producto");
        }
    }

    @Override
    public List<Producto> consultarProductos() throws PersistenciaException {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        FindIterable<ProductoMapeo> Productos = coleccion.find();
        List<Producto> listaProductos = new ArrayList<>();
        for (ProductoMapeo producto : Productos) {
            listaProductos.add(conversor.convertirProducto(producto));
        }
        try {
            return listaProductos;
        } catch (Exception e) {
            throw new PersistenciaException("No se pudo consultar la lista");
        }
    }

    @Override
    public Producto consultarPorNombre(String nombre) throws PersistenciaException {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        ProductoMapeo resultado = coleccion.find(eq("nombre", nombre)).first();
        if (resultado == null) {
            return null;
        }
        try {
            return conversor.convertirProducto(resultado);
        } catch (Exception e) {
            throw new PersistenciaException("No se pudo consultar");
        }
    }

    @Override
    public List<Producto> consultarProductosCoincidentes(String nombre) throws PersistenciaException {
        MongoCollection<ProductoMapeo> coleccion = conexion.obtenerColeccion();
        FindIterable<ProductoMapeo> resultados = coleccion.find(regex("nombre", "^" + nombre, "i"));

        List<ProductoMapeo> listaIngredientes = new LinkedList<>();
        resultados.into(listaIngredientes);
        try {
            return conversor.convertirProductos(listaIngredientes);
        } catch (Exception e) {
            throw new PersistenciaException("No se pudo consultar la lista");
        }
    }

}
