package Com.Controler;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginView extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	RequestDispatcher rDispatcher  = 	request.getRequestDispatcher("/WEB-INF/View/login.jsp");
	rDispatcher.forward(request, response);
	}

}
