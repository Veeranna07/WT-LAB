import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
/**
* Servlet implementation class ReadServlet
*/
public class ReadServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
/**
* @see HttpServlet#HttpServlet()
*/
public ReadServlet() {
super();
// TODO Auto-generated constructor stub
}
/**
* @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
response)
*/
protected void service(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
PrintWriter pw=response.getWriter();
//get all parameter names
Enumeration<String> e=request.getParameterNames();
pw.println("The user details are:");
while(e.hasMoreElements())
{
String pname=(String)e.nextElement();
pw.println(pname+"=");
String pvalue=request.getParameter(pname);
pw.println(pvalue);
}
//get a value of specified parameter
String name = request.getParameter("un");
String pwd=request.getParameter("pw");
if(name.equals("ramesh")&&pwd.equals("12345"))
pw.println("Welcome to"+name);
else
pw.println("Invalid User Credentials");
pw.close();
}
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
// TODO Auto-generated method stub
response.getWriter().append("Served at: ").append(request.getContextPath());
}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}
}
