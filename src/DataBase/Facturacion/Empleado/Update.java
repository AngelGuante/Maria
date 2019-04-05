package DataBase.Facturacion.Empleado;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    private static PreparedStatement stm = null;

    //empleado
    public static void empleado(String[] nuevosDatos, String textFieldFecha, boolean accesoASistema, boolean administrador) {
        //Casteo de la fecha pasada como estring a SqlDate
        java.util.Date date = DataBase.logica.casteoFecha.stringToDate(textFieldFecha);
        java.sql.Date fecha = new java.sql.Date(date.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update empleado"
                    + " set nombreEmpleado = '" + nuevosDatos[1] + "',"
                    + " apellidoEmpleado = '" + nuevosDatos[2] + "',"
                    + " contacto = '" + nuevosDatos[3] + "',"
                    + " puesto = '" + nuevosDatos[4] + "',"
                    + " Sueldo = '" + nuevosDatos[5] + "',"
                    + " ingreso = '" + fecha + "',"
                    + " notas = '" + nuevosDatos[6] + "',"
                    + " accesoASistema = " + accesoASistema + ","
                    + " contrasenia = '" + nuevosDatos[7] + "',"
                    + " administrador = " + administrador
                    + " where idEmpleado = '" + nuevosDatos[0] + "'");
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Para cancelar al empleado. pone su estado de activo a inactivo
    public static void cancelarEmpleado(String idEmpleado) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update empleado"
                    + " set activo = 0"
                    + " where idEmpleado = '" + idEmpleado + "'");
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
