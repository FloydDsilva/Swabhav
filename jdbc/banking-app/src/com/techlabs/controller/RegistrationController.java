package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Account;
import com.techlabs.service.BankService;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/registration")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get");
		RequestDispatcher view=request.getRequestDispatcher("view/registration.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String balance=request.getParameter("balance");
		if(balance!=""&&password!=""&&name!="") {
			System.out.println("Inside if");
			new BankService().addContact(new Account(name, password, Float.parseFloat(balance)));
		}
		PrintWriter out=response.getWriter();
		out.print("Account add Successful");
	}

}
