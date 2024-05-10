/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import com.mycompany.pasteleriadaos.IIngredienteDAO;
import com.mycompany.pasteleriadaos.IProductoDAO;
import com.mycompany.pasteleriadaos.IngredienteDAO;
import com.mycompany.pasteleriadaos.ProductoDAO;
import com.mycompany.pasteleriadocumentosanidados.IngredienteDetalle;
import com.mycompany.pasteleriadominios.Producto;
import dto.DTO_Ingrediente;
import dto.DTO_IngredienteDetalle;
import dto.DTO_Producto;
import java.util.List;

/**
 *
 * @author PC
 */
public class ProductosBO implements IProductosBO {

    private IProductoDAO productoDAO;
    private IIngredienteDAO ingredienteDAO;

    public ProductosBO() {
        this.productoDAO = new ProductoDAO();
        ingredienteDAO = new IngredienteDAO();
    }

    @Override
    public DTO_Producto agregarProducto(DTO_Producto producto) {
        DTO_Producto producoNuevo = productoDAO.agregarProducto(this.convertirDTOAProducto(producto));
        return producoNuevo;
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

    @Override
    public Producto convertirDTOAProducto(DTO_Producto producto) {
        Producto productoNuevo = new Producto();
        productoNuevo.setDescripcion(producto.getDescripcion());

        productoNuevo.setNombre(producto.getNombre());
        productoNuevo.setPrecio(producto.getPrecio());

        for (DTO_IngredienteDetalle ingredienteDetalle : producto.getIngredientes()) {
            productoNuevo.addIngredienteDetalle(convertirDTOAIngredienteDetalle(ingredienteDetalle));
        }
        return productoNuevo;
    }

    @Override
    public IngredienteDetalle convertirDTOAIngredienteDetalle(DTO_IngredienteDetalle ingredienteDetalle) {
        IngredienteDetalle ingredienteDetalleNuevo = new IngredienteDetalle();
        ingredienteDetalleNuevo.setCantidad(ingredienteDetalle.getCantidad());
        ingredienteDetalleNuevo.setNombre(ingredienteDetalle.getNombre());
        return ingredienteDetalleNuevo;
    }

    @Override
    public DTO_Ingrediente consultarIngredientePorNombre(String nombre) {
        return ingredienteDAO.consultarPorNombre(nombre);
    }

}
