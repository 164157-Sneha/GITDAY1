package com.sneha.axc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonDetails
 */
@WebServlet("/PersonDetails")
public class PersonDetailsSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonDetailsSevlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html"); 
	         PrintWriter out = response.getWriter(); 
	         String name=request.getParameter("Name");  
	         String pswd=request.getParameter("Password");  
	         String gen=request.getParameter("Gender");  
	         String city=request.getParameter("City");  
	         
	        out.println("name :"+name);
	        out.println("password:"+pswd);
	        out.println("Gender :"+gen);
	        out.println("City: " +city);
	                   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
