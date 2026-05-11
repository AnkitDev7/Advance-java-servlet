package Conroller;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  ServletConfig config  =	  getServletConfig();
		   String value =  config.getInitParameter("url");
		   System.out.println(value);
		   
		   ServletContext servletContext = getServletContext();
		    String valueString= servletContext.getInitParameter("key");
		    System.out.println(valueString);
		    
		   String attribute  =  (String) servletContext.getAttribute("userName");
		   System.out.println(attribute);
		   
		   response.sendRedirect("index.html");
	}

}
