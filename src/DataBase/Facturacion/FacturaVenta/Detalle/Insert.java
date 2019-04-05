package DataBase.Facturacion.FacturaVenta.Detalle;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    @SuppressWarnings("ConvertToTryWithResources")
    public static boolean detalleVenta(String[] datos) {
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement stm = null;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into detalleventa"
                    + "(facturaVenta_idFacturaVenta, producto_idProducto, cantidadProductoVenta, costoProductoIndividualVenta, precioProductoIndividualVenta)"
                    + "values (?, ?, ?, ?, ?)");
            //Buscar el id de la ultima factura de venta.
            int ultimaFacturaId = DataBase.Facturacion.FacturaVenta.Venta.Select.ultimoId();
            //Una conexion, para buscar el id de el producto pasado por parametro
            java.sql.ResultSet rs = DataBase.Facturacion.Producto.Select.productoPorCodigo(datos[0]);
            rs.next();
            
            stm.setInt(1, ultimaFacturaId);
            stm.setInt(2, rs.getInt("idProducto"));
            stm.setInt(3, Integer.parseInt(datos[1]));
            stm.setInt(4, Integer.parseInt(datos[2]));
            stm.setInt(5, Integer.parseInt(datos[3]));
            stm.executeUpdate();
            stm.close();
            rs.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
