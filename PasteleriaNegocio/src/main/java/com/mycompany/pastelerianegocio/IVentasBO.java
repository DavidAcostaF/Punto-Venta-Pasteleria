/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import com.mycompany.pasteleriadominios.Cliente;
import dto.DTO_Cliente;
import dto.DTO_Direccion;
import dto.DTO_Producto;
import java.util.List;

/**
 *
 * @author f_aco
 */
public interface IVentasBO {
    // En esta clase iran todos los metodos encargados de para agregar una venta 
    public List<DTO_Cliente> consultarClientes();
    public void agregarClientes(List<DTO_Cliente> clientes); 
    public List<DTO_Producto> consultarProductos();
    
    public void agregarDirecciones(List<DTO_Direccion> direcciones);
    
    public List<DTO_Direccion>consultarDirecciones();
}
