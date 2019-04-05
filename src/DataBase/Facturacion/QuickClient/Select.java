package DataBase.Facturacion.QuickClient;

import DataBase.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select extends conexion {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    @SuppressWarnings("CallToPrintStackTrace")
    public static int FacturaConQuickClient(String idfactura) {
        int encontrado = 0;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + " SELECT count(id) AS encontrado"
                    + " FROM quickclient"
                    + " WHERE QuickClient_idFactura = '" + idfactura + "'");
            rs = stm.executeQuery();

            rs.next();
            encontrado = rs.getInt("encontrado");
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return encontrado;
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public static String FacturaQuickClientNombre(String idfactura) {
        String nombre = "";
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + " SELECT nombreCliente "
                    + " FROM quickclient"
                    + " WHERE QuickClient_idFactura = '" + idfactura + "'");
            rs = stm.executeQuery();

            rs.next();
            nombre = rs.getString("nombreCliente");
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return nombre;
    }
}
