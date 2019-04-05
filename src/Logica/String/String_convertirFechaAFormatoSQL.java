package Logica.String;

public class String_convertirFechaAFormatoSQL {

    /**
     *Convierte una fecha pasada por string en formato SQL.
     * 
     * @param fecha
     * @return String: Fecha en formato SQL
     */
    public static String formatearFecha(String fecha) {
        //Elimina los espacios de la cadena por si existe alguno
        fecha = fecha.replace(" ", "");
        Character[] charObjectArray
                = fecha.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        return ""
                + charObjectArray[6]
                + charObjectArray[7]
                + charObjectArray[8]
                + charObjectArray[9]
                + "/"
                + charObjectArray[3]
                + charObjectArray[4]
                + "/"
                + charObjectArray[0]
                + charObjectArray[1];
    }
}
