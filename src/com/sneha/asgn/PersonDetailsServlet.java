package com.sneha.xy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonDetailsServlet
 */
//@WebServlet("/PersonDetailsServlet")
public class PersonDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonDetailsServlet() {
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   response.setContentType("text/html"); 
	         PrintWriter out = response.getWriter(); 
	         
	         String name = request.getParameter("Name");
	         String password = request.getParameter("Password");
	         String gender = request.getParameter("gender");
	         String city = request.getParameter("City");
	    
	       out.println("Name: " + name + "</BR>");
	       out.println("password: " + password + "</BR>");
	       out.println("Gender:"+gender+"</BR>");
	       out.println("City: "+city);
	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
