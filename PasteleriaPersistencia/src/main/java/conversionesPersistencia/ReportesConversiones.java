/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesPersistencia;

import com.mycompany.pasteleriadominioentidades.Reporte;
import com.mycompany.pasteleriadominiosMapeo.ReporteMapeo;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import org.bson.types.Binary;

/**
 *
 * @author abelc
 */
public class ReportesConversiones {

    public ReportesConversiones() {
    }

    public ReporteMapeo reporteEntidadAMapeo(Reporte reporte) {
        ReporteMapeo reporteMapeo = new ReporteMapeo();
        reporteMapeo.setCategoria(reporte.getCategoria());
        reporteMapeo.setNombre(reporte.getNombre());
        reporteMapeo.setTipo(reporte.getTipo());
        reporteMapeo.setContenido(new Binary(reporte.getBytesContenido()));
        reporteMapeo.setFechaExpedicion(reporte.getFechaExpedicion());
        return reporteMapeo;
    }

    public Reporte reporteMapeoAEntidad(ReporteMapeo reporte) {
        Reporte reporteE = new Reporte();
        reporteE.setId(reporte.getId().toString());
        reporteE.setCategoria(reporte.getCategoria());
        reporteE.setNombre(reporte.getNombre());
        reporteE.setTipo(reporte.getTipo());
        reporteE.setFechaExpedicion(reporte.getFechaExpedicion());
        byte[] contenidoBytes64 = reporte.getContenido().getData();
        String contenidoBase64 = Base64.getEncoder().encodeToString(contenidoBytes64);
        byte[] contenidoBytes = Base64.getDecoder().decode(contenidoBase64);
        reporteE.setBytesContenido(contenidoBytes);
        return reporteE;
    }

    public List<Reporte> listaMapeosAEntidad(List<ReporteMapeo> reportes) {
        List<Reporte> reportesE = new ArrayList<>();
        for (ReporteMapeo reporteM : reportes) {
            Reporte reporte = new Reporte();
            reporte.setId(reporteM.getId().toHexString());
            reporte.setNombre(reporteM.getNombre());
            reporte.setCategoria(reporteM.getCategoria());
            reporte.setTipo(reporteM.getTipo());
            reporte.setFechaExpedicion(reporteM.getFechaExpedicion());
            byte[] contenidoBytes64 = reporteM.getContenido().getData();
            String contenidoBase64 = Base64.getEncoder().encodeToString(contenidoBytes64);
            byte[] contenidoBytes = Base64.getDecoder().decode(contenidoBase64);
            reporte.setBytesContenido(contenidoBytes);
            
            reportesE.add(reporte);
        }
        return reportesE;
    }
}
