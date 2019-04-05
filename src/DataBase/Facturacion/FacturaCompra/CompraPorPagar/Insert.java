package DataBase.Facturacion.FacturaCompra.CompraPorPagar;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    @SuppressWarnings("ConvertToTryWithResources")
    public static boolean facturaCompraPorPagar(String[] datos, String textFieldFecha) {
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement stm = null;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into facturaporpagar"
                    + "(distribuidor_idDistribuidor, fechaCompra, valorFacturaCompra)"
                    + "values (?, ?, ?)");            
            //Una conexion, para buscar el id del distribuidor a travez de du codigo.
            java.sql.ResultSet rs = DataBase.Facturacion.Distribuidor.Select.distribuidorCodigo(datos[0]);
            rs.next();
            //Casteo de la fecha pasada como estring a SqlDate
            java.util.Date date = DataBase.logica.casteoFecha.stringToDate(textFieldFecha);
            java.sql.Date fecha = new java.sql.Date(date.getTime());
            //*
            stm.setInt(1, rs.getInt("idDistribuidor"));
            stm.setDate(2, fecha);
            stm.setInt(3, Integer.parseInt(datos[2]));
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
