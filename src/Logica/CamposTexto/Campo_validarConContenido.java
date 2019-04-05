package Logica.CamposTexto;

public class Campo_validarConContenido {
    /**
     * Verifica que el campo de texto tenga algo escrito.
     * @param campo
     * @return
     */
    public static boolean campoConContenido(javax.swing.JTextField campo){
        System.err.println(campo.getText());
        System.err.println(campo.getText().length());
        System.err.println(campo.getText().length() == 0);
        return campo.getText().length() != 0;
    }
}
