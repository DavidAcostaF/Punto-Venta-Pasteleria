/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extras;

import dto.DTO_Producto;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author PERSONAL
 */
public class PastelComboBoxModel extends DefaultComboBoxModel {
   
    public PastelComboBoxModel(List<DTO_Producto> lista) {
        super();
        for (DTO_Producto producto : lista) {
            addElement(producto.getNombre());
        }
    }
   
}
