/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaagregaringrediente;

import com.mycompany.pastelerianegocio.IInventarioIngredientesBO;
import com.mycompany.pastelerianegocio.InventarioIngredientesBO;

import dto.DTO_Ingrediente;

/**
 *
 * @author af_da
 */
public class FuncionalidadAgregarIngrediente implements IFuncionalidadAgregarIngrediente {

    private IInventarioIngredientesBO inventarioIngredientesBO;

    public FuncionalidadAgregarIngrediente() {
        inventarioIngredientesBO = new InventarioIngredientesBO();
    }

    @Override
    public DTO_Ingrediente agregarIngrediente(DTO_Ingrediente ingrediente) throws Exception {

        if (inventarioIngredientesBO.validarExistencia(ingrediente) != null) {
            throw new Exception("El ingrediente ya se encuentra agregado");
        }
        DTO_Ingrediente ingredienteNuevo = inventarioIngredientesBO.agregarIngrediente(ingrediente);
        return ingredienteNuevo;
    }
}
