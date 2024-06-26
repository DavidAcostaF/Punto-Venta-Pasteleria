/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriaguardarreportes;

import dto.DTO_Factura;
import dto.DTO_Reporte;
import java.io.File;

/**
 *
 * @author abelc
 */
public interface IFuncionalidadGuardarReportes {
   public DTO_Reporte guardarReporte(DTO_Reporte reporte);    
   public DTO_Factura guardarFactura(DTO_Factura factura);
   public byte[] convertirArchivoABytes(File archivo); 
}
