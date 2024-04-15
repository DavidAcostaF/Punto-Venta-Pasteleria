/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadirecciones;

import dto.DTO_Direccion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author f_aco
 */
//Esta clase funciona de que se manda la informacion al negocio o se obtiene mediante dtos y el negocio se encargara de devolver la info o mandarlas a las daos de ser necesarias

public class FuncionalidadDirecciones implements IFuncionalidadDirecciones {
        //esta clase tendra todas las operaciones de direcciones necesarias 

    
    @Override
    public DTO_Direccion agregarDireccion (DTO_Direccion direccion){
        
        return direccion;
    }
    //TODO: Aqui debe de llamar a los clientes desde la clase negocio
    //ConsultarClientes cc = new ConsultarClientes();
    
    @Override
    public List<DTO_Direccion> consultarDirecciones() {
        List<DTO_Direccion> direcciones;
        direcciones = new ArrayList<>();
        //Clientes obtenidos de la clase negocio que la clase negocio los obtiene de persistencia
//        direcciones.add(new DireccionDTO("Calle 1", "Colonia A", "123", cc.consultarClientes().get(0)));
//        direcciones.add(new DireccionDTO("Calle 2", "Colonia B", "456", cc.consultarClientes().get(1)));
//        direcciones.add(new DireccionDTO("Calle 3", "Colonia C", "789", cc.consultarClientes().get(2)));
//        direcciones.add(new DireccionDTO("Calle 4", "Colonia D", "1011", cc.consultarClientes().get(3)));
        
        return direcciones;
    }
    
}
