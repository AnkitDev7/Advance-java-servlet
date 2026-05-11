package Com.Controler;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.DTO.EmployeeDTO;
import Com.Service.EmployeeServiceIMPL;

@WebServlet("/readEmployee")
public class ReadEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 EmployeeServiceIMPL employeeServiceIMPL = new EmployeeServiceIMPL();
		 ArrayList<EmployeeDTO>employee = employeeServiceIMPL.readEmployee();
		 
		 request.setAttribute("data" , employee);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/View/ReadEmployee.jsp");
			requestDispatcher.forward(request, response);
	}


}
