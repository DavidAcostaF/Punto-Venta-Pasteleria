/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriacalculargananciasdeldia;

import Excepciones.ConsultarVentasPorFechaException;
import java.util.Date;
import com.mycompany.pastelerianegocio.IVentasBO;
import com.mycompany.pastelerianegocio.VentasBO;
import dto.DTO_Venta;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class FuncionalidadCalcularGananciasDelDia implements IFuncionalidadCalcularGananciasDelDia {

    private IVentasBO ventaBO;

    public FuncionalidadCalcularGananciasDelDia() {
        this.ventaBO = new VentasBO();
    }

    @Override
    public float CalcularGananciasDelDia(Date fecha) {

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

        float ganancias = 0;

        for (DTO_Venta venta : ventasDia) {
            ganancias += venta.getMontoTotal();
        }

        return ganancias;
    }

}
