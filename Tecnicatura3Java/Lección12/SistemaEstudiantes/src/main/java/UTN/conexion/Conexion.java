package UTN.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection() {
        Connection conexion = null;
        // Variables para conectarnos a la base de datos
        var baseDatos = "estudiantes2023";
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;
        var usuario = "root";
        var password = "admin";

        // Cargamos la clase del driver de MySQL en memoria
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Ocurrió un error en la conexión: " + e.getMessage());
        } // Fin del catch
        return conexion; // Retornamos la conexión
    } // Fin método getConnection
}
