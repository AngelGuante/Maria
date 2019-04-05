package DataBase.Financiera.FacturaVentaCredito.Restantes;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    public static void RestantesVentaCredito(String[] nuevosDatos) {
        try(PreparedStatement stm = DataBase.ClientConexion.getConn().prepareStatement("update restantesfacturaventacredito"
                    + " set totalPagarRst = '" + nuevosDatos[1] + "',"
                    + " cantidadCuotasRst = '" + nuevosDatos[2] + "'"
                    + " where restantes_idFacturaVentaCredito = '" + nuevosDatos[0] + "'");) {
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
