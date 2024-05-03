package com.mycompany.pastelerianegocio;

import com.mycompany.pasteleriadominios.Ingrediente;
import dto.DTO_Ingrediente;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author af_da
 */
public interface IInventarioIngredientesBO {
    List<DTO_Ingrediente>consultarIngredientes();
    Ingrediente ConvertirDTOAIngrediente(DTO_Ingrediente ingrediente);
    public DTO_Ingrediente convertirIngredienteADTO(Ingrediente ingrediente);

}
