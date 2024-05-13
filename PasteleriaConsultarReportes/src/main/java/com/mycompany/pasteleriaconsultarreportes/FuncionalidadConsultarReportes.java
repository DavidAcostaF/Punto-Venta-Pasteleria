/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaconsultarreportes;

import com.mycompany.pastelerianegocio.IReportesBO;
import com.mycompany.pastelerianegocio.ReportesBO;
import dto.DTO_Reporte;
import java.util.List;

/**
 *
 * @author abelc
 */
public class FuncionalidadConsultarReportes implements IFuncionalidadConsultarReportes {

    IReportesBO reporteBo;

    public FuncionalidadConsultarReportes() {
        reporteBo = new ReportesBO();
    }

    @Override
    public List<DTO_Reporte> consultarReportes(List<DTO_Reporte> reportes) {
        return reporteBo.consultarReportes();
    }

}
