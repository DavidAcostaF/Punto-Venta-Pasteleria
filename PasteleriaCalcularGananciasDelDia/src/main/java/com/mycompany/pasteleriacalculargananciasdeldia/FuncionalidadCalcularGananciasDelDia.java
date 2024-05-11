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

        List<DTO_Venta> ventasDia = null;
        try {
            ventasDia = ventaBO.consultarVentasPorFecha(fecha);
        } catch (ConsultarVentasPorFechaException ex) {
            Logger.getLogger(FuncionalidadCalcularGananciasDelDia.class.getName()).log(Level.SEVERE, null, ex);
        }

        float ganancias = 0;
        if (ventasDia != null) {
            for (DTO_Venta venta : ventasDia) {
                ganancias += venta.getMontoTotal();
            }
        }

        return ganancias;
    }

}
