package DataBase.Facturacion.movimientoDiario;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    //movimiento diario
    @SuppressWarnings("ConvertToTryWithResources")
    public static boolean movimientoCaja(java.sql.Date fecha) {
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement stm = null;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into movimientoDiario"
                    + "(fechaMovimientos, cajaInicioCon)"
                    + "values (?, (select total from dinerototalencaja where dinerototalencaja.id = 1))");
            stm.setDate(1, fecha);
            stm.executeUpdate();
            stm.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
