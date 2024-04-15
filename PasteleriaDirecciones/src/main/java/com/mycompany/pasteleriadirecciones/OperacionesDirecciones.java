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
    protected void agregarDirecciones(){
       

        List<DTO_Direccion> direcciones;
        
        direcciones = new ArrayList<>();
        

        direcciones.add(new DTO_Direccion("Calle 1", "Colonia A", "123", new DTO_Cliente("David", "Acosta", "Fajardo", "6441223569", "davidaf@gmail.com")));
        direcciones.add(new DTO_Direccion("Calle 2", "Colonia B", "456", new DTO_Cliente("Jose", "Armenta", "Baca", "6441228598", "chemaab@gmail.com")));
        direcciones.add(new DTO_Direccion("Calle 3", "Colonia C", "789", new DTO_Cliente("Abel", "Corona", "Quintero", "6441274963", "abelCQ@gmail.com")));
        direcciones.add(new DTO_Direccion("Calle 4", "Colonia D", "1011",new DTO_Cliente("Hector", "Baez", "Luque", "6441578963", "PacoBL@gmail.com")));
        
        ventaBO.agregarDirecciones(direcciones);

        
    }
    
    protected List<DTO_Direccion> consultarDirecciones(){
        List<DTO_Direccion> direcciones;
        
        direcciones=ventaBO.consultarDirecciones();
        
        return direcciones;
    }
}
