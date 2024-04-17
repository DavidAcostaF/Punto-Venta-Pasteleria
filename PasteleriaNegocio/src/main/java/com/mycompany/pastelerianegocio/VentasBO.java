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
    public void agregarCliente(DTO_Cliente clienteDTO) {

        Cliente cliente = new Cliente(
                clienteDTO.getNombre(),
                clienteDTO.getApellidoP(),
                clienteDTO.getApellidoM(),
                clienteDTO.getTelefono(),
                clienteDTO.getCorreo());
        clienteDAO.agregarCliente(cliente);
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

    @Override
    public void agregarDirecciones(List<DTO_Direccion> direcciones) {
        List<DTO_Direccion> listaDireccionesDTO = direcciones;

        for (DTO_Direccion direccionDTO : listaDireccionesDTO) {
            Cliente cliente = new Cliente(
                    direccionDTO.getCliente().getNombre(),
                    direccionDTO.getCliente().getApellidoP(),
                    direccionDTO.getCliente().getApellidoM(),
                    direccionDTO.getCliente().getTelefono(),
                    direccionDTO.getCliente().getCorreo());

            Direccion direccion = new Direccion(
                    direccionDTO.getCalle(),
                    direccionDTO.getColonia(),
                    direccionDTO.getNumExterior(),
                    cliente);

            this.direccionDAO.agregarDireccion(direccion);
        }
    }

    @Override
    public List<DTO_Direccion> consultarDirecciones() {
        List<Direccion> listaDirecciones = this.direccionDAO.consultarDirecciones();
        List<DTO_Direccion> listaDireccionesDTO = new ArrayList<>();
        for (Direccion direccion : listaDirecciones) {
            DTO_Cliente clienteDTO = new DTO_Cliente(direccion.getCliente().getNombre(),
                    direccion.getCliente().getApellidoP(),
                    direccion.getCliente().getApellidoM(),
                    direccion.getCliente().getTelefono(),
                    direccion.getCliente().getCorreo());
            DTO_Direccion direccionDTO = new DTO_Direccion(
                    direccion.getCalle(),
                    direccion.getColonia(),
                    direccion.getNumExterior(),
                    clienteDTO);
            listaDireccionesDTO.add(direccionDTO);
        }
        return listaDireccionesDTO;
    }

    @Override
    public void agregarVenta(DTO_Venta ventaDTO) {
        Venta venta = new Venta();
        Cliente cliente = new Cliente(
                ventaDTO.getCliente().getNombre(),
                ventaDTO.getCliente().getApellidoP(),
                ventaDTO.getCliente().getApellidoM(),
                ventaDTO.getCliente().getTelefono()
        );
        venta.setCliente(cliente);
        venta.setFechaEntrega(ventaDTO.getFechaEntrega());
        venta.setMontoTotal(ventaDTO.getMontoTotal());
        List<DTO_DetalleVenta> detallesVenta = ventaDTO.getDetallesVenta();
        List<DetalleVenta> detalleVentaLista = new ArrayList<>();
        for (DTO_DetalleVenta dv : detallesVenta) {
            DetalleVenta detalleVenta = new DetalleVenta();
            detalleVenta.setCantidad(dv.getCantidad());
            detalleVenta.setImporte(dv.getImporte());

        }
    }
}
