/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaguardarreportes;

import com.mycompany.pastelerianegocio.IReportesBO;
import com.mycompany.pastelerianegocio.ReportesBO;
import dto.DTO_Reporte;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

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

    public byte[] convertirArchivoABytes(File archivo) {
        try (FileInputStream fis = new FileInputStream(archivo); ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int longitud;
            while ((longitud = fis.read(buffer)) != -1) {
                bos.write(buffer, 0, longitud);
            }
            return bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
