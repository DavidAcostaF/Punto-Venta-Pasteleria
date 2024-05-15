/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import Exceptions.PersistenciaException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gt;
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
    public Ingrediente agregar(IngredienteMapeo ingrediente) throws PersistenciaException {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();
        coleccion.insertOne(ingrediente);
        IngredienteMapeo ingredienteAgregado = coleccion.find().sort(Sorts.descending("_id")).first();
        if (ingredienteAgregado != null && !ingredienteAgregado.getNombre().equals(ingrediente.getNombre())) {
            throw new PersistenciaException("No se pudo agregar el ingrediente");

        }

        return ingredienteConversiones.convertir(ingredienteAgregado);

    }

    @Override
    public Ingrediente actualizar(IngredienteMapeo ingrediente) throws PersistenciaException {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();
        IngredienteMapeo ingredienteActualizado = coleccion.findOneAndReplace(eq("nombre", ingrediente.getNombre()), ingrediente);

        try {
            return ingredienteConversiones.convertir(ingredienteActualizado);

        } catch (Exception e) {
            throw new PersistenciaException("No se actualizar el ingrediente");
        }
    }

    @Override
    public List<Ingrediente> consultar() throws PersistenciaException {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();
        FindIterable<IngredienteMapeo> resultados = coleccion.find();

        List<IngredienteMapeo> listaIngredientes = new LinkedList<>();
        resultados.into(listaIngredientes);
        try {
            return ingredienteConversiones.convertir(listaIngredientes);

        } catch (Exception e) {
            throw new PersistenciaException("No se pudo consultar la lista");
        }
    }

    @Override
    public List<Ingrediente> consultar(IngredienteMapeo ingrediente) throws PersistenciaException {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();
        FindIterable<IngredienteMapeo> resultados = coleccion.find(regex("nombre", "^" + ingrediente.getNombre(), "i"));

        List<IngredienteMapeo> listaIngredientes = new LinkedList<>();
        resultados.into(listaIngredientes);
        try {
            return ingredienteConversiones.convertir(listaIngredientes);

        } catch (Exception e) {
            throw new PersistenciaException("No se pudo consultar la lista");
        }
    }

    @Override
    public Ingrediente consultarPorNombre(String nombre) throws PersistenciaException {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();
        IngredienteMapeo resultado = coleccion.find(eq("nombre", nombre)).first();

        try {
            return ingredienteConversiones.convertir(resultado);

        } catch (Exception e) {
            throw new PersistenciaException("No se pudo consultar");
        }
    }

    @Override
    public Boolean eliminar(IngredienteMapeo ingrediente) throws PersistenciaException {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();
        DeleteResult result = coleccion.deleteOne(eq("nombre", ingrediente.getNombre()));

        try {
            return result.getDeletedCount() == 1;

        } catch (Exception e) {
            throw new PersistenciaException("No se pudo eliminar");
        }
    }

    @Override
    public List<Ingrediente> consultarIngredientesFaltantes(List<String> ingredientesIds) throws PersistenciaException {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();
        List<ObjectId> ids = new ArrayList<>();
        for (String id : ingredientesIds) {
            ids.add(new ObjectId(id));
        }
        Bson filtro = Filters.not(Filters.in("_id", ids));

        try {
            return ingredienteConversiones.convertir(coleccion.find(filtro).into(new ArrayList<>()));

        } catch (Exception e) {
            throw new PersistenciaException("No se pudo consultar lal lista");
        }
    }

    @Override
    public List<Ingrediente> consultarCantidadesIngredientesInventario(List<String> ingredientesNombres) throws PersistenciaException {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();

        Bson filtro = Filters.in("nombre", ingredientesNombres);

        try {
            return ingredienteConversiones.convertir(coleccion.find(filtro).into(new ArrayList<>()));

        } catch (Exception e) {
            throw new PersistenciaException("No se pudo consultar lal lista");
        }
    }

    @Override
    public List<Ingrediente> consultarIngredientesConStock() throws PersistenciaException {
        MongoCollection<IngredienteMapeo> coleccion = conexion.obtenerColeccion();
        try {
            return ingredienteConversiones.convertir(coleccion.find(gt("cantidad", 0)).into(new ArrayList<>()));

        } catch (Exception e) {
            throw new PersistenciaException("No se pudo consultar lal lista");
        }
    }

}
