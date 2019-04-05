package DataBase.Financiera.AtrasosPagados;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    public static boolean AtrasosPagados(String[] datos) {
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement stm = null;

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + "INSERT INTO atrasosPagados (atrasosPagados_idFacturaVentaCredito,"
                    + "cantidadAtrasosPagados, montoAtrasosPagados, fechaPago) "
                    + "VALUES (?, ?, ?, ?)");
            //Casteo de la fecha pasada como estring a SqlDate
            java.util.Date date = DataBase.logica.casteoFecha.stringToDate(datos[3]);
            java.sql.Date fecha = new java.sql.Date(date.getTime());

            stm.setString(1, datos[0]);
            stm.setString(2, datos[1]);
            stm.setString(3, datos[2]);
            stm.setDate(4, fecha);
            stm.executeUpdate();
            stm.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
