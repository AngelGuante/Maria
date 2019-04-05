package Logica.tablas;

public class Tabla_limpiarFilas {
    
    //Limpia la tabla quitando todas las filas.
    public static void limpiarTabla(javax.swing.table.DefaultTableModel model, javax.swing.JTable tabla) {
        for (int i = model.getRowCount() - 1; i > -1; i--) {
            model.removeRow(i);
        }
    }   
}
