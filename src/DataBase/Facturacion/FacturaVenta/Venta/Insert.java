package DataBase.Facturacion.FacturaVenta.Venta;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    @SuppressWarnings({"ConvertToTryWithResources", "CallToPrintStackTrace"})
    public static boolean facturaVenta(String[] datos) {
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement stm = null;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into facturaventa"
                    + "(cliente_idCliente, fechaFactura, valorFacturaVenta, costoFactura, activo, facturadoPor)"
                    + "values (?, ?, ?, ?, ?, ?)");
            //Una conexion, para buscar el id del cliente a travez de du codigo.
            java.sql.ResultSet rs = DataBase.Facturacion.Clientes.Select.clienteCedula(datos[0]);
            rs.next();
            //Casteo de la fecha pasada como estring a SqlDate
            java.util.Date date = DataBase.logica.casteoFecha.stringToDate(datos[1]);
            java.sql.Date fecha = new java.sql.Date(date.getTime());

            stm.setInt(1, rs.getInt("idCliente"));
            stm.setDate(2, fecha);
            stm.setInt(3, Integer.parseInt(datos[2]));
            stm.setInt(4, Integer.parseInt(datos[3]));
            stm.setBoolean(5, true);
            stm.setInt(6, Integer.parseInt(Logica.CamposTexto.Campo_extraerCodigo.getCode(
                    DataBase.Facturacion.Empleado.Select.Empleado(
                            Diseño.Facturacion.paneles_pantallaPrincipal.panel_pantallaPrincipal.panel_PantallaPrincipal_labelNombreLog
                                    .getText(), false))));
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
