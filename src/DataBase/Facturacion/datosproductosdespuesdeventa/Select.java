package DataBase.Facturacion.datosproductosdespuesdeventa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    public static String[] DatosProdcutoDespuesDeVenta(String idFactura, String codigoProducto) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select costoProducto, cantidadProducto "
                    + "from datosproductosdespuesdeventa "
                    + "where id_facturaVenta =" + idFactura
                    + " and codigoProducto ='" + codigoProducto + "'");
            rs = stm.executeQuery();
            rs.next();
            String[] datos = {rs.getString("costoProducto"), rs.getString("cantidadProducto")};
            rs.close();
            return datos;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
