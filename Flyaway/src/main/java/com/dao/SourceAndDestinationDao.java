package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.SourceAndDestination;
import com.resource.DbResource;

public class SourceAndDestinationDao 
{
	public List<SourceAndDestination> getSourceAndDestination()
	{
		List<SourceAndDestination> lsad = new ArrayList<SourceAndDestination>();
		
		try 
		{
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement(
					"SELECT"
					+ "   q1.source_airport_city,"
					+ "   q1.destination_airport_city"
					+ " FROM"
					+ " (SELECT DISTINCT"
					+ "   source_airport,"
					+ "   a1.city source_airport_city,"
					+ "   destination_airport,"
					+ "   a2.city destination_airport_city"
					+ " FROM Routes"
					+ " INNER JOIN Airports a1"
					+ " ON source_airport = a1.iata"
					+ " INNER JOIN Airports a2"
					+ " ON destination_airport = a2.iata)q1"
					+ " WHERE q1.source_airport_city IS NOT NULL"
					+ " AND q1.destination_airport_city IS NOT NULL"
					+ " ORDER BY 1, 2;");
			
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				SourceAndDestination tempSourceAndDestination = new SourceAndDestination();
				tempSourceAndDestination.setSourceCity(rs.getString("source_airport_city"));
				tempSourceAndDestination.setDestinationCity(rs.getString("destination_airport_city"));
				
				lsad.add(tempSourceAndDestination);
			}
		} 
		catch (Exception e) 
		{
			System.out.println("There was a problem executing the query. " + e);
			return null;
		}
		
		return lsad;
	}

}
