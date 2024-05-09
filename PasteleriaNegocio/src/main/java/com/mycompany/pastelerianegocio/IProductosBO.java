/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import dto.DTO_Producto;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IProductosBO {

    public List<DTO_Producto> consultarProductos();
}
