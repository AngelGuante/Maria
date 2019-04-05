package DataBase.Facturacion.Movimento;

import DataBase.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select extends conexion {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //retorna todos los movimientos activos
    public static ResultSet todosMovimientosActivos(String mes, String anio) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idMovimiento, tipoMovimento, montoMovimiento, motivoMovimiento, DATE_FORMAT(fechaMovimiento, '%d/%m/%Y (%h:%i %p)') as fecha, activo "
                    + "from movimiento "
                    + "where activo = 1 "
                    + "and month(fechaMovimiento) = '" + mes + "' "
                    + "and year(fechaMovimiento) = '" + anio + "' "
                    + "order by fechaMovimiento desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //retorna todos los movimientos activos del empleado buscado
    public static ResultSet todosMovimientosActivosDeEmpleado(String mes, String anio, String datosEmpleado) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select cargadoA, idMovimiento, tipoMovimento, montoMovimiento, motivoMovimiento, DATE_FORMAT(fechaMovimiento, '%d/%m/%Y (%h:%i %p)') as fecha, activo "
                    + "from movimiento "
                    + "where activo = 1 "
                    + "and month(fechaMovimiento) = '" + mes + "' "
                    + "and year(fechaMovimiento) = '" + anio + "' "
                    + "and cargadoA like '%" + datosEmpleado + "%' "
                    + "order by fechaMovimiento desc");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //retorna los datos del movimiento buscando el id pasado por parametro.
    public static ResultSet facturaID(String numeroMovimiento) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select *"
                    + " from movimiento "
                    + " where idMovimiento = " + numeroMovimiento);
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //Retorna la sumatoria de los movimientos de caja detallados de una fecha espesificada
    public static String[] movimientosSumatoriaDetallados(String movimientosFechaInicio, String movimientosFechaFin) {
        String[] sumatorias = {"0", "0", "0", "0", "0", "0", "0", "0"};

        //Se le agrega un dia a la fecha fin para que se incluya la fecha limite
        movimientosFechaFin = DataBase.logica.agregarDiasAFecha.agregarDias(
                Logica.String.String_convertirFechaAFormatoSQL
                        .formatearFecha(movimientosFechaFin), 1);
        //Casteo de la fechaInicio pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(movimientosFechaInicio);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(movimientosFechaFin);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("SELECT tipoMovimento, sum(montoMovimiento) sumatoria"
                    + " FROM movimiento "
                    + " where activo = 1"
                    + " and fechaMovimiento BETWEEN date('" + fechaInicio + "') and date('" + fechaFin + "')"
                    + " group by tipoMovimento");
            rs = stm.executeQuery();

            while (rs.next()) {
                //Datos de la caja
                if (rs.getString("tipoMovimento").equals("Entrada a caja")) {
                    sumatorias[0] = rs.getString("sumatoria") == null ? "0" : rs.getString("sumatoria");
                }
                if (rs.getString("tipoMovimento").equals("Otro benefico")) {
                    sumatorias[1] = rs.getString("sumatoria") == null ? "0" : rs.getString("sumatoria");
                }
                if (rs.getString("tipoMovimento").equals("Salida de caja")) {
                    sumatorias[2] = rs.getString("sumatoria") == null ? "0" : rs.getString("sumatoria");
                }
                if (rs.getString("tipoMovimento").equals("Gasto micelaneo")) {
                    sumatorias[3] = rs.getString("sumatoria") == null ? "0" : rs.getString("sumatoria");
                }
                //Datos del empleado
                if (rs.getString("tipoMovimento").equals("Pago de prestamo")) {
                    sumatorias[4] = rs.getString("sumatoria") == null ? "0" : rs.getString("sumatoria");
                }
                if (rs.getString("tipoMovimento").equals("Prestamo personal")) {
                    sumatorias[5] = rs.getString("sumatoria") == null ? "0" : rs.getString("sumatoria");
                }
                if (rs.getString("tipoMovimento").equals("Pago de sueldo")) {
                    sumatorias[6] = rs.getString("sumatoria") == null ? "0" : rs.getString("sumatoria");
                }
            }
            rs.close();
            return sumatorias;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //retorna los movimientos Activos entre fechas buscados por su tipoMovimiento
    public static ResultSet MovimientosActivosPorTipoEntreFecha(String fechaInicioFacturas, String fechaFinFacturas, String tipoMovimiento) {
        //Se le agrega un dia a la fecha fin para que se incluya la fecha limite
        fechaFinFacturas = DataBase.logica.agregarDiasAFecha.agregarDias(
                Logica.String.String_convertirFechaAFormatoSQL
                        .formatearFecha(fechaFinFacturas), 1);
        //Casteo de la fechaInicio pasada como estring a SqlDate
        java.util.Date dateInicio = DataBase.logica.casteoFecha.stringToDate(fechaInicioFacturas);
        java.sql.Date fechaInicio = new java.sql.Date(dateInicio.getTime());
        java.util.Date dateFin = DataBase.logica.casteoFecha.stringToDate(fechaFinFacturas);
        java.sql.Date fechaFin = new java.sql.Date(dateFin.getTime());

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select idMovimiento, fechaMovimiento, montoMovimiento"
                    + " from movimiento "
                    + " where fechaMovimiento BETWEEN '" + fechaInicio + "' and '" + fechaFin + "'"
                    + " and tipoMovimento = '" + tipoMovimiento + "'");
            rs = stm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
