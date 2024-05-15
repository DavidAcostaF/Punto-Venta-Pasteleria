/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaeliminarreporte;

import Exceptions.PersistenciaException;
import com.mycompany.pastelerianegocio.GestorFacturasBO;
import com.mycompany.pastelerianegocio.IGestorFacturasBO;
import com.mycompany.pastelerianegocio.IReportesBO;
import com.mycompany.pastelerianegocio.ReportesBO;
import dto.DTO_Factura;
import dto.DTO_Reporte;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abelc
 */
public class FuncionalidadEliminarReporte implements IFuncionalidadEliminarReporte {

    private IReportesBO reportesBO;
    private IGestorFacturasBO facturaBO;

    public FuncionalidadEliminarReporte() {
        reportesBO = new ReportesBO();
        facturaBO = new GestorFacturasBO();
    }

    @Override
    public void eliminarReporte(DTO_Reporte reporte) {
        reportesBO.eliminarReporte(reporte);
    }

    @Override
    public void eliminarFactura(DTO_Factura factra) {
        try {
            facturaBO.eliminarFactura(factra);
        } catch (PersistenciaException ex) {
            Logger.getLogger(FuncionalidadEliminarReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
