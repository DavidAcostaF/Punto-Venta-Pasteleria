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
import com.mongodb.client.model.Sorts;
import com.mongodb.client.result.DeleteResult;
import com.mycompany.pasteleriadominios.Ingrediente;
import conversiones.IngredienteConversiones;
import dto.DTO_Ingrediente;
import java.util.LinkedList;
import java.util.List;
import javax.swing.text.Document;

/**
 *
 * @author af_da
 */
public class IngredienteDAO implements IIngredienteDAO {

    private IConexion conexion;
    private IngredienteConversiones ingredienteConversiones;

    public IngredienteDAO() {
        conexion = new Conexion("ingredientes", Ingrediente.class);
        ingredienteConversiones = new IngredienteConversiones();
    }

    @Override
    public DTO_Ingrediente agregar(Ingrediente ingrediente) {
        MongoCollection<Ingrediente> coleccion = conexion.obtenerColeccion();
        coleccion.insertOne(ingrediente);
        Ingrediente ingredienteAgregado = coleccion.find().sort(Sorts.descending("_id")).first();
        if (ingredienteAgregado != null && !ingredienteAgregado.getNombre().equals(ingrediente.getNombre())) {
            //Arrojar una excepcion
        }
        System.out.println(ingredienteAgregado);
        System.out.println(ingredienteAgregado.getId());

        return ingredienteConversiones.convertir(ingredienteAgregado);
    }

    @Override
    public DTO_Ingrediente actualizar(Ingrediente ingrediente) {
        MongoCollection<Ingrediente> coleccion = conexion.obtenerColeccion();
        Ingrediente ingredienteActualizado = coleccion.findOneAndReplace(eq("nombre", ingrediente.getNombre()), ingrediente);

        return ingredienteConversiones.convertir(ingredienteActualizado);
    }

    @Override
    public List<DTO_Ingrediente> consultar() {
        MongoCollection<Ingrediente> coleccion = conexion.obtenerColeccion();
        FindIterable<Ingrediente> resultados = coleccion.find();

        List<Ingrediente> listaIngredientes = new LinkedList<>();
        resultados.into(listaIngredientes);
        return ingredienteConversiones.convertir(listaIngredientes);
    }

    @Override
    public List<DTO_Ingrediente> consultar(Ingrediente ingrediente) {
        MongoCollection<Ingrediente> coleccion = conexion.obtenerColeccion();
        FindIterable<Ingrediente> resultados = coleccion.find(regex("nombre", "^" + ingrediente.getNombre(), "i"));

        List<Ingrediente> listaIngredientes = new LinkedList<>();
        resultados.into(listaIngredientes);
        return ingredienteConversiones.convertir(listaIngredientes);
    }

    @Override
    public DTO_Ingrediente consultarPorNombre(String nombre) {
        MongoCollection<Ingrediente> coleccion = conexion.obtenerColeccion();
        Ingrediente resultado = coleccion.find(regex("nombre", "^" + nombre + "$", "i")).first();
        DTO_Ingrediente ingredienteDTO = new DTO_Ingrediente();
        
        
        return ingredienteConversiones.convertir(resultado);
    }

    @Override
    public Boolean eliminar(Ingrediente ingrediente) {
        MongoCollection<Ingrediente> coleccion = conexion.obtenerColeccion();
        DeleteResult result = coleccion.deleteOne(eq("nombre", ingrediente.getNombre()));

        return result.getDeletedCount() == 1;
    }

}
