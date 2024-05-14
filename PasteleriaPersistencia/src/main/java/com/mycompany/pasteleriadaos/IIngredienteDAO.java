/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mycompany.pasteleriadominioentidades.Ingrediente;
import com.mycompany.pasteleriadominiosMapeo.IngredienteMapeo;
import java.util.List;

/**
 *
 * @author af_da
 */
public interface IIngredienteDAO {

    public Ingrediente agregar(IngredienteMapeo ingrediente);

    public Ingrediente actualizar(IngredienteMapeo ingrediente);

    public List<Ingrediente> consultar();

    public List<Ingrediente> consultar(IngredienteMapeo ingrediente);

    public Ingrediente consultarPorNombre(String nombre);

    public Boolean eliminar(IngredienteMapeo ingrediente);

    public List<Ingrediente> consultarIngredientesFaltantes(List<String> ingredientesIds);

    public List<Ingrediente> consultarCantidadesIngredientesInventario(List<String> ingredientesNombres);

    public List<Ingrediente> consultarIngredientesConStock();

}
