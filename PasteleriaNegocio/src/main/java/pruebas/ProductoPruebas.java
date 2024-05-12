/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.pasteleriadaos.ProductoDAO;
import com.mycompany.pasteleriadominiodocumentosanidados.IngredienteDetalle;
import com.mycompany.pasteleriadominioentidades.Producto;
import com.mycompany.pastelerianegocio.ProductosBO;
import conversionesnegocio.IngredienteConversiones;
import conversionesnegocio.IngredienteDetalleConversiones;
import dto.DTO_Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author af_da
 */
public class ProductoPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductosBO p = new ProductosBO();
        ProductoDAO dao = new ProductoDAO();
        Producto producto = new Producto();
        IngredienteDetalleConversiones conversor = new IngredienteDetalleConversiones();
        IngredienteConversiones conversorIngrediente = new IngredienteConversiones();
        producto.setNombre("Si");
        producto.setDescripcion("!@3");
        producto.setPrecio(0F);

        List<IngredienteDetalle> listaIngredientes = new ArrayList<>();

        IngredienteDetalle ingredienteDetalle1 = new IngredienteDetalle();
        ingredienteDetalle1.setNombre("Az");
        ingredienteDetalle1.setCantidad(200);
        ingredienteDetalle1.setIngredienteId(conversor.convertirIngredienteADetalleIngrediente(p.consultarIngredientePorNombre(ingredienteDetalle1.getNombre())).getIngredienteId());
        IngredienteDetalle ingredienteDetalle2 = new IngredienteDetalle();
        ingredienteDetalle2.setNombre("Azucar");
        ingredienteDetalle2.setCantidad(200);
        listaIngredientes.add(ingredienteDetalle1);
        ingredienteDetalle2.setIngredienteId(conversor.convertirIngredienteADetalleIngrediente(p.consultarIngredientePorNombre(ingredienteDetalle2.getNombre())).getIngredienteId());
        listaIngredientes.add(ingredienteDetalle2);

        producto.setIngredientes(listaIngredientes);
        DTO_Producto productoDTO = new DTO_Producto();
        //producto.set
        //p.agregarProducto(producto);
    }

}
