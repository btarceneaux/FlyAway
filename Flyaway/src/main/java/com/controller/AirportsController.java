package com.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.bean.Airports;
import com.service.AirportsService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class AirportController
 */

public class AirportsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	AirportsService apService = new AirportsService(); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AirportsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		//PrintWriter pw = response.getWriter(); 
		HttpSession hs = request.getSession();
		
		// Get the parameters from the form
		String sourceCity = request.getParameter("depart");
		String destinationCity = request.getParameter("arrive");
		
		// Get the data from the Airports table so we can use it in searching the routes table. 
		List<Airports> routeDetails = apService.getAirportDetails(sourceCity, destinationCity);
		
		hs.setAttribute("flightListing", routeDetails);
		
		// Display information
		response.sendRedirect("displayFlights.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
