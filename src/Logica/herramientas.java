package Logica;

import Diseño.Facturacion.paneles_base.panelBase;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

public class herramientas {

    public static java.util.ArrayList<Diseño.Facturacion.paneles_base.panelBase> historial = new java.util.ArrayList<>();

    //Almacenara todos la referencia de los paneles por los cuales acceda el
    //usuario. Este metodo es para poder limpiar el historial de paneles desde
    //otro lado.
    public static void clearHistorial() {
        historial.clear();
    }

    //*************************************************************//
    //******************** Boton de 'Atras' ***********************//
    //*************************************************************//
    //Se pasa por parametro un objeto de la clase base 'panelBase' a la
    //variable tipo Arrayist para llevar un control de todos los paneles
    //visualizados por el usuario.
    static public void set_historialPaneles(Diseño.Facturacion.paneles_base.panelBase nuevoPanel) {
        historial.add(nuevoPanel);
    }

    //Retorna el ultimo elemento del arrayList(historial).
    static public Diseño.Facturacion.paneles_base.panelBase get_historialPaneles() {
        return historial.get(historial.size() - 1);
    }

    //Elimina el ultimo elemento del arrayList(historial) y desaparece los paneles
    //de la pantalla princial si esta en el inicio.
    static public void remove_historialPanelesLast() {
        historial.remove(historial.size() - 1);

        for (panelBase PANELES : Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES) {
            PANELES.setVisible(false);
        }

        if (historial.size() < 1) {
            Diseño.Facturacion.ventanas_bases.Ventana_base.BASEBOTONATRAS.setVisible(false);
        }
        if (historial.size() < 2) {
            Diseño.Facturacion.ventanas_bases.Ventana_base.BASEBOTONINICIO.setVisible(false);
        }
    }

    //Este metodo oculta este panel, muestra el boton 'atras' y agrega este panel
    //al metodo 'set_historialPaneles' para volver hacia el.
    static public void procesoDeHistorial() {
        for (panelBase PANELES : Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES) {
            if (PANELES.isVisible()) {
                set_historialPaneles(PANELES);
                break;
            }
        }

        for (panelBase PANELES : Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES) {
            PANELES.setVisible(false);
        }

        Diseño.Facturacion.ventanas_bases.Ventana_base.BASEBOTONATRAS.setVisible(true);

        if (historial.size() > 1) {
            Diseño.Facturacion.ventanas_bases.Ventana_base.BASEBOTONINICIO.setVisible(true);
        }
    }

    //*************************************************************//
    //******************** Boton de 'Inicio' ***********************//
    //*************************************************************//
    /*
    *Este metodo es para ocultar todos aquellos paneles de salen a partir de otros,
    *me explico, para el caso de los paneles 'Clientes', 'Distribuidores' como 
    *para que estos aparezcan tiene primero que el usuario aver pasado por los
    *paneles de 'venta' y 'compra' respectivamente. Ademas este metodo se creo
    *con el fin de utilizarlro como evento para el boton 'inicio' asi que a 
    *parte de ocultar dichos paneles, tambien vuelve al inicio ocutando los botones
    *de 'inicio' y 'atras'.
     */
    static public void ocultarSegundasVentanas() {
        Diseño.Facturacion.ventanas_bases.Ventana_base.BASEBOTONATRAS.setVisible(false);
        Diseño.Facturacion.ventanas_bases.Ventana_base.BASEBOTONINICIO.setVisible(false);

        for (panelBase PANELES : Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES) {
            PANELES.setVisible(false);
        }

        Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[0].setVisible(true);
        historial.clear();
    }

    //*************************************************************//
    //************************ TextArea ***************************//
    //*************************************************************//
    //Establece al textArea el maximo de caracteres que se pueden introducir en el.
    static public void campoTextoAreaTamaño(JTextArea campo, int tamañoMaximo) {
        campo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyTyped(KeyEvent e) {
                JTextArea textArea = (JTextArea) e.getSource();
                String text = textArea.getText();
                if (text.length() > tamañoMaximo) {
                    textArea.remove(text.length());
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }
        });
    }

    //Establece al textArea la propiedad de que su texto luego de ser introducido
    //sea mayuscula.
    static public void campoTextoAreaMayuscula(JTextArea campo) {
        campo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                JTextArea textArea = (JTextArea) e.getSource();
                String text = textArea.getText();
                textArea.setText(text.toUpperCase());
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }
        });
    }

    //*************************************************************//
    //************************ Password ***************************//
    //*************************************************************//
    //Transforma una cadena de caracteres en un string unico.
    public static String passwordToString(char[] contrasenia) {
        String password = "";

        for (char tmp : contrasenia) {
            password = String.copyValueOf(contrasenia);
        }
        return password;
    }
}
