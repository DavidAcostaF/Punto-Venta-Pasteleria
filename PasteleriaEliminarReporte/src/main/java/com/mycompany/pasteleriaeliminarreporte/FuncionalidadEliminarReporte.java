/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaeliminarreporte;

import com.mycompany.pastelerianegocio.IReportesBO;
import com.mycompany.pastelerianegocio.ReportesBO;
import dto.DTO_Reporte;

/**
 *
 * @author abelc
 */
public class FuncionalidadEliminarReporte implements IFuncionalidadEliminarReporte {

    private IReportesBO reportesBO;

    public FuncionalidadEliminarReporte() {
        reportesBO = new ReportesBO();
    }

    @Override
    public void eliminarReporte(DTO_Reporte reporte) {
        reportesBO.eliminarReporte(reporte);
    }

}
