/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import Exceptions.PersistenciaException;
import com.mycompany.pastelerianegocio.ReportesBO;
import dto.DTO_Reporte;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abelc
 */
public class Reporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReportesBO rep = new ReportesBO();
        DTO_Reporte reporte = new DTO_Reporte();
        String rutaDirectorio = "C:\\Users\\abelc\\OneDrive\\Escritorio";
        String nombreArchivo = "hola.pdf";
        File archivo = new File(rutaDirectorio, nombreArchivo);
        byte[] bytesArchivo = convertirArchivoABytes(archivo);
        reporte.setBytesContenido(bytesArchivo);
        reporte.setNombre(nombreArchivo);
        reporte.setCategoria("Reporte de Ventas");
        reporte.setTipo("application/pdf");
        reporte.setFechaExpedicion(new Date());
        rep.guardarReporte(reporte);

    }

    private static byte[] convertirArchivoABytes(File archivo) {
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
