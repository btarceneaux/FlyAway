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
  Object obj = session.getAttribute("airportListing");
  ArrayList<Airports> arrayList = (ArrayList<Airports>)obj; 
  
  if(arrayList.size() > 0)
  {
	  //List<Airports> airportList = (List<Airports>)obj;
	  out.println("The size of the list is : " + arrayList.size());
	  
	  Iterator<Airports> airportIterator = arrayList.listIterator();
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