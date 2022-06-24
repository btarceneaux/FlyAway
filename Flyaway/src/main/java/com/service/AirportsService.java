package com.service;

import java.util.List;
import com.bean.Airports;
import com.dao.AirportsDao;

public class AirportsService 
{
	AirportsDao ad = new AirportsDao();
	
	public List<Airports> getAirportDetails(String sourceCity, String destinationCity, int numberOfPassengers)
	{
		List<Airports> airportRoutesList = ad.getRouteDetails(sourceCity, destinationCity, numberOfPassengers);
		
		return airportRoutesList;
	}

}
