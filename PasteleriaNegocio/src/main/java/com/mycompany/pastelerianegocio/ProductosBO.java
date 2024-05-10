/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import com.mycompany.pasteleriadaos.IProductoDAO;
import com.mycompany.pasteleriadaos.ProductoDAO;
import dto.DTO_Producto;
import java.util.List;

/**
 *
 * @author PC
 */
public class ProductosBO implements IProductosBO {

    private IProductoDAO productoDAO;

    public ProductosBO() {
        this.productoDAO = new ProductoDAO();

    }

    @Override
    public List<DTO_Producto> consultarProductos() {
        List<DTO_Producto> listaProductos = productoDAO.consultarProductos();
        return listaProductos;
    }

    @Override
    public DTO_Producto consultarProductoId(String idProducto) {
        return productoDAO.consultarProductoId(idProducto);
    }
    
      
}
