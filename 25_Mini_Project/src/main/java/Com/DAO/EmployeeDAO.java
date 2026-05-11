package Com.DAO;

import java.util.ArrayList;

import Com.DTO.EmployeeDTO;

public interface EmployeeDAO {
	public void createTable();
	public String addEmployee(EmployeeDTO employeeDTO);  
	ArrayList<EmployeeDTO>readEmployee();
}
