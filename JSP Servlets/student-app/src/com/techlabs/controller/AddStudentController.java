package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

/**
 * Servlet implementation class AddStudentController
 */
@WebServlet("/addStudent")
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddStudentController() {
    	System.out.println("IN add Contr");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view=request.getRequestDispatcher("view/AddStudent.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text/html");
		//PrintWriter out=response.getWriter();
		//out.println("Adding Student<br>");
		
		String rollNo=request.getParameter("rollNo");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		if(rollNo!=""&&name!=""&&age!="") {
			Student student=new Student();
			student.setId(Integer.parseInt(rollNo));
			student.setName(name);
			student.setRollNo(Integer.parseInt(rollNo));
			student.setAge(Integer.parseInt(age));
			StudentService studserv=StudentService.getInstance();
			studserv.addStudent(student);

			response.sendRedirect("students");
		}
		else {
			request.setAttribute("name", name);
			request.setAttribute("rollNo", rollNo);
			request.setAttribute("age", age);
			RequestDispatcher view=request.getRequestDispatcher("view/AddStudent.jsp");
			view.forward(request, response);
		}
		
	}

}
