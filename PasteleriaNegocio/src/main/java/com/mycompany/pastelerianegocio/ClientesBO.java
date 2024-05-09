/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import com.mycompany.pasteleriadaos.ClienteDAO;
import com.mycompany.pasteleriadaos.IClienteDAO;
import dto.DTO_Cliente;
import java.util.List;

/**
 *
 * @author PC
 */
public class ClientesBO implements IClientesBO {

    private IClienteDAO clienteDAO;

    public ClientesBO() {
        this.clienteDAO = new ClienteDAO();
    }

    @Override
    public List<DTO_Cliente> consultarClientes() {
        List<DTO_Cliente> clientes = clienteDAO.consultarClientes();
        return clientes;
    }

    @Override
    public void agregarCliente(DTO_Cliente clientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
