package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Airports;
import com.bean.Reservation;
import com.resource.DbResource;

public class ReservationDao 
{
	public int storeReservation(Reservation myReservation)
	{
		int result = 0;
		
		try 
		{			  
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO Reservation"
					+ "(contact_email_address, "
					+ " country, "
					+ " source_city, "
					+ " source_airport_alias,"
					+ " source_airport_name, "
					+ " destination_airport_alias, "
					+ " destination_airport_name, "
					+ " airline, "
					+ " price, "
					+ " departure_date,"
					+ " return_date) VALUES "
					+ "(?,?,?,?,?,?,?,?,?,?,?)");
			
			pstmt.setString(1, myReservation.getContact_email_address());
			pstmt.setString(2, myReservation.getCountry());
			pstmt.setString(3, myReservation.getSource_city());
			pstmt.setString(4, myReservation.getSource_airport_alias());
			pstmt.setString(5, myReservation.getSource_airport_name());
			pstmt.setString(6, myReservation.getDestination_airport_alias());
			pstmt.setString(7, myReservation.getDestination_airport_name());
			pstmt.setString(8, myReservation.getAirline());
			pstmt.setDouble(9, myReservation.getPrice());
			pstmt.setDate(10, (Date)myReservation.getDeparture_date());
			pstmt.setDate(11, (Date)myReservation.getReturn_date());
			
			result = pstmt.executeUpdate();
		} 
		catch (Exception e) 
		{
			System.out.println("An error has occured! : " + e);
		}
		
		return result;
	}
	
	public List<Reservation> getMyReservations(String emailAddress)
	{
		List<Reservation> myReservations = new ArrayList<Reservation>();
		
		try 
		{
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement(
					"SELECT "
					+ " contact_email_address,"
					+ " country,"
					+ " source_city,"
					+ " source_airport_alias,"
					+ " source_airport_name, "
					+ " destination_airport_alias, "
					+ " destination_airport_name, "
					+ " airline, "
					+ " price, "
					+ "departure_date, "
					+ "return_date "
					+ "FROM Reservation "
					+ "WHERE contact_email_address = ?; ");
			
			pstmt.setString(1, emailAddress);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				Reservation tempReservation = new Reservation();
				
				tempReservation.setContact_email_address(rs.getString("contact_email_address"));
				tempReservation.setCountry(rs.getString("country"));
				tempReservation.setSource_city(rs.getString("source_city"));
				tempReservation.setSource_airport_alias(rs.getString("source_airport_alias"));
				tempReservation.setSource_airport_name(rs.getString("source_airport_name"));
				tempReservation.setDestination_airport_alias(rs.getString("destination_airport_alias"));
				tempReservation.setDestination_airport_name(rs.getString("destination_airport_name"));
				tempReservation.setAirline(rs.getNString("airline"));
				tempReservation.setPrice(rs.getDouble("price"));
				tempReservation.setDeparture_date(rs.getDate("departure_date"));
				tempReservation.setReturn_date(rs.getDate("return_date"));
				
				myReservations.add(tempReservation);
			}
			
		} 
		catch (Exception e) 
		{
			System.out.println("An error has occured : " + e);
		}
		
		return myReservations;
	}
	
}
