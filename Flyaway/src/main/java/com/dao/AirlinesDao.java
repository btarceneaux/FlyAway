package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Airlines;
import com.resource.DbResource;

public class AirlinesDao 
{
	List<Airlines> airlinesList = new ArrayList<Airlines>();
	
	public List<Airlines> getAllActiveAirlines()
	{
		try 
		{
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement(
					"SELECT "
					+ "  airline_id,"
					+ "  airline_name,"
					+ "  alias,"
					+ "  iata,"
					+ "  callsign,"
					+ "  country,"
					+ "  active_ind"
					+ " FROM Airlines "
					+ "WHERE active_ind = 'Y' "
					+ "ORDER BY 2;");
			
            ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				Airlines tempAirlines = new Airlines();
				tempAirlines.setAirline_id(rs.getInt("airline_id"));
				tempAirlines.setAirline_name(rs.getString("airline_name"));
				tempAirlines.setAlias(rs.getNString("alias"));
				tempAirlines.setIata(rs.getString("iata"));
				tempAirlines.setCallsign(rs.getNString("callsign"));
				tempAirlines.setCountry(rs.getNString("country"));
				tempAirlines.setActive_ind(rs.getString("active_ind"));
				
				airlinesList.add(tempAirlines);
			}
		} 
		catch (Exception e) 
		{
			System.out.println("An error has occured : " + e);
		}
		
		return airlinesList;
	}

}
