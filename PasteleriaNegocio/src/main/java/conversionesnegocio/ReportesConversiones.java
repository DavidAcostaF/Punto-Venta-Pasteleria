/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesnegocio;

import com.mycompany.pasteleriadominioentidades.Reporte;
import dto.DTO_Reporte;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abelc
 */
public class ReportesConversiones {

    public ReportesConversiones() {
    }

    public DTO_Reporte reporteEntidadADto(Reporte reporte) {
        DTO_Reporte dtoReporte = new DTO_Reporte();
        dtoReporte.setId(reporte.getId());
        dtoReporte.setNombre(reporte.getNombre());
        dtoReporte.setCategoria(reporte.getCategoria());
        dtoReporte.setTipo(reporte.getTipo());
        dtoReporte.setFechaExpedicion(reporte.getFechaExpedicion());
        dtoReporte.setBytesContenido(reporte.getBytesContenido());
        return dtoReporte;
    }

    public Reporte reporteDtoAEntidad(DTO_Reporte Dtoreporte) {
        Reporte reporte = new Reporte();
        reporte.setId(Dtoreporte.getId());
        reporte.setNombre(Dtoreporte.getNombre());
        reporte.setTipo(Dtoreporte.getTipo());
        reporte.setCategoria(Dtoreporte.getCategoria());
        reporte.setFechaExpedicion(Dtoreporte.getFechaExpedicion());
        reporte.setBytesContenido(Dtoreporte.getBytesContenido());
        return reporte;
    }

    public List<DTO_Reporte> reportesADto(List<Reporte> reportes) {
        List<DTO_Reporte> reportesDto = new ArrayList<>();
        for (Reporte reporte : reportes) {
            DTO_Reporte reporteDto = new DTO_Reporte();
            reporteDto.setId(reporte.getId());
            reporteDto.setNombre(reporte.getNombre());
            reporteDto.setTipo(reporte.getTipo());
            reporteDto.setCategoria(reporte.getCategoria());
            reporteDto.setFechaExpedicion(reporte.getFechaExpedicion());
            reporteDto.setBytesContenido(reporte.getBytesContenido());
            reportesDto.add(reporteDto);
        }
        return reportesDto;
    }
}
