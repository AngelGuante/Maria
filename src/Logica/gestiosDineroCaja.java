package Logica;

public class gestiosDineroCaja {

    public static boolean verificarExistenciaYEstadoDia(String fechaDia) {

        //Casteo de la fecha pasada como estring a SqlDate
        java.util.Date date = DataBase.logica.casteoFecha.stringToDate(fechaDia);
        java.sql.Date fecha = new java.sql.Date(date.getTime());

        try (java.sql.ResultSet rs = DataBase.Facturacion.movimientoDiario.Select.movimientoDiaFecha(fecha)){
            rs.next();
            if (rs.getBoolean("cerrado")) {
                //Si cuando se intente realizar una transaccion la fecha esta
                //cerrada se le muestra al usurio un mensage indicandole lo que
                //ocurre. pero que esto no ocurra en la ventana de cuadre de caja.
                for (int i = 1; i < Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES.length; i++) {
                    if (i == 4) {
                        if (!Diseño.Facturacion.ventanas_bases.Ventana_base.PANELES[i].isVisible()) {
                            Logica.Cuadros_Emergentes.alerta("FECHA CERRADA\n\n"
                                    + "No se puede crear ningun tipo de movimiento de efectivo en esta fecha.");
                            break;
                        }
                    }
                }
                //En caso de que se encuentre la fecha pero esa fecha este
                //cerrada (1) se retornara false para que no se pueda realizar
                //el proceso quien llamo este metodo.
                return false;
            }

        } catch (java.lang.NullPointerException | java.sql.SQLException ex) {
            //En caso de que ocurra uno de estos exceptions con la fecha se
            //retornara false para que se cree el registro con la fecha pasada
            //por parametro y se retorna true para que se realize el procedimiento
            DataBase.Facturacion.movimientoDiario.Insert.movimientoCaja(fecha);
            return true;
        }
        //En caso de que se encuentre la fecha y esa fecha no este cerrada (0)
        //se retornara true para que se pueda realizar el proceso quien llamo
        //este metodo.
        return true;
    }

    /**Se encarga de llamar los metodos correspondiente al tipo de movimiento
     * enviado, o de entrada o de salida.
     * 
     * @param monto
     * @param tipoMovimiento
     * @param fechaDia 
     */
    public static void agregarMontos(String monto, boolean tipoMovimiento, String fechaDia) {
        //Casteo de la fecha pasada como estring a SqlDate
        java.util.Date date = DataBase.logica.casteoFecha.stringToDate(fechaDia);
        java.sql.Date fecha = new java.sql.Date(date.getTime());

        if (tipoMovimiento) {
            DataBase.Facturacion.movimientoDiario.Update.movimientoEntrada(monto, fecha);
        } else {
            DataBase.Facturacion.movimientoDiario.Update.movimientoSalida(monto, fecha);
        }
    }
}
