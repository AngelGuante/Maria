package DataBase.Facturacion.DatosFuncionamiento;

import DataBase.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select extends conexion {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    @SuppressWarnings("CallToPrintStackTrace")
    public static String[] Datos() {
        String[] datos = new String[8];
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + " SELECT *"
                    + " FROM datosfuncionamiento"
                    + " WHERE id = 1");
            rs = stm.executeQuery();

            rs.next();
            datos[0] = rs.getString("rutaBin");
            datos[1] = rs.getString("ruta_backUp_USB");
            datos[2] = rs.getString("ruta_backUp_EQUIPO");
            datos[3] = rs.getString("pedirContrasenia");
            datos[4] = rs.getString("usuario_datosARecordar");
            datos[5] = rs.getString("usuario_nombreRecordado");
            datos[6] = rs.getString("usuario_contraseniaRecordada");
            datos[7] = rs.getString("usuarioPrincipal");
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }
}
