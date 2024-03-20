/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import com.mycompany.pastelerianegocio.dtos.ProductoDTO;
import gui.DlgAgregarPastel;
import javax.swing.JFrame;

/**
 *
 * @author abelc
 */
public class ControlAgregarVenta {
    
    public ControlAgregarVenta() {
    }
   
    public ProductoDTO agregarPastel(JFrame frame){
    ProductoDTO producto=new ProductoDTO();
    DlgAgregarPastel dlgpastel= new DlgAgregarPastel(frame,true,producto);
    return producto;
    }
}
