package DataBase.Facturacion.FacturaCompra.Detalle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //Retorna el detalle de factura de la factura de compra pasada por parametro
    //junto con los datos del producto comprado y el nombre del distribuidor. 
    public static ResultSet detalleFctura(String idFacturaCompra, String nombreTabla) {
        String nombreTablaCompra = "detallecompra".equals(nombreTabla) ? "facturaCompra" : "facturaporpagar";
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select " + nombreTabla + ".facturacompra_idFacturaCompra, " + nombreTabla + ".producto_idProducto, " + nombreTabla + ".cantidadProductoCompra, " + nombreTabla + ".costoProductoIndividualCompra,"
                    + " producto.idProducto, producto.claveProducto, producto.descripcionProducto,"
                    + nombreTablaCompra + ".distribuidor_idDistribuidor,"
                    + " distribuidor.idDistribuidor, distribuidor.nombreDistribuidor, distribuidor.claveDistribuidor"
                    + " from " + nombreTabla + ", producto," + nombreTablaCompra + ", distribuidor"
                    + " where facturacompra_idFacturaCompra = '" + idFacturaCompra + "'"
                    + " and idProducto = " + nombreTabla + ".producto_idProducto"
                    + " and " + nombreTablaCompra + ".idFacturaCompra = " + nombreTabla + ".facturacompra_idFacturaCompra"
                    + " and distribuidor.idDistribuidor = " + nombreTablaCompra + ".distribuidor_idDistribuidor");
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
                    + "select idFacturaCompra, DATE_FORMAT(fechaCompra,'%d/%m/%Y') as fecha, valorFacturaCompra, activo "
                    + "FROM ventafinanciera.detallecompra "
                    + "JOIN facturacompra "
                    + "ON facturacompra.idFacturaCompra = detallecompra.facturacompra_idFacturaCompra "
                    + "WHERE producto_idProducto =  " + idProducto + " "
                    + "AND facturacompra.fechaCompra BETWEEN  '" + fechIncio + "'"
                    + "AND '" + fechaFin + "' "
                    + "ORDER BY idDetalleCompra desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
}
