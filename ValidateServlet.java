package com.sneha.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sneha.util.DAOUtility;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/Validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ValidateServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username,password;
		PrintWriter out = response.getWriter();
		
		username = request.getParameter("username");
		password = request.getParameter("password");
		String userType=null;
		
		//try{
		 userType=getUserType(username,password);
//		}catch(InvalidUserException e){
//			out.println("<h2>Invalid User"+"</h2>");
//		}
		RequestDispatcher requestDispatcher=null;
		
		if(userType.equals("Admin"))
		{
			requestDispatcher=request.getRequestDispatcher("/AdminServlet");
			//out.println("<h2> Welcome Admin  "+username+"</h2>");
		}
		else if(userType.equals("User")){
			requestDispatcher=request.getRequestDispatcher("/UserServlet");
			//out.println("<h2> Welcome User  "+username+"</h2>");
		}
		else{
			requestDispatcher=request.getRequestDispatcher("/InvalidServlet");
			//out.println("Invalid User"+username);
		}
		
		requestDispatcher.forward(request, response);
		
		//out.println("<h2> Hello All</h2>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

	private String getUserType(String username, String password)
	{
		IUserDAO dao=DAOUtility.getUserDAO();
		return dao.getUserType(username,password);
	}
}
