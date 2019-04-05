package DataBase.Facturacion.FacturaCompra.CompraPorPagar;

import DataBase.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select extends conexion {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //retorna el id de la ultima factura de compra
    public static int ultimoId() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idFacturaCompra "
                    + "from facturaporpagar "
                    + "order by idFacturaCompra desc "
                    + "limit 1");
            rs = stm.executeQuery();
            rs.next();
            int ultimaFacturaId = rs.getInt("idFacturaCompra");
            rs.close();
            return ultimaFacturaId;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    //retorna todas las facturas de compras activas y NO pasadas a caja
    public static ResultSet todasFacturasActivasNoPasadaCaja() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idFacturaCompra, DATE_FORMAT(fechaCompra,'%d/%m/%Y') as fecha, valorFacturaCompra, activo "
                    + "from facturaporpagar "
                    + "where pagada = 0 "
                    + "and activo = 1 "
                    + "order by idFacturaCompra desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //retorna la factura que tenga el ID pasado por parametro si NO a sido pasadas a caja
    public static ResultSet facturaIDNoPasadaCaja(String idFactura) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idFacturaCompra, DATE_FORMAT(fechaCompra,'%d/%m/%Y') as fecha, valorFacturaCompra, activo "
                    + "from facturaporpagar "
                    + "where idFacturaCompra like '" + idFactura + "%' "
                    + "and pagada = 0 "
                    + "and activo = 1 "
                    + "order by idFacturaCompra desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //retorna la sumatoria de todas las facturas de una fecha establecida.
    public static String sumatoriaFacturasActivasPagadas(String fechaSumatoriaFacturasActivasInicio, String fechaSumatoriaFacturasActivasFin) {
        String sumatoriaFacturas;

        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaSumatoriaFacturasActivasInicio);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaSumatoriaFacturasActivasFin);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("SELECT sum(valorFacturaCompra) as sumatoria "
                    + "FROM facturaporpagar "
                    + "where fechaPagada BETWEEN '" + fechaInicio + "' and '" + fechaFin + "'"
                    + "and activo = 1 "
                    + "and pagada = 1");
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

    //retorna todas las facturas de compras  pagadas activas entre fechas
    public static ResultSet FacturasActivasEntreFechas(String fechaInicioFacturas, String fechaFinFacturas) {
        //Casteo de la fechaInicio pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaInicioFacturas);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaFinFacturas);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idFacturaCompra, DATE_FORMAT(fechaCompra,'%d - %m - %Y') as fecha, valorFacturaCompra"
                    + " from facturaporpagar "
                    + " where fechaCompra BETWEEN '" + fechaInicio + "' and '" + fechaFin + "'"
                    + " and activo = 1"
                    + " and pagada = 1");
            rs = stm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
