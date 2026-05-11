package Main;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Lifecycle extends HttpServlet {
	
	static {
		System.out.println("SERvLET Loading....");
	}
	
    public Lifecycle() {
        System.out.println("SERVLet Instantion");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Resourse Allocation");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service");
	}

	public void destroy() {
		System.out.println("Resourse DE_Allocation");
	}

}
