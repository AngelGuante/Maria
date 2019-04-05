package DataBase.Facturacion.Movimento;

import DataBase.conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update extends conexion {

    private static PreparedStatement stm = null;

    public static void movimiento(String[] nuevosDatos) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update movimiento"
                    + " set cargadoA = '" + nuevosDatos[1] + "',"
                    + " tipoMovimento = '" + nuevosDatos[2] + "',"
                    + " montoMovimiento = '" + nuevosDatos[3] + "',"
                    + " motivoMovimiento = '" + nuevosDatos[4] + "',"
                    + " fechaMovimiento = now()"
                    + " where idMovimiento = '" + nuevosDatos[0] + "'");
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Pone el estado del Movimiento a "inactivo".
    public static void desabilitarMovimiento(String[] idMovimiento) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update movimiento"
                    + " set activo  = 0"
                    + " where idMovimiento = '" + idMovimiento[0] + "'");
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
