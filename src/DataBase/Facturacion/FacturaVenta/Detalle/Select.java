package DataBase.Facturacion.FacturaVenta.Detalle;

import DataBase.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select extends conexion {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //retorna el detalle de factura de la factura de venta pasada por parametro
    //junto con los datos del producto vendido y el nombre del cliente. 
    public static ResultSet detalleFctura(String idFacturaVenta) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select detalleventa.facturaVenta_idFacturaVenta, detalleventa.producto_idProducto, detalleventa.cantidadProductoVenta, detalleventa.costoProductoIndividualVenta, detalleventa.precioProductoIndividualVenta, "
                    + " producto.idProducto, producto.claveProducto, producto.descripcionProducto,"
                    + " facturaVenta.cliente_idCliente,"
                    + " cliente.idCliente, cliente.nombreCliente, cliente.apellidoCliente"
                    + " from detalleventa, producto, facturaVenta, cliente"
                    + " where facturaVenta_idFacturaVenta = '" + idFacturaVenta + "'"
                    + " and idProducto = detalleventa.producto_idProducto"
                    + " and facturaVenta.idFacturaVenta = detalleventa.facturaVenta_idFacturaVenta"
                    + " and cliente.idCliente = facturaVenta.cliente_idCliente");
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
                    + "SELECT idFacturaVenta, DATE_FORMAT(fechaFactura,'%d/%m/%Y') as fecha, valorFacturaVenta, activo "
                    + "FROM ventafinanciera.detalleventa "
                    + "JOIN facturaventa "
                    + "ON facturaventa.idFacturaVenta = detalleventa.facturaVenta_idFacturaVenta "
                    + "WHERE producto_idProducto =  " + idProducto + " "
                    + "AND facturaventa.fechaFactura BETWEEN  '" + fechIncio + "'"
                            + "AND '" + fechaFin + "' "
                    + "ORDER BY idFacturaVenta desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
}
