import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class accessdb extends HttpServlet {
 public void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
 try {
 PrintWriter out = response.getWriter();
 out.println("<html><head>");
 out.println("<link rel='stylesheet' href='style.css' /><title>Access Space</title></head>");
 out.println("<body class='flex-col'><h1>Space Database</h1>");
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con =
DriverManager.getConnection("jdbc:mysql:/localhost:3306/login","root","");
 Statement stmt = con.createStatement();
 ResultSet rs = stmt.executeQuery("select * from users");
 out.println("<table><tr><th>Name</th><th>Email</th><th>Password</th></tr>");
 while(rs.next()) {
 out.println("<tr><td>" + rs.getString(1) + "</td><td>" +rs.getString(2) + "</td></tr>" +"<tr><td>" + rs.getString(3)+"</td></tr>");}
 out.println("</table>");
 out.println("</body></html>");
 } catch (Exception e) {
 System.err.println(e);
 }
 }
}