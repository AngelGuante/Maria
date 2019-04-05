package DataBase.Facturacion.FacturaCompra.Compra;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    @SuppressWarnings("ConvertToTryWithResources")
    public static boolean facturaCompra(String[] datos, String textFieldFecha) {
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement stm = null;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into facturacompra"
                    + "(distribuidor_idDistribuidor, fechaCompra, valorFacturaCompra, activo, facturadoPor)"
                    + "values (?, ?, ?, ?, ?)");
            //Una conexion, para buscar el id del distribuidor a travez de du codigo.
            java.sql.ResultSet rs = DataBase.Facturacion.Distribuidor.Select.distribuidorCodigo(datos[0]);
            rs.next();
            //Casteo de la fecha pasada como estring a SqlDate
            java.util.Date date = DataBase.logica.casteoFecha.stringToDate(textFieldFecha);
            java.sql.Date fecha = new java.sql.Date(date.getTime());

            stm.setInt(1, rs.getInt("idDistribuidor"));
            stm.setDate(2, fecha);
            stm.setInt(3, Integer.parseInt(datos[2]));
            stm.setBoolean(4, true);
            stm.setInt(5, Integer.parseInt(Logica.CamposTexto.Campo_extraerCodigo.getCode(
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
