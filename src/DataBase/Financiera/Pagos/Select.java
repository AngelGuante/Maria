package DataBase.Financiera.Pagos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //retorna el id de el ultimo pago
    public static int ultimoId() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idPagos "
                    + "from pagos "
                    + "order by idPagos desc "
                    + "limit 1");
            rs = stm.executeQuery();
            rs.next();
            int ultimaFacturaId = rs.getInt("idPagos");
            rs.close();
            return ultimaFacturaId;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    //Buscar el total de pagos realizados a una factura
    public static int totalPagos(String idVentaCredito) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select sum(cuotasPagadas) as total "
                    + "from pagos "
                    + "where ventaCredito_idVentaCredito = " + idVentaCredito);
            rs = stm.executeQuery();
            rs.next();
            int total = rs.getInt("total");
            rs.close();
            stm.close();
            return total;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    //Busca todos los pagos realizados a una factura.
    public static ResultSet todosPagosActivosFactura(String idVentaCredito) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select cuotasPagadas, DATE_FORMAT(fechaPago,'%d/%m/%Y') as fecha, montoPagado "
                    + "from pagos "
                    + "where ventaCredito_idVentaCredito = '" + idVentaCredito
                    + "' and activo = 1 "
                    + "order by idPagos asc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //Busca todos los pagos realizados activos.
    public static ResultSet todosPagosActivos() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select pagos.idPagos, facturaventacredito.idVentaCredito, DATE_FORMAT(pagos.fechaPago,'%d/%m/%Y') as fecha, pagos.montoPagado "
                    + "from pagos, facturaventacredito "
                    + "where pagos.activo = 1 "
                    + "and pagos.ventaCredito_idVentaCredito = facturaventacredito.idVentaCredito "
                    + "order by pagos.idPagos desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //Busca todos los pagos realizados activos de una factura en espesifico.
    public static ResultSet todosPagosActivosDeFactura(String idFacturaVentaCredito) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select pagos.idPagos, facturaventacredito.idVentaCredito,DATE_FORMAT(pagos.fechaPago,'%d/%m/%Y') as fecha, pagos.montoPagado "
                    + "from pagos, facturaventacredito "
                    + "where facturaventacredito.idVentaCredito like '" + idFacturaVentaCredito + "%' "
                    + "and pagos.activo = 1 "
                    + "and pagos.ventaCredito_idVentaCredito = facturaventacredito.idVentaCredito "
                    + "order by pagos.idPagos desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //retorna la sumatoria de todos los pagos de una fecha establecida.
    public static String sumatoriaPagos(String fechaSumatoriaPagosInicio, String fechaSumatoriaFin) {
        int sumatoriaPagos;
        //Casteo de la fecha pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaSumatoriaPagosInicio);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaSumatoriaFin);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select sum(pagos.montoPagado) as sumatoria "
                    + "from pagos "
                    + "where pagos.fechaPago BETWEEN '" + fechaInicio + "' and '" + fechaFin + "'"
                    + "and pagos.activo = 1"
                    + " and pagoPorAbono != 1");
            rs = stm.executeQuery();
            rs.next();
            sumatoriaPagos = rs.getString("sumatoria") == null ? 0 : rs.getInt("sumatoria");
            rs.close();
            return Integer.toString(sumatoriaPagos);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "0";
        }
    }

    //Busca todos los pagos realizados activos entre dos fechas.
    public static ResultSet PagosActivosEntreFechas(String fechaInicioPagos, String fechaFinPagos) {
        //Casteo de la fechaInicio pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaInicioPagos);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaFinPagos);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select pagos.ventaCredito_idVentaCredito, DATE_FORMAT(pagos.fechaPago,'%d - %m - %Y') as fecha, (pagos.montoPagado) pagadas "
                    + "from pagos "
                    + "where pagos.fechaPago BETWEEN '" + fechaInicio + "' and '" + fechaFin + "'"
                    + " and pagos.activo = 1"
                    + " and pagoPorAbono != 1");
            rs = stm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
