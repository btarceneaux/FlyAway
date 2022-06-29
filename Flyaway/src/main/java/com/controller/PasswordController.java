package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.service.LoginService;
import com.service.PasswordService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PasswordController
 */
@WebServlet("/PasswordController")
public class PasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PasswordController() {
        // TODO Auto-generated constructor stub
    }
    
    // We can use the previously created "LoginService" to check if the current password.
    LoginService ls = new LoginService();
    PasswordService ps = new PasswordService();
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String currentPassword = request.getParameter("currentPassword");
		String newPassword = request.getParameter("newPassword");
		String confirmPassword = request.getParameter("confirmPassword");
		
		int result = ls.checkLoginInformation("admin@gmail.com", "currentPassword", "admin");
		
		RequestDispatcher rdAdmin = request.getRequestDispatcher("admin.jsp");
		
		// If and only if the current password is entered will we allow the password change.
		if(result == 7)
		{
			int passwordChangeResult = ps.changePassword(newPassword, confirmPassword);
			
			if(passwordChangeResult == 1)
			{
				pw.println("The password was successfully changed");
			}
			else
			{
				pw.println("The password was not successfully changed. ");
			}
			
			rdAdmin.include(request, response);
			
		}
		else
		{
			pw.println("You have entered an incorrect password! Please try again.");
			rdAdmin.include(request, response);
		}
				
	}

}
