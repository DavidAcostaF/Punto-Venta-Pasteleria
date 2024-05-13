/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mycompany.pasteleriadominioentidades.Producto;
import com.mycompany.pasteleriadominiosMapeo.ProductoMapeo;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IProductoDAO {

    public Producto agregarProducto(Producto producto);

    public Producto actualizar(Producto producto);

    public boolean eliminarProducto(ProductoMapeo producto);

    public List<Producto> consultarProductos();

    public Producto consultarPorNombre(String nombre);

    public List<Producto> consultarProductosCoincidentes(String nombre);

}
