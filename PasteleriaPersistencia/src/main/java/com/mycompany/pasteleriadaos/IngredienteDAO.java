/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.regex;
import com.mongodb.client.model.Sorts;
import com.mongodb.client.result.DeleteResult;
import com.mycompany.pasteleriadominioentidades.Ingrediente;
import com.mycompany.pasteleriadominiosMapeo.IngredienteMapeo;
import conversionesPersistencia.IngredienteConversiones;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.text.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author af_da
 */
public class IngredienteDAO implements IIngredienteDAO {

    private IConexion conexion;
    private IngredienteConversiones ingredienteConversiones;

    public IngredienteDAO() {
        conexion = new Conexion("ingredientes", IngredienteMapeo.class);
        ingredienteConversiones = new IngredienteConversiones();
    }

    @Override
    public Ingrediente agregar(IngredienteMapeo ingrediente) {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();
        coleccion.insertOne(ingrediente);
        IngredienteMapeo ingredienteAgregado = coleccion.find().sort(Sorts.descending("_id")).first();
        if (ingredienteAgregado != null && !ingredienteAgregado.getNombre().equals(ingrediente.getNombre())) {
            //Arrojar una excepcion
        }

        return ingredienteConversiones.convertir(ingredienteAgregado);
    }

    @Override
    public Ingrediente actualizar(IngredienteMapeo ingrediente) {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();
        IngredienteMapeo ingredienteActualizado = coleccion.findOneAndReplace(eq("nombre", ingrediente.getNombre()), ingrediente);

        return ingredienteConversiones.convertir(ingredienteActualizado);
    }

    @Override
    public List<Ingrediente> consultar() {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();
        FindIterable<IngredienteMapeo> resultados = coleccion.find();

        List<IngredienteMapeo> listaIngredientes = new LinkedList<>();
        resultados.into(listaIngredientes);
        return ingredienteConversiones.convertir(listaIngredientes);
    }

    @Override
    public List<Ingrediente> consultar(IngredienteMapeo ingrediente) {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();
        FindIterable<IngredienteMapeo> resultados = coleccion.find(regex("nombre", "^" + ingrediente.getNombre(), "i"));

        List<IngredienteMapeo> listaIngredientes = new LinkedList<>();
        resultados.into(listaIngredientes);
        return ingredienteConversiones.convertir(listaIngredientes);
    }

    @Override
    public Ingrediente consultarPorNombre(String nombre) {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();
        IngredienteMapeo resultado = coleccion.find(eq("nombre", nombre)).first();

        return ingredienteConversiones.convertir(resultado);
    }

    @Override
    public Boolean eliminar(IngredienteMapeo ingrediente) {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();
        DeleteResult result = coleccion.deleteOne(eq("nombre", ingrediente.getNombre()));

        return result.getDeletedCount() == 1;
    }

    @Override
    public List<Ingrediente> consultarIngredientesFaltantes(List<String> ingredientesIds) {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();
        List<ObjectId> ids = new ArrayList<>();
        for (String id : ingredientesIds) {
            ids.add(new ObjectId(id));
        }
        Bson filtro = Filters.not(Filters.in("_id", ids));

        return ingredienteConversiones.convertir(coleccion.find(filtro).into(new ArrayList<>()));

    }

    @Override
    public List<Ingrediente> consultarCantidadesIngredientesInventario(List<String> ingredientesNombres) {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();

        Bson filtro = Filters.in("nombre", ingredientesNombres);

        return ingredienteConversiones.convertir(coleccion.find(filtro).into(new ArrayList<>()));
    }

}
