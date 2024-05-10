/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mycompany.pasteleriadominios.Producto;
import dto.DTO_Producto;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IProductoDAO {
    public DTO_Producto agregarProducto(Producto producto);
    
    public void eliminarProducto(Producto producto);
    
    public List<DTO_Producto> consultarProductos();
    
    public DTO_Producto consultarProductoId(String idProducto);
}
