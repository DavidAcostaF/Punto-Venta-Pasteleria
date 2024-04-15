/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import com.mycompany.pasteleriadaos.ClienteDAO;
import com.mycompany.pasteleriadaos.IClienteDAO;
import com.mycompany.pasteleriadominios.Cliente;
import dto.DTO_Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author f_aco
 */
public class VentasBO implements IVentasBO {

    private IClienteDAO clienteDAO = new ClienteDAO();

    @Override
    public List<DTO_Cliente> consultarClientes() {
        List<Cliente> listaClientes = this.clienteDAO.consultarClientes();
        List<DTO_Cliente> listaClientesDTO = new ArrayList<>();

        for (Cliente cliente : listaClientes) {
            DTO_Cliente clienteDTO = new DTO_Cliente(
                    cliente.getNombre(),
                    cliente.getApellidoP(),
                    cliente.getApellidoM(),
                    cliente.getTelefono(),
                    cliente.getCorreo());

            listaClientesDTO.add(clienteDTO);
        }
        return listaClientesDTO;

    }
    // En esta clase iran todos los metodos encargados de para agregar una venta 

    @Override
    public void agregarClientes(List<DTO_Cliente> clientes) {
        List<DTO_Cliente> listaClientesDTO = clientes;

        for (DTO_Cliente clienteDTO : listaClientesDTO) {
            Cliente cliente = new Cliente(
                    clienteDTO.getNombre(),
                    clienteDTO.getApellidoP(),
                    clienteDTO.getApellidoM(),
                    clienteDTO.getTelefono(),
                    clienteDTO.getCorreo());

            this.clienteDAO.agregarCliente(cliente);
        }

    }

}
