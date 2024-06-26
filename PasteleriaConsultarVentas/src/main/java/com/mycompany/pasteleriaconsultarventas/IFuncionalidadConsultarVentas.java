/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriaconsultarventas;

import dto.DTO_Producto;
import dto.DTO_Venta;
import java.util.Date;
import java.util.List;

/**
 *
 * @author abelc
 */
public interface IFuncionalidadConsultarVentas {
    public List<DTO_Venta> consultarVentas();
    public DTO_Venta encontrarVenta(String idVenta);
     public List<DTO_Venta> ventasPorCliente(String clienteId);
     public List<DTO_Venta> consultarVentasPorProductos(List<DTO_Producto> listaProductos);
     public List<DTO_Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin);
     public List<DTO_Venta> consultarVentasConFiltros(String clienteId, Date fechaInicio, Date fechaFin, List<DTO_Producto> listaProductos);
     public List<DTO_Venta> consultarVentasPorFecha(Date fechaInicio);
}
