package DataBase.logica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class diasEntreFechas {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    /**
     * Retorna la cantidad de día que hay entre dos fechas.
     *
     * @param fechaFin
     * @param fechaInicio
     * @return Días.
     */
    public static int getDIas(String fechaFin, String fechaInicio) {
        int dias;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("SELECT DATEDIFF('" + fechaFin + "','" + fechaInicio + "') as dias");
            rs = stm.executeQuery();
            rs.next();
            dias = rs.getInt("dias");
            stm.close();
            rs.close();
            return dias;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
}
