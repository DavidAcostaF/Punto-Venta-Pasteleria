/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mycompany.pasteleriadominios.Cliente;
import conversiones.ClientesConversiones;
import dto.DTO_Cliente;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

}
