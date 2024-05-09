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
import com.mycompany.pasteleriadominios.Cliente;
import com.mycompany.pasteleriadominios.DetalleVenta;
import com.mycompany.pasteleriadominios.Direccion;
import com.mycompany.pasteleriadominios.Producto;
import com.mycompany.pasteleriadominios.Venta;
import dto.DTO_Cliente;
import dto.DTO_DetalleVenta;
import dto.DTO_Direccion;
import dto.DTO_Producto;
import dto.DTO_Venta;
import java.util.AbstractList;
import java.util.ArrayList;
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

}
