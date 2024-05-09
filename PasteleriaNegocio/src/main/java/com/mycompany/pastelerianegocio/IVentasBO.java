/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import com.mycompany.pasteleriadominios.Cliente;
import dto.DTO_Cliente;
import dto.DTO_Direccion;
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

    public List<DTO_Venta> consultarVentasPorFecha(Date fecha);
    
    public List<DTO_Venta> consultarVentasPorRangoFecha(Date fechaInicio, Date fechaFin);

}
