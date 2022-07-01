package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bean.Airports;
import com.bean.Reservation;
import com.service.ReservationService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ReservationController
 */
@WebServlet("/ReservationController")
public class ReservationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ReservationController() {
        // TODO Auto-generated constructor stub
    }
    
    ReservationService rs = new ReservationService();

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
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
        HttpSession hs = request.getSession();
        Object obj = hs.getAttribute("reservation");
        Airports airportReservation = (Airports)obj;
        
        //Store the data into a "Reservation" object.
        String emailAddress = (String)hs.getAttribute("emailAddress");
        String country = airportReservation.getCountry();
        String city = airportReservation.getCity();
        String soruceAirportAlias = airportReservation.getAlias();
        String sourceAirportName = airportReservation.getName();
        String destinationAirportAlias = airportReservation.getDestination_airport();
        String destinationAirportName = airportReservation.getDestination_airport_name();
        String airline = airportReservation.getAirline_name();
        double price = airportReservation.getPrice();
        String tempDepartureDate = hs.getAttribute("departureDate").toString();
        String tempReturnDate = hs.getAttribute("returnDate").toString();
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date departureDate = null;
        Date returnDate = null;
        
		try {
			departureDate = dateFormat.parse(tempDepartureDate);
			returnDate = dateFormat.parse(tempReturnDate);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}

        java.sql.Date mySqlDepartureDate = new java.sql.Date(departureDate.getTime());
        java.sql.Date mySqlReturnDate = new java.sql.Date(returnDate.getTime());
        
        Reservation myReservation = new Reservation();
        myReservation.setContact_email_address(emailAddress);
        myReservation.setCountry(country);
        myReservation.setSource_city(city);
        myReservation.setSource_airport_alias(soruceAirportAlias);
        myReservation.setSource_airport_name(sourceAirportName);
        myReservation.setDestination_airport_alias(destinationAirportAlias);
        myReservation.setDestination_airport_name(destinationAirportName);
        myReservation.setAirline(airline);
        myReservation.setPrice(price);
        myReservation.setDeparture_date(mySqlDepartureDate);
        myReservation.setReturn_date(mySqlReturnDate);
        
        RequestDispatcher rdSuccess = request.getRequestDispatcher("confirmationPage.jsp");
        RequestDispatcher rdFailure = request.getRequestDispatcher("home.jsp");
        
        hs.setAttribute("myReservation", myReservation);
        
        int result = rs.createReservation(myReservation);
        
        if(result == 1)
        {
        	pw.println("The registration was stored successfully.");
        	rdSuccess.include(request, response);
        }
        else
        {
        	pw.println("Youre reservation was not stored successfully!");
        	rdFailure.include(request, response);
        }
	}

}
