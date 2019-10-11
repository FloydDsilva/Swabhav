package com.techlabs.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

/**
 * Servlet implementation class AddContactController
 */
@WebServlet("/addContact")
public class AddContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContactController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In add get");
		RequestDispatcher view=request.getRequestDispatcher("view/AddContact.html");
		view.forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In add post");
		String firstName=request.getParameter("FirstName");
		String lastName=request.getParameter("LastName");
		String email=request.getParameter("Email");
		String contact=request.getParameter("Contact");
		Contact cont=new Contact(firstName, lastName, email, contact);
		System.out.println("Contact:"+cont);
		if(email!=""&&firstName!=""&&lastName!=""&&contact!="") {
			
			new ContactService().addContact(cont);

			response.sendRedirect("displayContacts");
		}
//		else {
//			request.setAttribute("FirstName", firstName);
//			request.setAttribute("LastName", lastName);
//			request.setAttribute("Email", email);
//			request.setAttribute("Contact", contact);
//			request.setAttribute("message", "Some Fields are Empty");
//			RequestDispatcher view=request.getRequestDispatcher("view/AddStudent.jsp");
//			view.forward(request, response);
//		}
	}

}
