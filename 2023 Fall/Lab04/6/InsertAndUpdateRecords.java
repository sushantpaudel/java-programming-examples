import java.sql.*;

// •	Create a Java program that inserts new records into a database table and updates existing records using JDBC. Ensure proper error handling

public class InsertAndUpdateRecords {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            Statement statement = connection.createStatement();

            // Inserting a new record
            statement.executeUpdate("INSERT INTO your_table_name (column1, column2) VALUES ('value1', 42)");

            // Updating an existing record
            statement.executeUpdate("UPDATE your_table_name SET column1 = 'new_value' WHERE column2 = 42");

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
