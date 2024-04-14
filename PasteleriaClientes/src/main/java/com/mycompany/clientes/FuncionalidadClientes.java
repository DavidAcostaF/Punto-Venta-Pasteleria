/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientes;

import com.mycompany.pastelerianegocio.dtos.ClienteDTO;
import java.util.ArrayList;
import java.util.List;
//Esta clase funciona de que se manda la informacion al negocio o se obtiene mediante dtos y el negocio se encargara de devolver la info o mandarlas a las daos de ser necesarias

public class FuncionalidadClientes implements IFuncionalidadClientes{
    //esta clase tendra todas las operaciones del cliente necesarias
    @Override
    public List<ClienteDTO> consultarClientes() {
        List<ClienteDTO> clientes;

        clientes = new ArrayList<>();

        clientes.add(new ClienteDTO("David", "Acosta", "Fajardo", "6441223569", "davidaf@gmail.com"));
        clientes.add(new ClienteDTO("Jose", "Armenta", "Baca", "6441228598", "chemaab@gmail.com"));
        clientes.add(new ClienteDTO("Abel", "Corona", "Quintero", "6441274963", "abelCQ@gmail.com"));
        clientes.add(new ClienteDTO("Hector", "Baez", "Luque", "6441578963", "PacoBL@gmail.com"));
        return clientes;
    }

    @Override
    public ClienteDTO agregarCliente(ClienteDTO cliente) {
        return cliente;
    }
}
