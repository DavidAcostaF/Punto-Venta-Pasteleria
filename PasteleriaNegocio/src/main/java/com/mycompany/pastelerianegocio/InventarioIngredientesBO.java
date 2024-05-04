/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import com.mycompany.pasteleriadaos.IIngredienteDAO;
import com.mycompany.pasteleriadaos.IngredienteDAO;
import com.mycompany.pasteleriadominios.Ingrediente;
import dto.DTO_Ingrediente;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author af_da
 */
public class InventarioIngredientesBO implements IInventarioIngredientesBO {

    IIngredienteDAO ingredienteDAO;

    public InventarioIngredientesBO() {
        ingredienteDAO = new IngredienteDAO();
    }

    @Override
    public DTO_Ingrediente agregarIngrediente(DTO_Ingrediente ingrediente) {
        //VALIDAR QUE EL INGREDIENTE NO ESTE AGREGADO
        //Happy path primero

        Ingrediente ingredienteNueva = ingredienteDAO.agregar(ConvertirDTOAIngrediente(ingrediente));
        return convertirIngredienteADTO(ingredienteNueva);
    }

    @Override
    public List<DTO_Ingrediente> consultarIngredientes() {
        List<Ingrediente> ingredientes = ingredienteDAO.consultar();
        List<DTO_Ingrediente> ingredientesDTO = new LinkedList<>();
        for (Ingrediente ingrediente : ingredientes) {
            ingredientesDTO.add(convertirIngredienteADTO(ingrediente));
        }
        return ingredientesDTO;
    }

    @Override
    public Ingrediente ConvertirDTOAIngrediente(DTO_Ingrediente ingredienteDTO) {
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setCantidad(ingredienteDTO.getCantidad());
        ingrediente.setNombre(ingredienteDTO.getNombre());
        ingrediente.setPrecio(ingredienteDTO.getPrecio());
        ingrediente.setUnidadDeMedida(ingredienteDTO.getUnidadDeMedida());
        return ingrediente;
    }

    @Override
    public DTO_Ingrediente convertirIngredienteADTO(Ingrediente ingrediente) {
        DTO_Ingrediente dtoIngrediente = new DTO_Ingrediente();
        dtoIngrediente.setId(ingrediente.getId().toString());

        dtoIngrediente.setCantidad(ingrediente.getCantidad());
        dtoIngrediente.setNombre(ingrediente.getNombre());
        dtoIngrediente.setPrecio(ingrediente.getPrecio());
        dtoIngrediente.setUnidadDeMedida(ingrediente.getUnidadDeMedida());
        return dtoIngrediente;
    }

}
