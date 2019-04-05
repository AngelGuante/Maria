package Logica.tablas;

import javax.swing.JTable;

public class Tabla_verificarFilaSeleccionada {

    //Busco el primer elemento de la fila seleccionda de la tabla, que es el
    //ID del producto de ese registro para verificar que no es NULL
    public static boolean rowSelectedNotNull(JTable tabla) {
        return (tabla.getValueAt(tabla.getSelectedRow(), 0)) != null;
    }

    //Busco el primer elemento de la fila seleccionda de la tabla, que es el
    //ID del producto de ese registro para verificar que no esta vacio
    public static boolean rowSelectedNotEmpty(JTable tabla) {
        return (tabla.getValueAt(tabla.getSelectedRow(), 0)).equals("");
    }
    
}
