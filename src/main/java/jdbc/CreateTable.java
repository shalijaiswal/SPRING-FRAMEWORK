package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/emp";
        String user = "root";
        String password = "shalini";

        // SQL statement to create a table
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Rj ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "name VARCHAR(255),"
                + "age INT)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {
            // Execute SQL statement to create table
            statement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully!");
        } catch (SQLException e) {
            System.out.println("Table creation failed!");
            e.printStackTrace();
        }
    }
}

