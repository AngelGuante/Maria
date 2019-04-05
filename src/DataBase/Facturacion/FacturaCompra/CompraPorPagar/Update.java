package DataBase.Facturacion.FacturaCompra.CompraPorPagar;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    private static PreparedStatement stm = null;

    public static void eliminarFactura(String idFactura) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update facturaporpagar"
                    + " set activo = 0"
                    + " where idFacturaCompra = '" + idFactura + "'");
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Pagar factura de compra
    public static void pagarFactura(String idFactura) {
        //Buscar la fecha actual para pasarla a la tabla y verificar si la fecha esta cerrada o no:
        String fe = Logica.fechaHora.getFecha();
        String fecha = ((fe.substring(0, 2) + ". ")
                + (fe.substring(2, 4) + ". " + (fe.substring(4, fe.length()))));
        Logica.gestiosDineroCaja.verificarExistenciaYEstadoDia(fecha);
        try {
            //Marcar la factura como pagada.
             stm = DataBase.ClientConexion.getConn().prepareStatement("update facturaporpagar"
                    + " set pagada = 1,"
                    + " fechaPagada = now()"
                    + " where idFacturaCompra = '" + idFactura + "'");
            //Pasar este movimiento de entrada a la tabla "Movimiento diario":
            java.util.Date date = DataBase.logica.casteoFecha.stringToDate(fecha);
            java.sql.Date fechaD = new java.sql.Date(date.getTime());
            //para sacar el costo de la factura:
            java.sql.ResultSet rs;
            rs = DataBase.Facturacion.FacturaCompra.CompraPorPagar.Select.facturaIDNoPasadaCaja(idFactura);
            rs.next();
             DataBase.Facturacion.movimientoDiario.Update.movimientoSalida(rs.getString("valorFacturaCompra"), fechaD);
            rs.close();
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}