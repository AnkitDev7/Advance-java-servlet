package Com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.tomcat.dbcp.dbcp2.ConnectionFactory;

import Com.DTO.EmployeeDTO;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void createTable() {
		try {
			String sql = "create table IF NOT EXISTS employee(sn int primary key auto_increment,"
					+ "name varchar(30),"
					+ "address varchar(100),"
					+ "age int,"
					+ "salary int)";
			
			Connection connection = Connection_Factory.getConnection();
			Statement statement = connection.createStatement();
			statement.execute(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public String addEmployee(EmployeeDTO employeeDTO) {
		
		try {
			String sql = "insert into employee(name,address,age,salary) values(?,?,?,?)";
			Connection connection = Connection_Factory.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, employeeDTO.getName());
			preparedStatement.setString(2, employeeDTO.getAddress());
			preparedStatement.setInt(3, employeeDTO.getAge());
			preparedStatement.setInt(4, employeeDTO.getSalary());
			
			int row = preparedStatement.executeUpdate();
			
			if (row == 1) {
				return "SAVED";
			}else {
				return "FAILED TO SAVE"; 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "FAILED to Save";
		}
		
		
	}

	@Override
	public  ArrayList<EmployeeDTO> readEmployee() {
		
		ArrayList<EmployeeDTO> arrayList = new ArrayList<EmployeeDTO>();
		try {
			String sql = "select * from employee";
			Connection connection = Connection_Factory.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			ResultSet resultSet = preparedStatement.getResultSet();
			
		   while (resultSet.next()) {
			 EmployeeDTO employeeDTO = new EmployeeDTO(resultSet.getString("name") , resultSet.getString("address"),resultSet.getInt("age"),resultSet.getInt("salary"));
			 arrayList.add(employeeDTO);
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			return arrayList;
		}
	}

	
	
}
