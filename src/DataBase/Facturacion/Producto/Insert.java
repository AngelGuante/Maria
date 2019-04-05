package DataBase.Facturacion.Producto;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    public static boolean producto(String[] datos) {
        PreparedStatement stm = null;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into producto"
                    + "(claveProducto, descripcionProducto, costoUnidadProducto, precioUnidadProducto, cantidadAlmacenProducto)"
                    + "values (?, ?, ?, ?, ?)");
            stm.setString(1, datos[0]);
            stm.setString(2, datos[1]);
            stm.setString(3, datos[2]);
            stm.setString(4, datos[3]);
            stm.setString(5, datos[4]);
            stm.executeUpdate();
            stm.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
