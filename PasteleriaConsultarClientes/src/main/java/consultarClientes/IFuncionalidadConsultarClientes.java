/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package consultarClientes;


import dto.DTO_Cliente;
import java.util.List;

/**
 *
 * @author Paco
 */
public interface IFuncionalidadConsultarClientes {
    public List<DTO_Cliente> consultarClientes();
    
     public DTO_Cliente encontrarCliente(String apellidoPaterno, String apellidoMaterno, String nombres, String telefono);
     
     public DTO_Cliente encontrarClienteID(String idCliente);
}
