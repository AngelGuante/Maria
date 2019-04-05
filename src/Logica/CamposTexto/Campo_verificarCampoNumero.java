package Logica.CamposTexto;

public class Campo_verificarCampoNumero {

    //Verificar si el campo ingresado esta compuesto solo de numeros
    public static boolean ValidarCampo(javax.swing.JTextField campo) {
        try {
            Long.parseLong(campo.getText());
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}