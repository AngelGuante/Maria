package DataBase.Financiera.abonoAPago;

import DataBase.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select extends conexion {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //todos los abonos sumados
    public static ResultSet todosAbonos() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("SELECT cliente.nombreCliente, cliente.apellidoCliente, abonoapago.ventaCredito_idVentaCredito, sum(abonoapago.montoAbonado) as suma"
                    + " FROM abonoapago, facturaventacredito, cliente"
                    + " where abonoapago.activo = 1"
                    + " and facturaventacredito.idVentaCredito = ventaCredito_idVentaCredito"
                    + " and cliente.idCliente = facturaventacredito.cliente_idCliente"
                    + " group by ventaCredito_idVentaCredito;");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex);
        }
        return rs;
    }

    //todos los abonos parametrisados
    public static ResultSet abonoParametrizado(String datosCliente) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("SELECT cliente.nombreCliente, cliente.apellidoCliente, abonoapago.ventaCredito_idVentaCredito, sum(abonoapago.montoAbonado) as suma"
                    + " FROM abonoapago, facturaventacredito, cliente"
                    + " where abonoapago.activo = 1"
                    + " and facturaventacredito.idVentaCredito = ventaCredito_idVentaCredito"
                    + " and cliente.idCliente = facturaventacredito.cliente_idCliente"
                    + " and (nombreCliente like '%" + datosCliente + "%'"
                    + " or apellidoCliente like '%" + datosCliente + "%'"
                    + " or ventaCredito_idVentaCredito like '%" + datosCliente + "%')"
                    + " group by ventaCredito_idVentaCredito;");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //Busca la sumatoria de todos los abonos de pagos activos realizados a una factura.
    public static String abonosDePagoDeFactura(String idVentaCredito) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select ventaCredito_idVentaCredito, sum(montoAbonado) as montoAbonado "
                    + "from abonoAPago "
                    + "where ventaCredito_idVentaCredito = '" + idVentaCredito
                    + "' and activo = 1");
            rs = stm.executeQuery();
            rs.next();
            String monto = rs.getString("montoAbonado");
            rs.close();
            stm.close();
            return monto;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "";
    }

    //retorna la sumatoria de todos los abonos de una fecha establecida.
    public static String sumatoriaFacturasActivas(String fechaSumatoriaFacturasActivasInicio, String fechaSumatoriaFacturasActivasFin) {
        String sumatoriaFacturas;
        //Casteo de la fecha pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaSumatoriaFacturasActivasInicio);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaSumatoriaFacturasActivasFin);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("SELECT sum(montoAbonado) as sumatoria "
                    + "FROM abonoapago "
                    + "where fechaAbono BETWEEN '" + fechaInicio + "' and '" + fechaFin + "'");
            rs = stm.executeQuery();
            rs.next();
            sumatoriaFacturas = rs.getString("sumatoria") == null ? "0" : rs.getString("sumatoria");
            rs.close();
            stm.close();
            return sumatoriaFacturas;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "0";
        }
    }

    //retorna el id el ultimo abono a pago
    public static int ultimoId() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select id "
                    + "from abonoapago "
                    + "order by id desc "
                    + "limit 1");
            rs = stm.executeQuery();
            rs.next();
            int ultimaFacturaId = rs.getInt("id");
            rs.close();
            stm.close();
            return ultimaFacturaId;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return -1;
    }

    //todos los abonos activos entre fechas
    public static ResultSet AbonosActivosEntreFechas(String fechaInicioAbonos, String fechaFinAbonos) {
        //Casteo de la fechaInicio pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaInicioAbonos);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaFinAbonos);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("SELECT ventaCredito_idVentaCredito, DATE_FORMAT(fechaAbono,'%d - %m - %Y') as fecha, montoAbonado "
                    + " FROM abonoapago"
                    + " where fechaAbono BETWEEN '" + fechaInicio + "' and '" + fechaFin + "'"
                    + " and abonoapago.activo = 1");
            rs = stm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
