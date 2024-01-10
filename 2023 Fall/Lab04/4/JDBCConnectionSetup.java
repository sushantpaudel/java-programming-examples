// •    Write a Java program that establishes a connection to a MySQL database using JDBC. Print a message indicating a successful connection

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionSetup {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to the database successfully!");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
