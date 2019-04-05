/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.JFileChooser;

/**
 *
 * @author Miki
 */
public class FileChooser {

    public static String returnPath(String tituloDialog) {
        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new java.io.File("C:\\"));
        jfc.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        jfc.setDialogTitle(tituloDialog);
        jfc.showSaveDialog(null);
        return jfc.getSelectedFile().getAbsolutePath();
    }

}
