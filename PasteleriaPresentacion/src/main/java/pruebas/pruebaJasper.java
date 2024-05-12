/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import com.mycompany.pasteleriaconsultarventas.FuncionalidadConsultarVentas;
import com.mycompany.pasteleriaconsultarventas.IFuncionalidadConsultarVentas;
import dto.DTO_ReporteVentasFormato;
import dto.DTO_Venta;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author abelc
 */
public class pruebaJasper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JRException {
        IFuncionalidadConsultarVentas funcionalidadConsultarVentas = new FuncionalidadConsultarVentas();
        List<DTO_Venta> ventas = funcionalidadConsultarVentas.consultarVentas();
        List<DTO_ReporteVentasFormato> reporteVentas=new ArrayList<>();
        SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
        for (DTO_Venta venta : ventas) {
            DTO_ReporteVentasFormato r= new DTO_ReporteVentasFormato();
            r.setFechaEntrega(ff.format(venta.getFechaEntrega()));
            r.setFechaCompra(ff.format(venta.getFechaRegistro()));
            r.setEstado(venta.getEstado());
            r.setTotal(Float.toString(venta.getMontoTotal()));
            reporteVentas.add(r);
            r.getEstado();
        }
        

        if (reporteVentas == null) {
            System.out.println("no jala");
            return;
        }
        
        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(reporteVentas);

        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("ds", itemsJRBean);
        
        InputStream input = null;
        try {
            input = new FileInputStream(new File("src\\main\\resources\\JasperFile\\ReporteVentas.jrxml"));

            JasperDesign jasperDesign = JRXmlLoader.load(input);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

            JasperViewer.viewReport(jasperPrint,false);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(pruebaJasper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(pruebaJasper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
