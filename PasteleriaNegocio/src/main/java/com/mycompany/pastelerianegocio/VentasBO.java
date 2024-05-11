/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import conversionesnegocio.ProductosConversiones;
import conversionesnegocio.VentasConversiones;
import Excepciones.ConsultarVentasPorFechaException;
import Exceptions.PersistenciaException;
import com.mycompany.pasteleriadaos.IVentaDAO;
import com.mycompany.pasteleriadaos.VentaDAO;
import com.mycompany.pasteleriadominioentidades.Producto;
import dto.DTO_Producto;
import dto.DTO_Venta;
import java.util.Date;
import java.util.List;

/**
 *
 * @author f_aco
 */
public class VentasBO implements IVentasBO {

    private IVentaDAO ventaDAO;
    private VentasConversiones conversor;
    private ProductosConversiones conversorp;

    public VentasBO() {
        this.ventaDAO = new VentaDAO();
        this.conversor = new VentasConversiones();
        this.conversorp = new ProductosConversiones();
    }

    @Override
    public void agregarVenta(DTO_Venta venta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DTO_Venta> consultarVentasPorRangoFecha(Date fechaInicio, Date fechaFin) {
        try {
            return conversor.convertirListaADTO(ventaDAO.consultarVentasPorRangoFechas(fechaInicio, fechaFin));
        } catch (PersistenciaException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> consultarVentas() {
        try {
            return conversor.convertirListaADTO(ventaDAO.consultarVentas());
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public DTO_Venta encontrarVenta(String idVenta) {
        try {
            return conversor.convertirADTO(ventaDAO.encontrarVenta(idVenta));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> ventasPorCliente(String clienteId) {
        try {
            return conversor.convertirListaADTO(ventaDAO.ventasPorCliente(clienteId));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> consultarVentasPorProductos(List<DTO_Producto> listaProductos) {
        try {
            List<Producto> productos = conversorp.convertirListaProductosEntidad(listaProductos);
            return conversor.convertirListaADTO(ventaDAO.consultarVentasPorProductos(productos));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin) {
        try {
            return conversor.convertirListaADTO(ventaDAO.consultarVentasPorRangoFechas(fechaInicio, fechaFin));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> consultarVentasConFiltros(String clienteId, Date fechaInicio, Date fechaFin, List<DTO_Producto> listaProductos) {
        try {
            List<Producto> productos = conversorp.convertirListaProductosEntidad(listaProductos);
            return conversor.convertirListaADTO(ventaDAO.consultarVentasConFiltros(clienteId, fechaInicio, fechaFin, productos));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> consultarVentasPorFecha(Date fecha) throws ConsultarVentasPorFechaException {
        try {
            return conversor.convertirListaADTO(ventaDAO.consultarVentasPorFecha(fecha));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

}
