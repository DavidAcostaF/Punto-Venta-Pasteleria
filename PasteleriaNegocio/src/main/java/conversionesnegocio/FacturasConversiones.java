/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesnegocio;

import com.mycompany.pasteleriadominioentidades.Factura;
import dto.DTO_Factura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PERSONAL
 */
public class FacturasConversiones {

    VentasConversiones conversorVentas;
    
    /**
     * Constructor por defecto.
     */
    public FacturasConversiones() {
        conversorVentas = new VentasConversiones();
    }
    
    public DTO_Factura facturaEntidadADto (Factura factura){
        DTO_Factura facturaDto = new DTO_Factura();
        
        factura.setId(factura.getId());
        facturaDto.setFechaEmision(factura.getFechaEmision());
        facturaDto.setFechaVencimiento(factura.getFechaVencimiento());
        facturaDto.setVentaId(factura.getVentaId());
        facturaDto.setBytesContenido(factura.getBytesContenido());
        
        return facturaDto;
    }
    
    public DTO_Factura convertirADto (Factura factura){
        DTO_Factura facturaDto = new DTO_Factura();
        
        factura.setId(factura.getId());
        facturaDto.setFechaEmision(factura.getFechaEmision());
        facturaDto.setFechaVencimiento(factura.getFechaVencimiento());
        facturaDto.setVentaId(factura.getVentaId());
        facturaDto.setBytesContenido(factura.getBytesContenido());
        facturaDto.setVenta(conversorVentas.convertirADTO(factura.getVenta()));
        
        return facturaDto;
    }
    
    public Factura facturaDtoAEntidad (DTO_Factura factura){
        Factura facturaEnt = new Factura();
        
        factura.setId(factura.getId());
        facturaEnt.setFechaEmision(factura.getFechaEmision());
        facturaEnt.setFechaVencimiento(factura.getFechaVencimiento());
        facturaEnt.setVentaId(factura.getVentaId());
        facturaEnt.setBytesContenido(factura.getBytesContenido());
        
        return facturaEnt;
    }
    
    public List<DTO_Factura> listaFacturasADto(List<Factura> facturas){
        List<DTO_Factura> facturasDto = new ArrayList<>();
        
        for (Factura factura : facturas) {
            facturasDto.add(facturaEntidadADto(factura));
        }
        return facturasDto;
        
    }
}
