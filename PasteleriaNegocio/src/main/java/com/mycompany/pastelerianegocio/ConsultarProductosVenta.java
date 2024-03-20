/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import com.mycompany.pastelerianegocio.dtos.ProductoDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author af_da
 */
public class ConsultarProductosVenta implements IConsultarProductosVenta {

    @Override
    public List<ProductoDTO> consultarProductosVenta() {
        List<ProductoDTO> pasteles;

        pasteles = new ArrayList<>();

        pasteles.add(new ProductoDTO(300, "Pastel de Chocolate", "Cubierto con ganache de chocolate y decorado con virutas de chocolate.", "Grande"));
        pasteles.add(new ProductoDTO(200, "Tarta de Fresa", "Rellena con crema de fresa y cubierta con glaseado de fresa.", "Mediano"));
        pasteles.add(new ProductoDTO(150, "Pastel de Zanahoria", "Lleno de nueces y especias, cubierto con frosting de queso crema.", "Chico"));
        pasteles.add(new ProductoDTO(300, "Tarta de Limón", "Bizcocho esponjoso de limón cubierto con crema de limón y ralladura de limón.", "Grande"));
        pasteles.add(new ProductoDTO(400, "Pastel Red Velvet", "Bizcocho de terciopelo rojo con capas de frosting de queso crema.", "Grande"));

        return pasteles;
    }

}
