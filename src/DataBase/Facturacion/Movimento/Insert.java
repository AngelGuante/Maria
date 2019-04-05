package DataBase.Facturacion.Movimento;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static boolean movimento(String[] datos) {
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement stm = null;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into movimiento"
                    + "(cargadoA, tipoMovimento, montoMovimiento, motivoMovimiento)"
                    + "values (?, ?, ?, ?)");
            stm.setString(1, datos[0]);
            stm.setString(2, datos[1]);
            stm.setString(3, datos[2]);
            stm.setString(4, datos[3]);
            stm.executeUpdate();
            stm.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
