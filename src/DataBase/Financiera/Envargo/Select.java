package DataBase.Financiera.Envargo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //Busca todos los envargos realizados activos.
    public static ResultSet todosEnvargos() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select envargos.idEnvargo, facturaventacredito.idVentaCredito,DATE_FORMAT(envargos.fechaEnvargo,'%d/%m/%Y') as fecha "
                    + "from envargos, facturaventacredito "
                    + "where envargos.ventaCredito_idVentaCredito = facturaventacredito.idVentaCredito "
                    + "order by envargos.idEnvargo desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //Busca todos los pagos realizados activos de una factura en espesifico.
    public static ResultSet envargoDeFactura(String idFacturaVentaCredito) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select envargos.idEnvargo, facturaventacredito.idVentaCredito,DATE_FORMAT(envargos.fechaEnvargo,'%d/%m/%Y') as fecha "
                    + "from envargos, facturaventacredito "
                    + "where facturaventacredito.idVentaCredito like '"  + idFacturaVentaCredito + "%' "
                    + "and envargos.ventaCredito_idVentaCredito = facturaventacredito.idVentaCredito "
                    + "order by envargos.idEnvargo desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
}
