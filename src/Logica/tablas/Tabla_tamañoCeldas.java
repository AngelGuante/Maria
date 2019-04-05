package Logica.tablas;

import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class Tabla_tamañoCeldas {
    public static void setTablaColumnasTamaño(int[] tamaños, JTable tabla) {
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        int x = tabla.getColumnCount();
        for (int i = 0; i < x; i++) {
            TableColumn col = tabla.getColumnModel().getColumn(i);
            col.setPreferredWidth(tamaños[i]);
        }
    }    
}
