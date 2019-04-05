package DataBase.Financiera.Envargo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    public static boolean envargos(String idVentaCredito, String textFieldFecha) {
        PreparedStatement stm = null;

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into envargos"
                    + "(ventaCredito_idVentaCredito, fechaEnvargo)"
                    + "values (?, ?)");
            //Casteo de la fecha pasada como estring a SqlDate
            java.util.Date date = DataBase.logica.casteoFecha.stringToDate(textFieldFecha);
            java.sql.Date fecha = new java.sql.Date(date.getTime());
            //*
            stm.setString(1, idVentaCredito);
            stm.setDate(2, fecha);
            stm.executeUpdate();
            stm.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}