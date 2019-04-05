package DataBase.Financiera.FacturaVentaCredito.Detalle;

import DataBase.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select extends conexion {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //retorna el detalle de factura de la factura de venta credito pasada por parametro.
    public static ResultSet detalleFacturaCredito(String idFacturaVentaCredito) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + " SELECT detalleventacredito.facturaVentaCredito_idFacturaVentaCredito, sum(detalleventacredito.costoProductoEnCompra) as sumatoriaCostos,"
                    + " facturaVentaCredito.idVentaCredito, facturaVentaCredito.totalPagar, facturaVentaCredito.cuotas, facturaVentaCredito.gananciaPagos, facturaVentaCredito.cliente_idCliente, DATE_FORMAT(facturaventacredito.fechaFactura,'%d/%m/%Y') as fecha, facturaVentaCredito.activo, facturaVentaCredito.inicial,"
                    + " restantesfacturaventacredito.totalPagarRst, restantesfacturaventacredito.cantidadCuotasRst,"
                    + " cliente.cedulaCliente, cliente.nombreCliente, cliente.apellidoCliente"
                    + " FROM detalleventacredito, facturaVentaCredito, restantesfacturaventacredito, cliente"
                    + " WHERE detalleventacredito.facturaVentaCredito_idFacturaVentaCredito = '" + idFacturaVentaCredito + "'"
                    + " AND detalleventacredito.facturaVentaCredito_idFacturaVentaCredito = facturaVentaCredito.idVentaCredito"
                    + " AND restantesfacturaventacredito.restantes_idFacturaVentaCredito = facturaVentaCredito.idVentaCredito"
                    + " AND facturaventacredito.cliente_idCliente = cliente.idCliente"
                    + " AND activo = 1");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //Retorna los id de detalles de la factura venta a credito pasada por parametro.
    public static ResultSet detallesFacturaVentaCredito(String idFacturaVentaCredito) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + "SELECT producto_idProducto, costoProductoEnCompra "
                    + "FROM detalleventacredito "
                    + "WHERE facturaVentaCredito_idFacturaVentaCredito = '" + idFacturaVentaCredito + "'");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //retorna todas las facturas de compras buscadas por un producto en
    //espesifico en un rango de fechas
    public static ResultSet FacturasBusquedaAvanzada(String idProducto, String fechIncio, String fechaFin) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + "SELECT facturaventacredito.idVentaCredito, DATE_FORMAT(facturaventacredito.fechaFactura,'%d/%m/%Y') as fecha, "
                    + "cliente.cedulaCliente, cliente.nombreCliente, cliente.apellidoCliente "
                    + "FROM cliente, detalleventacredito "
                    + "JOIN facturaventacredito "
                    + "ON facturaventacredito.idVentaCredito = detalleventacredito.facturaVentaCredito_idFacturaVentaCredito "
                    + "WHERE producto_idProducto =  " + idProducto + " "
                    + "AND facturaventacredito.fechaFactura BETWEEN  '" + fechIncio + "'"
                            + "AND '" + fechaFin + "' "
                    + "AND facturaventacredito.cliente_idCliente = cliente.idCliente "
                    + "AND activo = " + Diseño.Financiera.paneles_pantallaPrincipal.panel_ClientesPendientes.grupo_Activos.isSelected() + " "
                    + "ORDER BY idVentaCredito desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
}
