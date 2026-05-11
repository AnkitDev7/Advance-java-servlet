package Com.Service;

import java.util.ArrayList;

import Com.DTO.EmployeeDTO;

public interface EmployeeService {
	
	String addEmployee(EmployeeDTO employeeDTO);
	ArrayList<EmployeeDTO> readEmployee();
	
}
