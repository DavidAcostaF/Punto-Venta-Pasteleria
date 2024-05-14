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
import dto.DTO_IngredienteDetalle;
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

        System.out.println(p.consultarListaProductosConStock());
        List<DTO_Producto> productos = p.consultarListaProductosConStock();
        if (productos == null) {
            return;
        }
        System.out.println(productos);
//        for (DTO_Producto prod : productos) {
//            System.out.println("Producto " + prod.getNombre());
//            System.out.println("Descripcion " + prod.getDescripcion());
//            System.out.println("Precio " + String.valueOf(prod.getPrecio()));
//            System.out.println("Detalles ");
//
//            for (DTO_IngredienteDetalle de : prod.getIngredientes()) {
//                System.out.println("Detalle nombre " + de.getNombre());
//                System.out.println("Detalle cantidad " + de.getCantidad());
//
//            }
//            System.out.println("siguiente producto");
//        }
//
//
//        List<DTO_IngredienteDetalle> listaIngredientes = new ArrayList<>();
//
//        DTO_IngredienteDetalle ingredienteDetalle1 = new DTO_IngredienteDetalle();
//        ingredienteDetalle1.setNombre("Azucar");
//        ingredienteDetalle1.setCantidad(200);
//        DTO_IngredienteDetalle ingredienteDetalle2 = new DTO_IngredienteDetalle();
//        ingredienteDetalle2.setNombre("Leche");
//        ingredienteDetalle2.setCantidad(200);
//        listaIngredientes.add(ingredienteDetalle1);
//        listaIngredientes.add(ingredienteDetalle2);
//
//        DTO_Producto productoDTO = new DTO_Producto();
//        productoDTO.setIngredientes(listaIngredientes);
//        productoDTO.setNombre("Si");
//        productoDTO.setDescripcion("!@3");
//        p.agregarProducto(productoDTO);
    }

}
