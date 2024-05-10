/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import Exceptions.PersistenciaException;
import com.mycompany.pasteleriadominios.Venta;
import dto.DTO_Producto;
import dto.DTO_Venta;
import java.util.Date;
import java.util.List;

/**
 *
 * @author f_aco
 */
public interface IVentaDAO {

    public Venta agregarVenta(Venta venta) throws PersistenciaException;

    public void eliminarVenta(Venta venta) throws PersistenciaException;

    public List<DTO_Venta> consultarVentas() throws PersistenciaException;

    public List<DTO_Venta> ventasPorCliente(String clienteId) throws PersistenciaException;

    public List<DTO_Venta> consultarVentasPorFecha(Date fecha) throws PersistenciaException;

    public List<DTO_Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin) throws PersistenciaException;

    public DTO_Venta encontrarVenta(String idVenta)throws PersistenciaException;
    
    public List<DTO_Venta> consultarVentasPorProductos(List<DTO_Producto> listaProductos)throws PersistenciaException;
}
