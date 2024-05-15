/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientes;

import com.mycompany.pastelerianegocio.ClientesBO;
import com.mycompany.pastelerianegocio.IClientesBO;
import com.mycompany.pastelerianegocio.IVentasBO;
import com.mycompany.pastelerianegocio.VentasBO;
import dto.DTO_Cliente;

//Esta clase funciona de que se manda la informacion al negocio o se obtiene mediante dtos y el negocio se encargara de devolver la info o mandarlas a las daos de ser necesarias
public class FuncionalidadAgregarClientes implements IFuncionalidadAgregarClientes {
    //esta clase tendra todas las operaciones del cliente necesarias

    private IClientesBO clientesBO;

    public FuncionalidadAgregarClientes() {
        this.clientesBO = new ClientesBO();
    }

    @Override
    public DTO_Cliente agregarCliente(DTO_Cliente cliente) {
        return clientesBO.agregarCliente(cliente);

    }

}
