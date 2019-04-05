package DataBase.Financiera.DatosFinanciera;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    private static PreparedStatement stm = null;

    /**
     * Para cambiar el valor del dinero invertido en la calle.
     *
     * @param monto cantidad que se le va a Restar O Sumar al monto invertido en
     * la calle.
     * @param sumarRestar Si el nuevo monto se va a sumar, el valor de 
     * sumarRestar debe ser true, en caso contrario, false.
     */
    public static void CambiarCostoFacturasActivas(int monto, boolean sumarRestar) {
        System.err.println(monto);
        int costoInvertidoEnCalle = DataBase.Financiera.DatosFinanciera.Select.getMontoInvertidoEnLaCalle();
        int nuevoCostoInvertidoEnCalle = sumarRestar
                ? costoInvertidoEnCalle + monto
                : costoInvertidoEnCalle - monto;

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + " UPDATE datosfinanciera"
                    + " SET costoFacturasActivas = '" + nuevoCostoInvertidoEnCalle + "'"
                    + " WHERE id = 0");
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
