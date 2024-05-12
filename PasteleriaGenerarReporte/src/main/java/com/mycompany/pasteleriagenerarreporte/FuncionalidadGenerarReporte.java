/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriagenerarreporte;

import dto.DTO_GenerarReporte;
import dto.DTO_ReporteVentasFormato;
import dto.DTO_Venta;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 *
 * @author abelc
 */
public class FuncionalidadGenerarReporte implements IFuncionalidadGenerarReporte{

    @Override
      public DTO_GenerarReporte generarReporteVentasCasoHistoriales(List<DTO_ReporteVentasFormato> reporteVentas) {
        try {
            DTO_GenerarReporte reporteGenerado=new DTO_GenerarReporte();
            JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(reporteVentas);
            
            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("ds", itemsJRBean);
            
            InputStream input = null;
            
            input = new FileInputStream(new File("src\\main\\resources\\JasperFile\\ReporteVentas.jrxml"));

            JasperDesign jasperDesign = JRXmlLoader.load(input);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            reporteGenerado.setParameters(parameters);
            reporteGenerado.setJasperReport(jasperReport);
            return reporteGenerado;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FuncionalidadGenerarReporte.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (JRException ex) {
            Logger.getLogger(FuncionalidadGenerarReporte.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

 
    
}
