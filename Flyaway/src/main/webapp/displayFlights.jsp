<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.bean.Airports"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="flyAway.css">
<meta charset="UTF-8">
<title>Available Flights</title>
</head>
<body>
<table border="1">
  <tr>
    <th>Select Flight</th>
    <th>Country</th>
    <th>Source City</th>
    <th>Source</th>
    <th>Source Airport Name</th>
    <th>Destination</th>
    <th>Destination Airport Name</th>
    <th>Airline</th>
    <th>Price</th>
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
       <form action="register.jsp" method="post" name="myForm">
		  <tr>
		    <td><input type="radio" name="option" value=<%=a.getIndex() %> required></td>
		    <td><%=a.getCountry() %></td>
		    <td><%=a.getCity() %></td>
		    <td><%=a.getIata() %></td>
		    <td><%=a.getName() %></td>
		    <td><%=a.getDestination_airport() %></td>
		    <td><%=a.getDestination_airport_name() %></td>
		    <td><%=a.getAirline_name() %></td>
		    <td><%=a.getPrice() %></td>
		  </tr>
		  <% 
		  
	  }
	  
  }
%>
</table>
  <input type="submit" name="Purchase" value="Purchase">
  </form>
<br/>
<br/>
<jsp:include page= "NavigationFooter.jsp"/>
</body>
</html>