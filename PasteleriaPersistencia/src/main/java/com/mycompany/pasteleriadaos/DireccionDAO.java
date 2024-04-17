/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mycompany.pasteleriadominios.Direccion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author f_aco
 */
public class DireccionDAO implements IDireccionDAO {
    List<Direccion> listaDirecciones;
    
     public DireccionDAO() {
        this.listaDirecciones = new ArrayList<>();
        listaDirecciones.add(new Direccion("Machi lopez","Nose","#69"));
        listaDirecciones.add(new Direccion("Benito Juarez","Rey misterio","#619"));
        listaDirecciones.add(new Direccion("Cristiano Ronaldo","Prados","#7"));
    }

    @Override
    public Direccion agregarDireccion(Direccion direccion) {
        this.listaDirecciones.add(direccion);
        return direccion;
    }

    @Override
    public void eliminarDireccion(Direccion direccion) {
        this.listaDirecciones.remove(direccion);
    }

    @Override
    public List<Direccion> consultarDirecciones() {
        return this.listaDirecciones;
    }
    
    
}
