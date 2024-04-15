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
    
    
    
}
