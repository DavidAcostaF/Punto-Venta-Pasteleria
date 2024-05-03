/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mycompany.pasteleriadominios.Ingrediente;

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
    public Boolean agregar(Ingrediente ingrediente) {
        MongoCollection<Ingrediente> coleccion = conexion.obtenerColeccion();
        coleccion.insertOne(ingrediente);
        return true;
    }

    @Override
    public Boolean actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
