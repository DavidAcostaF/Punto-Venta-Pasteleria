/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mycompany.pasteleriadominios.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author f_aco
 */
public class ClienteDAO implements IClienteDAO {

    List<Cliente> listaClientes;

    public ClienteDAO() {
        this.listaClientes = new ArrayList<>();

        listaClientes.add(new Cliente("David", "Acosta", "Fajardo", "6441223569", "davidaf@gmail.com"));
        listaClientes.add(new Cliente("Jose", "Armenta", "Baca", "6441228598", "chemaab@gmail.com"));
        listaClientes.add(new Cliente("Abel", "Corona", "Quintero", "6441274963", "abelCQ@gmail.com"));
        listaClientes.add(new Cliente("Hector", "Baez", "Luque", "6441578963", "PacoBL@gmail.com"));

    }

    @Override
    public Cliente agregarCliente(Cliente cliente) {
        this.listaClientes.add(cliente);
        return cliente;
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        this.listaClientes.remove(cliente);
    }

    @Override
    public List<Cliente> consultarClientes() {
        return this.listaClientes;
    }

}
