package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeController
 */
@WebServlet("/Welcome")
public class WelcomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;

	/**
	 * Default constructor.
	 */
	public WelcomeController() {
		// TODO Auto-generated constructor stub
		message = "Welcome to Servlet";
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside GEt");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String devName="";
		if(request.getParameter("developer")!=null) {
			devName=request.getParameter("developer");
		}
		for (int i = 1; i <= 6; i++) {
			out.println("<h"+i+">" + message +" "+devName+"</h"+i+">");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside Post");
	}

}
