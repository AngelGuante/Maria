package DataBase.Facturacion.DatosFuncionamiento;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    private static PreparedStatement stm = null;

    public static void Datos_backUp(String Columna, String nuevosDatos) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + " UPDATE datosfuncionamiento"
                    + " SET " + Columna + " = '" + nuevosDatos + "'"      
                    + " WHERE id = '1'");
            stm.executeUpdate();
            stm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
