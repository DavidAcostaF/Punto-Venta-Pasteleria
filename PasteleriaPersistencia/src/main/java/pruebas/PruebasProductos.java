/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.pasteleriadaos.IIngredienteDAO;
import com.mycompany.pasteleriadaos.IProductoDAO;
import com.mycompany.pasteleriadaos.IngredienteDAO;
import com.mycompany.pasteleriadaos.ProductoDAO;
import com.mycompany.pasteleriadocumentosanidadosmapeo.IngredienteDetalleMapeo;
import com.mycompany.pasteleriadominioentidades.Ingrediente;
import com.mycompany.pasteleriadominioentidades.Producto;
import com.mycompany.pasteleriadominiosMapeo.IngredienteMapeo;
import com.mycompany.pasteleriadominiosMapeo.ProductoMapeo;
import java.util.List;
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

        Producto producto = productoDAO.consultar("6641fd5d3711d5016e6f8a86");
        producto.setNombre("Dzxc");
       productoDAO.actualizar(producto);
    }
}
