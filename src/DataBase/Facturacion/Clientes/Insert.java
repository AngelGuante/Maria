package DataBase.Facturacion.Clientes;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    public static boolean cliente(String[] datos) {
        @SuppressWarnings("UnusedAssignment")
        PreparedStatement stm = null;

        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("insert into cliente"
                    + "(cedulaCliente, nombreCliente, apellidoCliente, telefonoCliente, direccionCliente, pendiente, envargado)"
                    + "values (?, ?, ?, ?, ?, ?, ?)");
            stm.setString(1, datos[0]);
            stm.setString(2, datos[1]);
            stm.setString(3, datos[2]);
            stm.setString(4, datos[3]);
            stm.setString(5, datos[4]);
            stm.setBoolean(6, false);
            stm.setBoolean(7, false);
            stm.executeUpdate();
            stm.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
