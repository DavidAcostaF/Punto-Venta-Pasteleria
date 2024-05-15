/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dto.DTO_Producto;
import presentacion.Presentacion_MenuPrincipal;
import presentacion.gestioninventarios.Presentacion_DlgActualizarDatosDelProducto;
import presentacion.gestioninventarios.Presentacion_DlgActualizarIngredientesSeleccionados;
import presentacion.gestioninventarios.Presentacion_DlgDetalleProducto;
import presentacion.gestioninventarios.Presentacion_DlgIngredientesSeleccionados;
import presentacion.gestioninventarios.Presentacion_DlgIngresarDatosDelProducto;
import presentacion.gestioninventarios.Presentacion_DlgInventarioIngredientes;
import presentacion.gestioninventarios.Presentacion_DlgInventarioProductos;
import presentacion.gestioninventarios.Presentacion_DlgSeleccionOpcionGestion;

/**
 *
 * @author af_da
 */
public class ControlGestionarInventario {

    private static ControlGestionarInventario instance;
    private DTO_Producto productoDTO;
    private DTO_Producto productoAActualizar;

    public ControlGestionarInventario() {
        this.productoDTO = new DTO_Producto();
    }

    public static ControlGestionarInventario getInstance() {
        if (instance == null) {
            instance = new ControlGestionarInventario();
        }
        return instance;
    }

    public DTO_Producto getProductoDTO() {
        return productoDTO;
    }

    public void setProductoDTO(DTO_Producto productoDTO) {
        this.productoDTO = productoDTO;
    }

    public DTO_Producto getProductoAActualizar() {
        return productoAActualizar;
    }

    public void setProductoAActualizar(DTO_Producto productoAActualizar) {
        this.productoAActualizar = productoAActualizar;
    }

    public void mostrarMenuPrincipal() {
        Presentacion_MenuPrincipal p = new Presentacion_MenuPrincipal();
        p.setVisible(true);
    }

    public void mostrarOpcionesGestion() {
        Presentacion_DlgSeleccionOpcionGestion seleccionOpcionGestion = new Presentacion_DlgSeleccionOpcionGestion();
        seleccionOpcionGestion.setVisible(true);
    }

    public void mostrarInventarioIngredientes() {
        Presentacion_DlgInventarioIngredientes p = new Presentacion_DlgInventarioIngredientes();
        p.setVisible(true);
    }

    public void mostrarInvetarioProductos() {
        Presentacion_DlgInventarioProductos p = new Presentacion_DlgInventarioProductos();
        p.setVisible(true);
    }

    public void mostrarIngresarDatosDelProducto() {
        Presentacion_DlgIngresarDatosDelProducto p = new Presentacion_DlgIngresarDatosDelProducto();
        p.setVisible(true);
    }

    public void mostrarIngredientesSeleccionados() {
        Presentacion_DlgIngredientesSeleccionados p = new Presentacion_DlgIngredientesSeleccionados();
        p.setVisible(true);
    }

    public void mostrarDetalleProducto() {
        Presentacion_DlgDetalleProducto p = new Presentacion_DlgDetalleProducto();
        p.setVisible(true);
    }

    public void mostrarActualizarDatosDelProducto() {
        Presentacion_DlgActualizarDatosDelProducto p = new Presentacion_DlgActualizarDatosDelProducto();
        p.setVisible(true);
    }

    public void mostrarActualizarIngredientesSeleccionados() {

        Presentacion_DlgActualizarIngredientesSeleccionados p = new Presentacion_DlgActualizarIngredientesSeleccionados();
        p.setVisible(true);
    }
}
