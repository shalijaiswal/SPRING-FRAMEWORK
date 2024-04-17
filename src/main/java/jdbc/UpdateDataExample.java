package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDataExample {
    public static void main(String[] args) {
        // JDBC URL, username, and password
        String url = "jdbc:mysql://localhost:3306/emp";
        String user = "root";
        String password = "shalini";

        // SQL statement to update data
        String sql = "UPDATE Dj SET name = ? WHERE id = ?";

        try (
            // Establishing the connection
            Connection conn = DriverManager.getConnection(url, user, password);
            // Creating a PreparedStatement object
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            // Set values for parameters
            pstmt.setString(1, "ashwi");
            //pstmt.setString(2, "42");
            pstmt.setInt(2, 1);

            // Execute the update statement
            int rowsAffected = pstmt.executeUpdate();
            
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
