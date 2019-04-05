package DataBase.Facturacion.Clientes;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    private static PreparedStatement stm = null;

    @SuppressWarnings("CallToPrintStackTrace")
    public static void cliente(String[] nuevosDatos) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("update cliente"
                    + " set nombreCliente = '" + nuevosDatos[1] + "',"
                    + " apellidoCliente = '" + nuevosDatos[2] + "',"
                    + " telefonoCliente = '" + nuevosDatos[3] + "',"
                    + " direccionCliente = '" + nuevosDatos[4] + "'"
                    + " where cedulaCliente = '" + nuevosDatos[0] + "'");
            stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
