/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaconsultarventas;

import com.mycompany.pastelerianegocio.IVentasBO;
import com.mycompany.pastelerianegocio.VentasBO;
import dto.DTO_Venta;
import java.util.List;

/**
 *
 * @author abelc
 */
public class FuncionalidadConsultarVentas implements IFuncionalidadConsultarVentas{
    private IVentasBO ventasbo;

    public FuncionalidadConsultarVentas() {
        ventasbo=new VentasBO();
    }

    @Override
    public List<DTO_Venta> consultarVentas() {
        return ventasbo.consultarVentas();
    }

    @Override
    public DTO_Venta encontrarVenta(String idVenta) {
        return ventasbo.encontrarVenta(idVenta);
    }
    
}
