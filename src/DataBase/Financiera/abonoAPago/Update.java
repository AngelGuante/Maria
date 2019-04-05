package DataBase.Financiera.abonoAPago;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    private static PreparedStatement stm = null;

    //Desactiva los abonos de una venta a credito espesificada.
    public static void actualizarAbonoAPagoAFalse(String ventaCredito_idVentaCredito) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update abonoAPago"
                    + " set activo = 0"
                    + " where ventaCredito_idVentaCredito = '" + ventaCredito_idVentaCredito + "'"
                    + " and activo = 1");
            stm.executeUpdate();
            stm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Desactiva un abono en especifico.
    public static void actualizarAbonoAPagoAFalseenEspecifico(String idADesabilitar) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update abonoAPago"
                    + " set activo = 0"
                    + " where id = '" + idADesabilitar + "'");
            stm.executeUpdate();
            stm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Desactiva los abonos de una venta a credito espesificada menos el ultimo
    public static void actualizarAbonoAPagoAFalseMenosElUltimo(String ventaCredito_idVentaCredito, String idExcluir) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update abonoAPago"
                    + " set activo = 0"
                    + " where ventaCredito_idVentaCredito = '" + ventaCredito_idVentaCredito + "'"
                    + " and id != '" + idExcluir + "'"
                    + " and activo = 1");
            stm.executeUpdate();
            stm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
