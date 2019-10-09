package com.techlabs.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter({"/addStudent","/deleteStudent","/editStudent"})
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
    	System.out.println("In Auth filter");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("In filter DO");
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
		HttpSession session=req.getSession();
		if(session.getAttribute("userName")!=null) {
//		RequestDispatcher view=request.getRequestDispatcher("view/AddStudent.jsp");
//		view.forward(request, response);
			chain.doFilter(request, response);
			}
		else {
			res.sendRedirect("auth");
						
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
