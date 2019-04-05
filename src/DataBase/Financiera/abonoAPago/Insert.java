package DataBase.Financiera.abonoAPago;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    //Abono a pago
    public static boolean abonoAPagos(String[] datos, String textFieldFecha) {
        PreparedStatement stm;
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into abonoAPago"
                    + "(ventaCredito_idVentaCredito, montoAbonado, fechaAbono)"
                    + "values (?, ?, ?)");
            //Casteo de la fecha pasada como estring a SqlDate
            java.util.Date date = DataBase.logica.casteoFecha.stringToDate(textFieldFecha);
            java.sql.Date fecha = new java.sql.Date(date.getTime());
            
            stm.setString(1, datos[0]);
            stm.setString(2, datos[1]);
            stm.setDate(3, fecha);
            stm.executeUpdate();
            stm.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}