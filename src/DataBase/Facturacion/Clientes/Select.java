package DataBase.Facturacion.Clientes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //todos los clientes
    public static ResultSet todoClientes() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from cliente"
                    + " order by cedulaCliente");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            Logica.Cuadros_Emergentes.alerta(ex.getMessage());
        }
        return rs;
    }

    //cliente por like
    public static ResultSet clienteLike(String codigoBuscado) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from cliente"
                    + " where cedulaCliente like '" + codigoBuscado + "%' or "
                    + " nombreCliente like '" + codigoBuscado + "%' or "
                    + " apellidoCliente like '" + codigoBuscado + "%'"
                    + " order by cedulaCliente");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            Logica.Cuadros_Emergentes.alerta(ex.getMessage());
        }
        return rs;
    }

    //cliente por Cedula
    public static ResultSet clienteCedula(String cedulaCliente) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from cliente"
                    + " where cedulaCliente = '" + cedulaCliente + "'");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            Logica.Cuadros_Emergentes.alerta(ex.getMessage());
        }
        return rs;
    }

    //cliente por Id
    public static ResultSet clienteId(String idCliente) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from cliente"
                    + " where idCliente = '" + idCliente + "'");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            Logica.Cuadros_Emergentes.alerta(ex.getMessage());
        }
        return rs;
    }
}
