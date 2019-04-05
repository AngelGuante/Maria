package Logica.String;

public class String_verificarStringNumero {

    //Verificar si el texto ingresado esta compuesto solo de numeros
    public static boolean ValidarString(String texto) {
        try {
            Long.parseLong(texto);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}