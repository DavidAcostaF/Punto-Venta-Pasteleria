/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import Exceptions.PersistenciaException;
import com.mycompany.pasteleriadaos.ClienteDAO;
import com.mycompany.pasteleriadominioentidades.Cliente;
import com.mycompany.pasteleriadominioentidades.Direccion;
import com.mycompany.pasteleriadominiosMapeo.ClienteMapeo;
import com.mycompany.pasteleriadominiosMapeo.DireccionMapeo;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abelc
 */
public class pruebaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ClienteDAO clientedao=new ClienteDAO();
            Cliente cliente = new Cliente();
            Cliente cliente1=clientedao.encontrarCliente("gsgs", "grgsgrs", "sgrsg", "43532");
            List<Direccion> direcciones = new ArrayList<>();
            direcciones=cliente1.getDirecciones();
            direcciones.add(new Direccion("Calle wallabe #42", "sydney", "1"));
            direcciones.add(new Direccion("Calle 2", "sgrgr2", "2"));
            cliente.setDirecciones(direcciones);
            
            clientedao.actualizarCliente(cliente1);
            
//cliente = clientedao.encontrarClienteID("66406d0293d57d3040a5bdc8");
       //     System.out.println(cliente);
            /* List<DTO_Cliente> clientes = clientedao.consultarClientes();
            
            // Imprimir la lista de clientes
            System.out.println("Clientes consultados:");
            for (DTO_Cliente cliente1 : clientes) {
            System.out.println(cliente1);
            }*/
            /*
            DTO_Cliente cliente1=clientedao.encontrarCliente("Perez", "Mendez", "Juan", "1234567890");
            System.out.println(cliente1.getDirecciones());
        */      } catch (PersistenciaException ex) {
            Logger.getLogger(pruebaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
