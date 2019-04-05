package DataBase.Facturacion.FacturaCompra.Compra;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    private static PreparedStatement stm = null;
    
    public static void eliminarFactura(String idFactura) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update facturacompra"
                    + " set activo = 0"
                    + " where idFacturaCompra = '" + idFactura + "'");
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
