package DataBase;

import java.sql.Connection;

public class ClientConexion extends conexion {

    private static Connection conn;
    private static int peticion;
    
    @SuppressWarnings("static-access")
    public ClientConexion() {
        conn = getConnection();
    }

    public static Connection getConn() {
        System.out.println("Peticion a conexio " + (++peticion));
        return conn;
    }
}
