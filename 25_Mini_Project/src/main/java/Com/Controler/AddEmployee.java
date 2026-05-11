package Com.Controler;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.DTO.EmployeeDTO;
import Com.Service.EmployeeService;
import Com.Service.EmployeeServiceIMPL;


@WebServlet(urlPatterns = {  "/viewAddEmployee" , "/AddEmployee" })
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/View/AddEmployee.jsp");
		requestDispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String age = request.getParameter("Age");
		String salary = request.getParameter("Salary");
		
	    EmployeeDTO employeeDTO = new EmployeeDTO(name, address, Integer.parseInt(age), Integer.parseInt(salary));
	    EmployeeService employeeService = new EmployeeServiceIMPL();
	    String result = employeeService.addEmployee(employeeDTO);
	    
	    request.setAttribute("msg", result); 
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/View/AddEmployee.jsp");
		requestDispatcher.forward(request, response);
	}

}
