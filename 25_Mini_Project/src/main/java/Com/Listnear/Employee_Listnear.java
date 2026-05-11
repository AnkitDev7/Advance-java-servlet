package Com.Listnear;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import Com.DAO.Connection_Factory;
import Com.DAO.EmployeeDAO;
import Com.DAO.EmployeeDAOImpl;

@WebListener
public class Employee_Listnear implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce)  { 
         
    }
    
    public void contextInitialized(ServletContextEvent sce)  { 
    	
    	try {
    		
            ServletContext servletContext = sce.getServletContext();
            
//          String realPath = servletContext.getRealPath("/WEB-INF/Config/config.properties");
//          System.out.println(realPath);
          
            InputStream resourceAsStream = servletContext.getResourceAsStream("/WEB-INF/Config/config.properties");

            Properties properties = new Properties();

            if (resourceAsStream == null) {
                System.out.println("File not found!");
            }
           
            properties.load(resourceAsStream);

            String url = properties.getProperty("db.url");
            String user = properties.getProperty("db.user");
            String password = properties.getProperty("db.password");
            String driver = properties.getProperty("db.driver");

            Connection_Factory.init(url, user, password, driver);
            
            EmployeeDAO employeeDAO = new EmployeeDAOImpl();
            employeeDAO.createTable();
            
		} catch (Exception e) {
			e.printStackTrace();
		}

    }
	
}
