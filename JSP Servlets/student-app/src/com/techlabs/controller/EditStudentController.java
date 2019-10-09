package com.techlabs.controller;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

/**
 * Servlet implementation class EditStudentController
 */
@WebServlet("/editStudent")
public class EditStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditStudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session=request.getSession();
//		if(session.getAttribute("userName")!=null) {
		System.out.println("in edit get cntrl");
		System.out.println(request.getParameter("id"));
		StudentService studentService=StudentService.getInstance();
		Student editStudent=studentService.fetchStudent(request.getParameter("id"));
		System.out.println(editStudent);
		request.setAttribute("id", editStudent.getId());
		request.setAttribute("name", editStudent.getName());
		request.setAttribute("rollNo", editStudent.getRollNo());
		request.setAttribute("age", editStudent.getAge());
		RequestDispatcher view=request.getRequestDispatcher("view/EditStudent.jsp");
		view.forward(request, response);}
//		else {
//			response.sendRedirect("auth");
//			}			
//		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String rollNo=request.getParameter("rollNo");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		if(rollNo!=""&&name!=""&&age!="") {
			Student student=new Student();
			student.setId(id);
			student.setName(name);
			student.setRollNo(Integer.parseInt(rollNo));
			student.setAge(Integer.parseInt(age));
			StudentService studserv=StudentService.getInstance();
			studserv.updateStudent(student);

			response.sendRedirect("students");
		}
		else {
			request.setAttribute("id", id);
			request.setAttribute("name", name);
			request.setAttribute("rollNo", rollNo);
			request.setAttribute("age", age);
			request.setAttribute("message", "Some Fields are Empty");
			RequestDispatcher view=request.getRequestDispatcher("view/EditStudent.jsp");
			view.forward(request, response);
		}
	}

}
