/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadirecciones;

import com.mycompany.pastelerianegocio.dtos.DireccionDTO;
import java.util.List;

/**
 *
 * @author f_aco
 */
public interface IFuncionalidadDirecciones {
    public DireccionDTO agregarDireccion (DireccionDTO direccion);
    public List<DireccionDTO> consultarDirecciones();

}
