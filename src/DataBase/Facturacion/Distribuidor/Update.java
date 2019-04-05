package DataBase.Facturacion.Distribuidor;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    private static PreparedStatement stm = null;

    public static void Distribuidor(String[] nuevosDatos) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update distribuidor"
                    + " set nombreDistribuidor = '" + nuevosDatos[1] + "',"
                    + " telefonoDistribuidor = '" + nuevosDatos[2] + "',"
                    + " direccionDistribuidor = '" + nuevosDatos[3] + "'"        
                    + " where claveDistribuidor = '" + nuevosDatos[0] + "'");
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Pone el estado del distribuidor a "inactivo" o "activo".
    public static void setStatusDisableOrEnable(String[] estadoProductoDatos) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update distribuidor"
                    + " set activo  = " + estadoProductoDatos[1] + ""
                    + " where claveDistribuidor = '" + estadoProductoDatos[0] + "'");
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
