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

/**
 * Servlet implementation class ALLoginController
 */
@WebServlet("/ALlogin")
public class ALLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ALLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("username");
        out.print("Welcome " + userName);

        HttpSession session = request.getSession();
        session.setAttribute("uname", userName);

        ServletContext ctx = getServletContext();
        int totalUsers = (Integer) ctx.getAttribute("totalusers");
        int currentUsers = (Integer) ctx.getAttribute("currentusers");
        
        out.print("<br>total users= " + totalUsers);
        out.print("<br>current users= " + currentUsers);

        out.print("<br><a href='ALlogout'>logout</a>");

        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
