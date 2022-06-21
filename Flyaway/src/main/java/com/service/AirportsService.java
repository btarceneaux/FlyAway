package com.service;

import java.util.List;
import com.bean.Airports;
import com.dao.AirportsDao;

public class AirportsService 
{
	AirportsDao ad = new AirportsDao();
	
	public List<Airports> getAirportDetails(String parameterCity)
	{
		List<Airports> airportList = ad.getAirportDetails(parameterCity);
		
		return airportList;
	}

}
