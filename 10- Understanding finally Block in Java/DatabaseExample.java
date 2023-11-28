import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseExample {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
            // Perform some database operations
        } catch (SQLException e) {
            System.out.println("Error while accessing the database: " + e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Database connection closed successfully!");
                }
            } catch (SQLException e) {
                System.out.println("Error while closing the database connection: " + e.getMessage());
            }
        }
    }
}