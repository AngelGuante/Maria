package DataBase.Facturacion.Producto;

import DataBase.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select extends conexion {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //todos los Producto con y sin existencia para llenar la tabla de productos
    @SuppressWarnings("CallToPrintStackTrace")
    public static ResultSet todoProductoConSinExistenciaAlmace(String orderBy) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + "SELECT * "
                    + "FROM producto "
                    + "ORDER BY " + orderBy);
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //todos los Producto
    public static ResultSet todoProducto() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from producto");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }

    //Productos en almacen
    public static ResultSet ProductoEnAlmacen() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("SELECT * FROM producto"
                    + " where cantidadAlmacenProducto > 0"
                    + " order by descripcionProducto");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }

    //Productos sin existencia en almacen
    public static ResultSet ProductoNoAlmacen() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("SELECT * FROM producto"
                    + " where cantidadAlmacenProducto = 0"
                    + " order by descripcionProducto");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }

    //producto por like
    public static ResultSet productoLike(String datosProducto) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from producto"
                    + " where claveProducto like '%" + datosProducto + "%'"
                    + " or descripcionProducto like '%" + datosProducto + "%'"
                    + " order by descripcionProducto");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }

    //producto por like
    public static ResultSet productoLikeEnAlmacen(String datosProducto) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from producto"
                    + " where (claveProducto like '" + datosProducto + "%'"
                    + " or descripcionProducto like '" + datosProducto + "%')"
                    + " and cantidadAlmacenProducto > 0"
                    + " order by descripcionProducto");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }

    //producto por like
    public static ResultSet productoLikeNoAlmacen(String datosProducto) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from producto"
                    + "  where (claveProducto like '" + datosProducto + "%'"
                    + " or descripcionProducto like '" + datosProducto + "%')"
                    + " and cantidadAlmacenProducto = 0"
                    + " order by descripcionProducto");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }

    //producto por parametro
    public static ResultSet productoPorCodigo(String codigoBuscado) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from producto"
                    + " where claveProducto = '" + codigoBuscado + "'");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }

    //producto por parametro
    public static ResultSet productoParametroEnAlmacen(String codigoBuscado) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from producto"
                    + "  where claveProducto = '" + codigoBuscado + "'"
                    + " and cantidadAlmacenProducto > 0"
                    + " order by descripcionProducto");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }

    /*
    *Retorna el total en almacen de un producto, este metodo se creo en un principio
    *porque al momento de actualizar la cantidad en almacen del producto necesito saber 
    *la cantidad que tiene para poner sumarle o restarle la nueva cantidad.
     */
    public static int cantidadProductoAlmacen(String codigoBuscado) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select claveProducto, cantidadAlmacenProducto from producto"
                    + "  where claveProducto = '" + codigoBuscado + "'");
            rs = stm.executeQuery();
            rs.next();
            int totalAlmacenProducto = rs.getInt("cantidadAlmacenProducto");
            rs.close();
            return totalAlmacenProducto;
        } catch (SQLException ex) {
        }
        return -1;
    }

    //Retorna los datos de un producto contenidos en el detalle de venta a credito de una factura cuyo id es pasado por parametro.
    public static ResultSet productoDeFacturaVentaCredito(String idFacturaVentaCredito) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select claveProducto, descripcionProducto"
                    + " from producto "
                    + " where idProducto = '" + idFacturaVentaCredito + "'");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }
}
