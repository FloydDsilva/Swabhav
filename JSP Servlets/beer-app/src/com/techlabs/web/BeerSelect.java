package com.techlabs.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tehlabs.model.BeerExpert;

/**
 * Servlet implementation class BeerSelect
 */
@WebServlet("/SelectBeer.do")
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BeerSelect() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String c =request.getParameter("color");
		BeerExpert be=new BeerExpert();
		List<String> results = be.getBrands(c);

//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		out.println("Beer Selection Advice<br>");
		
		request.setAttribute("results", results);
		
		RequestDispatcher view=request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

}
