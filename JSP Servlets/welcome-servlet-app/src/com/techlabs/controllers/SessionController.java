package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionController
 */
@WebServlet("/session")
public class SessionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String oldVal="0",newVal="1";
        HttpSession session=request.getSession();
        if(session.getAttribute("counter")==null){
            session.setAttribute("counter",newVal);
        }
        else{
            oldVal=(String)(session.getAttribute("counter"));
            newVal=""+(Integer.parseInt(oldVal)+1);
            session.setAttribute("counter",newVal);
        }
        PrintWriter out=response.getWriter();
        out.println("<label><p>Old:"+oldVal+"</p><p>New:"+newVal+"</p><p>Id:"+session.getId()+"</p></label>");
        out.print("<a href=\"summary\">Summary</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
