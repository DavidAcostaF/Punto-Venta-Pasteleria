/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaactualizarproducto;

import com.mycompany.pastelerianegocio.IProductosBO;
import com.mycompany.pastelerianegocio.ProductosBO;
import dto.DTO_Producto;

/**
 *
 * @author af_da
 */
public class FuncionalidadActualizarProducto implements IFuncionalidadActualizarProducto {

    private IProductosBO productosBO;

    public FuncionalidadActualizarProducto() {
        productosBO = new ProductosBO();
    }

    @Override
    public DTO_Producto actualizarProducto(DTO_Producto producto) {
        return productosBO.actualizarProducto(producto);
    }

}
