/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mycompany.pasteleriadominios.Cliente;
import com.mycompany.pasteleriadominios.Venta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author f_aco
 */
public class VentaDAO implements IVentaDAO {
    List<Venta> listaVentas;
    
     public VentaDAO() {
        this.listaVentas = new ArrayList<>();
    }

    @Override
    public Venta agregarVenta(Venta venta) {
        this.listaVentas.add(venta); 
        return venta;
    }

    @Override
    public void eliminarCliente(Venta venta) {
        this.listaVentas.remove(venta);
    }
    
}
