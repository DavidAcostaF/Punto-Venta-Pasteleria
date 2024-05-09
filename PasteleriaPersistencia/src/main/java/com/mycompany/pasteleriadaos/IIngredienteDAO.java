/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mycompany.pasteleriadominios.Ingrediente;
import dto.DTO_Ingrediente;
import java.util.List;

/**
 *
 * @author af_da
 */
public interface IIngredienteDAO {

    public DTO_Ingrediente agregar(Ingrediente ingrediente);

    public DTO_Ingrediente actualizar(Ingrediente ingrediente);

    public List<DTO_Ingrediente> consultar();

    public List<DTO_Ingrediente> consultar(Ingrediente ingrediente);

    public DTO_Ingrediente consultarPorNombre(String nombre);

    public Boolean eliminar(Ingrediente ingrediente);
}
