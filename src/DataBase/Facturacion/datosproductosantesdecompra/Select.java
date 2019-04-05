package DataBase.Facturacion.datosproductosantesdecompra;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    public static String[] DatosProdcutoAntesDeCompra(String idFactura, String codigoProducto) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select costoProducto, cantidadProducto "
                    + "from datosproductosantesdecompra "
                    + "where id_facturaCompra =" + idFactura
                    + " and codigoProducto ='" + codigoProducto + "'");
            rs = stm.executeQuery();
            rs.next();
            System.err.println(idFactura);
            System.err.println(codigoProducto);
            String[] datos = {rs.getString("costoProducto"), rs.getString("cantidadProducto")};
            rs.close();
            return datos;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
