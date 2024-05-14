/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import Exceptions.PersistenciaException;
import com.mycompany.pasteleriadaos.FacturaDAO;
import com.mycompany.pasteleriadominioentidades.Factura;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.types.ObjectId;

/**
 *
 * @author PERSONAL
 */
public class PruebasFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura factura = new Factura();
        FacturaDAO facturadao = new FacturaDAO();
        try {
            String rutaDirectorio = "C:\\Users\\jonas\\Desktop";

            String nombreArchivo = "hola.txt";
            File archivo = new File(rutaDirectorio, nombreArchivo);
            byte[] bytesArchivo = convertirArchivoABytes(archivo);
            factura.setId(new ObjectId().toHexString());
            factura.setBytesContenido(bytesArchivo);
            factura.setVentaId("6643503255039232aa1ff16c");
            factura.setFechaEmision(new Date());
            factura.setFechaVencimiento(new Date());
            try {
                facturadao.guardarFactura(factura);
            } catch (PersistenciaException ex) {
                Logger.getLogger(ReportePrueba.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(facturadao.consultarFacturas());
        } catch (PersistenciaException ex) {
            Logger.getLogger(ReportePrueba.class.getName()).log(Level.SEVERE, null, ex);
        }
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
