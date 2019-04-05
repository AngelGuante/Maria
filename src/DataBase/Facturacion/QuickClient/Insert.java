package DataBase.Facturacion.QuickClient;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    @SuppressWarnings("CallToPrintStackTrace")
    public static boolean QuickClient(String idFactura, String nombreCliente) {
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement stm = null;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into quickclient"
                    + "(QuickClient_idFactura, nombreCliente)"
                    + "values (?, ?)");
            stm.setString(1, idFactura);
            stm.setString(2, nombreCliente);
            stm.executeUpdate();
            stm.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
