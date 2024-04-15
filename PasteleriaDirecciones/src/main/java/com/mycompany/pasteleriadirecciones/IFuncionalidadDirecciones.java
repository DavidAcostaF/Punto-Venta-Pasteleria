/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadirecciones;

import dto.DTO_Direccion;
import java.util.List;

/**
 *
 * @author f_aco
 */
public interface IFuncionalidadDirecciones {
    public DTO_Direccion agregarDireccion (DTO_Direccion direccion);
    public List<DTO_Direccion> consultarDirecciones();

}
