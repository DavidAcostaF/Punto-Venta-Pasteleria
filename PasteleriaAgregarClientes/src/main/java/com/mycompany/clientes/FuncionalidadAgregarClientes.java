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

public class FuncionalidadAgregarClientes implements IFuncionalidadAgregarClientes {

    private IClientesBO clientesBO;

    public FuncionalidadAgregarClientes() {
        this.clientesBO = new ClientesBO();
    }

    @Override
    public DTO_Cliente agregarCliente(DTO_Cliente cliente) {
        return clientesBO.agregarCliente(cliente);

    }

}
