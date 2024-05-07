/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extras;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.icons.FlatCheckBoxIcon;
import com.formdev.flatlaf.ui.FlatComboBoxUI;
import com.formdev.flatlaf.ui.FlatUIUtils;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import javax.swing.plaf.basic.ComboPopup;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author abelc
 * @param <E>
 */
public class ComboBoxMultiSeleccion<E> extends JComboBox<E> {

    // Lista de elementos seleccionados en el ComboBox
    private final List<Object> elementosSeleccionados = new ArrayList<>();

    // Editor personalizado para el ComboBox
    private final EditorComboMultiple editorComboMultiple;

    // Componente para la lista desplegable del ComboBox
    private Component listaCombo;

    /**
     * Constructor de la clase ComboBoxMultiSeleccion.
     * Inicializa la interfaz de usuario, el editor y el renderizador del ComboBox.
     */
    public ComboBoxMultiSeleccion() {
        setUI(new InterfazComboMultiple());
        editorComboMultiple = new EditorComboMultiple();
        setRenderer(new RenderizadorComboMultiple());
        setEditor(editorComboMultiple);
        setEditable(true);
        addActionListener((e) -> {
            if (e.getModifiers() == ActionEvent.MOUSE_EVENT_MASK) {
                JComboBox combo = (JComboBox) e.getSource();
                Object obj = combo.getSelectedItem();
                if (elementosSeleccionados.contains(obj)) {
                    removerElemento(obj);
                } else {
                    agregarElemento(obj);
                }
            }
        });
    }

    /**
     * Obtiene la lista de elementos seleccionados en el ComboBox.
     * @return Lista de elementos seleccionados.
     */
    public List<Object> obtenerElementosSeleccionados() {
        return elementosSeleccionados;
    }

    /**
     * Establece los elementos seleccionados en el ComboBox.
     * @param elementosSeleccionados Lista de elementos seleccionados.
     */
    public void establecerElementosSeleccionados(List<Object> elementosSeleccionados) {
        List<Object> itemsCombo = new ArrayList<>();
        int count = getItemCount();
        for (int i = 0; i < count; i++) {
            itemsCombo.add(getItemAt(i));
        }
        for (Object obj : elementosSeleccionados) {
            if (itemsCombo.contains(obj)) {
                agregarElemento(obj);
            }
        }
        itemsCombo.clear();
    }

    /**
     * Limpia la lista de elementos seleccionados en el ComboBox y actualiza su visualización.
     */
    public void limpiarElementosSeleccionados() {
        elementosSeleccionados.clear();
        Component componenteEditor = getEditor().getEditorComponent();
        if (componenteEditor instanceof JScrollPane) {
            JScrollPane scroll = (JScrollPane) componenteEditor;
            JPanel panel = (JPanel) scroll.getViewport().getComponent(0);
            panel.removeAll();
            revalidate();
            repaint();
            listaCombo.repaint();
        }
    }

    /**
     * Remueve un elemento de la lista de elementos seleccionados en el ComboBox y actualiza su visualización.
     * @param obj Objeto a remover.
     */
    private void removerElemento(Object obj) {
        elementosSeleccionados.remove(obj);
        editorComboMultiple.removerElemento(obj);
        if (listaCombo != null) {
            listaCombo.repaint();
        }
    }

    /**
     * Agrega un elemento a la lista de elementos seleccionados en el ComboBox y actualiza su visualización.
     * @param obj Objeto a agregar.
     */
    private void agregarElemento(Object obj) {
        elementosSeleccionados.add(obj);
        editorComboMultiple.agregarElemento(obj);
        if (listaCombo != null) {
            listaCombo.repaint();
        }
    }

    /**
     * Clase interna que proporciona una interfaz personalizada para el ComboBox.
     */
    private class InterfazComboMultiple extends FlatComboBoxUI {

        @Override
        protected ComboPopup createPopup() {
            return new PopupComboMultiple(comboBox);
        }

        private class PopupComboMultiple extends FlatComboPopup {

