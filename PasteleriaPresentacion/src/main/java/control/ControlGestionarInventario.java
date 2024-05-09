/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import presentacion.Presentacion_DlgIngresarDatosDelProducto;
import presentacion.Presentacion_DlgInventarioIngredientes;
import presentacion.Presentacion_DlgInventarioProductos;
import presentacion.Presentacion_DlgSeleccionOpcionGestion;

/**
 *
 * @author af_da
 */
public class ControlGestionarInventario {

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
    
    public void mostrarIngresarDatosDelProducto(){
    Presentacion_DlgIngresarDatosDelProducto p = new Presentacion_DlgIngresarDatosDelProducto();
        p.setVisible(true);
    }
}
