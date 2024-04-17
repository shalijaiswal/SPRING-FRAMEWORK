package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
    public static void main(String[] args) {
        // JDBC URL, username, and password
        String url = "jdbc:mysql://localhost:3306/emp";
        String user = "root";
        String password = "shalini";

        // SQL statement to delete data
        String sql = "DELETE FROM Rj WHERE name = ?";

        try (
            // Establishing the connection
            Connection conn = DriverManager.getConnection(url, user, password);
            // Creating a PreparedStatement object
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            // Set the value for the parameter
            pstmt.setString(1, "Ram");

            // Execute the delete statement
            int rowsAffected = pstmt.executeUpdate();
            
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

