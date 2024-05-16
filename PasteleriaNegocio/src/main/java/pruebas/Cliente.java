/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.pasteleriadaos.ClienteDAO;
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
        DTO_Cliente cliente = new DTO_Cliente();
        ClientesBO c = new ClientesBO();

        cliente=c.encontrarCliente("gsgs", "grgsgrs", "sgrsg", "43532");
        
        List<DTO_Direccion> direcciones = new ArrayList<>();
        direcciones=cliente.getDirecciones();
        direcciones.add(new DTO_Direccion("Calle", "joder", "1"));
        cliente.setDirecciones(direcciones);
        c.actualizarCliente(cliente);

    }

}
