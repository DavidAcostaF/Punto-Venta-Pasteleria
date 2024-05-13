/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaguardarreportes;

import com.mycompany.pastelerianegocio.IReportesBO;
import com.mycompany.pastelerianegocio.ReportesBO;
import dto.DTO_Reporte;

/**
 *
 * @author abelc
 */
public class FuncionalidadGuardarReportes implements IFuncionalidadGuardarReportes {

    IReportesBO reporteBO;

    public FuncionalidadGuardarReportes() {
        reporteBO = new ReportesBO();
    }

    @Override
    public DTO_Reporte guardarReporte(DTO_Reporte reporte) {
        return reporteBO.guardarReporte(reporte);
    }

}