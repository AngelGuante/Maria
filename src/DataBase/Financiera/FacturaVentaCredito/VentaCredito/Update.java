package DataBase.Financiera.FacturaVentaCredito.VentaCredito;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    private static PreparedStatement stm = null;

    /*
    Cambiar el estado de una factura de venta a credito
    0-Eliminada
    1-Activa
    2-Saldada/Envargada
    3-Sacada del sistema
    */
    public static void ventaCreditoCambiarEstado(String idVentaCredito, String estado) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + "UPDATE facturaventacredito "
                    + "SET activo = " + estado + " "
                    + "WHERE idVentaCredito = '" + idVentaCredito + "'");
            stm.executeUpdate();
            stm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
