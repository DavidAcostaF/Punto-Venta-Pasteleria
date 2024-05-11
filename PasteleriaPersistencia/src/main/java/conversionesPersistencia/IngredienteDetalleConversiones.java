/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesPersistencia;

import com.mycompany.pasteleriadocumentosanidadosmapeo.IngredienteDetalleMapeo;
import com.mycompany.pasteleriadominiodocumentosanidados.IngredienteDetalle;
import dto.DTO_IngredienteDetalle;

/**
 *
 * @author af_da
 */
public class IngredienteDetalleConversiones {

    protected IngredienteDetalle convertir(IngredienteDetalleMapeo detalleIngrediente) {
        IngredienteDetalle detalleIngredienteE = new IngredienteDetalle();
        detalleIngredienteE.setIngredienteId(detalleIngrediente.getIngredienteId().toHexString());
        detalleIngredienteE.setCantidad(detalleIngrediente.getCantidad());
        detalleIngredienteE.setNombre(detalleIngrediente.getNombre());
        return detalleIngredienteE;
    }
}
