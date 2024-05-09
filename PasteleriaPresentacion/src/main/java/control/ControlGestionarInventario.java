/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import presentacion.Presentacion_DlgInventarioIngredientes;
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
    
    public void mostrarInventarioIngredientes(){
    Presentacion_DlgInventarioIngredientes p = new Presentacion_DlgInventarioIngredientes();
    p.setVisible(true);
    }
}
