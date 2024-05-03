/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author af_da
 */
public class Conexion<V, T> implements IConexion {

    private String nombreBaseDatos  = "pasteleria";
    private String cadenaConexion  = "mongodb://127.0.0.1:27017";
    private final String nombreColeccion;
    private final Class<T> tipoBase;

    public Conexion(String nombreColeccion, Class<T> tipoBase) {

        this.nombreColeccion = nombreColeccion;
        this.tipoBase = tipoBase;
    }

    @Override
    public MongoCollection<T> obtenerColeccion() {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClientSettings settings = MongoClientSettings.builder()
                .codecRegistry(pojoCodecRegistry).applyConnectionString(new ConnectionString(cadenaConexion))
                .build();
        MongoClient cliente = MongoClients.create(settings);

        MongoDatabase baseDatos = cliente.getDatabase(nombreBaseDatos);
        MongoCollection<T> coleccion = baseDatos.getCollection(nombreColeccion, tipoBase);

        return coleccion;
    }
}
