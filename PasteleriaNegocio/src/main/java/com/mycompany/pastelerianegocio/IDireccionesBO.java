/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import dto.DTO_Direccion;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IDireccionesBO {

    public void agregarDirecciones(List<DTO_Direccion> direcciones);

    public List<DTO_Direccion> consultarDirecciones();
}
