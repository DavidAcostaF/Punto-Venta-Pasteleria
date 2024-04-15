/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mycompany.pasteleriadominios.DetalleVenta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class DetalleVentaDAO implements IDetalleVentaDAO {

    List<DetalleVenta> listaDetalleVenta;

    public DetalleVentaDAO() {
        this.listaDetalleVenta = new ArrayList<>();
    }

    @Override
    public DetalleVenta agregrarDetalleVenta(DetalleVenta detalleVenta) {
        this.listaDetalleVenta.add(detalleVenta);
        return detalleVenta;
    }

    @Override
    public void eliminarDetalleVenta(DetalleVenta detalleVenta) {
        this.listaDetalleVenta.remove(detalleVenta);
    }

}
