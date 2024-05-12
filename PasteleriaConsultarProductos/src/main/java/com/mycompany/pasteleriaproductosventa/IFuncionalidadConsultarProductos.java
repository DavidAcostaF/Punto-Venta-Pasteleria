/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriaproductosventa;

import dto.DTO_Producto;
import dto.DTO_Venta;
import java.util.List;

/**
 *
 * @author f_aco
 */
public interface IFuncionalidadConsultarProductos {

    public List<DTO_Producto> consultarProductos();

   public DTO_Producto consultarProductoPorNombre(String nombre);
   
  
}
