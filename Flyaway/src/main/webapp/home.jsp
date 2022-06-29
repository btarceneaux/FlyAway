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
<br/>
<h3> Flight Details</h3>
<br>
<%
  Object obj = session.getAttribute("reservation");
  Airports airportReservation = (Airports)obj;

   //String departureDate = session.getAttribute("departureDate");
%>
<table border="1">
   <form action="register.jsp" method="post" name="myForm">
     <tr>
       <td>Country</td>
	   <td><%=airportReservation.getCountry() %></td>
	 </tr>
	 <tr>
	   <td>Source City</td>
	   <td><%=airportReservation.getCity() %></td>
	 </tr>
	 <tr>
	   <td>Source Airport Alias</td>
	   <td><%=airportReservation.getIata() %></td>
	 </tr>
	 <tr>
	   <td>Source Airport Name</td>
	   <td><%=airportReservation.getName() %></td>
	 </tr>
	 <tr>
	   <td>Destination Airport Alias</td>
	   <td><%=airportReservation.getDestination_airport() %></td>
	 </tr>
	 <tr>
	   <td>Destination Airport Name</td>
	   <td><%=airportReservation.getDestination_airport_name() %></td>
	 </tr>
	 <tr>
	   <td>Airline</td>
	   <td><%=airportReservation.getAirline_name() %></td>
	 </tr>
	 <tr>
	   <td>Price</td>
	   <td><%=airportReservation.getPrice() %></td>
	 </tr>
   </form>
   
 </table>
</body>
</html>