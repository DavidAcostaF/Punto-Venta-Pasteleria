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
import com.mycompany.pasteleriadominioentidades.Cliente;
import com.mycompany.pasteleriadominiosMapeo.ClienteMapeo;
import conversionesPersistencia.ClientesConversiones;
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
        conexion = new Conexion("clientes", ClienteMapeo.class);
        conversor = new ClientesConversiones();

    }

    @Override
    public Cliente agregarCliente(Cliente cliente) throws PersistenciaException {
        try {
            MongoCollection<ClienteMapeo> coleccion = conexion.obtenerColeccion();
            coleccion.insertOne(conversor.convertirClienteAMapeo(cliente));
            return cliente;
        } catch (Exception e) {
            throw new PersistenciaException("Error al agregar cliente: " + e.getMessage());
        }
    }

    @Override
    public List<Cliente> consultarClientes() throws PersistenciaException {
        try {
            MongoCollection<ClienteMapeo> coleccion = conexion.obtenerColeccion();
            FindIterable<ClienteMapeo> clientesConsulta = coleccion.find();
            List<Cliente> listaClientes = new ArrayList<>();

            for (ClienteMapeo cliente : clientesConsulta) {
                listaClientes.add(conversor.convertirCliente(cliente));
            }

            return listaClientes;
        } catch (Exception e) {
            throw new PersistenciaException("Error al consultar clientes: " + e.getMessage());
        }
    }

    @Override
    public Cliente encontrarCliente(String apellidoPaterno, String apellidoMaterno, String nombres, String telefono) throws PersistenciaException {
        try {
            MongoCollection<ClienteMapeo> coleccion = conexion.obtenerColeccion();
            BasicDBObject filtro = new BasicDBObject();
            filtro.put("apellidoP", apellidoPaterno);
            filtro.put("apellidoM", apellidoMaterno);
            filtro.put("nombre", nombres);
            filtro.put("telefono", telefono);
            Cliente clienteEncontrado = conversor.convertirCliente(coleccion.find(filtro).first());
            return clienteEncontrado;
        } catch (Exception e) {
            throw new PersistenciaException("Error al encontrar cliente: " + e.getMessage());
        }
    }

    @Override
    public Cliente encontrarClienteID(String idCliente) throws PersistenciaException {
        try {
            MongoCollection<ClienteMapeo> coleccion = conexion.obtenerColeccion();
            ClienteMapeo resultado = coleccion.find(eq("_id", new ObjectId(idCliente))).first();
            if (resultado != null) {
                return conversor.convertirCliente(resultado);
            } else {
                return null;
            }
        } catch (Exception e) {
            throw new PersistenciaException("Error al encontrar cliente por ID: " + e.getMessage());
        }
    }
}
