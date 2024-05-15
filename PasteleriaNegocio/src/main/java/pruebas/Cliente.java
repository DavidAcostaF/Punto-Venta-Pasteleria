/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.pasteleriadominioentidades.Direccion;
import com.mycompany.pastelerianegocio.ClientesBO;
import dto.DTO_Cliente;
import dto.DTO_Direccion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abelc
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DTO_Cliente cliente=new DTO_Cliente();
        ClientesBO c= new ClientesBO();
        cliente.setNombre("Putisco");
            cliente.setApellidoP("hola");
            cliente.setApellidoM("Morales");
            cliente.setTelefono("644412345");

            List<DTO_Direccion> direcciones = new ArrayList<>();
            direcciones.add(new DTO_Direccion("Calle wallabe #42", "sydney", "1"));
            direcciones.add(new DTO_Direccion("Calle 2", "Colonia 2", "2"));
            cliente.setDirecciones(direcciones);
            
            c.agregarCliente(cliente);
            
    }
    
}
