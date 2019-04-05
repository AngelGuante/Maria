package DataBase.Facturacion.DatosNecocio;

import DataBase.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select extends conexion {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    @SuppressWarnings("CallToPrintStackTrace")
    public static String[] Datos() {
        String[] datos = new String[6];
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + " SELECT *"
                    + " FROM datosnegocio"
                    + " WHERE id = 1");
            rs = stm.executeQuery();

            rs.next();
            datos[0] = rs.getString("nombreNegocio");
            datos[1] = rs.getString("direccion1");
            datos[2] = rs.getString("direccion2");
            datos[3] = rs.getString("telefono1");
            datos[4] = rs.getString("telefono2");
            datos[5] = rs.getString("rnc");
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }
}
