/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import Exceptions.PersistenciaException;
import com.mycompany.pasteleriadominioentidades.Producto;
import com.mycompany.pasteleriadominioentidades.Venta;

import java.util.Date;
import java.util.List;

/**
 *
 * @author f_aco
 */
public interface IVentaDAO {

    public Venta agregarVenta(Venta venta) throws PersistenciaException;

    public void eliminarVenta(Venta venta) throws PersistenciaException;

    public List<Venta> consultarVentas() throws PersistenciaException;

    public List<Venta> ventasPorCliente(String clienteId) throws PersistenciaException;

    public List<Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin) throws PersistenciaException;

    public Venta encontrarVenta(String idVenta) throws PersistenciaException;

    public List<Venta> consultarVentasPorProductos(List<Producto> listaProductos) throws PersistenciaException;

    public List<Venta> consultarVentasConFiltros(String clienteId, Date fechaInicio, Date fechaFin, List<Producto> listaProductos) throws PersistenciaException;
}
