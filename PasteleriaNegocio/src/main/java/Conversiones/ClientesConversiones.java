/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones;

import com.mycompany.pasteleriadominioentidades.Cliente;
import com.mycompany.pasteleriadominioentidades.Direccion;
import dto.DTO_Cliente;
import dto.DTO_Direccion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abelc
 */
public class ClientesConversiones {
     public ClientesConversiones() {
    }

    public DTO_Cliente convertirCliente(Cliente cliente) {
        DTO_Cliente dtoCliente = new DTO_Cliente();
        dtoCliente.setID(cliente.getId()); 
        dtoCliente.setNombre(cliente.getNombre());
        dtoCliente.setApellidoP(cliente.getApellidoP());
        dtoCliente.setApellidoM(cliente.getApellidoM());
        dtoCliente.setTelefono(cliente.getTelefono());

        List<DTO_Direccion> direcciones = new ArrayList<>();
        for (Direccion direccion : cliente.getDirecciones()) {
            DTO_Direccion dtoDireccion = new DTO_Direccion();
            dtoDireccion.setColonia(direccion.getColonia());
            dtoDireccion.setCalle(direccion.getCalle());
            dtoDireccion.setNumExterior(direccion.getNumExterior());
            direcciones.add(dtoDireccion);
        }
        dtoCliente.setDirecciones(direcciones);

        return dtoCliente;
    }

    public List<DTO_Cliente> convertirDesdeClientes(List<Cliente> clientes) {
        List<DTO_Cliente> dtosClientes = new ArrayList<>();
        for (Cliente cliente : clientes) {
            dtosClientes.add(convertirCliente(cliente));
        }
        return dtosClientes;
    } 
}
