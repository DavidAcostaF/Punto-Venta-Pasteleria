/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extras;

import dto.DTO_Venta;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author abelc
 */
public class VentasTableModel extends AbstractTableModel {

    public List<DTO_Venta> listaVentas;
    private String[] columnNames = {"Fecha de Registro", "Fecha de Entrega", "Estado","Total"};
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public VentasTableModel(List<DTO_Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    @Override
    public int getRowCount() {
        return listaVentas.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DTO_Venta venta = listaVentas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return formatDate(venta.getFechaRegistro());
            case 1:
                return formatDate(venta.getFechaEntrega());
            case 2:
                return venta.getEstado();
            case 3:
                return "$"+venta.getMontoTotal();
            default:
                return null;
        }
    }

    public void limpiarTabla() {
    listaVentas.clear(); 
    fireTableDataChanged();
}
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    public DTO_Venta getVentaAt(int rowIndex) {
        return listaVentas.get(rowIndex);
    }

    private String formatDate(Date date) {
        if (date != null) {
            return dateFormat.format(date);
        } else {
            return "";
        }
    }

    public List<DTO_Venta> getAllVentas() {
        return new ArrayList<>(listaVentas);
    }
}
