package Logica.CamposTexto;

public class Campo_cambiarEspacioPorGuion {
    
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void cambiarEspacioPorGuion(javax.swing.JTextField campo){
        campo.setText(campo.getText().replaceAll("\\s", "-"));
    }
}
