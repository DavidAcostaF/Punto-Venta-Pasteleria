/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.pasteleriadaos.IngredienteDAO;
import com.mycompany.pasteleriadominioentidades.Ingrediente;
import java.util.Arrays;

/**
 *
 * @author af_da
 */
public class PruebaIngredientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IngredienteDAO ingredienteDAO = new IngredienteDAO();
        String[] ids = {"66408dc23190850792b1ba41", "66408dc23190850792b1ba3f"};
//        for (Ingrediente ingrediente : ingredienteDAO.consultarIngredientesFaltantes(Arrays.asList(ids))) {
//            System.out.println(ingrediente.getId());
//        }
    }
    
}
