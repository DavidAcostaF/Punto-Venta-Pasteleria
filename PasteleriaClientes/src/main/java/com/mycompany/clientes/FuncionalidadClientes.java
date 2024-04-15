/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientes;

import com.mycompany.pastelerianegocio.IVentasBO;
import com.mycompany.pastelerianegocio.VentasBO;
import dto.DTO_Cliente;
import java.util.ArrayList;
import java.util.List;
//Esta clase funciona de que se manda la informacion al negocio o se obtiene mediante dtos y el negocio se encargara de devolver la info o mandarlas a las daos de ser necesarias

public class FuncionalidadClientes implements IFuncionalidadClientes{
    //esta clase tendra todas las operaciones del cliente necesarias
    
    private IVentasBO ventaBO;
    private OperacionesClientes agregarClientes;

    public FuncionalidadClientes() {
        this.ventaBO= new VentasBO();
        this.agregarClientes= new OperacionesClientes();
    }
    
    @Override
    public List<DTO_Cliente> consultarClientes() {
        List<DTO_Cliente> clientes;

        clientes = this.ventaBO.consultarClientes();

        return clientes;
    }

    @Override
    public void agregarCliente() {
        List<DTO_Cliente> clientes;
        clientes = agregarClientes.agregarClientes();
        this.ventaBO.agregarClientes(clientes);
    }
    
}
