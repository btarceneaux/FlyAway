package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.resource.DbSessionFactory;
import com.bean.Airports;

public class AirportsDao 
{
	public List<Airports> getAirportDetails(String cityName)
	{
		SessionFactory sf = DbSessionFactory.getSessionFactoryReference();
		Session session = sf.openSession();
	
//		System.out.println(queryString);
		//System.out.println("The city being passed in is : " );
		Query<Airports> q = session.createQuery("from Airports where city = :nameOfCity");
		q.setParameter("nameOfCity", cityName);
		
		List<Airports> airportList = q.list();
		
		return airportList;
	}
}
