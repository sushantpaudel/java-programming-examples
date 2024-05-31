import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/databaseHandler")
public class DatabaseHandlerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Establishing a connection to the database
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Executing an SQL query
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM your_table_name");
            ResultSet resultSet = preparedStatement.executeQuery();

            // Processing and sending the result back to the client
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body><h1>Database Query Result:</h1>");

            while (resultSet.next()) {
                out.println("<p>" + resultSet.getString("column1") + ", " + resultSet.getInt("column2") + "</p>");
            }

            out.println("</body></html>");

            // Closing the resources
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
