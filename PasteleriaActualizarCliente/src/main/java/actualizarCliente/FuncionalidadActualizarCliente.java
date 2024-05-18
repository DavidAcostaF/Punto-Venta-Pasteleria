/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actualizarCliente;

import com.mycompany.pastelerianegocio.ClientesBO;
import com.mycompany.pastelerianegocio.IClientesBO;
import dto.DTO_Cliente;

/**
 *
 * @author PERSONAL
 */
public class FuncionalidadActualizarCliente implements IFuncionalidadActualizarCliente {

    IClientesBO clientesBO;

    public FuncionalidadActualizarCliente() {
        this.clientesBO = new ClientesBO();
    }
    
    @Override
    public DTO_Cliente actualizarCliente(DTO_Cliente cliente) {
        DTO_Cliente dtoCliente = clientesBO.actualizarClienteEnVentas(cliente);
        return dtoCliente;
    }
    
    @Override
    public DTO_Cliente actualizarClienteConRfc(DTO_Cliente cliente){
        DTO_Cliente dtoCliente = clientesBO.actualizarClienteEnVentasConRFC(cliente);
        return dtoCliente;
    }
}
