/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import com.mycompany.pasteleriadaos.IIngredienteDAO;
import com.mycompany.pasteleriadaos.IngredienteDAO;
import com.mycompany.pasteleriadominios.Ingrediente;
import dto.DTO_Ingrediente;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author af_da
 */
public class InventarioIngredientesBO implements IInventarioIngredientesBO {

    IIngredienteDAO ingredienteDAO;

    public InventarioIngredientesBO() {
        ingredienteDAO = new IngredienteDAO();
    }

    @Override
    public DTO_Ingrediente agregarIngrediente(DTO_Ingrediente ingrediente) {

        DTO_Ingrediente ingredienteNueva = ingredienteDAO.agregar(ConvertirDTOAIngrediente(ingrediente));
        return ingredienteNueva;
    }

    @Override
    public List<DTO_Ingrediente> consultarIngredientes() {
        List<DTO_Ingrediente> ingredientes = ingredienteDAO.consultar();

        return ingredientes;
    }

    @Override
    public Ingrediente ConvertirDTOAIngrediente(DTO_Ingrediente ingredienteDTO) {
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setCantidad(ingredienteDTO.getCantidad());
        ingrediente.setNombre(ingredienteDTO.getNombre());
        ingrediente.setPrecio(ingredienteDTO.getPrecio());
        ingrediente.setUnidadDeMedida(ingredienteDTO.getUnidadDeMedida());
        return ingrediente;
    }

    @Override
    public DTO_Ingrediente convertirIngredienteADTO(Ingrediente ingrediente) {
        DTO_Ingrediente dtoIngrediente = new DTO_Ingrediente();
        //dtoIngrediente.setId(ingrediente.getId());

        dtoIngrediente.setCantidad(ingrediente.getCantidad());
        dtoIngrediente.setNombre(ingrediente.getNombre());
        dtoIngrediente.setPrecio(ingrediente.getPrecio());
        dtoIngrediente.setUnidadDeMedida(ingrediente.getUnidadDeMedida());
        return dtoIngrediente;
    }

    @Override
    public List<DTO_Ingrediente> consultarIngrediente(DTO_Ingrediente ingredienteDTO) {
        List<DTO_Ingrediente> ingredientes = ingredienteDAO.consultar(ConvertirDTOAIngrediente(ingredienteDTO));

        return ingredientes;
    }

    @Override
    public DTO_Ingrediente validarExistencia(DTO_Ingrediente ingrediente) {
        DTO_Ingrediente ingredienteConsultado = ingredienteDAO.consultarPorNombre(ingrediente.getNombre());

        if (ingredienteConsultado != null) {
            return ingredienteConsultado;
        }
        return null;
    }

    @Override
    public DTO_Ingrediente actualizarIngrediente(DTO_Ingrediente ingrediente) {
        DTO_Ingrediente ingredienteConsultado = ingredienteDAO.consultarPorNombre(ingrediente.getNombre());
        if (ingredienteConsultado != null) {
            return ingredienteDAO.actualizar(ConvertirDTOAIngrediente(ingrediente));
        }
        return null;
    }

    @Override
    public Boolean eliminarIngrediente(DTO_Ingrediente ingrediente) {
        DTO_Ingrediente ingredienteConsultado = ingredienteDAO.consultarPorNombre(ingrediente.getNombre());
        if (ingredienteConsultado != null) {
            return ingredienteDAO.eliminar(ConvertirDTOAIngrediente(ingrediente));
        }
        return false;
    }

    @Override
    public DTO_Ingrediente consultarIngredientePorNombre(DTO_Ingrediente ingrediente) {
        DTO_Ingrediente ingredienteConsultado = ingredienteDAO.consultarPorNombre(ingrediente.getNombre());
        return ingredienteConsultado;
    }

}
