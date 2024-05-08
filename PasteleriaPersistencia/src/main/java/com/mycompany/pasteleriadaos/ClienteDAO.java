/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mycompany.pasteleriadominios.Cliente;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author f_aco
 */
public class ClienteDAO implements IClienteDAO {

    private IConexion conexion;

    public ClienteDAO() {
        conexion = new Conexion("clientes", Cliente.class);

    }

    @Override
    public Cliente agregarCliente(Cliente cliente) {
        MongoCollection<Cliente> coleccion = conexion.obtenerColeccion();
        coleccion.insertOne(cliente);
        return cliente;
    }

    @Override
    public List<Cliente> consultarClientes() {
        MongoCollection<Cliente> coleccion = conexion.obtenerColeccion();
        FindIterable<Cliente> clientesConsulta = coleccion.find();
        List<Cliente> listaCliente = new LinkedList<>();

        for (Cliente cliente : clientesConsulta) {
            listaCliente.add(cliente);
        }

        return listaCliente;
    }

}
