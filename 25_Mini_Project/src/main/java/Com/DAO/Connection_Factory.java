package Com.DAO;
import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Connection_Factory {
	private static HikariDataSource  hikariDataSource;
	
	public static void init(String url , String user , String password , String driver) {
		try {
		   Class.forName(driver);
		  HikariConfig hikariConfig = new HikariConfig();
		  hikariConfig.setJdbcUrl(url);
		  hikariConfig.setUsername(user);
		  hikariConfig.setPassword(password);
		  
		 hikariDataSource = new HikariDataSource(hikariConfig);
	
		} catch (Exception e) {
		  e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
	  return	hikariDataSource.getConnection(); 
	}
	
}
