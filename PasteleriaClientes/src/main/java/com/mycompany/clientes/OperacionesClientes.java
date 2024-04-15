/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientes;

import dto.DTO_Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class OperacionesClientes {
    
    protected List<DTO_Cliente> agregarClientes(){
        List<DTO_Cliente> clientes;
        
        clientes = new ArrayList<>();
        
        clientes.add(new DTO_Cliente("David", "Acosta", "Fajardo", "6441223569", "davidaf@gmail.com"));
        clientes.add(new DTO_Cliente("Jose", "Armenta", "Baca", "6441228598", "chemaab@gmail.com"));
        clientes.add(new DTO_Cliente("Abel", "Corona", "Quintero", "6441274963", "abelCQ@gmail.com"));
        clientes.add(new DTO_Cliente("Hector", "Baez", "Luque", "6441578963", "PacoBL@gmail.com"));

        return clientes;
    }
}
