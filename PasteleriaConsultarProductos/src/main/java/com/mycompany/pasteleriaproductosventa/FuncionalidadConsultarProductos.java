/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaproductosventa;

import com.mycompany.pastelerianegocio.IProductosBO;
import com.mycompany.pastelerianegocio.ProductosBO;
import dto.DTO_Producto;
import java.util.List;

public class FuncionalidadConsultarProductos implements IFuncionalidadConsultarProductos {

    private IProductosBO productoBO;

    public FuncionalidadConsultarProductos() {
        this.productoBO = new ProductosBO();
    }

    @Override
    public List<DTO_Producto> consultarProductos() {
        List<DTO_Producto> pasteles = productoBO.consultarProductos();
        return pasteles;
    }

    @Override
    public DTO_Producto consultarProductoPorNombre(String nombre) {
        return productoBO.consultarProductoPorNombre(nombre);
    }

    @Override
    public List<DTO_Producto> consultarProductosCoincidentes(String nombre) {
        return productoBO.consultarProductosCoincidentes(nombre);

    }

    @Override
    public DTO_Producto consultarProducto(String id) {
        return productoBO.consultarProducto(id);
    }
}
