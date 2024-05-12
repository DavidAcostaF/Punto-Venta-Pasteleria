/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaeliminarproducto;

import com.mycompany.pastelerianegocio.IProductosBO;
import com.mycompany.pastelerianegocio.ProductosBO;
import dto.DTO_Producto;

/**
 *
 * @author af_da
 */
public class FuncionalidadEliminarProducto implements IFuncionalidadEliminarProducto {

    private IProductosBO productoBO;

    public FuncionalidadEliminarProducto() {
        this.productoBO = new ProductosBO();
    }

    @Override
    public boolean eliminarProducto(DTO_Producto producto) {
        return productoBO.eliminarProducto(producto);
    }

}
