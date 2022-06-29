package com.controller;

import java.io.IOException;
import java.util.List;

import com.bean.SourceAndDestination;
import com.service.SourceAndDestinationService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SourceAndDestinationController
 */
@WebServlet("/SourceAndDestinationController")
public class SourceAndDestinationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SourceAndDestinationController() {
        // TODO Auto-generated constructor stub
    }
    
    SourceAndDestinationService sads = new SourceAndDestinationService();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession hs = request.getSession();
		
		List<SourceAndDestination> sourceAndDestinationCities = sads.getSourceAndDestinationDetails();
		
		hs.setAttribute("sourceDestination", sourceAndDestinationCities);
		response.sendRedirect("listPlaces.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
