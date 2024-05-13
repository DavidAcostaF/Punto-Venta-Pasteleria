/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriaconsultarreportes;

import dto.DTO_Reporte;
import java.util.List;

/**
 *
 * @author abelc
 */
public interface IFuncionalidadConsultarReportes {
    public List<DTO_Reporte> consultarReportes(List<DTO_Reporte> reportes);
}
