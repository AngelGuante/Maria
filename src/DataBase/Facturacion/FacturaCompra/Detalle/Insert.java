package DataBase.Facturacion.FacturaCompra.Detalle;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    @SuppressWarnings("ConvertToTryWithResources")
    public static boolean detalleCompra(String[] datos) {
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement stm = null;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into detallecompra"
                    + "(facturacompra_idFacturaCompra, producto_idProducto, cantidadProductoCompra, costoProductoIndividualCompra)"
                    + "values (?, ?, ?, ?)");
            //Buscar el id de la ultima factura de compra.
            int ultimaFacturaId = DataBase.Facturacion.FacturaCompra.Compra.Select.ultimoId();
            //Una conexion, para buscar el id de el producto pasado por parametro
            java.sql.ResultSet rs = DataBase.Facturacion.Producto.Select.productoPorCodigo(datos[0]);
            rs.next();
            //*
            stm.setInt(1, ultimaFacturaId);
            stm.setInt(2, rs.getInt("idProducto"));
            stm.setInt(3, Integer.parseInt(datos[1]));
            stm.setInt(4, Integer.parseInt(datos[2]));
            stm.executeUpdate();
            stm.close();
            rs.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
