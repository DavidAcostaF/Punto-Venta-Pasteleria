/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.pasteleriaconsultarventas.FuncionalidadConsultarVentas;
import com.mycompany.pasteleriaconsultarventas.IFuncionalidadConsultarVentas;
import dto.DTO_Venta;

/**
 *
 * @author abelc
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         IFuncionalidadConsultarVentas funcionalidadConsultarVentas= new FuncionalidadConsultarVentas();
         DTO_Venta venta= new DTO_Venta();
         
         venta=funcionalidadConsultarVentas.encontrarVenta("663c5d4fa6ca7e6121d3e11r");
         System.out.println(venta.getID());
         System.out.println(venta.getCliente().getDirecciones());
    }
    
}
