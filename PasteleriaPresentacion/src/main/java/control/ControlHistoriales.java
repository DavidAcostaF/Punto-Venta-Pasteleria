/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dto.DTO_Venta;
import presentacion.Presentacion_FrmDetallesVenta;
import presentacion.Presentacion_FrmHistorialVentas;
import presentacion.Presentacion_FrmMenuHistoriales;

/**
 *
 * @author abelc
 */
public class ControlHistoriales {

    private static ControlHistoriales instance;
    private DTO_Venta venta;

    public ControlHistoriales() {
        this.venta = new DTO_Venta();
    }

    public static ControlHistoriales getInstance() {
        if (instance == null) {
            instance = new ControlHistoriales();
        }
        return instance;
    }

    public void mostrarHistorialVentas() {
        Presentacion_FrmHistorialVentas historialVentas = new Presentacion_FrmHistorialVentas();
        historialVentas.mostrarHistorialVentas();
    }

    public void mostrarMenu() {
        Presentacion_FrmMenuHistoriales menu = new Presentacion_FrmMenuHistoriales();
        menu.setVisible(true);
    }

    public void mostrarDetallesVenta() {
        Presentacion_FrmDetallesVenta detallesVenta = new Presentacion_FrmDetallesVenta();
        detallesVenta.mostrarDetallesVentas();

    }

    public DTO_Venta getVenta() {
        return venta;
    }

    public void setVenta(DTO_Venta venta) {
        this.venta = venta;
    }

}
