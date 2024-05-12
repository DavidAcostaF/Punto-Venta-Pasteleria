/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesPersistencia;

import com.mycompany.pasteleriadocumentosanidadosmapeo.IngredienteDetalleMapeo;
import com.mycompany.pasteleriadominiodocumentosanidados.IngredienteDetalle;
import com.mycompany.pasteleriadominioentidades.Producto;
import com.mycompany.pasteleriadominiosMapeo.ProductoMapeo;
import dto.DTO_Producto;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author af_da
 */
public class ProductosConversiones {

    private IngredienteDetalleConversiones ingredienteDetalleConversiones;

    public ProductosConversiones() {
        ingredienteDetalleConversiones = new IngredienteDetalleConversiones();
    }

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

    public ProductoMapeo convertirProductoMapeo(Producto producto) {
        ProductoMapeo productoM = new ProductoMapeo();
        productoM.setPrecio(producto.getPrecio());
        productoM.setNombre(producto.getNombre());
        productoM.setDescripcion(producto.getDescripcion());

        List<IngredienteDetalleMapeo> ingredientesMapeo = new ArrayList<>();
        for (IngredienteDetalle ingredienteDetalle : producto.getIngredientes()) {
            IngredienteDetalleMapeo ingredienteDetalleM = ingredienteDetalleConversiones.convertirMapeo(ingredienteDetalle);
            ingredientesMapeo.add(ingredienteDetalleM);
        }
        productoM.setIngredientes(ingredientesMapeo);

        return productoM;
    }
}
