/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesPersistencia;

import com.mycompany.pasteleriadocumentosanidadosmapeo.IngredienteDetalleMapeo;
import com.mycompany.pasteleriadominioentidades.Producto;
import com.mycompany.pasteleriadominiosMapeo.ProductoMapeo;
import dto.DTO_Producto;

/**
 *
 * @author af_da
 */
public class ProductosConversiones {

    public Producto convertirProducto(ProductoMapeo producto) {
        Producto productoE = new Producto();
        IngredienteDetalleConversiones convertirIngredienteDetalle = new IngredienteDetalleConversiones();

        productoE.setId(producto.getId().toHexString());
        productoE.setPrecio(producto.getPrecio());
        productoE.setNombre(producto.getNombre());
        productoE.setDescripcion(producto.getDescripcion());

        for (IngredienteDetalleMapeo ingredienteDetalle : producto.getIngredientes()) {
            productoE.addIngredienteDetalle(convertirIngredienteDetalle.convertir(ingredienteDetalle));
        }
        
        return productoE;
    }
}
