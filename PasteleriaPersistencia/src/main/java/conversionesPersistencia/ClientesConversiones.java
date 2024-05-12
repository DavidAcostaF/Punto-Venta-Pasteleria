/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversionesPersistencia;

import com.mycompany.pasteleriadominioentidades.Cliente;
import com.mycompany.pasteleriadominiosMapeo.DireccionMapeo;
import com.mycompany.pasteleriadominiosMapeo.ClienteMapeo;
import com.mycompany.pasteleriadominioentidades.Direccion;
import dto.DTO_Cliente;

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author abelc
 */
public class ClientesConversiones {

    public ClientesConversiones() {
    }

    public Cliente convertirCliente(ClienteMapeo cliente) {
        Cliente Cliente = new Cliente();
        Cliente.setId(cliente.getId().toString());
        Cliente.setNombre(cliente.getNombre());
        Cliente.setApellidoP(cliente.getApellidoP());
        Cliente.setApellidoM(cliente.getApellidoM());
        Cliente.setTelefono(cliente.getTelefono());

        List<Direccion> direcciones = new ArrayList<>();
        for (DireccionMapeo direccion : cliente.getDirecciones()) {
            Direccion direccionE = new Direccion();
            direccionE.setColonia(direccion.getColonia());
            direccionE.setCalle(direccion.getCalle());
            direccionE.setNumExterior(direccion.getNumExterior());
            direcciones.add(direccionE);
        }

        Cliente.setDirecciones(direcciones);

        return Cliente;
    }

    public ClienteMapeo convertirClienteAMapeo(Cliente cliente) {
        if (cliente == null) {
            return null;
        }
        ClienteMapeo clienteMapeo = new ClienteMapeo();
        clienteMapeo.setId(new ObjectId(cliente.getId()));
        clienteMapeo.setNombre(cliente.getNombre());
        clienteMapeo.setApellidoP(cliente.getApellidoP());
        clienteMapeo.setApellidoM(cliente.getApellidoM());
        clienteMapeo.setTelefono(cliente.getTelefono());

        List<DireccionMapeo> direccionesMapeo = new ArrayList<>();
        for (Direccion direccion : cliente.getDirecciones()) {
            DireccionMapeo direccionMapeo = new DireccionMapeo();
            direccionMapeo.setColonia(direccion.getColonia());
            direccionMapeo.setCalle(direccion.getCalle());
            direccionMapeo.setNumExterior(direccion.getNumExterior());
            direccionesMapeo.add(direccionMapeo);
        }

        clienteMapeo.setDirecciones(direccionesMapeo);

        return clienteMapeo;
    }
    
     public ClienteMapeo convertirClienteAMapeoAgregar(Cliente cliente) {
        if (cliente == null) {
            return null;
        }
        ClienteMapeo clienteMapeo = new ClienteMapeo();
        clienteMapeo.setNombre(cliente.getNombre());
        clienteMapeo.setApellidoP(cliente.getApellidoP());
        clienteMapeo.setApellidoM(cliente.getApellidoM());
        clienteMapeo.setTelefono(cliente.getTelefono());

        List<DireccionMapeo> direccionesMapeo = new ArrayList<>();
        for (Direccion direccion : cliente.getDirecciones()) {
            DireccionMapeo direccionMapeo = new DireccionMapeo();
            direccionMapeo.setColonia(direccion.getColonia());
            direccionMapeo.setCalle(direccion.getCalle());
            direccionMapeo.setNumExterior(direccion.getNumExterior());
            direccionesMapeo.add(direccionMapeo);
        }

        clienteMapeo.setDirecciones(direccionesMapeo);

        return clienteMapeo;
    }
    
    public Cliente convertirClienteConRFC(ClienteMapeo cliente) {
        Cliente Cliente = new Cliente();
        Cliente.setId(cliente.getId().toString());
        Cliente.setNombre(cliente.getNombre());
        Cliente.setApellidoP(cliente.getApellidoP());
        Cliente.setApellidoM(cliente.getApellidoM());
        Cliente.setTelefono(cliente.getTelefono());
        Cliente.setRfc(cliente.getRfc());

        List<Direccion> direcciones = new ArrayList<>();
        for (DireccionMapeo direccion : cliente.getDirecciones()) {
            Direccion direccionE = new Direccion();
            direccionE.setColonia(direccion.getColonia());
            direccionE.setCalle(direccion.getCalle());
            direccionE.setNumExterior(direccion.getNumExterior());
            direcciones.add(direccionE);
        }

        Cliente.setDirecciones(direcciones);

        return Cliente;
    }

    public ClienteMapeo convertirClienteAMapeoConRFC(Cliente cliente) {
        if (cliente == null) {
            return null;
        }
        ClienteMapeo clienteMapeo = new ClienteMapeo();
        clienteMapeo.setId(new ObjectId(cliente.getId()));
        clienteMapeo.setNombre(cliente.getNombre());
        clienteMapeo.setApellidoP(cliente.getApellidoP());
        clienteMapeo.setApellidoM(cliente.getApellidoM());
        clienteMapeo.setTelefono(cliente.getTelefono());
        cliente.setRfc(cliente.getRfc());

        List<DireccionMapeo> direccionesMapeo = new ArrayList<>();
        for (Direccion direccion : cliente.getDirecciones()) {
            DireccionMapeo direccionMapeo = new DireccionMapeo();
            direccionMapeo.setColonia(direccion.getColonia());
            direccionMapeo.setCalle(direccion.getCalle());
            direccionMapeo.setNumExterior(direccion.getNumExterior());
            direccionesMapeo.add(direccionMapeo);
        }

        clienteMapeo.setDirecciones(direccionesMapeo);

        return clienteMapeo;
    }

    public List<Cliente> convertirDesdeClientes(List<ClienteMapeo> clientesMapeo) {
        List<Cliente> clientes = new ArrayList<>();
        for (ClienteMapeo clienteMapeo : clientesMapeo) {
            Cliente cliente = convertirCliente(clienteMapeo);
            clientes.add(cliente);
        }
        return clientes;
    }

}
