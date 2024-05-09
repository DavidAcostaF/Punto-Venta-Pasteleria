/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mycompany.pasteleriadominios.Cliente;
import dto.DTO_Cliente;
import java.util.List;

/**
 *
 * @author f_aco
 */
public interface IClienteDAO {
    public Cliente agregarCliente(Cliente cliente);
    
    
    public List<DTO_Cliente> consultarClientes();
}
