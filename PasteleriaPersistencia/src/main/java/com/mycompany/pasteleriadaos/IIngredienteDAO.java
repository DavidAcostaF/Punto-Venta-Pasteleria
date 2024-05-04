/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mycompany.pasteleriadominios.Ingrediente;
import java.util.List;

/**
 *
 * @author af_da
 */
public interface IIngredienteDAO {

    public Ingrediente agregar(Ingrediente ingrediente);

    public Boolean actualizar();

    public List<Ingrediente> consultar();
    public List<Ingrediente> consultar(Ingrediente ingrediente);
}
