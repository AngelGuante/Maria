package Logica.CamposTexto;

import javax.swing.JTextField;

public class Campo_mayuscula {

    /**
     * Establece al textField la propiedad de que su texto luego de ser
     * introducido sea mayuscula.
     *
     * @param campo
     */
    public static void campoTextoMayuscula(JTextField campo) {
        campo.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                textField.setText(text.toUpperCase());
            }

            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
            }

            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
            }
        });
    }

}
