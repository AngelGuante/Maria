package DataBase.Facturacion.Distribuidor;

import DataBase.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select extends conexion {

    private static PreparedStatement stm = null;
    private static ResultSet rs = null;

    //todos los Distribuidores
    @SuppressWarnings("CallToPrintStackTrace")
    public static ResultSet todoDistribuidores() {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from distribuidor"
                    + " order by nombreDistribuidor");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //distribuidor por like
    @SuppressWarnings("CallToPrintStackTrace")
    public static ResultSet distribuidorLike(String codigoBuscado) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from distribuidor"
                    + " where claveDistribuidor like '" + codigoBuscado + "%'"
                    + " order by nombreDistribuidor");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //distribuidor por Codigo
    @SuppressWarnings("CallToPrintStackTrace")
    public static ResultSet distribuidorCodigo(String codigoBuscado) {
        try {
            stm = DataBase.ClientConexion.getConn().prepareStatement("select * from distribuidor"
                    + " where claveDistribuidor = '" + codigoBuscado + "'");
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
}
