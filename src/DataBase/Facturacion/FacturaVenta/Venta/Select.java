package DataBase.Facturacion.FacturaVenta.Venta;

import DataBase.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select extends conexion {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //retorna el id de la ultima factura de venta
    public static int ultimoId() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idFacturaVenta "
                    + "from facturaventa "
                    + "order by idFacturaVenta desc "
                    + "limit 1");
            rs = stm.executeQuery();
            rs.next();
            int ultimaFacturaId = rs.getInt("idFacturaVenta");
            rs.close();
            return ultimaFacturaId;
        } catch (SQLException ex) {
        }
        return 1000;
    }

    //retorna el codigo de quien hizo la factura
    public static String facturadaPor(String idFactura) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + "SELECT facturadoPor "
                    + "FROM facturaventa "
                    + "WHERE idFacturaVenta = " + idFactura);
            rs = stm.executeQuery();
            rs.next();
            String facturadaPor = rs.getString("facturadoPor");
            rs.close();
            return facturadaPor;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "";
    }

    //retorna todas las facturas de compras activas
    public static ResultSet FacturasBusquedaAvanzada() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + "SELECT idFacturaVenta, DATE_FORMAT(fechaFactura,'%d/%m/%Y') as fecha, valorFacturaVenta, activo "
                    + "FROM facturaventa "
                    + "WHERE activo = 1 "
                    + "ORDER BY idFacturaVenta desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //retorna todas las facturas de venta eliminadas
    public static ResultSet todasFacturasEliminadas() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idFacturaVenta, DATE_FORMAT(fechaFactura,'%d/%m/%Y') as fecha, valorFacturaVenta, activo "
                    + "from facturaventa "
                    + "where activo = 0 "
                    + "order by idFacturaVenta desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //retorna la factura que tenga el ID pasado por parametro.
    public static ResultSet facturaID(String idFactura) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idFacturaVenta, DATE_FORMAT(fechaFactura,'%d/%m/%Y') as fecha, valorFacturaVenta, activo"
                    + " from facturaventa "
                    + " where idFacturaVenta like '" + idFactura + "%'"
                    + " and activo = 1"
                    + " order by idFacturaVenta desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //retorna todas las facturas de ventas "Eliminadas"
    public static ResultSet facturaEliminada(String idFactura) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idFacturaVenta, DATE_FORMAT(fechaFactura,'%d/%m/%Y') as fecha, valorFacturaVenta, activo "
                    + "from facturaventa "
                    + "where idFacturaVenta like '" + idFactura + "%' "
                    + "and activo = 0 "
                    + "order by idFacturaVenta desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }

    //retorna todas las facturas de ventas por los datos de un cliente con un Join
    public static ResultSet facturasPorDatosCliente(String cliente) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + "SELECT idFacturaVenta, DATE_FORMAT(fechaFactura,'%d/%m/%Y') AS fecha, valorFacturaVenta "
                    + "FROM facturaventa "
                    + "JOIN cliente "
                    + "ON facturaventa.cliente_idCliente = cliente.idCliente "
                    + "WHERE cliente.nombreCliente LIKE '%" + cliente + "%' "
                    + "OR cliente.apellidoCliente LIKE '%" + cliente + "%' "
                    + "OR cliente.cedulaCliente LIKE '%" + cliente + "%' "
                    + "ORDER BY idFacturaVenta DESC");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }

    //retorna todas las facturas de ventas por los datos de un QuickClient con un Join
    public static ResultSet facturasPorDatosQuickClient(String cliente) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + "SELECT idFacturaVenta, DATE_FORMAT(fechaFactura,'%d/%m/%Y') AS fecha, valorFacturaVenta "
                    + "FROM facturaventa "
                    + "JOIN quickclient "
                    + "ON quickclient.QuickClient_idFactura = facturaventa.idFacturaVenta "
                    + "WHERE quickclient.nombreCliente LIKE '%" + cliente + "%' "
                    + "ORDER BY idFacturaVenta DESC");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }

    //retorna la Sumatoria de todas las facturas de una fechaInicio establecida.
    public static String sumatoriaFacturasActivas(String fechaSumatoriaFacturasActivasInicio, String fechaSumatoriaFacturasActivasFin) {
        String sumatoriaFacturas;

        //Casteo de la fechaInicio pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaSumatoriaFacturasActivasInicio);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaSumatoriaFacturasActivasFin);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("SELECT sum(valorFacturaVenta) as sumatoria "
                    + "FROM facturaventa "
                    + "where fechaFactura BETWEEN '" + fechaInicio + "' and '" + fechaFin + "'"
                    + "and activo = 1");
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

    //retorna todas las facturas activas entre una fecha inicio y una fecha final
    public static ResultSet FacturasActivasEntreFechas(String fechaInicioFacturas, String fechaFinFacturas) {
        //Casteo de la fechaInicio pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaInicioFacturas);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaFinFacturas);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("SELECT idFacturaVenta, DATE_FORMAT(fechaFactura,'%d - %m - %Y') as fecha, valorFacturaVenta "
                    + " FROM facturaventa "
                    + " where fechaFactura BETWEEN '" + fechaInicio + "' and '" + fechaFin + "'"
                    + " and activo = 1");
            rs = stm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
