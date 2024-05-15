/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import conversionesnegocio.ProductosConversiones;
import conversionesnegocio.VentasConversiones;
import Excepciones.ConsultarVentasPorFechaException;
import Exceptions.PersistenciaException;
import com.mycompany.pasteleriadaos.IIngredienteDAO;
import com.mycompany.pasteleriadaos.IVentaDAO;
import com.mycompany.pasteleriadaos.IngredienteDAO;
import com.mycompany.pasteleriadaos.VentaDAO;
import com.mycompany.pasteleriadominioentidades.Ingrediente;
import com.mycompany.pasteleriadominioentidades.Producto;
import dto.DTO_Ingrediente;
import dto.DTO_IngredienteDetalle;
import dto.DTO_Producto;
import dto.DTO_Venta;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author f_aco
 */
public class VentasBO implements IVentasBO {

    private IVentaDAO ventaDAO;
    private VentasConversiones conversor;
    private ProductosConversiones conversorp;
    private IIngredienteDAO ingredientesDAO;

    public VentasBO() {
        this.ventaDAO = new VentaDAO();
        this.conversor = new VentasConversiones();
        this.conversorp = new ProductosConversiones();
        ingredientesDAO = new IngredienteDAO();
    }

    @Override
    public void agregarVenta(DTO_Venta venta) {
        System.out.println("hola id bo" + venta.getIDcliente());
        try {
            ventaDAO.agregarVenta(conversor.convertirDTOAgregar(venta));
        } catch (PersistenciaException ex) {
            Logger.getLogger(VentasBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<DTO_Venta> consultarVentasPorRangoFecha(Date fechaInicio, Date fechaFin) {
        try {
            return conversor.convertirListaADTO(ventaDAO.consultarVentasPorRangoFechas(fechaInicio, fechaFin));
        } catch (PersistenciaException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> consultarVentas() {
        try {
            return conversor.convertirListaADTO(ventaDAO.consultarVentas());
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public DTO_Venta encontrarVenta(String idVenta) {
        try {
            return conversor.convertirADTO(ventaDAO.encontrarVenta(idVenta));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> ventasPorCliente(String clienteId) {
        try {
            return conversor.convertirListaADTO(ventaDAO.ventasPorCliente(clienteId));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> consultarVentasPorProductos(List<DTO_Producto> listaProductos) {
        try {
            List<Producto> productos = conversorp.convertirListaProductosEntidad(listaProductos);
            return conversor.convertirListaADTO(ventaDAO.consultarVentasPorProductos(productos));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin) {
        try {
            return conversor.convertirListaADTO(ventaDAO.consultarVentasPorRangoFechas(fechaInicio, fechaFin));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> consultarVentasConFiltros(String clienteId, Date fechaInicio, Date fechaFin, List<DTO_Producto> listaProductos) {
        try {
            List<Producto> productos = conversorp.convertirListaProductosEntidad(listaProductos);
            return conversor.convertirListaADTO(ventaDAO.consultarVentasConFiltros(clienteId, fechaInicio, fechaFin, productos));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public List<DTO_Venta> consultarVentasPorFecha(Date fecha) throws ConsultarVentasPorFechaException {
        try {
            return conversor.convertirListaADTO(ventaDAO.consultarVentasPorFecha(fecha));
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public boolean consultarExistenciaIngredientesStock(DTO_Producto producto) {
        List<String> ingredientesNombres = new ArrayList<>();
        List<DTO_IngredienteDetalle> ingredientesDetalles = producto.getIngredientes();

        for (DTO_IngredienteDetalle ingredienteDetalle : ingredientesDetalles) {
            ingredientesNombres.add(ingredienteDetalle.getNombre());
        }
        List<Ingrediente> ingredientesConsultados = ingredientesDAO.consultarCantidadesIngredientesInventario(ingredientesNombres);
        boolean disponible = false;

        for (Ingrediente ingrediente : ingredientesConsultados) {

            Optional<DTO_IngredienteDetalle> ingredienteDetalleConsultado = ingredientesDetalles.stream().filter(p -> p.getNombre().equalsIgnoreCase(ingrediente.getNombre())).findAny();
            if (ingredienteDetalleConsultado.isPresent()) {
                float cantidadNecesaria = calcularCantidadIngrediente(ingredienteDetalleConsultado.get(), producto.getTamanio());
                if (cantidadNecesaria < ingrediente.getCantidad()) {
                    disponible = true;
                }
            }
            if (!disponible) {
                break;
            }
            disponible = false;
        }
        return disponible;
    }

    @Override
    public Float calcularCantidadIngrediente(DTO_IngredienteDetalle ingredienteDetalle, String tamanio) {
        if (tamanio.equalsIgnoreCase("Chico")) {
            return ingredienteDetalle.getCantidad() * 1F;
        } else if (tamanio.equalsIgnoreCase("Mediano")) {
            return ingredienteDetalle.getCantidad() * 1.5F;

        } else if (tamanio.equalsIgnoreCase("Grande")) {
            return ingredienteDetalle.getCantidad() * 1.7F;

        }
        return 0f;
    }

}
