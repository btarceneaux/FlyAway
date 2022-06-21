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
  if(obj != null)
  {
	  List<Airports> airportList = (List<Airports>)obj;
	  Iterator<Airports> airportIterator = airportList.listIterator();
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