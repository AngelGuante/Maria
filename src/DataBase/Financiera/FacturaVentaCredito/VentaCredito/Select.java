package DataBase.Financiera.FacturaVentaCredito.VentaCredito;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //retorna el id de la ultima factura de venta a credito
    public static int ultimoId() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idVentaCredito "
                    + "from facturaventacredito "
                    + "order by idVentaCredito desc "
                    + "limit 1");
            rs = stm.executeQuery();
            rs.next();
            int ultimaFacturaId = rs.getInt("idVentaCredito");
            rs.close();
            return ultimaFacturaId;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 1000;
    }

    //retorna el codigo de quien hizo la factura
    public static String facturadaPor(String idFactura) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + "SELECT facturadoPor "
                    + "FROM facturaventacredito "
                    + "WHERE idVentaCredito = " + idFactura);
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

    //retorna true o false dependiendo si el cliente pasado por parametro tiene o no tiene facturas a credito activas osea que deba alguna factura.
    public static boolean clienteConFacturaVentaCredito(String cliente) {
        //Busco el id del cliente a travez de su cedula
        rs = DataBase.Facturacion.Clientes.Select.clienteCedula(cliente);
        try {
            rs.next();
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idVentaCredito, cliente_idCliente "
                    + "from facturaventacredito "
                    + "where activo = 1 "
                    + "and cliente_idCliente = '" + rs.getString("idCliente") + "'");
            rs.close();
            rs = stm.executeQuery();
            while (rs.next()) {
                return true;
            }
            rs.close();
        } catch (SQLException ex) {
        }
        return false;
    }

    //Busca todas las facturas de venta a credito activas de una cedulaCliente pasado por parametro.
    public static ResultSet todasFacturasActivasDeClienteCedula(String cliente) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select facturaventacredito.idVentaCredito, facturaventacredito.cliente_idCliente, DATE_FORMAT(facturaventacredito.fechaFactura,'%d/%m/%Y') as fecha, facturaventacredito.totalPagar, facturaventacredito.activo,"
                    + "cliente.nombreCliente, cliente.apellidoCliente "
                    + "from facturaventacredito, cliente "
                    + "where cliente.cedulaCliente = '" + cliente + "'"
                    + "and facturaventacredito.cliente_idCliente = cliente.idCliente "
                    + "and activo = 1 "
                    + "order by idVentaCredito asc");
            rs = stm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //Busca todas las facturas de venta a credito activas de un idCliente pasado por parametro.
    public static ResultSet todasFacturasActivasDeClienteId(String cliente) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select facturaventacredito.idVentaCredito, facturaventacredito.cliente_idCliente, DATE_FORMAT(facturaventacredito.fechaFactura,'%d/%m/%Y') as fecha, facturaventacredito.totalPagar, facturaventacredito.activo, "
                    + "cliente.nombreCliente, cliente.apellidoCliente "
                    + "from facturaventacredito, cliente "
                    + "where facturaventacredito.cliente_idCliente = cliente.idCliente "
                    + "and cliente.idCliente =  '" + cliente + "' "
                    + "and activo = 1 "
                    + "order by idVentaCredito asc");
            rs = stm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //Retorna el numero de facturas a venta a credito activas.
    public static String cantidadFacturasVentasCreditosActivas() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select count(facturaventacredito.idVentaCredito) filas"
                    + " from facturaventacredito"
                    + " where facturaventacredito.activo = 1 ");
            rs = stm.executeQuery();
            rs.next();
            String sumaCostos = rs.getString("filas");
            rs.close();
            return sumaCostos;
        } catch (SQLException ex) {
        }
        return null;
    }

    //Retorna todas las factturas de venta a credito activas.
    public static ResultSet todasFacturasVentasCreditoActivasConDatosCliente(boolean formatoSql) {
        String fechaFormat = !formatoSql
                ? "DATE_FORMAT(facturaventacredito.fechaFactura,'%d/%m/%Y') as fecha"
                : "facturaventacredito.fechaFactura as fecha";
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select facturaventacredito.idVentaCredito, facturaventacredito.cliente_idCliente, " + fechaFormat + ", totalPagar, facturaventacredito.gananciaPagos,"
                    + " cliente.cedulaCliente, cliente.nombreCliente, cliente.apellidoCliente"
                    + " from facturaventacredito, cliente"
                    + " where facturaventacredito.activo = 1 "
                    + " and facturaventacredito.cliente_idCliente = cliente.idCliente");
            rs = stm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //Busca las facturas a credito de un cliente a travez de los datos pasados por parametros dependiendo el numero pasasdo como segundo parametro.
    public static ResultSet todasFacturasVentasCreditoPorDatosCliente(String datosCliente, int indiceTipoBusqueda, int estado) {
        String[] tipo = {"cliente.cedulaCliente", "cliente.nombreCliente", "cliente.apellidoCliente"};
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + "select cliente.cedulaCliente, cliente.nombreCliente, cliente.apellidoCliente,"
                    + " facturaventacredito.idVentaCredito, DATE_FORMAT(facturaventacredito.fechaFactura,'%d/%m/%Y') as fecha "
                    + " from cliente, facturaventacredito"
                    + " where " + tipo[indiceTipoBusqueda] + " like '%" + datosCliente + "%'"
                    + " and facturaventacredito.cliente_idCliente = cliente.idCliente"
                    + " and facturaventacredito.activo = " + estado);
            rs = stm.executeQuery();
            return rs;
        } catch (SQLException ex) {
        }
        return null;
    }

    //Busca una factura por su id.
    public static ResultSet facturaVentaCreditoId(String idFacturaVentaCredito, int activo) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select facturaventacredito.idVentaCredito, DATE_FORMAT(facturaventacredito.fechaFactura,'%d/%m/%Y') as fecha,"
                    + " cliente.cedulaCliente, cliente.nombreCliente, cliente.apellidoCliente, "
                    + " restantesfacturaventacredito.totalPagarRst"
                    + " from facturaventacredito, cliente, restantesfacturaventacredito"
                    + " where facturaventacredito.idVentaCredito like '" + idFacturaVentaCredito
                    + "%' and facturaventacredito.activo = " + activo
                    + " and cliente.idCliente = facturaventacredito.cliente_idCliente"
                    + " and restantesfacturaventacredito.restantes_idFacturaVentaCredito = facturaventacredito.idVentaCredito");
            return rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //Busca una factura por su id
    @SuppressWarnings("CallToPrintStackTrace")
    public static ResultSet facturaVentaCreditoid(String idFacturaVentaCredito) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select cliente_idCliente, inicial, cuotas, cantidadCuotas, DATE_FORMAT(facturaventacredito.fechaFactura,'%d/%m/%Y') as fecha, facturaventacredito.fechaFactura as fechaSQL, totalPagar, "
                    + " restantesfacturaventacredito.totalPagarRst, restantesfacturaventacredito.cantidadCuotasRst"
                    + " from facturaventacredito, restantesfacturaventacredito"
                    + " where facturaventacredito.idVentaCredito = '" + idFacturaVentaCredito + "' "
                    + " and restantesfacturaventacredito.restantes_idFacturaVentaCredito = facturaventacredito.idVentaCredito");
            return rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //retorna la sumatoria de los iniciales de todas las facturas de una fecha establecida.
    public static String sumatoriaInicialesFacturasActivas(String fechaSumatoriaFacturasActivasInicio, String fechaSumatoriaFacturasFin) {
        String sumatoriaFacturas;

        //Casteo de la fecha pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaSumatoriaFacturasActivasInicio);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaSumatoriaFacturasFin);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("SELECT sum(inicial) as sumatoria "
                    + "FROM facturaventacredito "
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

    //retorna todos los iniciales de las facturas a creditos activas entre una fecha inicio y una fecha final
    public static ResultSet InicialesActivosEntreFechas(String fechaInicioIniciales, String fechaFinIniciales) {
        //Casteo de la fecha pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaInicioIniciales);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaFinIniciales);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("SELECT idVentaCredito, DATE_FORMAT(fechaFactura,'%d - %m - %Y') as fecha, inicial "
                    + "FROM facturaventacredito "
                    + "where fechaFactura BETWEEN '" + fechaInicio + "' and '" + fechaFin + "'"
                    + "and activo = 1");
            rs = stm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
