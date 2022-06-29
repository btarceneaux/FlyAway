package com.service;

import java.util.List;
import com.bean.SourceAndDestination;
import com.dao.SourceAndDestinationDao;

public class SourceAndDestinationService 
{
	SourceAndDestinationDao sadao = new SourceAndDestinationDao();
	
	public List<SourceAndDestination> getSourceAndDestinationDetails()
	{
		List<SourceAndDestination> sourceAndDestination = sadao.getSourceAndDestination();
		
		return sourceAndDestination;
	}
	

}
