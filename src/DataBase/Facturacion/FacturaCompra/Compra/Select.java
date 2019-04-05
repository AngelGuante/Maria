package DataBase.Facturacion.FacturaCompra.Compra;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //retorna el id de la ultima factura de compra
    public static int ultimoId() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idFacturaCompra "
                    + "from facturacompra "
                    + "order by idFacturaCompra desc "
                    + "limit 1");
            rs = stm.executeQuery();
            rs.next();
            int ultimaFacturaId = rs.getInt("idFacturaCompra");
            rs.close();
            stm.close();
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
                    + "FROM facturacompra "
                    + "WHERE idFacturaCompra = " + idFactura);
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

    //retorna todas las facturas de compras activas y pasadas a caja
    public static ResultSet todasFacturasActivas() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idFacturaCompra, DATE_FORMAT(fechaCompra,'%d/%m/%Y') as fecha, valorFacturaCompra, activo "
                    + "from facturacompra "
                    + "where activo = 1 "
                    + "order by idFacturaCompra desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }

    //retorna la factura que tenga el ID pasado por parametro si a sido pasadas a caja
    public static ResultSet facturaID(String idFactura) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idFacturaCompra, DATE_FORMAT(fechaCompra,'%d/%m/%Y') as fecha, valorFacturaCompra, activo "
                    + "from facturacompra "
                    + "where idFacturaCompra like '" + idFactura + "%' "
                    + "and activo = 1 "
                    + "order by idFacturaCompra desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }

    //retorna todas las facturas de compras eliminadas
    public static ResultSet todasFacturasEliminadas() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idFacturaCompra, DATE_FORMAT(fechaCompra,'%d/%m/%Y') as fecha, valorFacturaCompra, activo "
                    + "from facturacompra "
                    + "where activo = 0 "
                    + "order by idFacturaCompra desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }

    //retorna todas las facturas de compras "Eliminadas"
    public static ResultSet facturaEliminada(String idFactura) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + "select idFacturaCompra, DATE_FORMAT(fechaCompra,'%d/%m/%Y') as fecha, valorFacturaCompra, activo "
                    + "from facturacompra "
                    + "where idFacturaCompra like '" + idFactura + "%' "
                    + "and activo = 0 "
                    + "order by idFacturaCompra desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }

    //retorna todas las facturas de ventas por los datos de un distribuidor con un Join
    public static ResultSet facturasPorDatosDistribuido(String distribuidor) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + "select idFacturaCompra, DATE_FORMAT(fechaCompra,'%d/%m/%Y') as fecha, valorFacturaCompra, activo "
                    + "from facturacompra "
                    + "join distribuidor "
                    + "on facturacompra.distribuidor_idDistribuidor = distribuidor.idDistribuidor "
                    + "where distribuidor.claveDistribuidor like '%" + distribuidor + "%' "
                    + "or distribuidor.nombreDistribuidor like '%" + distribuidor + "%' "
                    + "order by idFacturaCompra desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }

    //retorna la sumatoria de todas las facturas de una fecha establecida.
    public static String sumatoriaFacturasActivas(String fechaSumatoriaFacturasActivasInicio, String fechaSumatoriaFacturasActivasFin) {
        String sumatoriaFacturas;

        //Casteo de la fecha pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaSumatoriaFacturasActivasInicio);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaSumatoriaFacturasActivasFin);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("SELECT sum(valorFacturaCompra) as sumatoria "
                    + "FROM facturacompra "
                    + "where fechaCompra BETWEEN '" + fechaInicio + "' and '" + fechaFin + "'"
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

    //retorna todas las facturas de compras activas entre fechas
    public static ResultSet FacturasActivasEntreFechas(String fechaInicioFacturas, String fechaFinFacturas) {
        //Casteo de la fechaInicio pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaInicioFacturas);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaFinFacturas);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idFacturaCompra, DATE_FORMAT(fechaCompra,'%d - %m - %Y') as fecha, valorFacturaCompra"
                    + " from facturacompra "
                    + " where fechaCompra BETWEEN '" + fechaInicio + "' and '" + fechaFin + "'"
                    + " and activo = 1 ");
            rs = stm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
