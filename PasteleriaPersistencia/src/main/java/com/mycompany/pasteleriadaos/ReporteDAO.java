/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import Exceptions.PersistenciaException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mycompany.pasteleriadominioentidades.Reporte;
import com.mycompany.pasteleriadominiosMapeo.ReporteMapeo;
import conversionesPersistencia.ReportesConversiones;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author abelc
 */
public class ReporteDAO implements IReporte {

    private IConexion conexion;
    private ReportesConversiones conversor;

    public ReporteDAO() {
        conexion = new Conexion("Reportes", ReporteMapeo.class);
        conversor = new ReportesConversiones();
    }

    @Override
    public Reporte guardarReporte(Reporte reporte) throws PersistenciaException {
        MongoCollection<ReporteMapeo> coleccion = conexion.obtenerColeccion();
        coleccion.insertOne(conversor.reporteEntidadAMapeo(reporte));
        return reporte;
    }

    @Override
    public List<Reporte> consultarReportes() throws PersistenciaException {
        MongoCollection<ReporteMapeo> coleccion = conexion.obtenerColeccion();
        FindIterable<ReporteMapeo> reportes = coleccion.find();
        List<Reporte> reportesE = new ArrayList<>();
        for (ReporteMapeo reporteM : reportes) {
            reportesE.add(conversor.reporteMapeoAEntidad(reporteM));
        }
        return reportesE;
    }

    @Override
    public void eliminarReporte(Reporte reporte) throws PersistenciaException {
         try {
        MongoCollection<ReporteMapeo> coleccion = conexion.obtenerColeccion();
        coleccion.deleteOne(Filters.eq("_id", new ObjectId(reporte.getId())));
    } catch (Exception e) {
        throw new PersistenciaException("Error al eliminar el reporte: " + e.getMessage());
    }
    }

}
