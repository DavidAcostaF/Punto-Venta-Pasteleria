/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesnegocio;

import com.mycompany.pasteleriadominiodocumentosanidados.IngredienteDetalle;
import dto.DTO_Ingrediente;
import dto.DTO_IngredienteDetalle;

/**
 *
 * @author abelc
 */
public class IngredienteDetalleConversiones {

    public DTO_IngredienteDetalle convertir(IngredienteDetalle detalleIngrediente) {
        DTO_IngredienteDetalle detalleIngredienteDTO = new DTO_IngredienteDetalle();
        detalleIngredienteDTO.setIngredienteId(detalleIngrediente.getIngredienteId());
        detalleIngredienteDTO.setCantidad(detalleIngrediente.getCantidad());
        detalleIngredienteDTO.setNombre(detalleIngrediente.getNombre());
        return detalleIngredienteDTO;
    }

    public IngredienteDetalle convertir(DTO_IngredienteDetalle detalleIngredienteDTO) {
        IngredienteDetalle detalleIngrediente = new IngredienteDetalle();
        detalleIngrediente.setIngredienteId(detalleIngredienteDTO.getIngredienteId());
        detalleIngrediente.setCantidad(detalleIngredienteDTO.getCantidad());
        detalleIngrediente.setNombre(detalleIngredienteDTO.getNombre());
        return detalleIngrediente;
    }

    public DTO_IngredienteDetalle convertirIngredienteADetalleIngrediente(DTO_Ingrediente ingredienteDTO) {
        DTO_IngredienteDetalle detalleIngrediente = new DTO_IngredienteDetalle();
        detalleIngrediente.setIngredienteId(ingredienteDTO.getId());
        detalleIngrediente.setCantidad(ingredienteDTO.getCantidad());
        detalleIngrediente.setNombre(ingredienteDTO.getNombre());
        return detalleIngrediente;
    }
}
