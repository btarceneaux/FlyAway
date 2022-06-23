package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.bean.Airports;
import com.resource.DbResource;

public class AirportsDao 
{
	public List<Airports> getRouteDetails(String sourceCity, String destinationCity)
	{
		String query = 
				
		"SELECT"
		+ " a.airport_id, "
		+ " a.name, "
		+ " a.city, "
		+ " a.country, "
		+ " a.iata, "
		+ " b.source_airport, "
		+ " b.source_airport_id, "
		+ " b.destination_airport, "
		+ " b.destination_airport_id, "
		+ " c.airline_id, "
		+ " c.airline_name, "
		+ " c.alias "
		+ " FROM Airports a "
		+ " INNER JOIN Routes b "
		+ " ON b.source_airport_id = a.airport_id"
		+ " AND b.destination_airport_id IN (SELECT d.airport_id FROM Airports d WHERE d.city = ?)"
		+ " INNER JOIN Airlines c"
		+ " ON c.airline_id = b.airline_id"
		+ " WHERE city = ?";
		
		List<Airports> lap = new ArrayList<Airports>();
		
		try 
		{
			Connection myConnection = DbResource.getDbConnection();
			PreparedStatement pstmt = myConnection.prepareStatement(query);
			pstmt.setString(1, destinationCity);
			pstmt.setString(2, sourceCity);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				Airports tempAirport = new Airports();
				
				tempAirport.setAirport_id(rs.getInt("airport_id"));
				tempAirport.setName(rs.getString("name"));
				tempAirport.setCity(rs.getString("city"));
				tempAirport.setCountry(rs.getString("country"));
				tempAirport.setIata(rs.getNString("iata"));
				tempAirport.setSource_airport(rs.getNString("source_airport"));
				tempAirport.setSource_airport_id(rs.getInt("source_airport_id"));
				tempAirport.setDestination_airport(rs.getNString("destination_airport"));
				tempAirport.setDestination_airport_id(rs.getInt("destination_airport_id"));
				tempAirport.setAirline_id(rs.getInt("airline_id"));
				tempAirport.setAirline_name(rs.getString("airline_name"));
				tempAirport.setAlias(rs.getString("alias"));
				
				lap.add(tempAirport);
			}
			
			return lap;
		} 
		
		catch (SQLException e) 
		{
			System.out.println("An error has occured : " + e);
		}

		return null;
	}
}
