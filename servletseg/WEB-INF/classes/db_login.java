import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class db_login extends HttpServlet {
 public void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
 try {
 String name = request.getParameter("name");
 String pwd = request.getParameter("pwd");
 String email = request.getParameter("email");
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con =
DriverManager.getConnection("jdbc:mysql:/localhost:3306/login","root","");
 Statement stmt = con.createStatement();
 stmt.executeUpdate("insert into users values('" + name + "','"
+ email + "','" +pwd+")");
 stmt.close();
 con.close();
 PrintWriter out = response.getWriter();
 out.println("<html><head>");
 out.println("<link rel='stylesheet' href='style.css' /><title>Logindb</title></head>");
 out.println("<body class='flex-col'><h1>Database</h1>");
 out.println("<h2>Info added successfully</h2>");
 out.println("<a href='accessdb'>Click here to see the database</a>");
 out.println("</body></html>");
 }
 catch(Exception e) {
 System.out.println(e);
 }
 }
}
