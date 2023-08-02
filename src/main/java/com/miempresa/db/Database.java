
package com.miempresa.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FullFontJ
 */

public class Database {
    protected static Connection conexion = null;

    private static final String DB_URL = "jdbc:mysql://localhost/library"; // Cambia la URL si es necesario
    private static final String DB_USER = "root"; // Cambia el usuario
    private static final String DB_PASSWORD =  ""; // Cambia la contraseña


    public static void getConnection() {
       try {
                // Cargar el controlador de la base de datos
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // Establecer la conexión a la base de datos
                conexion = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                System.out.println("Conexión a la base de datos exitosa.");
        } catch (ClassNotFoundException e) {
                System.err.println("Error al cargar el controlador de la base de datos.");
        } catch (SQLException e) {
                System.err.println("Error al conectar a la base de datos.");
        }
    }

    public static void closeConnection() {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión cerrada correctamente.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión.");
            }
        }
    }
}
