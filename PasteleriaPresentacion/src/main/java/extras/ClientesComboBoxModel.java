/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extras;

import dto.DTO_Cliente;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author abelc
 */
public class ClientesComboBoxModel extends DefaultComboBoxModel{

    public ClientesComboBoxModel(List<DTO_Cliente> clientes) {
          super();
           addElement("Todos");
        for (DTO_Cliente cliente : clientes) {
            addElement(cliente.getNombre()+" "+cliente.getApellidoP()+" "+cliente.getApellidoM()+"-"+cliente.getTelefono());
        }
    }
    
}
