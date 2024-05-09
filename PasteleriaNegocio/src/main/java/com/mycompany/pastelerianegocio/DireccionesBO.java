/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import com.mycompany.pasteleriadaos.DireccionDAO;
import com.mycompany.pasteleriadaos.IDireccionDAO;
import dto.DTO_Direccion;
import java.util.List;

/**
 *
 * @author PC
 */
public class DireccionesBO implements IDireccionesBO {

    private IDireccionDAO direccionDAO;

    public DireccionesBO() {
        this.direccionDAO = new DireccionDAO();

    }

    @Override
    public void agregarDirecciones(List<DTO_Direccion> direcciones) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DTO_Direccion> consultarDirecciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
