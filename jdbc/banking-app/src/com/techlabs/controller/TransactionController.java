package com.techlabs.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.BankService;

/**
 * Servlet implementation class TransactionController
 */
@WebServlet("/transaction")
public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("view/transaction.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		float amount=Float.parseFloat(request.getParameter("amount"));
		HttpSession session=request.getSession();
		String name=(String) session.getAttribute("name");
		String transaction=request.getParameter("transaction");
		try {
		if(transaction.equals("Deposit")) {
				new BankService().deposit(name, amount);
		}
		else if(transaction.equals("Withdraw")) {
			System.out.println("In trans with");
			new BankService().withdraw(name, amount);
		}
		response.sendRedirect("profile");
		} catch (SQLException e) {
			request.setAttribute("message",e.getMessage());
			RequestDispatcher view = request.getRequestDispatcher("view/transaction.jsp");
			view.forward(request, response);
			e.printStackTrace();
		}
	}

}
