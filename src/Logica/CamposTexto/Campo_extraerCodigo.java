package Logica.CamposTexto;

public class Campo_extraerCodigo {

    //Retorna la primera palabra antes de encontrar un espacio de un JTextField si no encuentra nada retorna la palabra completa
    public static String getCode(javax.swing.JTextField campo) {
        int space = campo.getText().indexOf(" ");
        return space != -1 ? campo.getText().substring(0, space) : campo.getText();
    }

    //Retorna la primera palabra antes de encontrar un espacio de un JTextField si no encuentra nada retorna la palabra completa
    public static String getCode(String cadenaTexto) {
        int space = cadenaTexto.indexOf(" ");
        return space != -1 ? cadenaTexto.substring(0, space) : cadenaTexto;
    }
}
