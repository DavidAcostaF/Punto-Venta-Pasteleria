/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mycompany.pasteleriadominioentidades.Producto;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IProductoDAO {
   /* public DTO_Producto agregarProducto(ProductoMapeo producto);
    
    public void eliminarProducto(ProductoMapeo producto);*/
    
    public List<Producto> consultarProductos();
    
    public Producto consultarPorNombre(String nombre);
}
