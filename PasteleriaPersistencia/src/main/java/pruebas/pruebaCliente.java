/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.pasteleriadaos.ClienteDAO;
import com.mycompany.pasteleriadominios.Cliente;
import com.mycompany.pasteleriadominios.Direccion;
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
        Cliente cliente = new Cliente();
 
   /* cliente.setNombre("Maria");
    cliente.setApellidoP("Gonzales");
    cliente.setApellidoM("KK");
    cliente.setTelefono("12345654890");

    // Crear algunas direcciones de ejemplo y agregarlas al cliente
    List<Direccion> direcciones = new ArrayList<>();
    direcciones.add(new Direccion("Calle 1", "Colonia 1", "1"));
    direcciones.add(new Direccion("Calle 2", "Colonia 2", "2"));
    cliente.setDirecciones(direcciones);
    
    clientedao.agregarCliente(cliente);*/
    
     List<DTO_Cliente> clientes = clientedao.consultarClientes();
     
    // Imprimir la lista de clientes
    System.out.println("Clientes consultados:");
    for (DTO_Cliente cliente1 : clientes) {
        System.out.println(cliente1);
    }
    }
    
}
