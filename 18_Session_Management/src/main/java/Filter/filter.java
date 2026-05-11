package Filter;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class filter extends HttpFilter implements Filter {

	public void destroy() {
		System.out.println("Filter Destroived");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		
		String header = httpServletRequest.getHeader("User-Agent");
		System.out.println(header);
		
		if (header.contains("Chrome")) {
		  httpServletResponse.getWriter().print("Invalid ID Browser");
		  return;
		}
	
		long nanoTime1 = System.nanoTime();
		chain.doFilter(request, response);// forward -> Ex:- Servlet
		
		long nanoTime2 = System.nanoTime();
		System.out.println("Time Taken:-" + (nanoTime1-nanoTime2)+"ns");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter Intialized");
	}

}
