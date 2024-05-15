/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import Exceptions.PersistenciaException;
import com.mycompany.pasteleriadominioentidades.Producto;
import com.mycompany.pasteleriadominiosMapeo.ProductoMapeo;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IProductoDAO {

    public Producto agregarProducto(Producto producto)throws PersistenciaException;

    public Producto actualizar(Producto producto)throws PersistenciaException;

    public boolean eliminarProducto(ProductoMapeo producto)throws PersistenciaException;

    public Producto consultar(String id)throws PersistenciaException;

    public List<Producto> consultarProductos()throws PersistenciaException;

    public Producto consultarPorNombre(String nombre)throws PersistenciaException;

    public List<Producto> consultarProductosCoincidentes(String nombre)throws PersistenciaException;

}
