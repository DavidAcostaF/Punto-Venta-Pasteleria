/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pastelerianegocio;

import com.mycompany.pastelerianegocio.dtos.DireccionDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PERSONAL
 */
public class ConsultarDirecciones implements IConsultarDirecciones{

    ConsultarClientes cc = new ConsultarClientes();
    
    @Override
    public List<DireccionDTO> consultarDirecciones() {
        List<DireccionDTO> direcciones;
        direcciones = new ArrayList<>();
        
        direcciones.add(new DireccionDTO("Calle 1", "Colonia A", "123", cc.consultarClientes().get(0)));
        direcciones.add(new DireccionDTO("Calle 2", "Colonia B", "456", cc.consultarClientes().get(1)));
        direcciones.add(new DireccionDTO("Calle 3", "Colonia C", "789", cc.consultarClientes().get(2)));
        direcciones.add(new DireccionDTO("Calle 4", "Colonia D", "1011", cc.consultarClientes().get(3)));
        
        return direcciones;
    }
}
