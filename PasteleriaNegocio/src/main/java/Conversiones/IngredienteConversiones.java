/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones;

import com.mycompany.pasteleriadominioentidades.Ingrediente;
import dto.DTO_Ingrediente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abelc
 */
public class IngredienteConversiones {
    
    public DTO_Ingrediente convertir(Ingrediente ingrediente) {
        if (ingrediente == null) {
            return null;
        }
        DTO_Ingrediente ingredienteDTO = new DTO_Ingrediente();
        ingredienteDTO.setId(ingrediente.getId());
        ingredienteDTO.setNombre(ingrediente.getNombre());
        ingredienteDTO.setCantidad(ingrediente.getCantidad());
        ingredienteDTO.setPrecio(ingrediente.getPrecio());
        ingredienteDTO.setUnidadDeMedida(ingrediente.getUnidadDeMedida());

        return ingredienteDTO;
    }

    public List<DTO_Ingrediente> convertir(List<Ingrediente> ingredientes) {
        if (ingredientes == null) {
            return null;
        }
        List<DTO_Ingrediente> ingredientesDTO = new ArrayList<>();
        for (Ingrediente ingrediente : ingredientes) {
            ingredientesDTO.add(convertir(ingrediente));
        }
        return ingredientesDTO;
    }
}
