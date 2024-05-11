/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.pasteleriadaos.ClienteDAO;
import com.mycompany.pasteleriadominiosMapeo.ClienteMapeo;
import com.mycompany.pasteleriadominiosMapeo.DireccionMapeo;
import dto.DTO_Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abelc
 */
public class pruebaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClienteDAO clientedao=new ClienteDAO();
        ClienteMapeo cliente = new ClienteMapeo();
 
    cliente.setNombre("Taylor");
    cliente.setApellidoP("Swift");
    cliente.setApellidoM("Morales");
    cliente.setTelefono("644412345");

    // Crear algunas direcciones de ejemplo y agregarlas al cliente
    List<DireccionMapeo> direcciones = new ArrayList<>();
    direcciones.add(new DireccionMapeo("Calle wallabe #42", "sydney", "1"));
    direcciones.add(new DireccionMapeo("Calle 2", "Colonia 2", "2"));
    cliente.setDirecciones(direcciones);

    
    /* List<DTO_Cliente> clientes = clientedao.consultarClientes();
     
    // Imprimir la lista de clientes
    System.out.println("Clientes consultados:");
    for (DTO_Cliente cliente1 : clientes) {
        System.out.println(cliente1);
    }*/
    /*
    DTO_Cliente cliente1=clientedao.encontrarCliente("Perez", "Mendez", "Juan", "1234567890");
        System.out.println(cliente1.getDirecciones());
*/
    }
    
}
