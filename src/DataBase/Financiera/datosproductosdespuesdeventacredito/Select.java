package DataBase.Financiera.datosproductosdespuesdeventacredito;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    public static String DatosProdcutoDespuesDeVenta(String idFactura, String codigoProducto) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select cantidadProducto "
                    + "from datosproductosdespuesdeventacredito "
                    + "where id_facturaVentaCredito =" + idFactura
                    + " and codigoProducto ='" + codigoProducto + "'");
            rs = stm.executeQuery();
            rs.next();
            String dato = rs.getString("cantidadProducto");
            rs.close();
            return dato;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
