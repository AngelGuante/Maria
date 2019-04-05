package DataBase.logica;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class casteoFecha {

    /**
     * Castea una fecha en formato dd/mm/yyyy a formato sql, si la fecha es
     * pasada en formato 'dd mm yyyy' entra en un try que evalua otro caso.
     *
     * @param fecha
     * @return
     */
    public static Date stringToDate(String fecha) {
        DateFormat formatter = new SimpleDateFormat("dd. MM. yyyy");
        Date date = null;
        try {
            date = formatter.parse(fecha);
        } catch (java.text.ParseException ex) {
            formatter = new SimpleDateFormat("dd/MM/yyyy");
            try {
                date = formatter.parse(fecha);
            } catch (java.text.ParseException e) {
                e.printStackTrace();
            }
        }
        return date;
    }

}
