package DataBase.Financiera.saldos;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    public static boolean saldos(String[] datos, String textFieldFecha) {
        PreparedStatement stm;

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into saldos"
                    + "(ventaCredito_idVentaCredito, fechaPago, totalSaldo, gananciaSaldo)"
                    + "values (?, ?, ?, ?)");
            //Casteo de la fecha pasada como estring a SqlDate
            java.util.Date date = DataBase.logica.casteoFecha.stringToDate(textFieldFecha);
            java.sql.Date fecha = new java.sql.Date(date.getTime());
            //*
            stm.setString(1, datos[0]);
            stm.setDate(2, fecha);
            stm.setString(3, datos[1]);
            stm.setString(4, datos[2]);
            stm.executeUpdate();
            stm.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
