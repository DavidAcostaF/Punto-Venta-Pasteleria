/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import Excepciones.ConsultarVentasPorFechaException;
import dto.DTO_Ingrediente;
import dto.DTO_IngredienteDetalle;
import dto.DTO_Producto;
import dto.DTO_Venta;
import java.util.Date;
import java.util.List;

/**
 *
 * @author f_aco
 */
public interface IVentasBO {

    // En esta clase iran todos los metodos encargados de para agregar una venta 
    public void agregarVenta(DTO_Venta venta);

    public List<DTO_Venta> consultarVentasPorRangoFecha(Date fechaInicio, Date fechaFin);

    public List<DTO_Venta> consultarVentas();

    public DTO_Venta encontrarVenta(String idVenta);

    public List<DTO_Venta> ventasPorCliente(String clienteId);

    public List<DTO_Venta> consultarVentasPorProductos(List<DTO_Producto> listaProductos);

    public List<DTO_Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin);

    public List<DTO_Venta> consultarVentasConFiltros(String clienteId, Date fechaInicio, Date fechaFin, List<DTO_Producto> listaProductos);

    public List<DTO_Venta> consultarVentasPorFecha(Date fecha) throws ConsultarVentasPorFechaException;

    public boolean consultarExistenciaIngredientesStock(DTO_Producto producto);

    public Float calcularCantidadIngrediente(DTO_IngredienteDetalle ingredienteDetalle,String tamanio);
}
