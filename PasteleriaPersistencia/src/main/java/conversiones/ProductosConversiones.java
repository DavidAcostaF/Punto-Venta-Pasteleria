/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversiones;

import com.mycompany.pasteleriadocumentosanidados.IngredienteDetalle;
import com.mycompany.pasteleriadominios.Producto;
import dto.DTO_Producto;

/**
 *
 * @author af_da
 */
public class ProductosConversiones {

    public DTO_Producto convertirProducto(Producto producto) {
        DTO_Producto productoDTO = new DTO_Producto();
        IngredienteDetalleConversiones convertirIngredienteDetalle = new IngredienteDetalleConversiones();

        productoDTO.setId(producto.getId().toHexString());
        productoDTO.setPrecio(producto.getPrecio());
        productoDTO.setNombre(producto.getNombre());
        productoDTO.setDescripcion(producto.getDescripcion());

        for (IngredienteDetalle ingredienteDetalle : producto.getIngredientes()) {
            productoDTO.addDTO_IngredienteDetalle(convertirIngredienteDetalle.convertir(ingredienteDetalle));
        }
        
        return productoDTO;
    }
}
