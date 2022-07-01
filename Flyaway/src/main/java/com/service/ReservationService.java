package com.service;

import java.util.List;

import com.bean.Reservation;
import com.dao.ReservationDao;

public class ReservationService 
{
	ReservationDao rd = new ReservationDao();
	
	public int createReservation(Reservation myReservation)
	{
		int result = 0;
	    
		if(rd.storeReservation(myReservation) > 0)
		{
			result = 1;
		}
		
		return result;
	}
	
	public List<Reservation> getMyReservations(String emailAddress)
	{
		List<Reservation> myReservations = rd.getMyReservations(emailAddress);
		
		return myReservations;
	}

}
