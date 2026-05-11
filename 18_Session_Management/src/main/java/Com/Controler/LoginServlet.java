package Com.Controler;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String data = (String) session.getAttribute("data");
		
		if (data!=null) {
			RequestDispatcher rDispatcher  = 	request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
			rDispatcher.forward(request, response);
		}else {
			RequestDispatcher rDispatcher  = 	request.getRequestDispatcher("/WEB-INF/View/login.jsp");
			rDispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("raju") && password.equals("12345")) {
			HttpSession session = request.getSession();
			session.setAttribute("data", username);
			
			RequestDispatcher rDispatcher  = 	request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
			rDispatcher.forward(request, response);
		}else {
			RequestDispatcher rDispatcher  = 	request.getRequestDispatcher("/WEB-INF/View/login.jsp");
			rDispatcher.forward(request, response);
		}
	}

}
