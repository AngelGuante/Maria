package DataBase.Facturacion.FacturasImpuestos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    @SuppressWarnings("CallToPrintStackTrace")
    public static ResultSet NcfFactura(String idFactura, boolean campo) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + "SELECT ncf "
                    + "FROM facturasimpuestos "
                    + "WHERE " + (campo ? "idVenta" : "idVentaCredito") + " = " + idFactura);
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
}