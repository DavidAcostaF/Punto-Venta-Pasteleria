/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesPersistencia;

import com.mycompany.pasteleriadominioentidades.Factura;
import com.mycompany.pasteleriadominiosMapeo.FacturaMapeo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import org.bson.types.Binary;
import org.bson.types.ObjectId;

/**
 *
 * @author PERSONAL
 */
public class FacturasConversiones {

    VentasConversiones conversosrVentas;

    public FacturasConversiones() {
        conversosrVentas = new VentasConversiones();
    }

    public Factura convertirAFacturaEntidad(FacturaMapeo factura){
        Factura facturaEnt = new Factura();
        facturaEnt.setId(factura.getId().toHexString());
        facturaEnt.setFechaEmision(factura.getFechaEmision());
        facturaEnt.setFechaVencimiento(factura.getFechaVencimiento());
        facturaEnt.setVentaId(factura.getVentaId().toHexString());

        byte[] contenidoBytes64 = factura.getContenido().getData();
        String contenidoBase64 = Base64.getEncoder().encodeToString(contenidoBytes64);
        byte[] contenidoBytes = Base64.getDecoder().decode(contenidoBase64);
        facturaEnt.setBytesContenido(contenidoBytes);

        return facturaEnt;
    }
    
    public Factura convertirAFacturaEntidadObjetos (FacturaMapeo factura){
        Factura facturaEnt = new Factura();
        facturaEnt.setId(factura.getId().toHexString());
        facturaEnt.setFechaEmision(factura.getFechaEmision());
        facturaEnt.setFechaVencimiento(factura.getFechaVencimiento());
        facturaEnt.setVentaId(factura.getVentaId().toHexString());
        facturaEnt.setVenta(conversosrVentas.convertirAVentaEntidad(factura.getVenta()));

        byte[] contenidoBytes64 = factura.getContenido().getData();
        String contenidoBase64 = Base64.getEncoder().encodeToString(contenidoBytes64);
        byte[] contenidoBytes = Base64.getDecoder().decode(contenidoBase64);
        facturaEnt.setBytesContenido(contenidoBytes);

        return facturaEnt;
    }

    public FacturaMapeo convertirAFacturaMapeo (Factura factura){
        FacturaMapeo facturaMap = new FacturaMapeo();
        facturaMap.setId(new ObjectId(factura.getId()));
        facturaMap.setFechaEmision(factura.getFechaEmision());
        facturaMap.setFechaVencimiento(factura.getFechaVencimiento());
        facturaMap.setVenta(conversosrVentas.convertirAVentaMapeo(factura.getVenta()));
        facturaMap.setContenido(new Binary(factura.getBytesContenido()));
        
        return facturaMap;
    }
    
    public List<Factura> listaMapeosEntidad(List<FacturaMapeo> facturas) {
        List<Factura> facturasEnt = new ArrayList<>();
        for (FacturaMapeo facturaMap : facturas) {
            Factura factura = new Factura();
            factura.setId(facturaMap.getId().toHexString());
            factura.setFechaEmision(factura.getFechaEmision());
            factura.setFechaVencimiento(facturaMap.getFechaVencimiento());
            factura.setVenta(conversosrVentas.convertirAVentaEntidad(facturaMap.getVenta()));
            byte[] contenidoBytes64 = facturaMap.getContenido().getData();
            String contenidoBase64 = Base64.getEncoder().encodeToString(contenidoBytes64);
            byte[] contenidoBytes = Base64.getDecoder().decode(contenidoBase64);
            factura.setBytesContenido(contenidoBytes);
            
            facturasEnt.add(factura);
        }
        
        return facturasEnt;
    }

}
