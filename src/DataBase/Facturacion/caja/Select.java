package DataBase.Facturacion.caja;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //todos los Producto con y sin existencia para llenar la tabla de productos
    public static String montoTotalEnCaja() {
        String sumatoriaTotalCaja;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select sum(total) as sumatoria "
                    + "from dinerototalencaja "
                    + "where id = 1");
            rs = stm.executeQuery();
            rs.next();
            sumatoriaTotalCaja = rs.getString("sumatoria");
            rs.close();
            return sumatoriaTotalCaja;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
