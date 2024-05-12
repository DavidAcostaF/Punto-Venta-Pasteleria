/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Map;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author abelc
 */
public class DTO_GenerarReporte {
   private Map<String, Object> parameters;
   private JasperReport jasperReport;

    public DTO_GenerarReporte() {
    }

    public DTO_GenerarReporte(Map<String, Object> parameters, JasperReport jasperReport) {
        this.parameters = parameters;
        this.jasperReport = jasperReport;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public JasperReport getJasperReport() {
        return jasperReport;
    }

    public void setJasperReport(JasperReport jasperReport) {
        this.jasperReport = jasperReport;
    }
    
   
}
