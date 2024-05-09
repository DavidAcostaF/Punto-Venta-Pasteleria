/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversiones;

import com.mycompany.pasteleriadocumentosanidados.IngredienteDetalle;
import dto.DTO_IngredienteDetalle;

/**
 *
 * @author af_da
 */
public class IngredienteDetalleConversiones {

    protected DTO_IngredienteDetalle convertir(IngredienteDetalle detalleIngrediente) {
        DTO_IngredienteDetalle detalleIngredienteDTO = new DTO_IngredienteDetalle();
        detalleIngredienteDTO.setIngredienteId(detalleIngrediente.getIngredienteId().toHexString());
        detalleIngredienteDTO.setCantidad(detalleIngrediente.getCantidad());
        detalleIngredienteDTO.setNombre(detalleIngrediente.getNombre());
        return detalleIngredienteDTO;
    }
}
