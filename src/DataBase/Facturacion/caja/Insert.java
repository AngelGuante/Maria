package DataBase.Facturacion.caja;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    @SuppressWarnings("ConvertToTryWithResources")
    public static boolean caja(String totalInicial) {
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement stm = null;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into dineroTotalEnCaja"
                    + "(total)"
                    + "values (?)");
            stm.setString(1, totalInicial);
            stm.executeUpdate();
            stm.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
