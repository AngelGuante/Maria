package DataBase.Facturacion.Empleado;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    public static boolean empleado(String[] datos, String textFieldFecha, boolean accesoASistema, boolean administrador) {
        PreparedStatement stm;
        java.util.Date date = DataBase.logica.casteoFecha.stringToDate(textFieldFecha);
        java.sql.Date fecha = new java.sql.Date(date.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into empleado"
                    + "(claveEmpleado, nombreEmpleado, apellidoEmpleado, contacto, puesto, Sueldo, notas, ingreso, accesoASistema, contrasenia, administrador)"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stm.setString(1, datos[0]);
            stm.setString(2, datos[1]);
            stm.setString(3, datos[2]);
            stm.setString(4, datos[3]);
            stm.setString(5, datos[4]);
            stm.setString(6, datos[5]);
            stm.setString(7, datos[6]);
            stm.setDate(8, fecha);
            stm.setBoolean(9, accesoASistema);
            stm.setString(10, datos[7]);
            stm.setBoolean(11, administrador);
            stm.executeUpdate();
            stm.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
