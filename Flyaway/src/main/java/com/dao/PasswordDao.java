package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.resource.DbResource;

public class PasswordDao {
	
	public int updatePassword(String password)
	{
		int result = 0;
		
		try 
		{
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("UPDATE Login SET password = ? WHERE  email = 'admin@gmail.com'");
			pstmt.setString(1,  password);
			
			result = pstmt.executeUpdate();
		} 
		catch (Exception e) 
		{
			System.out.println("An error has occured! : " + e);
		}
		
		return result;
	}

}
