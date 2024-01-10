import java.sql.*;

// •	Develop a Java application that executes an SQL SELECT query to retrieve data from a database table. Print the results to the console.

public class ExecuteSQLQuery {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM your_table_name");

            while (resultSet.next()) {
                // Process and print data from the result set
                System.out.println(resultSet.getString("column1") + ", " + resultSet.getInt("column2"));
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
