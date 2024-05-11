/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaproductosventa;

import com.mycompany.pastelerianegocio.ClientesBO;
import com.mycompany.pastelerianegocio.IClientesBO;
import com.mycompany.pastelerianegocio.IProductosBO;
import com.mycompany.pastelerianegocio.ProductosBO;
import com.mycompany.pastelerianegocio.VentasBO;
import dto.DTO_Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author f_aco
 */
//Esta clase funciona de que se manda la informacion al negocio o se obtiene mediante dtos y el negocio se encargara de devolver la info o mandarlas a las daos de ser necesarias
public class FuncionalidadProductos implements IFuncionalidadProductos {
    //esta clase tendra todas las operaciones de ventas necesarias 

    private IProductosBO productoBO;

    public FuncionalidadProductos() {
       this.productoBO = new ProductosBO();
    }

    @Override
    public List<DTO_Producto> consultarProductosVenta() {
        List<DTO_Producto> pasteles = productoBO.consultarProductos();
        return pasteles;
    }

 

    @Override
    public DTO_Producto consultarProductoPorNombre(String nombre) {
    return productoBO.consultarProductoPorNombre(nombre);
    }
}
