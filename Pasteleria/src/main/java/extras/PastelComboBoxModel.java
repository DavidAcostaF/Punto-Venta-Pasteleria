/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extras;

import com.mycompany.pastelerianegocio.dtos.ProductoDTO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author PERSONAL
 */
public class PastelComboBoxModel extends DefaultComboBoxModel {
   
    public PastelComboBoxModel(List<ProductoDTO> lista) {
        super();
        for (ProductoDTO producto : lista) {
            addElement(producto.getNombre());
        }
    }
   
}
