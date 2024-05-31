import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    // This method will handle GET requests
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Setting the content type of the response
        response.setContentType("text/html");

        // Getting a PrintWriter to write the HTML response
        PrintWriter out = response.getWriter();

        // Writing the HTML response for the login page
        out.println("<html>");
        out.println("<head><title>Login Page</title></head>");
        out.println("<body>");
        out.println("<h2>Login Page</h2>");
        out.println("<form method=\"post\">");  // Form using POST method
        out.println("  Username: <input type=\"text\" name=\"username\"><br>");
        out.println("  Password: <input type=\"password\" name=\"password\"><br>");
        out.println("  <input type=\"submit\" value=\"Login\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
    

    // This method will handle POST requests
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Retrieving username and password from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Validating the login credentials (For simplicity, using a hardcoded username and password)
        if ("user123".equals(username) && "pass123".equals(password)) {
            // Login successful
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body><h2>Login Successful!</h2></body></html>");
        } else {
            // Login failed
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body><h2>Login Failed. Please try again.</h2></body></html>");
        }
    }
}
