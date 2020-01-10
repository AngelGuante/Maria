package DataBase.Facturacion.ncfnos;

import DataBase.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select extends conexion {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;
    
    public static ResultSet NcsNOs() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from ncfnos");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
        }
        return rs;
    }
}
