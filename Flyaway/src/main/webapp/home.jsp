<%@page import="com.bean.Airports"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="flyAway.css">
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

Here are the details of your flight.

<table border="1">
<tr>
  <th>Country</th>
  <th>Source City</th>
  <th>Source</th>
  <th>Source Airport Name</th>
  <th>Destination</th>
  <th>Destination Airport Name</th>
  <th>Airline</th>
  <th>Price</th>
</tr>
</table>
<%
  Object obj = session.getAttribute("reservation");
  Airports airportReservation = (Airports)obj;

   //String departureDate = session.getAttribute("departureDate");

%>
   <form action="register.jsp" method="post" name="myForm">
     <tr>
	   <td><%=airportReservation.getCountry() %></td>
	   <td><%=airportReservation.getCity() %></td>
	   <td><%=airportReservation.getIata() %></td>
	   <td><%=airportReservation.getName() %></td>
	   <td><%=airportReservation.getDestination_airport() %></td>
	   <td><%=airportReservation.getDestination_airport_name() %></td>
	   <td><%=airportReservation.getAirline_name() %></td>
	   <td><%=airportReservation.getPrice() %></td>
	 </tr>
   </form>
</body>
</html>