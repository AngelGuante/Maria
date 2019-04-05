package DataBase.Facturacion.Producto;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    private static PreparedStatement stm = null;

    public static void producto(String[] nuevosDatos) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update producto"
                    + " set descripcionProducto = '" + nuevosDatos[1] + "',"
                    + " costoUnidadProducto = '" + nuevosDatos[2] + "',"
                    + " precioUnidadProducto = '" + nuevosDatos[3] + "',"
                    + " cantidadAlmacenProducto = '" + nuevosDatos[4] + "'"
                    + " where claveProducto = '" + nuevosDatos[0] + "'");
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
