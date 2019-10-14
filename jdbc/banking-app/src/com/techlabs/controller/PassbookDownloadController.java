package com.techlabs.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.TransactionLog;
import com.techlabs.service.BankService;

/**
 * Servlet implementation class PassbookDownloadController
 */
@WebServlet("/passbookDownload")
public class PassbookDownloadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassbookDownloadController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    response.setContentType("text/csv");
		    response.setHeader("Content-Disposition", "attachment; filename=\"Passbook.csv\"");
		    try
		    {
		        OutputStream outputStream = response.getOutputStream();
		        //String outputResult = "xxxx, yyyy, zzzz, aaaa, bbbb, ccccc, dddd, eeee, ffff, gggg\n";
		        HttpSession session = request.getSession();
				List<TransactionLog> transactions=new BankService().getTransactions((String)session.getAttribute("name"));
		        String outputResult="";
		        for(TransactionLog transaction:transactions) {
		        	outputResult+=transaction.getName()+","+transaction.getAmount()+","+transaction.getTransactionType()+","+transaction.getTransactionDate()+"\n";
		        }
				outputStream.write(outputResult.getBytes());
		        outputStream.flush();
		        outputStream.close();
		    }
		    catch(Exception e)
		    {
		        System.out.println(e.toString());
		    }
		response.sendRedirect("passbook");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
