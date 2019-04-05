package DataBase.Financiera.Pagos;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    @SuppressWarnings("CallToPrintStackTrace")
    public static boolean pagos(String[] datos, String textFieldFecha) {
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement stm = null;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into pagos"
                    + "(ventaCredito_idVentaCredito, cuotasPagadas, montoPagado, fechaPago, pagoPorAbono)"
                    + "values (?, ?, ?, ?, ?)");
            //Casteo de la fecha pasada como estring a SqlDate
            java.util.Date date = DataBase.logica.casteoFecha.stringToDate(textFieldFecha);
            java.sql.Date fecha = new java.sql.Date(date.getTime());
            
            stm.setString(1, datos[0]);
            stm.setString(2, datos[1]);
            stm.setString(3, datos[2]);
            stm.setDate(4, fecha);
            stm.setInt(5, Integer.parseInt(datos[3]));
            stm.executeUpdate();
            stm.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
    