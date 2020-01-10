package DataBase.Facturacion.ncfnos;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    private static PreparedStatement stm = null;

    public static void NcfNOs(String nuevosDatos) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update ncfnos"
                    + " set ncfActual = '" + nuevosDatos + "'"
                    + " where id = 1");
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
