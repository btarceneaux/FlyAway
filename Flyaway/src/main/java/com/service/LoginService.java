package com.service;

import com.bean.Login;
import com.dao.LoginDao;

public class LoginService {
	
	LoginDao ld = new LoginDao();

	public int createRegistration(Login myRegistration) {
		
		int result = 0;
		String message;
		
		if(ld.storeRegistration(myRegistration) > 0)
		{
			message = "success";
			result = 1;
		}
		else
		{
			message = "failure";
		}
		
		return result;
			
	}
	
	public int checkLoginInformation(String emailAddress, String password, String typeOfUser)
	{
		int result = 0;
		
		if(emailAddress.contentEquals("admin@gmail.com") && ld.checkLoginInformation(emailAddress, password) && typeOfUser.equals("admin"))
		{
			result = 7;
		}
		else if(!emailAddress.contentEquals("admin@gmail.com") && ld.checkLoginInformation(emailAddress, password) && typeOfUser.equals("user"))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		
		return result;
	}

}
