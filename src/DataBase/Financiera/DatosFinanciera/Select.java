package DataBase.Financiera.DatosFinanciera;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    /**
     * Retorna la cantidad de dinero que hay invertido en la calle.
     * 
     * @return 
     */
    public static int getMontoInvertidoEnLaCalle() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + " SELECT costoFacturasActivas"
                    + " FROM datosfinanciera"
                    + " WHERE id = 0");
            rs = stm.executeQuery();
            rs.next();
            int nEmpleados = rs.getInt("costoFacturasActivas");
            rs.close();
            return nEmpleados;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
