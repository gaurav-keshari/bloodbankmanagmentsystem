package bloodbankcollegeproject.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebFilter("/AdminController")
public class AdminFilter implements Filter {

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse response=(HttpServletResponse)res;
		HttpServletRequest request=(HttpServletRequest)req;
		if(request.getSession().getAttribute("email")==null)
		response.sendRedirect("admin.jsp");
		else
		{
			
			chain.doFilter(request, response);
		}
		
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
