package DataBase.logica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class agregarDiasAFecha {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    /**
     * Retorna la cantidad de día que hay entre dos fechas.
     *
     * @param fecha: DEBE SER N FORMATO SQL.
     * @param dias
     * @return Días.
     */
    public static String agregarDias(String fecha, int dias) {
        String nuevaFecha;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + "SELECT DATE_FORMAT(date_add('" + fecha + "', interval " + dias + " day),'%d/%m/%Y') as fecha");
            rs = stm.executeQuery();
            rs.next();
            nuevaFecha = rs.getString("fecha");
            stm.close();
            rs.close();
            return nuevaFecha;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
