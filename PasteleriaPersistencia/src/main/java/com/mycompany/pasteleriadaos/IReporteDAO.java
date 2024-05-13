/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import Exceptions.PersistenciaException;
import com.mycompany.pasteleriadominioentidades.Reporte;
import com.mycompany.pasteleriadominiosMapeo.ClienteMapeo;
import com.mycompany.pasteleriadominiosMapeo.ReporteMapeo;
import java.util.List;

/**
 *
 * @author abelc
 */
public interface IReporteDAO {
   public Reporte guardarReporte(Reporte reporte) throws PersistenciaException;
   
   public List<Reporte> consultarReportes()throws PersistenciaException;
   
   public void eliminarReporte(Reporte reporte)throws PersistenciaException;
}
