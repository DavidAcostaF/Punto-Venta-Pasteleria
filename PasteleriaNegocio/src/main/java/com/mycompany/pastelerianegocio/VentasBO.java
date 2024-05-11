/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import Excepciones.ConsultarVentasPorFechaException;
import Exceptions.PersistenciaException;
import com.mycompany.pasteleriadaos.ClienteDAO;
import com.mycompany.pasteleriadaos.DireccionDAO;
import com.mycompany.pasteleriadaos.IClienteDAO;
import com.mycompany.pasteleriadaos.IDireccionDAO;
import com.mycompany.pasteleriadaos.IProductoDAO;
import com.mycompany.pasteleriadaos.IVentaDAO;
import com.mycompany.pasteleriadaos.ProductoDAO;
import com.mycompany.pasteleriadaos.VentaDAO;
import dto.DTO_Producto;

import dto.DTO_Venta;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author f_aco
 */
public class VentasBO implements IVentasBO {

    private IVentaDAO ventaDAO;

    public VentasBO() {
        this.ventaDAO = new VentaDAO();
    }

    @Override
    public void agregarVenta(DTO_Venta venta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DTO_Venta> consultarVentasPorFecha(Date fecha) {
        try {
            return ventaDAO.consultarVentasPorFecha(fecha);
        } catch (PersistenciaException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    @Override
    public List<DTO_Venta> consultarVentasPorRangoFecha(Date fechaInicio, Date fechaFin) {
        try {
            return ventaDAO.consultarVentasPorRangoFechas(fechaInicio, fechaFin);
        } catch (PersistenciaException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> consultarVentas() {
        try {
            return ventaDAO.consultarVentas();
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public DTO_Venta encontrarVenta(String idVenta) {
        try {
            return ventaDAO.encontrarVenta(idVenta);
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> ventasPorCliente(String clienteId) {
        try {
            return ventaDAO.ventasPorCliente(clienteId);
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> consultarVentasPorProductos(List<DTO_Producto> listaProductos) {
        try {
            return ventaDAO.consultarVentasPorProductos(listaProductos);
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin) {
        try {
            return ventaDAO.consultarVentasPorRangoFechas(fechaInicio, fechaFin);
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> consultarVentasConFiltros(String clienteId, Date fechaInicio, Date fechaFin, List<DTO_Producto> listaProductos) {
        try {
            return ventaDAO.consultarVentasConFiltros(clienteId, fechaInicio, fechaFin, listaProductos);
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

}
