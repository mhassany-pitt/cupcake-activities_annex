package edu.pitt.sis.paws.is2470;
// Handling HTTP GET Requests by Servlets
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class PostServletExample extends javax.servlet.http.HttpServlet
 {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		String say_param = request.getParameter("say");
		response.setContentType( "text/html" );  
		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD><TITLE>Get Servlet Example</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H1>Welcome to example of doPost servlet method!</H1>");
		out.println(((say_param != null && say_param.length() != 0)?"<p>You say:" + say_param + "</p>":""));
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}  	  	  	    
}