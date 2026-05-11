package Com.controler;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nameString = request.getParameter("name");
		String addressString = request.getParameter("address");
		
		System.out.println("Validate name & Address" + nameString + "||" + addressString);
		
		 response.getWriter().print("Data persistency Sucessful");
	}

}
