/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriagenerarreporte;

import dto.DTO_FacturaFormato;
import dto.DTO_GenerarReporte;
import dto.DTO_ReciboFormato;
import dto.DTO_ReporteIngresosFormato;
import dto.DTO_ReporteVentasFormato;
import dto.DTO_Venta;
import java.util.List;

/**
 *
 * @author abelc
 */
public interface IFuncionalidadGenerarReporte {
    
    public DTO_GenerarReporte generarReporteVentasCasoHistoriales(List<DTO_ReporteVentasFormato> listaVentas);
    
    public DTO_GenerarReporte generarRecibo(DTO_ReciboFormato reciboFormato);
    
    public DTO_GenerarReporte generarReporteIngresosMensuales(DTO_ReporteIngresosFormato ingresosFormato);
    
    public DTO_GenerarReporte generarReporteFactura (DTO_FacturaFormato formatoFactura);
}
