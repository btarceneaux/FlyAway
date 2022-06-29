package com.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import com.bean.Airports;
import com.bean.Login;
import com.service.LoginService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    LoginService ls = new LoginService();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        HttpSession hs = request.getSession();
		//Get the variables passed in from the registration jsp page.
		PrintWriter pw = response.getWriter();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String typeOfUser = request.getParameter("typeOfUser");
		
		Object obj = hs.getAttribute("flightListing");
		List<Airports> airportRoutesList = (List<Airports>)obj; 
		int index = Integer.parseInt((String)hs.getAttribute("option"));

		
		//Now let's get the item that was selected
		Airports myReservation = airportRoutesList.get(index);
		
		int result = ls.checkLoginInformation(email, password, typeOfUser);
		
		RequestDispatcher rdAdmin = request.getRequestDispatcher("admin.jsp");
		RequestDispatcher rdUser = request.getRequestDispatcher("home.jsp");
		RequestDispatcher rdNoUser = request.getRequestDispatcher("register.jsp");
		
		if(result == 7)
		{
			pw.println("Welcome to the admin page");
		    rdAdmin.include(request, response);
		}
		else if (result == 1)
		{
			// Make selections available on next page
			hs.setAttribute("reservation", myReservation);
			
			pw.println("Welcome to the user home page");
		    rdUser.include(request, response);
		}
		else
		{
			pw.println("Either you have entered an incorrect username or password or no user account exists! Please register for a new account");
			rdNoUser.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession hs = request.getSession();
		//Get the variables passed in from the registration jsp page.
		PrintWriter pw = response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String emailAddress = request.getParameter("email");
		String mailingAddress = request.getParameter("mailingAddress");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		int zipCode = Integer.parseInt(request.getParameter("zipCode"));
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		
		Object obj = hs.getAttribute("flightListing");
		List<Airports> airportRoutesList = (List<Airports>)obj; 
		int index = Integer.parseInt((String)hs.getAttribute("option"));

		
		//Now let's get the item that was selected
		Airports myReservation = airportRoutesList.get(index);
		
		
		RequestDispatcher rd1 = request.getRequestDispatcher("home.jsp");
		RequestDispatcher rd2 = request.getRequestDispatcher("register.jsp");
		
		if(password.equals(confirmPassword))
		{
			Login myLogin = new Login();
			myLogin.setFirstName(firstName);
			myLogin.setLastName(lastName);
			myLogin.setEmail(emailAddress);
			myLogin.setMailingAddress(mailingAddress);
			myLogin.setCity(city);
			myLogin.setState(state);
			myLogin.setZipCode(zipCode);
			myLogin.setPassword(password);
			
			int result = ls.createRegistration(myLogin);
			
			if(result > 0)
			{
				// Make selections available on next page
				hs.setAttribute("reservation", myReservation);
				
				pw.println("Account created.");
				rd1.include(request, response);
			}
			else
			{
				pw.println("Account not created.");
				rd2.include(request, response);
			}
			
		}
		else
		{
			pw.println("Error. The passwords did not match! Please try again.");
			rd2.include(request, response);
		}

    }
}