<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.bean.Airports"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Available Flights</title>
</head>
<body>
<table border="1">
  <tr>
    <th>Source City</th>
    <th>Airport Name</th>
    <th>Airport Code</th>
  </tr>
<%
Object obj = session.getAttribute("flightListing");
  List<Airports> airportRoutesList = (List<Airports>)obj; 
  
  if(airportRoutesList.size() > 0)
  {
	  //List<Airports> airportList = (List<Airports>)obj;
	  System.out.println("The size of the list is : " + airportRoutesList.size());
	  
	  Iterator<Airports> airportIterator = airportRoutesList.iterator();
	  while(airportIterator.hasNext())
	  {
		  Airports a = airportIterator.next();
%>
		  <tr>
		    <td><%=a.getCity() %></td>
		    <td><%=a.getName() %></td>
		    <td><%=a.getIata() %></td>
		  </tr>
		  <% 
		  
	  }
  }
%>
</table>
</body>
</html>