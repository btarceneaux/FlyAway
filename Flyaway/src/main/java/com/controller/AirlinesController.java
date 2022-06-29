package com.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.List;

import com.bean.Airlines;
import com.service.AirlinesService;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class AirlinesController
 */
@WebServlet("/AirlinesController")
public class AirlinesController extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AirlinesController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    AirlinesService as = new AirlinesService();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession hs = request.getSession();
		
		List<Airlines> airlinesList = as.getAllAirlines();
		
		hs.setAttribute("activeAirlinesList", airlinesList);
		response.sendRedirect("listAirlines.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
