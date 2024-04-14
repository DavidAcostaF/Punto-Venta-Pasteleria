/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientes;

import com.mycompany.pastelerianegocio.dtos.ClienteDTO;
import java.util.ArrayList;
import java.util.List;

public class FuncionalidadClientes implements IFuncionalidadClientes{

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
