/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaeliminaringrediente;

import com.mycompany.pastelerianegocio.IInventarioIngredientesBO;
import com.mycompany.pastelerianegocio.InventarioIngredientesBO;
import dto.DTO_Ingrediente;

/**
 *
 * @author af_da
 */
public class FuncionalidadEliminarIngrediente implements IFuncionalidadEliminarIngrediente {

    private IInventarioIngredientesBO ingredienteBO;

    public FuncionalidadEliminarIngrediente() {
        this.ingredienteBO = new InventarioIngredientesBO();
    }

    @Override
    public Boolean eliminarIngrediente(DTO_Ingrediente ingrediente) {
        return ingredienteBO.eliminarIngrediente(ingrediente);
    }
}
