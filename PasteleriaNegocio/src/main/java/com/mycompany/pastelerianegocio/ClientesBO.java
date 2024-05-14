/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import conversionesnegocio.ClientesConversiones;
import Exceptions.PersistenciaException;
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
    private ClientesConversiones conversor;

    public ClientesBO() {
        this.clienteDAO = new ClienteDAO();
        conversor = new ClientesConversiones();
    }

    @Override
    public List<DTO_Cliente> consultarClientes() {
        try {
            List<DTO_Cliente> clientes = conversor.convertirDesdeClientes(clienteDAO.consultarClientes());
            return clientes;
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public void agregarCliente(DTO_Cliente clientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public DTO_Cliente actualizarCliente(DTO_Cliente cliente){
        try {
            clienteDAO.actualizarCliente(conversor.convertirDtoClienteAEntidadConRfc(cliente));
            return cliente;
        } catch (PersistenciaException e) {
            System.out.println(e);
            return null;
        }  
    }

    @Override
    public DTO_Cliente encontrarCliente(String apellidoPaterno, String apellidoMaterno, String nombres, String telefono) {
        try {
            DTO_Cliente cliente = conversor.convertirCliente(clienteDAO.encontrarCliente(apellidoPaterno, apellidoMaterno, nombres, telefono));
            return cliente;
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public DTO_Cliente encontrarClienteID(String idCliente) {
        try {
            return conversor.convertirCliente(clienteDAO.encontrarClienteID(idCliente));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

}
