/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriacontarventaspordia;

import com.mycompany.pastelerianegocio.IVentasBO;
import com.mycompany.pastelerianegocio.VentasBO;
import dto.DTO_Venta;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author PC
 */
public class FuncionalidadContarVentasPorDia implements IFuncionalidadContarVentasPorDia {
    private IVentasBO ventaBO;

    public FuncionalidadContarVentasPorDia() {
        this.ventaBO = new VentasBO();
    }

    @Override
    public int contarVentasPorDia(Date fecha) {
        
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

    
    List<DTO_Venta> ventasDia = ventaBO.consultarVentasPorRangoFecha(fechaInicio, fechaFin);

    
    int numeroVentas = ventasDia.size();

    return numeroVentas;
    }
    
}
