/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesPersistencia;

import com.mycompany.pasteleriadominioentidades.Ingrediente;
import com.mycompany.pasteleriadominiosMapeo.IngredienteMapeo;
import dto.DTO_Ingrediente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author af_da
 */
public class IngredienteConversiones {

    public Ingrediente convertir(IngredienteMapeo ingrediente) {
       if (ingrediente == null) {
        return null;
    }
    Ingrediente ingredienteE = new Ingrediente();
    ingredienteE.setId(ingrediente.getId().toHexString());
    ingredienteE.setNombre(ingrediente.getNombre());
    ingredienteE.setCantidad(ingrediente.getCantidad());
    ingredienteE.setPrecio(ingrediente.getPrecio());
    ingredienteE.setUnidadDeMedida(ingrediente.getUnidadDeMedida());
    return ingredienteE;
    }

    public List<Ingrediente> convertir(List<IngredienteMapeo> ingredientes) {
        List<Ingrediente> ingredientesE = new ArrayList<>();
        if (ingredientes == null) {
            return null;
        }
        for (IngredienteMapeo ingrediente : ingredientes) {
            ingredientesE.add(this.convertir(ingrediente));
        }
        return ingredientesE;
    }
}
