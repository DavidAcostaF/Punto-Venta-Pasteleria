/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.regex;
import com.mongodb.client.result.DeleteResult;
import com.mycompany.pasteleriadominios.Ingrediente;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author af_da
 */
public class IngredienteDAO implements IIngredienteDAO {

    private IConexion conexion;

    public IngredienteDAO() {
        conexion = new Conexion("ingredientes", Ingrediente.class);
    }

    @Override
    public Ingrediente agregar(Ingrediente ingrediente) {
        MongoCollection<Ingrediente> coleccion = conexion.obtenerColeccion();
        coleccion.insertOne(ingrediente);
        return ingrediente;
    }

    @Override
    public Ingrediente actualizar(Ingrediente ingrediente) {
        MongoCollection<Ingrediente> coleccion = conexion.obtenerColeccion();
        Ingrediente ingredienteActualizado = coleccion.findOneAndReplace(eq("nombre", ingrediente.getNombre()), ingrediente);
        return ingredienteActualizado;
    }

    @Override
    public List<Ingrediente> consultar() {
        MongoCollection<Ingrediente> coleccion = conexion.obtenerColeccion();
        FindIterable<Ingrediente> resultados = coleccion.find();

        List<Ingrediente> listaIngredientes = new LinkedList<>();
        resultados.into(listaIngredientes);
        return listaIngredientes;
    }

    @Override
    public List<Ingrediente> consultar(Ingrediente ingrediente) {
        MongoCollection<Ingrediente> coleccion = conexion.obtenerColeccion();
        FindIterable<Ingrediente> resultados = coleccion.find(regex("nombre", "^" + ingrediente.getNombre(), "i"));

        List<Ingrediente> listaIngredientes = new LinkedList<>();
        resultados.into(listaIngredientes);
        return listaIngredientes;
    }

    @Override
    public Ingrediente consultarPorNombre(String nombre) {
        MongoCollection<Ingrediente> coleccion = conexion.obtenerColeccion();
        Ingrediente resultado = coleccion.find(regex("nombre", "^" + nombre + "$", "i")).first();
        return resultado;
    }

    @Override
    public Boolean eliminar(Ingrediente ingrediente) {
        MongoCollection<Ingrediente> coleccion = conexion.obtenerColeccion();
        DeleteResult result = coleccion.deleteOne(eq("nombre", ingrediente.getNombre()));
        if (result.getDeletedCount() == 1) {
            return true;
        } else {
            return false;
        }
    }

}
