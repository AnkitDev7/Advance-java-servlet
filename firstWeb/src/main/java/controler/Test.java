package controler;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Test extends HttpServlet {
	
	//  It can Handle the data from HTTP Request ( post ) 
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
     	String fullname  = request.getParameter("fullname");
     	String address  = request.getParameter("Address");
     	
     	System.out.println(fullname + " " + address);
     	
     	// To Print on Browser
//       PrintWriter writer  = 	response.getWriter();
//       writer.print("<h1>sucess</h1>");
       
     	response.sendRedirect("Home.html");
       
	}

}
