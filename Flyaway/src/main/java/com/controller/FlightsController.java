package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.bean.Flights;
import com.service.FlightsService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class FlightsController
 */
@WebServlet("/FlightsController")
public class FlightsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FlightsController() {
        // TODO Auto-generated constructor stub
    }
    
    FlightsService fs = new FlightsService();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		HttpSession hs = request.getSession();
		
		List<Flights> allFligts = fs.getAllFlights();
		
		hs.setAttribute("allFligths", allFligts);
		
		response.sendRedirect("listFlights.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
