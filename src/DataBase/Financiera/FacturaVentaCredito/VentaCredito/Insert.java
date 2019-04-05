package DataBase.Financiera.FacturaVentaCredito.VentaCredito;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    @SuppressWarnings("ConvertToTryWithResources")
    public static boolean facturaVentaCredito(String[] datos) {
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement stm = null;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into facturaventaCredito"
                    + "(cliente_idCliente, fechaFactura, totalPagar, inicial, cuotas, cantidadCuotas, gananciaPagos, activo, facturadoPor)"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            //Una conexion, para buscar el id del cliente a travez de du codigo.
            java.sql.ResultSet rs = DataBase.Facturacion.Clientes.Select.clienteCedula(datos[0]);
            rs.next();
            //Casteo de la fecha pasada como string a SqlDate
            java.util.Date date = DataBase.logica.casteoFecha.stringToDate(datos[1]);
            java.sql.Date fecha = new java.sql.Date(date.getTime());

            stm.setInt(1, rs.getInt("idCliente"));
            stm.setDate(2, fecha);
            stm.setInt(3, Integer.parseInt(datos[2]));
            stm.setInt(4, Integer.parseInt(datos[3]));
            stm.setInt(5, Integer.parseInt(datos[4]));
            stm.setInt(6, Integer.parseInt(datos[5]));
            stm.setInt(7, Integer.parseInt(datos[6]));
            stm.setBoolean(8, true);
            stm.setInt(9, Integer.parseInt(Logica.CamposTexto.Campo_extraerCodigo.getCode(
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
        } catch (java.lang.NullPointerException ex) {
            Logica.Cuadros_Emergentes.alerta("Error con la fecha\n"
                    + "Verifique que la fecha este bien escrita.\n"
                    + "Verifique que el campo de la fecha no este vacio.");
            return false;
        }
    }
}
