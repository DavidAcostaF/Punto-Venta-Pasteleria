/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriaconsultaringrediente;

import com.mycompany.pastelerianegocio.IInventarioIngredientesBO;
import com.mycompany.pastelerianegocio.InventarioIngredientesBO;
import dto.DTO_Ingrediente;
import java.util.List;

/**
 *
 * @author af_da
 */
public class FuncionalidadConsultarIngrediente implements IFuncionalidadConsultarIngrediente {

    private IInventarioIngredientesBO inventarioIngredientesBO;

    public FuncionalidadConsultarIngrediente() {
        inventarioIngredientesBO = new InventarioIngredientesBO();
    }

    @Override
    public List<DTO_Ingrediente> consultarIngrediente(DTO_Ingrediente ingrediente) {
        List<DTO_Ingrediente> ingredienteNuevo = inventarioIngredientesBO.consultarIngrediente(ingrediente);
        return ingredienteNuevo;
    }
}
