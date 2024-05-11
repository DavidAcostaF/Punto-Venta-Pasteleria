/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriadaos;

import Exceptions.PersistenciaException;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoException;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Field;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.regex;
import com.mongodb.client.model.Projections;
import com.mycompany.pasteleriadominios.Cliente;
import com.mycompany.pasteleriadominios.Venta;
import conversiones.VentasConversiones;
import dto.DTO_Producto;
import dto.DTO_Venta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.bson.Document;
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
        conexion = new Conexion("ventas", Venta.class);
        ventadto = new DTO_Venta();
        conversor = new VentasConversiones();

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
        List<DTO_Venta> ventasDTO = new ArrayList<>();
        for (Venta venta : ventasCliente) {
            ventasDTO.add(conversor.convertirVentaADTO(venta));
        }
        return ventasDTO;
    }

    @Override
    public List<DTO_Venta> consultarVentas() {
        MongoCollection<Venta> coleccion = conexion.obtenerColeccion();
        FindIterable<Venta> ventas = coleccion.find();
        List<DTO_Venta> ventasDTO = new ArrayList<>();
        for (Venta venta : ventas) {
            ventasDTO.add(conversor.convertirVentaADTO(venta));
        }
        return ventasDTO;
    }

    @Override
    public List<DTO_Venta> consultarVentasPorFecha(Date fecha) {
        MongoCollection<Venta> coleccion = conexion.obtenerColeccion();
        Bson filtroFecha = eq("fechaRegistro", fecha);
        FindIterable<Venta> ventasPorFecha = coleccion.find(filtroFecha);
        List<DTO_Venta> ventasDTO = new ArrayList<>();
        for (Venta venta : ventasPorFecha) {
            ventasDTO.add(conversor.convertirVentaADTO(venta));
        }
        return ventasDTO;
    }

    @Override
    public List<DTO_Venta> consultarVentasPorRangoFechas(Date fechaInicio, Date fechaFin) {
        MongoCollection<Venta> coleccion = conexion.obtenerColeccion();
        Bson filtroRangoFechas = Filters.and(
                Filters.gte("fechaRegistro", fechaInicio),
                Filters.lte("fechaRegistro", fechaFin)
        );

        FindIterable<Venta> ventasPorRangoFechas = coleccion.find(filtroRangoFechas);
        List<DTO_Venta> ventasDTO = new ArrayList<>();
        for (Venta venta : ventasPorRangoFechas) {
            ventasDTO.add(conversor.convertirVentaADTO(venta));
        }
        return ventasDTO;
    }

    @Override
    public DTO_Venta encontrarVenta(String idVenta) throws PersistenciaException {
        try {
            ObjectId objectIdVenta = new ObjectId(idVenta);

            MongoCollection<Venta> coleccion = conexion.obtenerColeccion();
            List<Bson> pipeline = Arrays.asList(
                    Aggregates.match(Filters.eq("_id", objectIdVenta)),
                    Aggregates.lookup("clientes", "clienteid", "_id", "cliente"),
                    Aggregates.addFields(new Field<>("cliente", new Document("$arrayElemAt", Arrays.asList("$cliente", 0)))),
                    Aggregates.lookup("productos", "detallesVenta.productoId", "_id", "producto"),
                    Aggregates.addFields(new Field<>("detallesVenta.producto", new Document("$arrayElemAt", Arrays.asList("$producto", 0)))),
                    Aggregates.project(Projections.fields(
                            Projections.include("_id", "clienteid", "cliente", "detallesVenta", "direccionEntrega", "estado", "fechaEntrega", "fechaRegistro", "montoTotal")
                    ))
            );
            AggregateIterable<Venta> resultados = coleccion.aggregate(pipeline);
            Venta ventaEncontrada = resultados.first();

            return conversor.convertirADTO(ventaEncontrada);
        } catch (IllegalArgumentException e) {
            throw new PersistenciaException("ID de venta no válido: " + idVenta);
        }
    }

    @Override
    public List<DTO_Venta> consultarVentasPorProductos(List<DTO_Producto> listaProductos) throws PersistenciaException {
        try {
            List<ObjectId> idsProductos = listaProductos.stream()
                    .map(producto -> new ObjectId(producto.getId()))
                    .collect(Collectors.toList());

            Bson filtro = Filters.in("detallesVenta.productoId", idsProductos);

            MongoCollection<Venta> coleccion = conexion.obtenerColeccion();
            List<Bson> pipeline = Arrays.asList(
                    Aggregates.match(filtro),
                    Aggregates.lookup("clientes", "clienteid", "_id", "cliente"),
                    Aggregates.addFields(new Field<>("cliente", new Document("$arrayElemAt", Arrays.asList("$cliente", 0)))),
                    Aggregates.project(Projections.fields(
                            Projections.include("_id", "clienteid", "cliente", "detallesVenta", "direccionEntrega", "estado", "fechaEntrega", "fechaRegistro", "montoTotal")
                    ))
            );

            AggregateIterable<Venta> resultados = coleccion.aggregate(pipeline);
            List<DTO_Venta> ventas = new ArrayList<>();
            for (Venta venta : resultados) {
                ventas.add(conversor.convertirVentaADTO(venta));
            }
            return ventas;
        } catch (IllegalArgumentException e) {
            throw new PersistenciaException("Error al consultar ventas por productos: " + e.getMessage());
        }
    }

    @Override
    public List<DTO_Venta> consultarVentasConFiltros(String clienteId, Date fechaInicio, Date fechaFin, List<DTO_Producto> listaProductos) throws PersistenciaException {
       try {
        MongoCollection<Venta> coleccion = conexion.obtenerColeccion();

        List<Bson> filtros = new ArrayList<>();

        if (clienteId != null && !clienteId.isEmpty()) {
            filtros.add(eq("clienteid", new ObjectId(clienteId)));
        }

        if (fechaInicio != null && fechaFin != null) {
            Bson filtroRangoFechas = Filters.and(
                    Filters.gte("fechaRegistro", fechaInicio),
                    Filters.lte("fechaRegistro", fechaFin)
            );
            filtros.add(filtroRangoFechas);
        }

        // Filtro por productos
        List<ObjectId> idsProductos = null;
        if (listaProductos != null && !listaProductos.isEmpty()) {
            idsProductos = listaProductos.stream()
                    .map(producto -> new ObjectId(producto.getId()))
                    .collect(Collectors.toList());
            
            filtros.add(Filters.in("detallesVenta.productoId", idsProductos));
        }

        Bson filtroFinal = Filters.and(filtros);

        FindIterable<Venta> ventasFiltradas = coleccion.find(filtroFinal);
        List<DTO_Venta> ventasDTO = new ArrayList<>();
        for (Venta venta : ventasFiltradas) {
            ventasDTO.add(conversor.convertirVentaADTO(venta));
        }

        return ventasDTO;
    } catch (Exception e) {
        throw new PersistenciaException("Error al consultar ventas con filtros: " + e.getMessage());
    }
    }
}
