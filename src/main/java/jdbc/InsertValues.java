package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertValues {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/emp";
        String user = "root";
        String password = "shalini";

        // SQL statement to insert values into the table
        String insertSQL = "INSERT INTO Rj (name, age) VALUES (?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            // Set values for placeholders in the SQL statement
            preparedStatement.setString(1, "shalini");
            preparedStatement.setInt(2, 36);

            // Execute the insertion SQL statement
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted successfully!");
        } catch (SQLException e) {
            System.out.println("Insertion failed!");
            e.printStackTrace();
        }
    }
}

