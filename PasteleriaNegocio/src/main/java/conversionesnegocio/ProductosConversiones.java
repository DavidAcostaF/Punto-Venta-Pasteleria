/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesnegocio;

import com.mycompany.pasteleriadominiodocumentosanidados.IngredienteDetalle;
import com.mycompany.pasteleriadominioentidades.Producto;
import dto.DTO_IngredienteDetalle;
import dto.DTO_Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abelc
 */
public class ProductosConversiones {

    public DTO_Producto convertirProducto(Producto producto) {
        DTO_Producto productoDTO = new DTO_Producto();
        IngredienteDetalleConversiones convertirIngredienteDetalle = new IngredienteDetalleConversiones();

        productoDTO.setId(producto.getId());
        productoDTO.setPrecio(producto.getPrecio());
        productoDTO.setNombre(producto.getNombre());
        productoDTO.setDescripcion(producto.getDescripcion());

        for (IngredienteDetalle ingredienteDetalle : producto.getIngredientes()) {
            productoDTO.addDTO_IngredienteDetalle(convertirIngredienteDetalle.convertir(ingredienteDetalle));
        }

        return productoDTO;
    }

    public List<DTO_Producto> convertirListaProductos(List<Producto> productos) {
        List<DTO_Producto> listaDTOProductos = new ArrayList<>();
        IngredienteDetalleConversiones convertirIngredienteDetalle = new IngredienteDetalleConversiones();

        for (Producto producto : productos) {
            listaDTOProductos.add(convertirProducto(producto));
        }

        return listaDTOProductos;
    }

    public Producto convertirAEntidad(DTO_Producto productoDTO) {
        Producto producto = new Producto();
        IngredienteDetalleConversiones convertirIngredienteDetalle = new IngredienteDetalleConversiones();
        producto.setId(productoDTO.getId());
        producto.setNombre(productoDTO.getNombre());
        producto.setPrecio(productoDTO.getPrecio());
        producto.setDescripcion(productoDTO.getDescripcion());

        for (DTO_IngredienteDetalle id : productoDTO.getIngredientes()) {
            producto.addIngredienteDetalle(convertirIngredienteDetalle.convertir(id));

        }
        return producto;
    }

    public List<Producto> convertirListaProductosEntidad(List<DTO_Producto> productos) {
        List<Producto> listaProductos = new ArrayList<>();
        IngredienteDetalleConversiones convertirIngredienteDetalle = new IngredienteDetalleConversiones();

        for (DTO_Producto producto : productos) {
            listaProductos.add(convertirAEntidad(producto));
        }

        return listaProductos;
    }
}
