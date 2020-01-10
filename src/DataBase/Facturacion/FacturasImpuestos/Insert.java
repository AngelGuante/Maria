
package DataBase.Facturacion.FacturasImpuestos;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    public static void FacturaImpuestos(Object[] datos, boolean tipo) {
        try {
            PreparedStatement stm;
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into facturasimpuestos "
                    + "(" + (tipo ? "idVenta" : "idVentaCredito") + ", ncf)"
                            + "values (?, ?)");
            stm.setInt(1, Integer.parseInt(datos[0].toString()));
            stm.setString(2, datos[1].toString());
            stm.executeUpdate();
            stm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
