/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.tablas;

import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 *
 * @author Miki
 */
public class Tabla_ponerTitulosCeldas {

    //Establece el titulo  de las columnas de una tabla.
    public static void setTablaColumnasTitulos(String[] titulos, JTable tabla) {
        //Este metodo al actualizar las tablas y en vez de hacerla con la GUI de Eclipse las haga por codigo se eliminara este metodo.
        for (int i = 0; i < titulos.length; i++) {
            TableColumn column1 = tabla.getTableHeader().getColumnModel().getColumn(i);
            column1.setHeaderValue(titulos[i]);
        }
    }
    
}
