
import com.mycompany.pastelerianegocio.VentasBO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author abelc
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       VentasBO ventabo=new VentasBO();
       
        System.out.println(ventabo.consultarClientes());
    }
    
}
