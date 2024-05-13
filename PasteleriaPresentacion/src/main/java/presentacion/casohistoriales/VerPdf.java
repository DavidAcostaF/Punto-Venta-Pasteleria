/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion.casohistoriales;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

/**
 *
 * @author abelc
 */
public class VerPdf extends JFrame {

    private byte[] pdfBytes;

    public VerPdf(byte[] pdfBytes) {
        super("PDF Viewer");
        this.pdfBytes = pdfBytes;
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 600);

        try {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(pdfBytes);
            PDDocument document = PDDocument.load(inputStream);
            PDFRenderer renderer = new PDFRenderer(document);
            int pageCount = document.getNumberOfPages();
            JPanel panel = new JPanel(new GridLayout(pageCount, 1));
            for (int i = 0; i < pageCount; i++) {
                BufferedImage image = renderer.renderImageWithDPI(i, 100);
                JLabel label = new JLabel(new ImageIcon(image));
                panel.add(label);
            }
            JScrollPane scrollPane = new JScrollPane(panel);
            add(scrollPane, BorderLayout.CENTER);

            JButton guardarButton = new JButton("Guardar PDF");
            guardarButton.setBackground(new Color(140, 220, 254));
            guardarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    guardarPDF();
                }
            });
            add(guardarButton, BorderLayout.SOUTH);

            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setVisible(true);
    }

    private void guardarPDF() {
      JFileChooser fileChooser = new JFileChooser();

    FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PDF", "pdf");
    fileChooser.setFileFilter(filter);
    
    int resultado = fileChooser.showSaveDialog(this);
    if (resultado == JFileChooser.APPROVE_OPTION) {
        File archivo = fileChooser.getSelectedFile();
      
        if (!archivo.getAbsolutePath().endsWith(".pdf")) {
            archivo = new File(archivo.getAbsolutePath() + ".pdf");
        }
        try (FileOutputStream fos = new FileOutputStream(archivo)) {
            fos.write(pdfBytes);
            JOptionPane.showMessageDialog(this, "PDF guardado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar el PDF.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }
}
