package Logica.CamposTexto;

public class Campo_tipoNumero {

    /**
     * Establece al textField el tipo de caracteres admitidos sean numero.
     *
     * @param campo
     */
    public static void campoTextoTipoNumero(javax.swing.JTextField campo) {
        campo.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
            }

            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                char caracter = e.getKeyChar();
                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume(); // ignorar el evento de teclado
                }
            }

            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
            }
        });
    }
}