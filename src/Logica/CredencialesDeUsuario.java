package Logica;

public class CredencialesDeUsuario {

    //Esta variable guarda el nivel de prvilegio que tiene un usuario:
    //1 -> Administrador
    //0 -> Normal
    private static int privilegio;
    
    public static void setPrivilegio(int privilegio) {
        CredencialesDeUsuario.privilegio = privilegio;
    }

    public static int getPrivilegio() {
        return privilegio;
    }
}
