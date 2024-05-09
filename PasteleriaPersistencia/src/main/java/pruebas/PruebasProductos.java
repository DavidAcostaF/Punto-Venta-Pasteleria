/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.pasteleriadaos.IIngredienteDAO;
import com.mycompany.pasteleriadaos.IProductoDAO;
import com.mycompany.pasteleriadaos.IngredienteDAO;
import com.mycompany.pasteleriadaos.ProductoDAO;
import com.mycompany.pasteleriadocumentosanidados.IngredienteDetalle;
import com.mycompany.pasteleriadominios.Ingrediente;
import com.mycompany.pasteleriadominios.Producto;
import dto.DTO_Ingrediente;
import org.bson.types.ObjectId;

/**
 *
 * @author af_da
 */
public class PruebasProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IIngredienteDAO ingredienteDAO = new IngredienteDAO();
        IProductoDAO productoDAO = new ProductoDAO();
        Ingrediente ingrediento1 = new Ingrediente();
        ingrediento1.setNombre("Azucar");
        ingrediento1.setCantidad(2);
        ingrediento1.setPrecio(123F);
        ingrediento1.setUnidadDeMedida("gramos");

        Ingrediente ingrediento2 = new Ingrediente();
        ingrediento2.setNombre("Az");
        ingrediento2.setCantidad(2);
        ingrediento2.setPrecio(123F);
        ingrediento2.setUnidadDeMedida("gramos");

        Producto producto = new Producto();
        producto.setNombre("Pastelongo");
        producto.setPrecio(100F);

        DTO_Ingrediente ingredienteConsultado1 = ingredienteDAO.consultarPorNombre(ingrediento1.getNombre());
        DTO_Ingrediente ingredienteConsultado2 = ingredienteDAO.consultarPorNombre(ingrediento1.getNombre());

        IngredienteDetalle ingredienteDetalle1 = new IngredienteDetalle();
        ingredienteDetalle1.setIngredienteId(new ObjectId(ingredienteConsultado1.getId()));
        ingredienteDetalle1.setCantidad(ingredienteConsultado1.getCantidad());
        ingredienteDetalle1.setNombre(ingredienteConsultado1.getNombre());

        IngredienteDetalle ingredienteDetalle2 = new IngredienteDetalle();
        ingredienteDetalle2.setIngredienteId(new ObjectId(ingredienteConsultado1.getId()));
        ingredienteDetalle2.setCantidad(ingredienteConsultado2.getCantidad());
        ingredienteDetalle2.setNombre(ingredienteConsultado2.getNombre());

        producto.addIngredienteDetalle(ingredienteDetalle1);
        producto.addIngredienteDetalle(ingredienteDetalle2);

        productoDAO.agregarProducto(producto);
    }

}
