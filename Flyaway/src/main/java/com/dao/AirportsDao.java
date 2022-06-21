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
		
		String queryString = "SELECT * FROM Airports " +
		                     "WHERE city = '" + cityName + "'";
		
		System.out.println(queryString);
		
		@SuppressWarnings("unchecked")
		Query<Airports> qry = session.createSQLQuery(queryString); 
		List<Airports> airportList = qry.list();
		
		return airportList;
	}
}
