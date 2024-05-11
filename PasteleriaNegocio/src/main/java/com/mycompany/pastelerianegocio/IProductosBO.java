/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import com.mycompany.pasteleriadocumentosanidadosmapeo.IngredienteDetalleMapeo;
import com.mycompany.pasteleriadominiosMapeo.ProductoMapeo;
import dto.DTO_Ingrediente;
import dto.DTO_IngredienteDetalle;
import dto.DTO_Producto;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IProductosBO {

   public DTO_Producto agregarProducto(DTO_Producto producto);

    public List<DTO_Producto> consultarProductos();

     public DTO_Producto consultarProductoPorNombre(String nombre);
     
    public ProductoMapeo convertirDTOAProducto(DTO_Producto producto);
    public IngredienteDetalleMapeo convertirDTOAIngredienteDetalle(DTO_IngredienteDetalle ingredienteDetalle);
    public DTO_Ingrediente consultarIngredientePorNombre(String nombre);
}
