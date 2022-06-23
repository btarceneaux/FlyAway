package com.resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbResource {

	public static Connection getDbConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://btarceneaux.ddns.net:3306/flyaway", "root", "myd@t@b@$3");
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			return null;
		}
		
	}
}
