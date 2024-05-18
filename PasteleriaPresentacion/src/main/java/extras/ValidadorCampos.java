/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extras;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author PERSONAL
 */
public class ValidadorCampos {
    
    /**
     * Limita los caracteres máximos permitidos en un campo de texto.
     *
     * @param e Evento de teclas necesario.
     * @param maxLength Longitud máxima del campo.
     * @param txt Campo de texto a trabajar.
     */
    public static void caracteresMaximos(KeyEvent e, int maxLength, JTextField txt) {
        char c = e.getKeyChar();

        // Solo permite la entrada si no se excede el límite de caracteres
        if (txt.getText().length() >= maxLength) {
            e.consume(); // Ignora el evento si se excede el límite
            Toolkit.getDefaultToolkit().beep(); // Emite un sonido de advertencia
        }
    }
    
    /**
     * Limita las opciones del campo de texto a solo teclear letras mayúsculas.
     *
     * @param e Evento de teclas necesario.
     */
    public static void soloLetras(KeyEvent e) {
        char c = e.getKeyChar();
        if (!(c >= 'A' && c <= 'Z')) {
            e.consume(); // Ignora el evento si no es una letra con acentos
            Toolkit.getDefaultToolkit().beep(); // Emite un sonido de advertencia
        }
    }
    
    /**
     * Limita las opciones del campo de texto a solo teclear letras mayúsculas.
     *
     * @param e Evento de teclas necesario.
     */
    public static void soloNumeros(KeyEvent e) {
        char c = e.getKeyChar();
        if (!(c >= '0' && c <= '9')) {
            e.consume(); // Ignora el evento si no es una letra con acentos
            Toolkit.getDefaultToolkit().beep(); // Emite un sonido de advertencia
        }
    }
    
}
