package DataBase.Financiera.saldos;

import DataBase.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select extends conexion {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //Busca todos los saldos realizados.
    public static ResultSet todosSaldos() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select saldos.idSaldos, facturaventacredito.idVentaCredito, DATE_FORMAT(saldos.fechaPago,'%d/%m/%Y') as fecha, saldos.totalSaldo "
                    + "from saldos, facturaventacredito "
                    + "where saldos.ventaCredito_idVentaCredito = facturaventacredito.idVentaCredito "
                    + "order by saldos.idSaldos desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //Busca el saldo realizado de una factura en espesifico.
    public static ResultSet saldoFacturaVentaCredito(String idFacturaVentaCredito) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select saldos.idSaldos, facturaventacredito.idVentaCredito, DATE_FORMAT(saldos.fechaPago,'%d/%m/%Y') as fecha, saldos.totalSaldo "
                    + "from saldos, facturaventacredito "
                    + "where facturaventacredito.idVentaCredito like '" + idFacturaVentaCredito + "%' "
                    + "and saldos.ventaCredito_idVentaCredito = facturaventacredito.idVentaCredito "
                    + "order by saldos.idSaldos desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //retorna la sumatoria de todos los saldos de una fecha establecida.
    public static String sumatoriaSaldos(String fechaSaldosActivosInicio, String fechaSaldosActivosFin) {
        String sumatoriaFacturas;

        //Casteo de la fecha pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaSaldosActivosInicio);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaSaldosActivosFin);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("SELECT sum(totalSaldo) as sumatoria "
                    + "FROM saldos "
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

    //Busca todos los saldos realizados en una fecha.
    public static ResultSet SaldosActivosEntreFechas(String fechaInicioSaldos, String fechaFinSaldos) {
        //Casteo de la fechaInicio pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaInicioSaldos);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaFinSaldos);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select ventaCredito_idVentaCredito, DATE_FORMAT(fechaPago,'%d - %m - %Y') as fecha, totalSaldo "
                    + " from saldos"
                    + " where fechaPago BETWEEN '" + fechaInicio + "' and '" + fechaFin + "'");
            rs = stm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
