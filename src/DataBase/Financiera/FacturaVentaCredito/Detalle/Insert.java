package DataBase.Financiera.FacturaVentaCredito.Detalle;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert{

    @SuppressWarnings("ConvertToTryWithResources")
    public static boolean detalleVentaCredito(String[] datos) {
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement stm = null;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into detalleventacredito"
                    + "(facturaVentaCredito_idFacturaVentaCredito, producto_idProducto, costoProductoEnCompra)"
                    + "values (?, ?, ?)");
            //Una conexion, para buscar el id de el producto pasado por parametro
            java.sql.ResultSet rs = DataBase.Facturacion.Producto.Select.productoPorCodigo(datos[1]);
            rs.next();
            
            stm.setInt(1, Integer.parseInt(datos[0]));
            stm.setInt(2, rs.getInt("idProducto"));
            stm.setInt(3, Integer.parseInt(datos[2]));
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
