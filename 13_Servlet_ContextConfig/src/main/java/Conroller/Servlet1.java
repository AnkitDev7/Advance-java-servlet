package Conroller;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  ServletConfig config  =	  getServletConfig();
	   String value1 =  config.getInitParameter("url");
	   System.out.println(value1);
	   
	   ServletContext servletContext = getServletContext();
	    String valueString= servletContext.getInitParameter("key");
	    System.out.println(valueString);
	    
	    servletContext.setAttribute("userName", "root");
	    
	   response.sendRedirect("index.html");
	}

}
