package Logica.CamposTexto;

import javax.swing.JTextField;

public class Campo_limiteDigitosCampo {

    /**
     * Establece al textField el maximo de caracteres que se pueden introducir
     * en el.
     *
     * @param campo
     * @param tamañoMaximo
     */
    public static void SetCampoTextoLimite(JTextField campo, int tamañoMaximo) {
        campo.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
            }

            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if (text.length() > tamañoMaximo) {
                    textField.remove(text.length());
                }
            }

            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
            }
        });
    }
}