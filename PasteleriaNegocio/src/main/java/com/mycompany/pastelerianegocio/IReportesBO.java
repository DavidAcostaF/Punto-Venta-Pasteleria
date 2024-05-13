/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import Exceptions.PersistenciaException;
import dto.DTO_Reporte;
import java.util.List;

/**
 *
 * @author abelc
 */
public interface IReportesBO {
  public DTO_Reporte guardarReporte(DTO_Reporte reporte);
   
   public List<DTO_Reporte> consultarReportes();
   
   public void eliminarReporte(DTO_Reporte reporte);
}
