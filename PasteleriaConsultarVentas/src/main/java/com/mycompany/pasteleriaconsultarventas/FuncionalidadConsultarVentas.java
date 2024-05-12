/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaconsultarventas;

import com.mycompany.pastelerianegocio.IVentasBO;
import com.mycompany.pastelerianegocio.VentasBO;
import dto.DTO_Producto;
import dto.DTO_Venta;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author abelc
 */
public class FuncionalidadConsultarVentas implements IFuncionalidadConsultarVentas {

    private IVentasBO ventasbo;

    public FuncionalidadConsultarVentas() {
        ventasbo = new VentasBO();
    }

    @Override
    public List<DTO_Venta> consultarVentas() {
        return ventasbo.consultarVentas();
    }

    @Override
    public DTO_Venta encontrarVenta(String idVenta) {
        return ventasbo.encontrarVenta(idVenta);
    }

    @Override
    public List<DTO_Venta> ventasPorCliente(String clienteId) {
        return ventasbo.ventasPorCliente(clienteId);
    }

    @Override
    public List<DTO_Venta> consultarVentasPorProductos(List<DTO_Producto> listaProductos) {
        return ventasbo.consultarVentasPorProductos(listaProductos);
    }

    @Override
    public List<DTO_Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin) {
        return ventasbo.consultarVentasPorRangoFecha(fechaInicio, fechaFin);
    }

    @Override
    public List<DTO_Venta> consultarVentasConFiltros(String clienteId, Date fechaInicio, Date fechaFin, List<DTO_Producto> listaProductos) {
        return ventasbo.consultarVentasConFiltros(clienteId, fechaInicio, fechaFin, listaProductos);
    }

    @Override
    public List<DTO_Venta> consultarVentasPorFecha(Date fecha) {
        Calendar calInicio = Calendar.getInstance();
        calInicio.setTime(fecha);
        calInicio.set(Calendar.HOUR_OF_DAY, 0);
        calInicio.set(Calendar.MINUTE, 0);
        calInicio.set(Calendar.SECOND, 0);
        calInicio.set(Calendar.MILLISECOND, 0);

        Calendar calFin = Calendar.getInstance();
        calFin.setTime(fecha);
        calFin.set(Calendar.HOUR_OF_DAY, 23);
        calFin.set(Calendar.MINUTE, 59);
        calFin.set(Calendar.SECOND, 59);
        calFin.set(Calendar.MILLISECOND, 999);

        Date fechaInicio = calInicio.getTime();
        Date fechaFin = calFin.getTime();
        return ventasbo.consultarVentasPorRangoFecha(fechaInicio, fechaFin);
    }
}
