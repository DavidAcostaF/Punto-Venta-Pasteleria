/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import conversionesnegocio.ProductosConversiones;
import com.mycompany.pasteleriadaos.IIngredienteDAO;
import com.mycompany.pasteleriadaos.IProductoDAO;
import com.mycompany.pasteleriadaos.IngredienteDAO;
import com.mycompany.pasteleriadaos.ProductoDAO;
import com.mycompany.pasteleriadocumentosanidadosmapeo.IngredienteDetalleMapeo;
import com.mycompany.pasteleriadominiodocumentosanidados.IngredienteDetalle;
import com.mycompany.pasteleriadominioentidades.Producto;
import com.mycompany.pasteleriadominiosMapeo.ProductoMapeo;
import conversionesnegocio.IngredienteConversiones;
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
    private ProductosConversiones conversor;
    private IngredienteConversiones conversorIngredientes;
    
    public ProductosBO() {
        this.productoDAO = new ProductoDAO();
        this.ingredienteDAO = new IngredienteDAO();
        this.conversor = new ProductosConversiones();
        this.conversorIngredientes = new IngredienteConversiones();
    }
    
    @Override
    public DTO_Producto agregarProducto(DTO_Producto producto) {
        Producto producoNuevo = productoDAO.agregarProducto(this.convertirDTOAProducto(producto));
        return conversor.convertirProducto(producoNuevo);
    }
    
    @Override
    public List<DTO_Producto> consultarProductos() {
        List<DTO_Producto> listaProductos = conversor.convertirListaProductos(productoDAO.consultarProductos());
        return listaProductos;
    }
    
    @Override
    public DTO_Producto consultarProductoPorNombre(String nombre) {
        return conversor.convertirProducto(productoDAO.consultarPorNombre(nombre));
    }
    
    @Override
    public ProductoMapeo convertirDTOAProductoMapeo(DTO_Producto producto) {
        ProductoMapeo productoNuevo = new ProductoMapeo();
        productoNuevo.setDescripcion(producto.getDescripcion());
        
        productoNuevo.setNombre(producto.getNombre());
        productoNuevo.setPrecio(producto.getPrecio());
        
        for (DTO_IngredienteDetalle ingredienteDetalle : producto.getIngredientes()) {
            productoNuevo.addIngredienteDetalle(convertirDTOAIngredienteDetalleMapeo(ingredienteDetalle));
        }
        return productoNuevo;
    }
    
    @Override
    public IngredienteDetalleMapeo convertirDTOAIngredienteDetalleMapeo(DTO_IngredienteDetalle ingredienteDetalle) {
        IngredienteDetalleMapeo ingredienteDetalleNuevo = new IngredienteDetalleMapeo();
        ingredienteDetalleNuevo.setCantidad(ingredienteDetalle.getCantidad());
        ingredienteDetalleNuevo.setNombre(ingredienteDetalle.getNombre());
        //ingredienteDetalleNuevo.setIngredienteId(ingredienteDetalle.getIngredienteId());
        return ingredienteDetalleNuevo;
    }
    
    @Override
    public DTO_Ingrediente consultarIngredientePorNombre(String nombre) {
        return conversorIngredientes.convertir(ingredienteDAO.consultarPorNombre(nombre));
    }
    
    @Override
    public Producto convertirDTOAProducto(DTO_Producto producto) {
        Producto productoNuevo = new Producto();
        productoNuevo.setDescripcion(producto.getDescripcion());
        
        productoNuevo.setNombre(producto.getNombre());
        productoNuevo.setPrecio(producto.getPrecio());
        
        for (DTO_IngredienteDetalle ingredienteDetalle : producto.getIngredientes()) {
            ingredienteDetalle.setIngredienteId(consultarIngredientePorNombre(ingredienteDetalle.getNombre()).getId());
            productoNuevo.addIngredienteDetalle(convertirDTOAIngredienteDetalle(ingredienteDetalle));
        }
        return productoNuevo;
    }
    
    @Override
    public IngredienteDetalle convertirDTOAIngredienteDetalle(DTO_IngredienteDetalle ingredienteDetalle) {
        IngredienteDetalle ingredienteDetalleNuevo = new IngredienteDetalle();
        ingredienteDetalleNuevo.setCantidad(ingredienteDetalle.getCantidad());
        ingredienteDetalleNuevo.setNombre(ingredienteDetalle.getNombre());
        ingredienteDetalleNuevo.setIngredienteId(ingredienteDetalle.getIngredienteId());
        return ingredienteDetalleNuevo;
    }
    
}
