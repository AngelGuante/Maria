package DataBase.Facturacion.Empleado;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //todos los empleados
    public static ResultSet todoEmpleados() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from empleado"
                    + " order by nombreEmpleado");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //empleados activos solamente
    public static ResultSet empleadosActivos() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from empleado"
                    + " where activo = 1"
                    + " order by nombreEmpleado");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //nombre, apellido y ID del empleado buscado por su codigo de empleado
    public static String Empleado(String codigo, boolean tipo) {
        String select =
                tipo
                ? "SELECT (CONCAT(claveEmpleado, ' ', nombreEmpleado, ' ', apellidoEmpleado)) AS empleado "
                : "SELECT (idEmpleado) AS empleado "; 
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement(""
                    + select
                    + "FROM empleado "
                    + "WHERE claveEmpleado = '" + Logica.CamposTexto.Campo_extraerCodigo.getCode(codigo) + "'"
                    + "OR idEmpleado = '" + codigo + "'");
            rs = stm.executeQuery();
            rs.next();
            String empleado = rs.getString("empleado");
            rs.close();
            return empleado;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "--";
    }

    //empleado por Id
    public static ResultSet empleadoPorId(String idEmpleado) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select nombreEmpleado, apellidoEmpleado, contacto, puesto, Sueldo, DATE_FORMAT(ingreso,'%d %m %Y') as fecha, notas, accesoASistema, contrasenia, administrador from empleado"
                    + " where idEmpleado = " + idEmpleado);
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //solo administradores
    public static ResultSet todosAdministradoresActivos() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from empleado"
                    + " where administrador = 1"
                    + " and activo = 1"
                    + " order by nombreEmpleado");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //Nombre de solo empleados que tienen acceso al sistema
    public static ResultSet soloEmpleadosConAcceso() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select claveEmpleado, nombreEmpleado, apellidoEmpleado from empleado"
                    + " where accesoASistema = 1"
                    + " and activo = 1");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    /**
     * Verifica y retorna un booleano si la contraseña pasada coincide con un
     * cliente buscado por su claveUsuario.
     *
     * @return true coincide la contraseña, false no coincide.
     * @param claveEmpleado: Clave del empleado.
     * @param contrasenia: Contraseña del empleado.
     */
    public static boolean verificarContrasenia(String claveEmpleado, String contrasenia) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select contrasenia from empleado"
                    + " where accesoASistema = 1"
                    + " and activo = 1"
                    + " and claveEmpleado = '" + claveEmpleado + "'");
            rs = stm.executeQuery();
            rs.next();
            boolean verificacion = rs.getString("contrasenia").matches(contrasenia);
            rs.close();
            return verificacion;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    /**
     * Retorna el privilegio del empleado.
     *
     * @return Un entero que indica el nivel de privilegio: 0. Estandar 1.
     * Administrador
     *
     * @param claveEmpleado: Clave del empleado.
     */
    public static int getPrivilegio(String claveEmpleado) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select administrador from empleado"
                    + " where accesoASistema = 1"
                    + " and activo = 1"
                    + " and claveEmpleado = '" + claveEmpleado + "'");
            rs = stm.executeQuery();
            rs.next();
            int nivelPrivilegio = rs.getInt("administrador");
            rs.close();
            return nivelPrivilegio;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    /**
     * Retorna la cantidad de registros de empleados ingresados.
     *
     * @return Un entero indicando la cantidad de empleados.
     */
    public static int getNumeroEmpleados() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select COUNT(idEmpleado)as nEmpleados FROM empleado");
            rs = stm.executeQuery();
            rs.next();
            int nEmpleados = rs.getInt("nEmpleados");
            rs.close();
            return nEmpleados;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
