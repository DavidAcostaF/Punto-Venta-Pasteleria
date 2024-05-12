/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.pasteleriadominioentidades.Producto;
import com.mycompany.pastelerianegocio.ProductosBO;

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
        System.out.println(p.consultarIngredientePorNombre("Az").getId());
    }
    
}
