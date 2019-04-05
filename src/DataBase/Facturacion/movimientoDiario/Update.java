package DataBase.Facturacion.movimientoDiario;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    private static PreparedStatement stm = null;

    //Movimiento diario de entrada 
    public static void movimientoEntrada(String montoDeEntrada, java.sql.Date fecha) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update movimientoDiario"
                    + " set montoEntrada = '" + montoDeEntrada + "',"
                    + " montoSalida = '0'"
                    + " where fechaMovimientos = '" + fecha + "'");
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Movimiento diario de salida 
    public static void movimientoSalida(String montoSalida, java.sql.Date fecha) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update movimientoDiario"
                    + " set montoSalida = '" + montoSalida + "',"
                    + " montoEntrada = '0'"
                    + " where fechaMovimientos = '" + fecha + "'");
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Cierra el cuadre de la fecha pasada por parametro
    public static void cerrarCuadre(java.sql.Date fecha) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update movimientoDiario"
                    + " set cerrado = 1"
                    + " where fechaMovimientos < '" + fecha + "'");
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
