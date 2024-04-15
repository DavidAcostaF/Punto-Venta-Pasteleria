/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import com.mycompany.pasteleriadaos.ClienteDAO;
import com.mycompany.pasteleriadaos.IClienteDAO;
import com.mycompany.pasteleriadaos.IProductoDAO;
import com.mycompany.pasteleriadaos.ProductoDAO;
import com.mycompany.pasteleriadominios.Cliente;
import com.mycompany.pasteleriadominios.Producto;
import dto.DTO_Cliente;
import dto.DTO_Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author f_aco
 */
public class VentasBO implements IVentasBO {


    private IClienteDAO clienteDAO;
    private IProductoDAO productoDAO;

    public VentasBO() {
        this.clienteDAO = new ClienteDAO();
        this.productoDAO = new ProductoDAO();
    }



    @Override
    public List<DTO_Cliente> consultarClientes() {
        List<Cliente> listaClientes = clienteDAO.consultarClientes();
        List<DTO_Cliente> listaClientesDTO = new ArrayList<>();

        for (Cliente cliente : listaClientes) {
            DTO_Cliente clienteDTO = new DTO_Cliente(
                    cliente.getNombre(),
                    cliente.getApellidoP(),
                    cliente.getApellidoM(),
                    cliente.getTelefono(),
                    cliente.getCorreo());

            listaClientesDTO.add(clienteDTO);
        }
        return listaClientesDTO;

    }
    // En esta clase iran todos los metodos encargados de para agregar una venta 

    @Override
    public void agregarClientes(List<DTO_Cliente> clientes) {
        List<DTO_Cliente> listaClientesDTO = clientes;

        for (DTO_Cliente clienteDTO : listaClientesDTO) {
            Cliente cliente = new Cliente(
                    clienteDTO.getNombre(),
                    clienteDTO.getApellidoP(),
                    clienteDTO.getApellidoM(),
                    clienteDTO.getTelefono(),
                    clienteDTO.getCorreo());

            this.clienteDAO.agregarCliente(cliente);
        }

    }


    @Override
    public List<DTO_Producto> consultarProductos() {
        List<Producto> listaProductos = productoDAO.consultarProductos();
        List<DTO_Producto> listaProductoDTO = new ArrayList<>();
        for (Producto producto : listaProductos) {
            DTO_Producto productoDTO = new DTO_Producto(
                    producto.getPrecio(),
                    producto.getNombre(),
                    producto.getDescripcion(),
                    producto.getTamaño());
            listaProductoDTO.add(productoDTO);
        }
        return listaProductoDTO;
    }


}
