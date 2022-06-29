package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.bean.Flights;
import com.resource.DbResource;

public class FlightsDao 
{
	List<Flights> flightList = new ArrayList<Flights>();
	
	public List<Flights> getAllFlights()
	{
		List<Flights> lof = new ArrayList<Flights>();
		
		try 
		{
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement(
					"SELECT "
					+ "  b.source_airport,"
					+ "  a.name,"
					+ "  b.destination_airport,"
					+ "  e.name AS 'destination_airport_name',"
					+ "  c.alias,"
					+ "  c.airline_name,"
					+ "  f.price"
					+ " FROM Routes b"
					+ " INNER JOIN Airports a"
					+ " ON a.airport_id = b.source_airport_id"
					+ " INNER JOIN Airports e"
					+ " ON e.iata = b.destination_airport"
					+ " INNER JOIN Airlines c"
					+ " ON c.airline_id = b.airline_id"
					+ " LEFT JOIN Prices f"
					+ " ON f.iata_code = a.iata"
					+ " ORDER BY 2, 4, 6;");
			
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				
				Flights tempFlights = new Flights();
				
				tempFlights.setSource_airport(rs.getNString("source_airport"));
				tempFlights.setName(rs.getNString("name"));
				tempFlights.setDestination_airport("destination_airport");
				tempFlights.setDestination_airport_name("destination_airport_name");
				tempFlights.setAlias(rs.getNString("alias"));
				tempFlights.setAirline_name("airline_name");
				
				double tempPrice = rs.getDouble("price");
				
				if (tempPrice > 0)
				{
					tempFlights.setPrice(tempPrice);
				}
				else
				{
					tempPrice = 750.0;
					tempFlights.setPrice(tempPrice);
				}
				
				lof.add(tempFlights);
			}
		} 
		catch (Exception e) 
		{
			System.out.println("An error has occured! : " + e);
		}
		
		return lof;
		
	}

}
