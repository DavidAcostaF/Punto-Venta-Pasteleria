/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.pasteleriadaos.IIngredienteDAO;
import com.mycompany.pasteleriadaos.IngredienteDAO;
import com.mycompany.pasteleriadominios.Ingrediente;

/**
 *
 * @author af_da
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IIngredienteDAO ingredienteDAO = new IngredienteDAO();
        Ingrediente ingrediento = new Ingrediente();
        ingrediento.setNombre("a");        
        System.out.println(ingredienteDAO.consultar(ingrediento));
    }
    
}