import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/requestHandler")
public class RequestHandlerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Handling GET requests
        String message = "Handling GET request";

        // Sending the response back to the client
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>" + message + "</h1></body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Handling POST requests
        String message = "Handling POST request";

        // Sending the response back to the client
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>" + message + "</h1></body></html>");
    }
}
