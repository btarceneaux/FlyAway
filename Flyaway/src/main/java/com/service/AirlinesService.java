package com.service;

import java.util.List;

import com.bean.Airlines;
import com.dao.AirlinesDao;

public class AirlinesService 
{
	AirlinesDao adao = new AirlinesDao();
	
	public List<Airlines> getAllAirlines()
	{
		List<Airlines> airlinesList = adao.getAllActiveAirlines();
		
		return airlinesList;
	}

}
