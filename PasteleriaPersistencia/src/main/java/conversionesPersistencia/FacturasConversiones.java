/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesPersistencia;

import com.mongodb.gridfs.GridFS;
import com.mycompany.pasteleriadominioentidades.Factura;
import com.mycompany.pasteleriadominiosMapeo.FacturaMapeo;
import java.io.File;
import java.io.IOException;
import org.bson.types.ObjectId;

/**
 *
 * @author PERSONAL
 */
public class FacturasConversiones {

    VentasConversiones conversosrVentas;
    ArchivosConversiones conversorArchivos;

    public FacturasConversiones() {
        conversosrVentas = new VentasConversiones();
        conversorArchivos = new ArchivosConversiones();
    }

    public Factura convertirAFacturaEntidad(FacturaMapeo factura, GridFS gridFS, String outputPath) throws IOException {
        Factura facturaEnt = new Factura();
        facturaEnt.setId(factura.getId().toHexString());
        facturaEnt.setFechaEmision(factura.getFechaEmision());
        facturaEnt.setFechaVencimiento(factura.getFechaVencimiento());
        facturaEnt.setVentaId(factura.getVentaId().toHexString());

        // Convertir GridFS a File solo si FacturaPDF no es null
        if (factura.getFacturaPdf() != null) {
            File facturaPdf = conversorArchivos.gridFSToFile(gridFS, factura.getFacturaPdf(), outputPath);
            facturaEnt.setFacturaPdf(facturaPdf);
        }

        return facturaEnt;
    }

    public Factura convertirAFacturaEntidadObjetos(FacturaMapeo factura) {
        Factura facturaEnt = new Factura();
        facturaEnt.setId(factura.getId().toString());
        facturaEnt.setFechaEmision(factura.getFechaEmision());
        facturaEnt.setFechaVencimiento(factura.getFechaVencimiento());
        facturaEnt.setVenta(conversosrVentas.convertirAVentaEntidad(factura.getVenta()));
        facturaEnt.setVentaId(factura.getVentaId().toString());

        return facturaEnt;
    }

    public FacturaMapeo convertirAFacturaMapeo(Factura factura) {
        FacturaMapeo facturaMap = new FacturaMapeo();
        facturaMap.setVentaId(new ObjectId(factura.getVentaId()));
        facturaMap.setFechaEmision(factura.getFechaEmision());
        facturaMap.setFechaVencimiento(factura.getFechaVencimiento());

        return facturaMap;
    }

}
