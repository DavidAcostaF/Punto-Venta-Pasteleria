/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import presentacion.Presentacion_FrmDetallesVenta;
import presentacion.Presentacion_FrmHistorialVentas;
import presentacion.Presentacion_FrmMenuHistoriales;

/**
 *
 * @author abelc
 */
public class ControlHistoriales {
     public ControlHistoriales() {
    }
    
    public void mostrarHistorialVentas() {
        Presentacion_FrmHistorialVentas historialVentas = new Presentacion_FrmHistorialVentas();
        historialVentas.mostrarHistorialVentas();
    }
    
    public void mostrarMenu() {
        Presentacion_FrmMenuHistoriales menu = new Presentacion_FrmMenuHistoriales();
        menu.setVisible(true);
    }
    
    public void mostrarDetallesVenta(){
    Presentacion_FrmDetallesVenta detallesVenta=new Presentacion_FrmDetallesVenta();
    detallesVenta.mostrarDetallesVentas();
    
    }
}
