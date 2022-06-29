package com.service;

import com.dao.PasswordDao;

public class PasswordService {
	
	public int changePassword(String password, String confirmedPassword)
	{
		PasswordDao pd = new PasswordDao();
		
		int result = 0;
		
		if(password.equals(confirmedPassword))
		{
			result = pd.updatePassword(password);
		}
		
		return result;
	}

}
