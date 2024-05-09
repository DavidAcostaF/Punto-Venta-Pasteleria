/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriaconsultarventas;

import dto.DTO_Venta;
import java.util.List;

/**
 *
 * @author abelc
 */
public interface IFuncionalidadConsultarVentas {
    public List<DTO_Venta> consultarVentas();
    public DTO_Venta encontrarVenta(String idVenta);
}
