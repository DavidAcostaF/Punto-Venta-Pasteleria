/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultarClientes;


import com.mycompany.pastelerianegocio.ClientesBO;
import com.mycompany.pastelerianegocio.IClientesBO;
import dto.DTO_Cliente;
import java.util.List;

/**
 *
 * @author Paco
 */
public class FuncionalidadConsultarClientes implements IFuncionalidadConsultarClientes {

    private IClientesBO clientesBO;

    public FuncionalidadConsultarClientes() {
        this.clientesBO = new ClientesBO();
    }

    @Override
    public List<DTO_Cliente> consultarClientes() {
        List<DTO_Cliente> clientes = clientesBO.consultarClientes();
        return clientes;
    }

    @Override
    public DTO_Cliente encontrarCliente(String apellidoPaterno, String apellidoMaterno, String nombres, String telefono) {
        DTO_Cliente cliente = clientesBO.encontrarCliente(apellidoPaterno, apellidoMaterno, nombres, telefono);
        return cliente;
    }

    @Override
    public DTO_Cliente encontrarClienteID(String idCliente) {
       return clientesBO.encontrarClienteID(idCliente);
    }

 
}
