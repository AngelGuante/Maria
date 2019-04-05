package DataBase.Facturacion.DatosNecocio;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    private static PreparedStatement stm = null;

    public static void Datos(String[] nuevosDatos) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + " UPDATE datosnegocio"
                    + " SET nombreNegocio = '" + nuevosDatos[0] + "',"
                    + " direccion1 = '" + nuevosDatos[1] + "',"
                    + " direccion2 = '" + nuevosDatos[2] + "',"
                    + " telefono1 = '" + nuevosDatos[3] + "',"
                    + " telefono2 = '" + nuevosDatos[4] + "',"
                    + " rnc = '" + nuevosDatos[5] + "'"        
                    + " WHERE id = '1'");
            stm.executeUpdate();
            stm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
