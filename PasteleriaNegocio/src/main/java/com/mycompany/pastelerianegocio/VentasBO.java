/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import com.mycompany.pasteleriadaos.ClienteDAO;
import com.mycompany.pasteleriadaos.DireccionDAO;
import com.mycompany.pasteleriadaos.IClienteDAO;
import com.mycompany.pasteleriadaos.IDireccionDAO;
import com.mycompany.pasteleriadaos.IProductoDAO;
import com.mycompany.pasteleriadaos.ProductoDAO;
import com.mycompany.pasteleriadominios.Cliente;
import com.mycompany.pasteleriadominios.DetalleVenta;
import com.mycompany.pasteleriadominios.Direccion;
import com.mycompany.pasteleriadominios.Producto;
import com.mycompany.pasteleriadominios.Venta;
import dto.DTO_Cliente;
import dto.DTO_DetalleVenta;
import dto.DTO_Direccion;
import dto.DTO_Producto;
import dto.DTO_Venta;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author f_aco
 */
public class VentasBO implements IVentasBO {

    private IClienteDAO clienteDAO;
    private IProductoDAO productoDAO;
    private IDireccionDAO direccionDAO;

    public VentasBO() {
        this.clienteDAO = new ClienteDAO();
        this.productoDAO = new ProductoDAO();
        this.direccionDAO = new DireccionDAO();
    }

    @Override
    public List<DTO_Cliente> consultarClientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarCliente(DTO_Cliente clientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DTO_Producto> consultarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarDirecciones(List<DTO_Direccion> direcciones) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DTO_Direccion> consultarDirecciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarVenta(DTO_Venta venta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}