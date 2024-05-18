/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extras;

import dto.DTO_Direccion;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author PERSONAL
 */
public class DireccionesComboboxModel extends DefaultComboBoxModel<String>{
    
    public DireccionesComboboxModel(List<DTO_Direccion> direcciones) {
          super();
           addElement("");
        for (DTO_Direccion direccion : direcciones) {
            addElement(direccion.getCalle() + " " + direccion.getColonia() + " " + direccion.getNumExterior() + "");
        }
    }
    
}
