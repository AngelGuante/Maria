package DataBase;

import java.sql.Connection;

public class conexion {

    @SuppressWarnings("FieldMayBeFinal")
    private static String user = "root";
    @SuppressWarnings("FieldMayBeFinal")
    private static String pass = "PrivateSource93@!";
    @SuppressWarnings("FieldMayBeFinal")
    private static String bd = "ventafinanciera";
    @SuppressWarnings({"FieldMayBeFinal", "StaticNonFinalUsedInInitialization"})
    private static String url = "jdbc:mysql://localhost:3306/" + bd;
    private static int totalConexiones = 0;

    protected static Connection getConnection() {
        Connection conn = null;
        try {
            totalConexiones++;
            System.out.println("Conexion No." + totalConexiones);
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) java.sql.DriverManager.getConnection(url, user, pass);
        } catch (java.sql.SQLException | ClassNotFoundException e) {
            Logica.Cuadros_Emergentes.alerta("Error al momento de conectarce con la base de datos.\n\n"
                    + "Detalles de error:\n"
                    + e.getMessage());
        }
        return conn;
    }
}
