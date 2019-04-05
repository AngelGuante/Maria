package DataBase.Facturacion.movimientoDiario;

import DataBase.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select extends conexion {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //movimiento dia
    public static ResultSet movimientoDiaFecha(java.sql.Date fecha) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from movimientoDiario"
                    + " where fechaMovimientos = '" + fecha + "'");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //movimiento dia monto con el que inicio el dia
    public static String movimientoDiaMontoInicioFecha(String textFieldFechaInicio) {
        String fechaInicioCon;
        //Casteo de la fecha pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(textFieldFechaInicio);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select cajaInicioCon from movimientoDiario"
                    + " where fechaMovimientos = '" + fechaInicio + "'");
            rs = stm.executeQuery();
            rs.next();
            fechaInicioCon = rs.getString("cajaInicioCon");
            rs.close();
            return fechaInicioCon;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "0";
    }
}
