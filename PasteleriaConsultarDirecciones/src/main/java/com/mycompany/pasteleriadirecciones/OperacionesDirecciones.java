/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadirecciones;

import com.mycompany.pastelerianegocio.IVentasBO;
import com.mycompany.pastelerianegocio.VentasBO;
import dto.DTO_Cliente;
import dto.DTO_Direccion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class OperacionesDirecciones {
    private IVentasBO ventaBO;
    
    public OperacionesDirecciones() {
        this.ventaBO = new VentasBO();
    }

    
    protected List<DTO_Direccion> consultarDirecciones(){
        List<DTO_Direccion> direcciones;
        
        direcciones=ventaBO.consultarDirecciones();
        
        return direcciones;
    }
}
