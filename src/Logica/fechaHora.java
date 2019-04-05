package Logica;

import java.util.Calendar;

public class fechaHora {

    private static final Calendar calendario = Calendar.getInstance();

    private static String dia = Integer.toString(calendario.get(Calendar.DATE));
    private static String mes = Integer.toString(calendario.get(Calendar.MONTH) + 1);
    private static final String annio = Integer.toString(calendario.get(Calendar.YEAR));

    /*private static int hora =calendario.get(Calendar.HOUR_OF_DAY);
    private static int minutos = calendario.get(Calendar.MINUTE);
    private static int segundos = calendario.get(Calendar.SECOND);*/
    //Obtiene la fecha del sistema en un String.
    public static String getFecha() {
        if (dia.length() == 1) {
            dia = "0" + dia;
        }

        if (mes.length() == 1) {
            mes = "0" + mes;
        }

        return dia + mes + annio;
    }

    //Obtiene la hora del sistema en un String.
    /* public static String getHora(){
        return hora+" "+minutos+" "+segundos;
    }*/
    //Obtiene la fecha del sistema en un String en formato Date de SQL.
    public static String getFechaSQL() {
        if (dia.length() == 1) {
            dia = "0" + dia;
        }

        if (mes.length() == 1) {
            mes = "0" + mes;
        }

        return annio + "-" + mes + "-" + dia;
    }

    //Obtiene la fecha del sistema formateada con /
    public static String getFechaFormated() {
        if (dia.length() == 1) {
            dia = "0" + dia;
        }

        if (mes.length() == 1) {
            mes = "0" + mes;
        }

        return dia + "/" + mes + "/" + annio;
    }
}
