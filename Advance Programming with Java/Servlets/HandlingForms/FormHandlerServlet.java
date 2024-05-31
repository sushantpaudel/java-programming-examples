import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/formHandler")
public class FormHandlerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Retrieving form data from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Processing the form data
        String message = "Hello, " + username + "! Your password is: " + password;

        // Sending the response back to the client
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>" + message + "</h1></body></html>");
    }
}
