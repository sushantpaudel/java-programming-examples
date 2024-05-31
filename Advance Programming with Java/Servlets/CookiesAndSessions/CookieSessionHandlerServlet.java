import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookieSessionHandler")
public class CookieSessionHandlerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Handling Cookies
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                String value = cookie.getValue();

                // Processing cookie data
                System.out.println("Cookie: " + name + " = " + value);
            }
        }

        // Handling Sessions
        HttpSession session = request.getSession();
        String sessionId = session.getId();

        // Storing and retrieving data in/from the session
        session.setAttribute("username", "exampleUser");

        String username = (String) session.getAttribute("username");

        // Sending the response back to the client
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>Session ID: " + sessionId + "</h1>");
        out.println("<p>Username from Session: " + username + "</p></body></html>");
    }
}
