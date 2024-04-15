/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaproductosventa;

import dto.DTO_Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author f_aco
 */
//Esta clase funciona de que se manda la informacion al negocio o se obtiene mediante dtos y el negocio se encargara de devolver la info o mandarlas a las daos de ser necesarias

public class FuncionalidadProductosVenta implements IFuncionalidadProductosVenta {
    //esta clase tendra todas las operaciones de ventas necesarias 

    @Override
    public List<DTO_Producto> consultarProductosVenta() {
        List<DTO_Producto> pasteles;

        pasteles = new ArrayList<>();

        pasteles.add(new DTO_Producto(300, "Pastel de Chocolate", "Cubierto con ganache de chocolate y decorado con virutas de chocolate.", "Grande"));
        pasteles.add(new DTO_Producto(200, "Tarta de Fresa", "Rellena con crema de fresa y cubierta con glaseado de fresa.", "Mediano"));
        pasteles.add(new DTO_Producto(150, "Pastel de Zanahoria", "Lleno de nueces y especias, cubierto con frosting de queso crema.", "Chico"));
        pasteles.add(new DTO_Producto(300, "Tarta de Limón", "Bizcocho esponjoso de limón cubierto con crema de limón y ralladura de limón.", "Grande"));
        pasteles.add(new DTO_Producto(400, "Pastel Red Velvet", "Bizcocho de terciopelo rojo con capas de frosting de queso crema.", "Grande"));

        return pasteles;
    }
}