            public PopupComboMultiple(JComboBox combo) {
                super(combo);
            }
        }

        @Override
        protected Dimension getDisplaySize() {
            Dimension size = super.getDefaultSize();
            return new Dimension(0, size.height);
        }
    }

    /**
     * Clase interna que proporciona un renderizador personalizado para los elementos del ComboBox.
     */
    private class RenderizadorComboMultiple extends BasicComboBoxRenderer {

        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (listaCombo != list) {
                listaCombo = list;
            }
            setIcon(new IconoCheckBox(elementosSeleccionados.contains(value)));
            return this;
        }
    }

    /**
     * Clase interna que proporciona un editor personalizado para el ComboBox.
     */
    private class EditorComboMultiple extends BasicComboBoxEditor {

        protected final JScrollPane scroll;
        protected final JPanel panel;

        protected void agregarElemento(Object obj) {
            Item item = new Item(obj);
            panel.add(item);
            panel.repaint();
            panel.revalidate();
        }

        protected void removerElemento(Object obj) {
            int count = panel.getComponentCount();
            for (int i = 0; i < count; i++) {
                Item item = (Item) panel.getComponent(i);
                if (item.getItem() == obj) {
                    panel.remove(i);
                    panel.revalidate();
                    panel.repaint();
                    break;
                }
            }
        }

        public EditorComboMultiple() {
            this.panel = new JPanel(new MigLayout("insets 0,filly,gapx 2", "", "fill"));
            this.scroll = new JScrollPane(panel);
            scroll.putClientProperty(FlatClientProperties.STYLE, ""
                    + "border:2,2,2,2;"
                    + "background:$ComboBox.editableBackground");
            panel.putClientProperty(FlatClientProperties.STYLE, ""
                    + "background:$ComboBox.editableBackground");
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
            JScrollBar scrollBar = scroll.getHorizontalScrollBar();
            scrollBar.putClientProperty(FlatClientProperties.STYLE, ""
                    + "width:3;"
                    + "thumbInsets:0,0,0,1;"
                    + "hoverTrackColor:null");
            scrollBar.setUnitIncrement(10);
        }

        @Override
        public Component getEditorComponent() {
            return scroll;
        }

    }

    /**
     * Clase interna que proporciona un icono personalizado para la casilla de verificación en los elementos del ComboBox.
     */
    private class IconoCheckBox extends FlatCheckBoxIcon {

        private final boolean seleccionado;

        public IconoCheckBox(boolean seleccionado) {
            this.seleccionado = seleccionado;
        }

        @Override
        protected boolean isSelected(Component c) {
            return seleccionado;
        }
    }

    /**
     * Clase interna que representa un elemento individual en el ComboBox.
     */
    private class Item extends JLabel {

        public Object getItem() {
            return elemento;
        }

        private final Object elemento;

        public Item(Object elemento) {
            super(elemento.toString());
            this.elemento = elemento;
            inicializar();
        }

        private void inicializar() {
            putClientProperty(FlatClientProperties.STYLE, ""
                    + "border:0,5,0,20;"
                    + "background:darken($ComboBox.background,10%)");
            JButton cerrar = new JButton(new FlatSVGIcon("extras/close.svg", 0.6f));
            cerrar.putClientProperty(FlatClientProperties.STYLE, ""
                    + "arc:999;"
                    + "margin:1,1,1,1;"
                    + "background:null;"
                    + "focusWidth:0");
            cerrar.addActionListener((e) -> {
                removerElemento(elemento);
            });
            cerrar.setFocusable(false);
            setLayout(new MigLayout("fill"));
            add(cerrar, "pos 1al 0.5al 10 10");
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            FlatUIUtils.setRenderingHints(g2);
            int arc = UIScale.scale(10);
            g2.setColor(getBackground());
            FlatUIUtils.paintComponentBackground(g2, 0, 0, getWidth(), getHeight(), 0, arc);
            g2.dispose();
            super.paintComponent(g);
        }
    }
}

