/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import Exceptions.PersistenciaException;
import com.mycompany.pasteleriadaos.FacturaDAO;
import com.mycompany.pasteleriadaos.IFacturaDAO;
import com.mycompany.pasteleriadominioentidades.Factura;
import com.mycompany.pasteleriadominioentidades.Venta;
import conversionesnegocio.FacturasConversiones;
import conversionesnegocio.VentasConversiones;
import dto.DTO_Factura;
import dto.DTO_Venta;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PERSONAL
 */
public class GestorFacturasBO implements IGestorFacturasBO {

    FacturasConversiones conversor;
    IFacturaDAO facturaDAO;
    VentasConversiones conversorVentas;

    public GestorFacturasBO() {
        conversor = new FacturasConversiones();
        facturaDAO = new FacturaDAO();
        conversorVentas = new VentasConversiones();
    }

    @Override
    public DTO_Factura guardarFactura(DTO_Factura factura) {
        Factura facturaConv = conversor.facturaDtoAEntidad(factura);
        Factura facturaNueva;
        try {

            facturaNueva = facturaDAO.guardarFactura(facturaConv);
            return conversor.facturaEntidadADto(facturaNueva);
        } catch (PersistenciaException e) {
            Logger.getLogger(GestorFacturasBO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    @Override
    public List<DTO_Factura> consultarFacturas() {
        List<DTO_Factura> facturas;
        try {
            facturas = conversor.listaFacturasADto(facturaDAO.consultarFacturas());
            return facturas;
        } catch (PersistenciaException ex) {
            Logger.getLogger(GestorFacturasBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void eliminarFactura(DTO_Factura factura) throws PersistenciaException {
        try {
            facturaDAO.eliminarFactura(conversor.facturaDtoAEntidad(factura));
        } catch (PersistenciaException ex) {
            Logger.getLogger(GestorFacturasBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<DTO_Factura> consultarFacturasPorRangoFechas(Date desde, Date hasta) throws PersistenciaException {
        try {
            return conversor.listaFacturasADto(facturaDAO.consultarFacturasPorRangoFechas(desde, hasta));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Factura> facturasPorListaVentas(List<DTO_Venta> ventas) throws PersistenciaException {
        try {
            List<Venta> ventasEnt = conversorVentas.listaVentasDtoAEntidad(ventas);
            return conversor.listaFacturasADto(facturaDAO.facturasPorListaVentas(ventasEnt));
        } catch (PersistenciaException e) {
            Logger.getLogger(GestorFacturasBO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    @Override
    public List<DTO_Factura> consultarFacturasConFiltros(List<DTO_Venta> ventas, Date desde, Date hasta) throws PersistenciaException {
        try {
            List<Venta> ventasEnt = conversorVentas.listaVentasDtoAEntidad(ventas);
            return conversor.listaFacturasADto(facturaDAO.consultarFacturasConFiltros(ventasEnt, desde, hasta));
        } catch (PersistenciaException e) {
            Logger.getLogger(GestorFacturasBO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

}
