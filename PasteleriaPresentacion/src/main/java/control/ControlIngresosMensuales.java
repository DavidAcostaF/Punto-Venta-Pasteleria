/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dto.DTO_Venta;
import java.util.Date;
import presentacion.Presentacion_DlgSeleccionarFechaIngresos;
import presentacion.Presentacion_DlgVentasTotales;
import presentacion.Presentacion_FrmMenuHistoriales;

/**
 *
 * @author PC
 */
public class ControlIngresosMensuales {

    private static ControlIngresosMensuales instance;
    private Date fechaSeleccionada;

    public ControlIngresosMensuales() {
        this.fechaSeleccionada = new Date();
    }

    public static ControlIngresosMensuales getInstance() {
        if (instance == null) {
            instance = new ControlIngresosMensuales();
        }
        return instance;
    }

    public Date getFechaSeleccionada() {
        return fechaSeleccionada;
    }

    public void setFechaSeleccionada(Date fechaSeleccionada) {
        this.fechaSeleccionada = fechaSeleccionada;
    }

    public void mostrarSeleccionadorFecha() {
        Presentacion_DlgSeleccionarFechaIngresos seleccionFecha = new Presentacion_DlgSeleccionarFechaIngresos();
        seleccionFecha.setVisible(true);
    }

    public void mostrarVentasTotales() {
        Presentacion_DlgVentasTotales ventasTotales = new Presentacion_DlgVentasTotales();
        ventasTotales.setVisible(true);
    }

}
