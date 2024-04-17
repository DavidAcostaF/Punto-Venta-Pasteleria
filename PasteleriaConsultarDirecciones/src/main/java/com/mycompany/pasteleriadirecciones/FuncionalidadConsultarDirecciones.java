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

public class FuncionalidadConsultarDirecciones implements IFuncionalidadConsultarDirecciones {
        //esta clase tendra todas las operaciones de direcciones necesarias 
    private OperacionesDirecciones operacionesDirecciones;

    public FuncionalidadConsultarDirecciones() {
        operacionesDirecciones = new OperacionesDirecciones();
    }

    //TODO: Aqui debe de llamar a los clientes desde la clase negocio
   
    @Override
    public List<DTO_Direccion> consultarDirecciones() {
        return this.operacionesDirecciones.consultarDirecciones();
    }
    
}
