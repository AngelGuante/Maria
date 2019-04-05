package Logica.CamposTexto;

import java.awt.event.KeyEvent;

public class Campo_validarSinEspacio {

    public static void SinEspacios(javax.swing.JTextField campo) {
        campo.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un espacio en blanco
                if ((caracter == ' ') && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }
        });
    }
}
