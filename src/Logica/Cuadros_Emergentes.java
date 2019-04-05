package Logica;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class Cuadros_Emergentes {

    /**
     * Abre un Joptionane con un JPanel como UI en el cual se muestra una tabla
     * la cual muestra los movimientos de una fecha espesificada.
     *
     * @param titulo Titulo de la ventana
     * @param tipoBusqueda
     * @return
     */
    public static int BusquedaAvanzadaFacturasVentas(String titulo, String tipoBusqueda) {
        javax.swing.JPanel myPanel = new Diseño.Paneles_herramientas.Panel_busquedaAvanzadaFacturasVenta(tipoBusqueda);
        java.awt.Image image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        javax.swing.JLabel clouds = new javax.swing.JLabel(new ImageIcon(new BufferedImage(250, 100,
                BufferedImage.TYPE_INT_RGB)));
        myPanel.add(clouds);
        myPanel.setSize(300, 300);
        return JOptionPane.showConfirmDialog(null,
                myPanel,
                "                                    ---- " + titulo + " ----",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                new ImageIcon(image)
        );
    }

    /**
     * Abre un Joptionane con un JPanel como UI en el cual se muestra una tabla
     * la cual muestra los movimientos de una fecha espesificada.
     *
     * @param historial Titulo de la ventana
     * @param rs
     * @param nombreColumnasTabla
     * @return
     */
    public static int Historiales(String historial, java.sql.ResultSet rs, String[] nombreColumnasTabla) {
        javax.swing.JPanel myPanel = new Diseño.Paneles_herramientas.Panel_historialesCaja(rs, nombreColumnasTabla);
        java.awt.Image image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        javax.swing.JLabel clouds = new javax.swing.JLabel(new ImageIcon(new BufferedImage(250, 100,
                BufferedImage.TYPE_INT_RGB)));
        myPanel.add(clouds);
        myPanel.setSize(300, 300);
        return JOptionPane.showConfirmDialog(
                null,
                myPanel,
                "                                    ---- " + historial + " ----",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                new ImageIcon(image)
        );
    }

    /**
     * Abre un JOptionPane con un JPanel como UI con el cual se puede verificar
     * cuanto efectivo se va a devolver según el monto de la transacción, este
     * JOptionPane no tiene un icono.
     *
     * @param monto
     * @return int: Si el usuario pulsó Yes o Cansel.
     */
    public static int Transacciones(String monto) {
        javax.swing.JPanel myPanel = new Diseño.Paneles_herramientas.Panel_efectivoEnTransaccion(monto);
        java.awt.Image image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        javax.swing.JLabel clouds = new javax.swing.JLabel(new ImageIcon(new BufferedImage(250, 100,
                BufferedImage.TYPE_INT_RGB)));
        myPanel.add(clouds);
        return JOptionPane.showConfirmDialog(
                null,
                myPanel,
                "VERIFICAR EFECTIVO A DEVOLVER",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                new ImageIcon(image)
        );
    }

    /**
     * Muestra un cuadro emergente con las opciones 'Si' y 'No'recibe un String
     * que es el mensage a mostrar.
     *
     * @param mensage
     * @return
     */
    public static int confirmacionDefinida(String mensage) {
        return JOptionPane.showConfirmDialog(null, "ESTO PROVOCARA LO SIGUIENTE:\n\n"
                + mensage, "¿Esta seguro que desea realizar esta accion?", JOptionPane.YES_NO_OPTION);
    }

    /**
     * Muestra un cuadro emergente con las opciones 'Si' y 'No' recibe un String
     * que es el mensage a mostrar. sin mensage prefesinido.
     *
     * @return
     */
    public static int confirmacion() {
        return JOptionPane.showConfirmDialog(null, "Seguro que desea realizar esta accion?",
                null, JOptionPane.YES_NO_OPTION);
    }

    /**
     * Muestra un cuadro emergente con las opciones 'Si' y 'No'recibe un String
     * que es el mensage a mostrar. con mensage predefinido para los productos,
     * Cliente y Distribuidor.
     *
     * @param codigo
     * @return
     */
    public static int confirmacionProductoClienteDistribuidorNoEncontrado(String codigo) {
        return JOptionPane.showConfirmDialog(null, "'" + codigo + "' no se encontro en la base de datos, desea crearlo?",
                "NO encontrado", JOptionPane.YES_NO_OPTION);
    }

    /**
     * Muestra un cuadro emergente recibe un String que es el mensage a mostrar
     * para la causa de la alerta.
     *
     * @param mensageDeAlerta
     * @return
     */
    public static int confirmacionAlerta(String mensageDeAlerta) {
        return JOptionPane.showConfirmDialog(null, mensageDeAlerta,
                "Seguro que desea realizar esta accion?", JOptionPane.YES_NO_OPTION);
    }

    public static void completado() {
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente!");
    }

    /**
     * Muestra un cuadro emergente con un JPassword para pedir contraseña
     *
     * @return
     */
    public static String confirmacionPassword() {
        JPasswordField pwd = new JPasswordField(10);
        JOptionPane.showConfirmDialog(null, pwd, "Contraseña del Programador:", JOptionPane.OK_CANCEL_OPTION);
        return herramientas.passwordToString(pwd.getPassword());
    }

    /**
     * Muestra un mensage con simbolo de alerta de error de contrasña.
     *
     * @param causaError
     */
    public static void alerta(String causaError) {
        JOptionPane.showMessageDialog(null, causaError, "Error", JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Muestra un mensage con simbolo de alerta de error de contrasña.
     *
     * @return
     */
    public static int alertaConfirmacion() {
        return JOptionPane.showConfirmDialog(null, "No se encontro una carpeta del sistema,\n"
                + "comuniquese con  el programador, esto\n"
                + "puede significar perdida de datos.\n"
                + "DESEA CONTINUAR?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
    }
}
