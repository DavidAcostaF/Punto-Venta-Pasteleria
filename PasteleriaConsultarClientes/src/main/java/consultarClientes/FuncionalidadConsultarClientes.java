/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultarClientes;

import com.mycompany.pastelerianegocio.IVentasBO;
import com.mycompany.pastelerianegocio.VentasBO;
import dto.DTO_Cliente;
import java.util.List;

/**
 *
 * @author Paco
 */
public class FuncionalidadConsultarClientes implements IFuncionalidadConsultarClientes{
    
    private IVentasBO ventaBO;

    public FuncionalidadConsultarClientes() {
        this.ventaBO = new VentasBO();
    }
    
    @Override
    public List<DTO_Cliente> consultarClientes() {
        List<DTO_Cliente> clientes;

        clientes = this.ventaBO.consultarClientes();

        return clientes;
    }
}
