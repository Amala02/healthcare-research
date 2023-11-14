import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class login extends HttpServlet {
 public void doGet(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
 PrintWriter out = response.getWriter();
 out.println("<html><head>");
 out.println("<link rel='stylesheet' href='style.css' /><title>Login</title></head>");

 out.println("<body><h1>Logint</h1>");
 out.println("<table><tr>Login succesful</tr>");
 out.println("<h2>Welcome back, " + request.getParameter("name") + "</h2>");

 out.println("</table></body></html>");
 }
}