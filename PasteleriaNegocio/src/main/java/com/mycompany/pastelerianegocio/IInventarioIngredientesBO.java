package com.mycompany.pastelerianegocio;

import com.mycompany.pasteleriadominiosMapeo.IngredienteMapeo;
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

    public List<DTO_Ingrediente> consultarIngredientes();

    public DTO_Ingrediente agregarIngrediente(DTO_Ingrediente ingrediente);

    public List<DTO_Ingrediente> consultarIngrediente(DTO_Ingrediente ingrediente);

    public DTO_Ingrediente actualizarIngrediente(DTO_Ingrediente ingrediente);

    IngredienteMapeo ConvertirDTOAIngrediente(DTO_Ingrediente ingrediente);

    public DTO_Ingrediente convertirIngredienteADTO(IngredienteMapeo ingrediente);

    public DTO_Ingrediente validarExistencia(DTO_Ingrediente ingrediente);
    
    public Boolean eliminarIngrediente(DTO_Ingrediente ingrediente);
    
    public DTO_Ingrediente consultarIngredientePorNombre(DTO_Ingrediente ingrediente);
}
