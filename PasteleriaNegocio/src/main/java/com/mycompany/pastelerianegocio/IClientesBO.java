/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pastelerianegocio;


import dto.DTO_Cliente;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IClientesBO {

    public List<DTO_Cliente> consultarClientes();

    public void agregarCliente(DTO_Cliente clientes);
    
    public DTO_Cliente encontrarCliente(String apellidoPaterno, String apellidoMaterno, String nombres, String telefono);
    
    public DTO_Cliente encontrarClienteID(String idCliente);
}
