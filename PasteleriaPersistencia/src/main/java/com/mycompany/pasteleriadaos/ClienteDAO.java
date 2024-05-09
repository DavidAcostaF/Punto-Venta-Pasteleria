/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import Exceptions.PersistenciaException;
import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import com.mycompany.pasteleriadominios.Cliente;
import conversiones.ClientesConversiones;
import dto.DTO_Cliente;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author f_aco
 */
public class ClienteDAO implements IClienteDAO {

    private IConexion conexion;
    private DTO_Cliente clientedto;
    private ClientesConversiones conversor;

    public ClienteDAO() {
        clientedto = new DTO_Cliente();
        conexion = new Conexion("clientes", Cliente.class);
        conversor = new ClientesConversiones();

    }

    @Override
    public Cliente agregarCliente(Cliente cliente) {
        MongoCollection<Cliente> coleccion = conexion.obtenerColeccion();
        coleccion.insertOne(cliente);
        return cliente;
    }

    @Override
    public List<DTO_Cliente> consultarClientes() {
        MongoCollection<Cliente> coleccion = conexion.obtenerColeccion();
        FindIterable<Cliente> clientesConsulta = coleccion.find();
        List<DTO_Cliente> listaDTOClientes = new ArrayList<>();

        for (Cliente cliente : clientesConsulta) {
            listaDTOClientes.add(conversor.convertirCliente(cliente));
        }

        return listaDTOClientes;
    }

    @Override
    public DTO_Cliente encontrarCliente(String apellidoPaterno, String apellidoMaterno, String nombres, String telefono) {
        MongoCollection<Cliente> coleccion = conexion.obtenerColeccion();
        BasicDBObject filtro = new BasicDBObject();
        filtro.put("apellidoP", apellidoPaterno);
        filtro.put("apellidoM", apellidoMaterno);
        filtro.put("nombre", nombres);
        filtro.put("telefono", telefono);
        DTO_Cliente clienteEncontrado = conversor.convertirCliente(coleccion.find(filtro).first());
        return clienteEncontrado;
    }

    @Override
    public DTO_Cliente encontrarClienteID(String idCliente) {
        MongoCollection<Cliente> coleccion = conexion.obtenerColeccion();
        Cliente resultado = coleccion.find(eq("_id", new ObjectId(idCliente))).first();
        if (resultado != null) {
            return conversor.convertirCliente(resultado);
        } else {
            return null;
        }

    }
}
