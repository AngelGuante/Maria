package Logica.CamposTexto;

import javax.swing.JTextField;

public class Campo_tipoLetra {

    /**Establece al textField el tipo de caracteres admitidos sean letras.
     * 
     * @param campo 
     */
    public static void campoTextoTipoLetras(JTextField campo) {
        campo.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
            }

            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                char caracter = e.getKeyChar();
                // Verificar si la tecla pulsada no es un digito
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z')) && (caracter == '\b' /*corresponde a BACK_SPACE*/ )) {
                    e.consume(); // ignorar el evento de teclado
                }
            }

            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
            }
        });
    }
}
