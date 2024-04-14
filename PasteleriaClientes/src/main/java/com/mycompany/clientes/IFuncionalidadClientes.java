/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.clientes;

import com.mycompany.pastelerianegocio.dtos.ClienteDTO;
import java.util.List;

public interface IFuncionalidadClientes {


    public ClienteDTO agregarCliente(ClienteDTO cliente);
    public List<ClienteDTO> consultarClientes();

}
