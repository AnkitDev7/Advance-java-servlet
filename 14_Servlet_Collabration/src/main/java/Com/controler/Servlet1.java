package Com.controler;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nameString = request.getParameter("name");
		String addressString = request.getParameter("address");
		
		System.out.println("Validate name & Address" + nameString + "||" + addressString);
		
//		response.sendRedirect("Servlet2");  // browser ---> GeT(servlet) new
		
		response.getWriter().print("Validataion sucessful <br>");
		
	 RequestDispatcher requestDispatcher =request.getRequestDispatcher("Servlet2");
//	 requestDispatcher.forward(request, response);
	 requestDispatcher.include(request, response);
	 
	 
	}

}
