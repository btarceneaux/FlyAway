package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Login;
import com.resource.DbResource;

public class LoginDao 
{
	
	
	public int storeRegistration(Login myRegistration)
	{
		int result = 0;
		
		try 
		{
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO Login(firstName, lastName, email, mailingAddress, city, state, zipCode, password) VALUES "
					+ "(?,?,?,?,?,?,?,?)");
			pstmt.setString(1, myRegistration.getFirstName());
			pstmt.setString(2, myRegistration.getLastName());
			pstmt.setString(3, myRegistration.getEmail());
			pstmt.setString(4, myRegistration.getMailingAddress());
			pstmt.setString(5, myRegistration.getCity());
			pstmt.setString(6, myRegistration.getState());
			pstmt.setInt(7, myRegistration.getZipCode());
			pstmt.setString(8, myRegistration.getPassword());
			
			result = pstmt.executeUpdate();
			
			System.out.println(result);
			
		} 
		catch (Exception e) 
		{
			System.out.println("An error has occured! : " + e);
		}
		
		return result; 
	}
	
	public boolean checkLoginInformation(String emailAddress, String password)
	{
		try 
		{
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("SELECT COUNT(*) FROM Login WHERE email = ? and password = ?");
			
			pstmt.setString(1, emailAddress);
			pstmt.setNString(2, password);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next())
			{
				return true;
			}
		} 
		catch (Exception e) {
			System.out.println("An error has occured : " + e);
			return false;
		}
		
		return false;
		
	}

}
