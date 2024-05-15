/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import Exceptions.PersistenciaException;
import conversionesnegocio.ProductosConversiones;
import com.mycompany.pasteleriadaos.IIngredienteDAO;
import com.mycompany.pasteleriadaos.IProductoDAO;
import com.mycompany.pasteleriadaos.IngredienteDAO;
import com.mycompany.pasteleriadaos.ProductoDAO;
import com.mycompany.pasteleriadocumentosanidadosmapeo.IngredienteDetalleMapeo;
import com.mycompany.pasteleriadominiodocumentosanidados.IngredienteDetalle;
import com.mycompany.pasteleriadominioentidades.Ingrediente;
import com.mycompany.pasteleriadominioentidades.Producto;
import com.mycompany.pasteleriadominiosMapeo.ProductoMapeo;
import conversionesnegocio.IngredienteConversiones;
import dto.DTO_Ingrediente;
import dto.DTO_IngredienteDetalle;
import dto.DTO_Producto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        try {
            Producto productoConvertido = this.convertirDTOAProducto(producto);
            Producto producoNuevo = productoDAO.agregarProducto(productoConvertido);
            return conversor.convertirProducto(producoNuevo);
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public DTO_Producto actualizarProducto(DTO_Producto producto) {
        try {
            Producto productoConvertido = this.convertirDTOAProducto(producto);
            Producto producoActualizado = productoDAO.actualizar(productoConvertido);
            return conversor.convertirProducto(producoActualizado);
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public List<DTO_Producto> consultarProductos() {
        try {
            List<DTO_Producto> listaProductos = conversor.convertirListaProductos(productoDAO.consultarProductos());
            return listaProductos;
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public DTO_Producto consultarProductoPorNombre(String nombre) {
        try {
            Producto productoConsultado = productoDAO.consultarPorNombre(nombre);
            if (productoConsultado == null) {
                return null;
            }
            return conversor.convertirProducto(productoConsultado);
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public DTO_Producto consultarProducto(String id) {
        try {
            Producto productoConsultado = productoDAO.consultar(id);
            if (productoConsultado == null) {
                return null;
            }
            return conversor.convertirProducto(productoConsultado);
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
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
        try {
            return conversorIngredientes.convertir(ingredienteDAO.consultarPorNombre(nombre));
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Producto convertirDTOAProducto(DTO_Producto producto) {
        Float precio = 0F;
        Producto productoNuevo = new Producto();
        productoNuevo.setDescripcion(producto.getDescripcion());
        if (producto.getId() != null) {
            productoNuevo.setId(producto.getId());
        }
        productoNuevo.setNombre(producto.getNombre());
        productoNuevo.setPrecio(producto.getPrecio());

        for (DTO_IngredienteDetalle ingredienteDetalle : producto.getIngredientes()) {
            DTO_Ingrediente ingredienteConsultado = consultarIngredientePorNombre(ingredienteDetalle.getNombre());
            precio += ingredienteConsultado.getPrecio() * ingredienteDetalle.getCantidad();
            ingredienteDetalle.setIngredienteId(ingredienteConsultado.getId());
            productoNuevo.addIngredienteDetalle(convertirDTOAIngredienteDetalle(ingredienteDetalle));
        }
        productoNuevo.setPrecio(precio + 50F);
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

    @Override
    public Float calcularCosto(List<IngredienteDetalle> productos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarProducto(DTO_Producto producto) {
        try {
            return productoDAO.eliminarProducto(convertirDTOAProductoMapeo(producto));
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public List<DTO_Ingrediente> consultarIngredientesFaltantes(DTO_Producto producto) {
        try {
            List<DTO_IngredienteDetalle> ingredientes = producto.getIngredientes();
            List<String> ids = new ArrayList();
            for (DTO_IngredienteDetalle ingrediente : ingredientes) {
                ids.add(consultarIngredientePorNombre(ingrediente.getNombre()).getId());
            }
            return this.conversorIngredientes.convertir(this.ingredienteDAO.consultarIngredientesFaltantes(ids));
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<DTO_Producto> consultarProductosCoincidentes(String nombre) {
        try {
            return conversor.convertirListaProductos(productoDAO.consultarProductosCoincidentes(nombre));
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<DTO_Producto> consultarListaProductosConStock() {
        try {
            List<Ingrediente> ingredientesDisponibles = ingredienteDAO.consultarIngredientesConStock();
            List<Producto> productos = productoDAO.consultarProductos();
            List<DTO_Producto> productosDTO = new ArrayList<>();

            for (Producto producto : productos) {
                boolean disponible = false;
                for (IngredienteDetalle ingredienteDetalle : producto.getIngredientes()) {

                    for (Ingrediente ingrediente : ingredientesDisponibles) {
                        if (ingrediente.getNombre().equalsIgnoreCase(ingredienteDetalle.getNombre())) {
                            if (ingrediente.getCantidad() > ingredienteDetalle.getCantidad()) {
                                disponible = true;
                            }
                        }
                    }
                    if (!disponible) {
                        break;
                    }

                }

                if (!disponible) {
                    break;
                }
                if (disponible) {
                    productosDTO.add(conversor.convertirProducto(producto));
                }
                disponible = false;

            }
            return productosDTO;
        } catch (PersistenciaException ex) {
            Logger.getLogger(ProductosBO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
