package Com.Service;

import java.util.ArrayList;

import Com.DAO.EmployeeDAOImpl;
import Com.DTO.EmployeeDTO;

public class EmployeeServiceIMPL implements EmployeeService{

	@Override
	public String addEmployee(EmployeeDTO employeeDTO) {
		// Data processing like validation
		EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl();
	  return	 employeeDAOImpl.addEmployee(employeeDTO); 
	}
	
	@Override
	public ArrayList<EmployeeDTO> readEmployee() {
		// TODO Auto-generated method stub
		EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl();
		return employeeDAOImpl.readEmployee();
	}

}
