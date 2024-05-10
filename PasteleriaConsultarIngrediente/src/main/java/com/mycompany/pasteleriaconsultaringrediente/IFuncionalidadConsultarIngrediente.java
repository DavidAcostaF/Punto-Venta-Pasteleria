/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriaconsultaringrediente;

import dto.DTO_Ingrediente;
import java.util.List;

/**
 *
 * @author af_da
 */
public interface IFuncionalidadConsultarIngrediente {

    public List<DTO_Ingrediente> consultarIngrediente(DTO_Ingrediente ingrediente);

    public DTO_Ingrediente consultarIngredientePorNombre(DTO_Ingrediente ingrediente);
}
