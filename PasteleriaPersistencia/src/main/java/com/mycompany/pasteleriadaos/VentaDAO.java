/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mycompany.pasteleriadominios.Cliente;
import com.mycompany.pasteleriadominios.Venta;
import conversiones.VentasConversiones;
import dto.DTO_Venta;
import java.util.ArrayList;
import java.util.List;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author f_aco
 */
public class VentaDAO implements IVentaDAO {

    private IConexion conexion;
    private DTO_Venta ventadto;
    private VentasConversiones conversor;

    public VentaDAO() {
    conexion=new Conexion("ventas",Venta.class);
    ventadto=new DTO_Venta();
    conversor=new VentasConversiones();
    }

    @Override
    public Venta agregarVenta(Venta venta) {
        MongoCollection<Venta> coleccion = conexion.obtenerColeccion();
        coleccion.insertOne(venta);
        return venta;
    }

    @Override
    public void eliminarVenta(Venta venta) {
        MongoCollection<Venta> coleccion = conexion.obtenerColeccion();
        try {
            coleccion.deleteOne(Filters.eq("_id", venta.getId()));
        } catch (MongoException e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public List<DTO_Venta> ventasPorCliente(String clienteId) {
          
        MongoCollection<Venta> coleccion = conexion.obtenerColeccion();
        Bson filtroCliente = eq("clienteid", new ObjectId(clienteId));
        FindIterable<Venta> ventasCliente = coleccion.find(filtroCliente);
        List<DTO_Venta> ventasDTO=new ArrayList<>();
        for (Venta venta : ventasCliente) {
            ventasDTO.add(conversor.convertirVentaADTO(venta));
        }
        return ventasDTO;
    }

}
