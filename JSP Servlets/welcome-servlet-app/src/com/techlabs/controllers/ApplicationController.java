package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.spi.http.HttpContext;

/**
 * Servlet implementation class ApplicationController
 */
@WebServlet("/application")
public class ApplicationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String oldVal="0",newVal="1";
        ServletContext application=request.getServletContext();
        if(application.getAttribute("counter")==null){
            application.setAttribute("counter",newVal);
        }
        else{
            oldVal=(String)(application.getAttribute("counter"));
            newVal=""+(Integer.parseInt(oldVal)+1);
            application.setAttribute("counter",newVal);
        }
        PrintWriter out=response.getWriter();
        out.println("<label><p>Old:"+oldVal+"</p><p>New:"+newVal+"</p></label>");
        out.print("<a href=\"summary\">Summary</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
