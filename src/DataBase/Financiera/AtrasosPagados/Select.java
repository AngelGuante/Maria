package DataBase.Financiera.AtrasosPagados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //Retorna el monto de moras pagadas por un recivo en espesifico.
    public static String AtrasosPagadosSumatoriaRecivo(String idVentaCredito) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select sum(montoAtrasosPagados) as atrasosPagados "
                    + "from atrasospagados "
                    + "where atrasosPagados_idFacturaVentaCredito ="
                    + "'" + idVentaCredito + "'");
            rs = stm.executeQuery();
            rs.next();
            String monto = rs.getString("atrasosPagados");
            rs.close();
            stm.close();
            return monto == null ? "0" : monto;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "";
    }

    //retorna la sumatoria de todas las moras de una fecha establecida.
    public static String sumatoriaMorasEnFecha(String fechaMorasActivosInicio, String fechaMorasActivosFin) {
        String sumatoriaFacturas;

        //Casteo de la fecha pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaMorasActivosInicio);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaMorasActivosFin);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("SELECT sum(montoAtrasosPagados) as sumatoria "
                    + "FROM atrasospagados "
                    + "where fechaPago BETWEEN '" + fechaInicio + "' and '" + fechaFin + "'");
            rs = stm.executeQuery();
            rs.next();
            sumatoriaFacturas = rs.getString("sumatoria") == null ? "0" : rs.getString("sumatoria");
            rs.close();
            return sumatoriaFacturas;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "0";
        }
    }

    //Retorna el monto de moras pagadas por un recivo en espesifico.
    public static ResultSet AtrasosPagadosActivosEntreFechas(String fechaInicioFacturas, String fechaFinFacturas) {
        //Casteo de la fechaInicio pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaInicioFacturas);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaFinFacturas);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select atrasosPagados_idFacturaVentaCredito, DATE_FORMAT(fechaPago,'%d - %m - %Y') as fecha, (montoAtrasosPagados * cantidadAtrasosPagados) as monto"
                    + " from atrasospagados "
                    + " where fechaPago BETWEEN '" + fechaInicio + "' and '" + fechaFin + "'");
            rs = stm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
