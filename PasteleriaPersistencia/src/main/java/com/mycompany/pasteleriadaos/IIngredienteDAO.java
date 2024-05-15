/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import Exceptions.PersistenciaException;
import com.mycompany.pasteleriadominioentidades.Ingrediente;
import com.mycompany.pasteleriadominiosMapeo.IngredienteMapeo;
import java.util.List;

/**
 *
 * @author af_da
 */
public interface IIngredienteDAO {

    public Ingrediente agregar(IngredienteMapeo ingrediente)throws PersistenciaException;

    public Ingrediente actualizar(IngredienteMapeo ingrediente)throws PersistenciaException;

    public List<Ingrediente> consultar()throws PersistenciaException;

    public List<Ingrediente> consultar(IngredienteMapeo ingrediente)throws PersistenciaException;

    public Ingrediente consultarPorNombre(String nombre)throws PersistenciaException;

    public Boolean eliminar(IngredienteMapeo ingrediente)throws PersistenciaException;

    public List<Ingrediente> consultarIngredientesFaltantes(List<String> ingredientesIds)throws PersistenciaException;

    public List<Ingrediente> consultarCantidadesIngredientesInventario(List<String> ingredientesNombres)throws PersistenciaException;

    public List<Ingrediente> consultarIngredientesConStock()throws PersistenciaException;

}
