package com.service;

import java.util.List;
import com.bean.Flights;
import com.dao.FlightsDao;

public class FlightsService {
	FlightsDao fd = new FlightsDao();
	
	public List<Flights> getAllFlights()
	{
		List<Flights> flightList = fd.getAllFlights();
		
		return flightList;
	}

}
