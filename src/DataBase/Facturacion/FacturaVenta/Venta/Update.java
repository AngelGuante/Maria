package DataBase.Facturacion.FacturaVenta.Venta;

import DataBase.conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update extends conexion {

    private static PreparedStatement stm = null;

    //Eliminar factura de venta
    public static void eliminarFactura(String idFactura) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update facturaventa"
                    + " set activo = 0"
                    + " where idFacturaVenta = '" + idFactura + "'");
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
