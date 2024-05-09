/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversiones;

import com.mycompany.pasteleriadominios.Ingrediente;
import dto.DTO_Ingrediente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author af_da
 */
public class IngredienteConversiones {

    public DTO_Ingrediente convertir(Ingrediente ingrediente) {
        DTO_Ingrediente ingredienteDTO = new DTO_Ingrediente();
        ingredienteDTO.setId(ingrediente.getId().toHexString());
        ingredienteDTO.setNombre(ingrediente.getNombre());
        ingredienteDTO.setCantidad(ingrediente.getCantidad());
        ingredienteDTO.setPrecio(ingrediente.getPrecio());
        ingredienteDTO.setUnidadDeMedida(ingrediente.getUnidadDeMedida());

        return ingredienteDTO;
    }

    public List<DTO_Ingrediente> convertir(List<Ingrediente> ingredientes) {
        List<DTO_Ingrediente> ingredientesDTO = new ArrayList<>();

        for (Ingrediente ingrediente : ingredientes) {
            ingredientesDTO.add(this.convertir(ingrediente));
        }
        return ingredientesDTO;
    }
}
